package expr

import symbols.Boolean

class Equiv(e1: Expr, e2: Expr) : BinaryOp(e1, e2, Boolean) {
    init {
        if (e1.type != e2.type) {
            System.err.println("Mismatched expression types " + e1.type + " and " + e2.type)
            valid = false
        }
    }
}
