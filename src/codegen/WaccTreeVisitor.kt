package codegen

import codegen.instr.Instruction
import parse.expr.*
import parse.stat.*


class WaccTreeVisitor : ASTVisitor {

    /* Begin at root of AST. */

    override fun visitAST() {
        TODO("Not yet implemented")
    }

    /* Code generation for statements. */

    override fun visitSkipNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitWhileNode(node: While): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitDeclarationNode(node: Declaration): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitAssignmentNode(node: Assignment): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitReadNode(node: Read): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitExitNode(node: Exit): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitPrintNode(node: Print): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitPrintlnNode(node: Println): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitStatListNode(statList: StatList): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitFreeNode(node: Free): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitIfNode(node: If): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitBeginNode(node: Begin): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitReturnNode(node: Return): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitVariableNode(node: Variable): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitNewPairNode(node: NewPair): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitCallNode(node: Call): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitEmptyArrayLiteralNode(node: EmptyArrayLiteral): List<Instruction> {
        TODO("Not yet implemented")
    }

    /*
    override fun visitArrayInstanceNode(node: ArrayInstance): List<Instruction> {
        TODO("Not yet implemented")
    }
    */

    /* Code generation for types. */

    override fun visitIntNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitBooleanNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitCharNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitStringNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitTypelessPairNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitPairInstanceNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitArgListNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitPairElemNode(): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitArrayElemNode(node: ArrayElem): List<Instruction> {
        TODO("Not yet implemented")
    }

    /* Code generation for binary operators. */

    override fun visitBinaryOp(node : BinaryOp): List<Instruction> {
        when (node.binOp) {
            BinaryOperator.AND -> TODO()
            BinaryOperator.OR -> TODO()
            BinaryOperator.MULTI -> TODO()
            BinaryOperator.DIV -> TODO()
            BinaryOperator.MOD -> TODO()
            BinaryOperator.PLUS -> TODO()
            BinaryOperator.MINUS -> TODO()
            BinaryOperator.GT -> TODO()
            BinaryOperator.GTE -> TODO()
            BinaryOperator.LT -> TODO()
            BinaryOperator.LTE -> TODO()
            BinaryOperator.EQUIV -> TODO()
            BinaryOperator.NOTEQUIV -> TODO()
        }
    }

    /* Code generation for literals. */

    override fun visitIntLiteralNode(token: kotlin.String): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitCharLiteralNode(token: kotlin.String): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitBooleanLiteralNode(token: kotlin.String): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitStringLiteralNode(token: kotlin.String): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitPairLiteralNode(token: kotlin.String): List<Instruction> {
        TODO("Not yet implemented")
    }

    override fun visitArrayLiteralNode(node: ArrayLiteral): List<Instruction> {
        TODO("Not yet implemented")
    }

    /* Code generation for unary operators. */

    override fun visitUnaryOpNode(node: UnaryOp): List<Instruction> {
        return when (node.op) {
            UnaryOperator.CHR -> TODO()
            UnaryOperator.LEN -> TODO()
            UnaryOperator.ORD -> TODO()
            UnaryOperator.NEG -> TODO()
            UnaryOperator.NOT -> TODO()
        }
    }
}
