import antlr.*
import codegen.ASTNode
import codegen.WaccTreeVisitor
import org.antlr.v4.runtime.*
import parse.semantics.Visitor
import kotlin.system.exitProcess

fun main() {

    println("-- Compiling...")

    val input = CharStreams.fromStream(System.`in`)

    /* Perform lexical analysis. */

    val lexer = WACCLexer(input)

    val tokens = CommonTokenStream(lexer)

    /* Perform syntax analysis. */

    val parser = WACCParser(tokens)

    val parseTree = parser.prog()
    System.err.println(parseTree.toStringTree(parser))

    if (parser.getNumberOfSyntaxErrors() > 0) {
        ErrorHandler.printErr(
            ErrorType.SYNTAX,
            ""
        )
    }

    /* Perform semantic analysis. */

    val visitor = Visitor()
    val ast = visitor.visit(parseTree)

    if (ErrorHandler.errorCount > 0) {
        System.err.println("Errors detected during compilation! Exit code " + ErrorType.SEMANTIC.code() + " returned.")
        exitProcess(ErrorType.SEMANTIC.code())
    }

    if (ast !is ASTNode) {
        System.err.println("Parser does not return an ASTNode")
        exitProcess(ErrorType.SEMANTIC.code())
    }

    val intermediateCodeGen = WaccTreeVisitor().visitAST(ast)

    println("-- Printing Assembly...")

    println("file.s contents are:")

    println("===========================================================")

    /* paste assembly here */

    println("===========================================================")

    println("-- Finished")
}
