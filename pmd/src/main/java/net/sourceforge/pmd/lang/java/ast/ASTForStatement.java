/* Generated By:JJTree: Do not edit this line. ASTForStatement.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTForStatement extends AbstractJavaNode {
    public ASTForStatement(int id) {
        super(id);
    }

    public ASTForStatement(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
