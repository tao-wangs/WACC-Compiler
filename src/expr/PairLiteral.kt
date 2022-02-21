package expr

import codegen.ASTVisitor
import codegen.instr.Instruction
import symbols.Null

class PairLiteral() : Literal<Void>(Null) {
    init {
        value = null
    }

    override fun toString(): String {
        return "null"
    }

    override fun accept(v: ASTVisitor): List<Instruction> {
        return v.visitPairLiteralNode("null")
    }
}
