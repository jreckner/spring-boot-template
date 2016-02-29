ruleset {

    description '''
        A Sample Groovy RuleSet containing Basic CodeNarc Rules.
        '''

    // rulesets/basic.xml
    AssertWithinFinallyBlock 
    AssignmentInConditional 
    BigDecimalInstantiation 
    BitwiseOperatorInConditional 
    BooleanGetBoolean 
    BrokenNullCheck 
    BrokenOddnessCheck 
    ClassForName 
    ComparisonOfTwoConstants 
    ComparisonWithSelf 
    ConstantAssertExpression 
    ConstantIfExpression 
    ConstantTernaryExpression 
    DeadCode 
    DoubleNegative 
    DuplicateCaseStatement 
    DuplicateMapKey 
    DuplicateSetValue 
    EmptyCatchBlock 
    //EmptyClass 
    EmptyElseBlock 
    EmptyFinallyBlock 
    EmptyForStatement 
    EmptyIfStatement 
    EmptyInstanceInitializer 
    EmptyMethod 
    EmptyStaticInitializer 
    EmptySwitchStatement 
    EmptySynchronizedStatement 
    EmptyTryBlock 
    EmptyWhileStatement 
    EqualsAndHashCode 
    EqualsOverloaded 
    ExplicitGarbageCollection 
    ForLoopShouldBeWhileLoop 
    HardCodedWindowsFileSeparator 
    HardCodedWindowsRootDirectory 
    IntegerGetInteger 
    RandomDoubleCoercedToZero 
    RemoveAllOnSelf 
    ReturnFromFinallyBlock 
    ThrowExceptionFromFinallyBlock 

    // rulesets/dry.xml
    DuplicateListLiteral 
    DuplicateMapLiteral 
    DuplicateNumberLiteral 
    DuplicateStringLiteral 

    // rulesets/exceptions.xml
    CatchArrayIndexOutOfBoundsException 
    CatchError 
    CatchException 
    CatchIllegalMonitorStateException 
    CatchIndexOutOfBoundsException 
    CatchNullPointerException 
    CatchRuntimeException 
    CatchThrowable 
    ConfusingClassNamedException 
    ExceptionExtendsError 
    ExceptionNotThrown 
    MissingNewInThrowStatement 
    ReturnNullFromCatchBlock 
    SwallowThreadDeath 
    ThrowError 
    ThrowException 
    ThrowNullPointerException 
    ThrowRuntimeException 
    ThrowThrowable 
    
    // rulesets/formatting.xml
    BracesForClass 
    BracesForForLoop 
    BracesForIfElse 
    BracesForMethod 
    BracesForTryCatchFinally 
    //ClassJavadoc 
    //ClosureStatementOnOpeningLineOfMultipleLineClosure 
    LineLength 
    SpaceAfterCatch 
    SpaceAfterClosingBrace 
    SpaceAfterComma 
    SpaceAfterFor 
    SpaceAfterIf 
    SpaceAfterOpeningBrace 
    SpaceAfterSemicolon 
    SpaceAfterSwitch 
    SpaceAfterWhile 
    //SpaceAroundClosureArrow 
    //SpaceAroundMapEntryColon 
    SpaceAroundOperator 
    SpaceBeforeClosingBrace 
    SpaceBeforeOpeningBrace 
    
    // rulesets/generic.xml
    //IllegalClassMember 
    //IllegalClassReference 
    IllegalPackageReference 
    IllegalRegex 
    //IllegalString 
    RequiredRegex 
    RequiredString 
    StatelessClass 
 
    // rulesets/groovyism.xml
    AssignCollectionSort 
    AssignCollectionUnique 
    ClosureAsLastMethodParameter 
    CollectAllIsDeprecated 
    ConfusingMultipleReturns 
    ExplicitArrayListInstantiation 
    ExplicitCallToAndMethod 
    ExplicitCallToCompareToMethod 
    ExplicitCallToDivMethod 
    ExplicitCallToEqualsMethod 
    ExplicitCallToGetAtMethod 
    ExplicitCallToLeftShiftMethod 
    ExplicitCallToMinusMethod 
    ExplicitCallToModMethod 
    ExplicitCallToMultiplyMethod 
    ExplicitCallToOrMethod 
    ExplicitCallToPlusMethod 
    ExplicitCallToPowerMethod 
    ExplicitCallToRightShiftMethod 
    ExplicitCallToXorMethod 
    ExplicitHashMapInstantiation 
    ExplicitHashSetInstantiation 
    ExplicitLinkedHashMapInstantiation 
    ExplicitLinkedListInstantiation 
    ExplicitStackInstantiation 
    ExplicitTreeSetInstantiation 
    GStringAsMapKey 
    //GStringExpressionWithinString 
    GetterMethodCouldBeProperty 
    GroovyLangImmutable 
    UseCollectMany 
    UseCollectNested 
    
    // rulesets/imports.xml
    DuplicateImport 
    ImportFromSamePackage 
    ImportFromSunPackages 
    MisorderedStaticImports 
    UnnecessaryGroovyImport 
    UnusedImport

    // rulesets/logging.xml
    LoggerForDifferentClass 
    LoggerWithWrongModifiers 
    LoggingSwallowsStacktrace 
    MultipleLoggers 
    PrintStackTrace 
    Println 
    SystemErrPrint 
    SystemOutPrint

    // rulesets/unnecessary.xml
    AddEmptyString 
    ConsecutiveLiteralAppends 
    ConsecutiveStringConcatenation 
    UnnecessaryBigDecimalInstantiation 
    UnnecessaryBigIntegerInstantiation 
    UnnecessaryBooleanExpression 
    UnnecessaryBooleanInstantiation 
    UnnecessaryCallForLastElement 
    UnnecessaryCallToSubstring 
    UnnecessaryCatchBlock 
    UnnecessaryCollectCall 
    UnnecessaryCollectionCall 
    UnnecessaryConstructor 
    UnnecessaryDefInFieldDeclaration 
    UnnecessaryDefInMethodDeclaration 
    UnnecessaryDefInVariableDeclaration 
    UnnecessaryDotClass 
    UnnecessaryDoubleInstantiation 
    UnnecessaryElseStatement 
    UnnecessaryFinalOnPrivateMethod 
    UnnecessaryFloatInstantiation 
    UnnecessaryGString 
    UnnecessaryGetter 
    UnnecessaryIfStatement 
    UnnecessaryInstanceOfCheck 
    UnnecessaryInstantiationToGetClass 
    UnnecessaryIntegerInstantiation 
    UnnecessaryLongInstantiation 
    UnnecessaryModOne 
    UnnecessaryNullCheck 
    UnnecessaryNullCheckBeforeInstanceOf 
    UnnecessaryObjectReferences 
    UnnecessaryOverridingMethod 
    UnnecessaryPackageReference 
    UnnecessaryParenthesesForMethodCallWithClosure 
    UnnecessaryPublicModifier 
    //UnnecessaryReturnKeyword
    UnnecessarySelfAssignment 
    UnnecessarySemicolon 
    UnnecessaryStringInstantiation 
    UnnecessarySubstring 
    UnnecessaryTernaryExpression 
    UnnecessaryTransientModifier 
    
    // rulesets/unused.xml
    UnusedArray 
    UnusedMethodParameter 
    UnusedObject 
    UnusedPrivateField 
    UnusedPrivateMethod 
    UnusedPrivateMethodParameter 
    UnusedVariable
    
}
