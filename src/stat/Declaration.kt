package stat

import symbols.Type
import myvisitor.SymbolTable

class Declaration(
    val t: Type,
    val id: String,
    val rhs: AssignRhs,
    st: SymbolTable
) : Stat() {
    init {
        if (rhs.type == t) {
            System.err.println("Expected " + t + ", got " + rhs.type)
            valid = false
        } else if (st.lookupAll(id) != null) {
            System.err.println("Identifier " + id + " already defined")
            valid = false
        } else {
            st.add(id, t)
        }
    }
}
