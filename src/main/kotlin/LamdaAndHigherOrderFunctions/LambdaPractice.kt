package LamdaAndHigherOrderFunctions

class LambdaPractice {
    /**
     * Lamda syntax Example:
     * val lamda:(dataType1,dataType2)->{variable1:dataType1,variable2:dataType2->methodBody}
     *
     */
/**********************************************************************************************************************/
    /**
     *lamda in shorter version!!
     * lamda can be assigned to a variable:
     * in this code the lamda is assigned to the variable add
     */
    val add={a:Int,b:Int->a+b}
    val sayHello: () -> Unit = {
        println("Hello, World!")
    }

}