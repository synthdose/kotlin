
val notSam = { /* Not SAM */ }
var foo: java.lang.Runnable = {/* Variable */}
fun bar(): java.lang.Runnable {
    foo = {/* Assignment */}
    val a = {/* Type Cast */} as java.lang.Runnable
    runRunnable {/* Argument */}
    return {/* Return */}
}

val baz = java.lang.Runnable { /* SAM */ }

fun runRunnable(r: java.lang.Runnable) = r()