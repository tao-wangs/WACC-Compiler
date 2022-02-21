package expr

import codegen.ASTVisitor
import codegen.instr.Instruction
import symbols.Char
import symbols.Int

class Ord(e: Expr) : UnaryOp(e, Int) {
    init {
        if (e.type != Char) {
            ErrorHandler.printErr(ErrorType.SEMANTIC, "Incompatible type at ${this.toString()} (expected: CHAR, actual ${e.type})")
        }
    }

    override fun accept(v: ASTVisitor): List<Instruction> {
        return v.visitOrdNode(e)
    }
}
