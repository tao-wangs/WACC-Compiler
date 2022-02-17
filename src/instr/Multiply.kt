package instr

import register.Register

class Multiply(val Rd: Register, val Rm: Register, val Rs: Register, cond: Cond = Cond.AL, s: Boolean = false) :
    Instruction(cond, s) {
    override fun accept(v: InstructionVisitor): String {
        return v.visitMul(Rd, Rm, Rs)
    }
}