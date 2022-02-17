package stat

import codegen.ASTVisitor
import instr.Instruction

object Skip : Stat() {
    override fun accept(v: ASTVisitor): List<Instruction> {
        return v.visitSkipNode()
    }

    override fun toString(): String = "skip"
}
