/* Generated By:JavaCC: Do not edit this line. MiniJavaVisitor.java Version 5.0 */
package minijavaparser;

public interface MiniJavaVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTMainClass node, Object data);
  public Object visit(ASTMainFuncDecl node, Object data);
  public Object visit(ASTClassDecl node, Object data);
  public Object visit(ASTVarDecl node, Object data);
  public Object visit(ASTMethodDecl node, Object data);
  public Object visit(ASTFormalList node, Object data);
  public Object visit(ASTFormalRest node, Object data);
  public Object visit(ASTType node, Object data);
  public Object visit(ASTStatement node, Object data);
  public Object visit(ASTOrCond node, Object data);
  public Object visit(ASTAndCond node, Object data);
  public Object visit(ASTRelExp node, Object data);
  public Object visit(ASTRelOp node, Object data);
  public Object visit(ASTArExp node, Object data);
  public Object visit(ASTAdOp node, Object data);
  public Object visit(ASTTerm node, Object data);
  public Object visit(ASTMulOp node, Object data);
  public Object visit(ASTFactor node, Object data);
  public Object visit(ASTFactorRest node, Object data);
  public Object visit(ASTExpFinal node, Object data);
  public Object visit(ASTExpList node, Object data);
}
/* JavaCC - OriginalChecksum=1440d359f4668a0f0dcbbde9d6bf1322 (do not edit this line) */