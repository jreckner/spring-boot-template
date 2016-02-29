var templateApp = angular.module('templateApp', [
    'angular-growl',
    'ui.bootstrap',
    'ngSanitize',
    'ngAnimate'
]);

templateApp.config(["growlProvider", "$httpProvider", function(growlProvider, $httpProvider) {
    growlProvider.globalTimeToLive(30000);
    growlProvider.globalEnableHtml(true);
    growlProvider.onlyUniqueMessages(true);
}]);

templateApp.factory('LatestBuildService', function($http) {
    var getData = function() {
        return $http({
                method: "GET",
                url: "https://www.recknerd.com/jenkins/job/spring-boot-template+ci/lastSuccessfulBuild/api/json"
            }).then(function(result){
            return angular.fromJson(result.data.artifacts[0]);
        });
    };
    return { getData: getData };
});

templateApp.controller('AppInfoCtrl', function ($scope, growl, $http, LatestBuildService) {

    $http.get('/info').success(function(data) {
        $scope.appVersion = data.app.version

        var latestBuildPromise = LatestBuildService.getData();
        latestBuildPromise.then(function(result) {
           // 1.0.0-SNAPSHOT
           var currentVersion = $scope.appVersion.split("-")[0]

           // spring-boot-template-1.0.0-SNAPSHOT.jar
           //[spring,boot,template,1.0.0,SNAPSHOT]
           // spring-boot-template-1.1.0.jar
           //[spring,boot,template,1.1.0]
           if(isNullorEmpty(result) == false ) {
               var latestBuildVersion = result.fileName.slice(0, -4).split("-")[3]
               console.log("Comparing: " + currentVersion + " to " + latestBuildVersion)
               if(versionCompare(currentVersion, latestBuildVersion) < 0) { // Notify when current version < latest version
                   growl.addInfoMessage('<b>New Update Available:</b>&nbsp;&nbsp;' + latestBuildVersion)
               }
           }
        });
    });
});

templateApp.controller('ActionsCtrl', function ($scope, growl, $http) {
    $scope.action1 = function() {
        growl.addInfoMessage('<b>Not yet implemented:</b>&nbsp;&nbsp;')
    }

    $scope.action2 = function() {
        growl.addInfoMessage('<b>Not yet implemented:</b>&nbsp;&nbsp;')
    }
});

function versionCompare(v1, v2, options) {
    var lexicographical = options && options.lexicographical,
        zeroExtend = options && options.zeroExtend,
        v1parts = v1.split('.'),
        v2parts = v2.split('.');

    function isValidPart(x) {
        return (lexicographical ? /^\d+[A-Za-z]*$/ : /^\d+$/).test(x);
    }

    if (!v1parts.every(isValidPart) || !v2parts.every(isValidPart)) {
        return NaN;
    }

    if (zeroExtend) {
        while (v1parts.length < v2parts.length) v1parts.push("0");
        while (v2parts.length < v1parts.length) v2parts.push("0");
    }

    if (!lexicographical) {
        v1parts = v1parts.map(Number);
        v2parts = v2parts.map(Number);
    }

    for (var i = 0; i < v1parts.length; ++i) {
        if (v2parts.length == i) {
            return 1;
        }

        if (v1parts[i] == v2parts[i]) {
            continue;
        }
        else if (v1parts[i] > v2parts[i]) {
            return 1;
        }
        else {
            return -1;
        }
    }

    if (v1parts.length != v2parts.length) {
        return -1;
    }

    return 0;
}

function isNullorEmpty(value) {
    return !value;
}