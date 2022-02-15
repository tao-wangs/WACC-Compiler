package expr

import codegen.ASTVisitor
import instr.Instruction
import symbols.Null

class PairLiteral() : Literal<Void>(Null) {
    init {
        value = null
    }

    override fun toString(): String {
        return "null"
    }

    override fun accept(v: ASTVisitor): List<Instruction> {
        TODO("Not yet implemented")
    }
}
