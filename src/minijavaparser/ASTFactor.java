/* Generated By:JJTree: Do not edit this line. ASTFactor.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=progen.Entity,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package minijavaparser;

public
class ASTFactor extends progen.ProgenNode {
  public ASTFactor(int id) {
    super(id);
  }

  protected ASTFactor(MiniJava p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MiniJavaVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=afde6db9b29d64d6bc992fd71b6c09a8 (do not edit this line) */
