package minijavaparser.visitors;

import minijavaparser.*;

public class DisplayVisitor implements MiniJavaVisitor {
	

	@Override
	public Object visit(SimpleNode node, Object data) {
		node.childrenAccept(this, data);
		return null;
	}

	@Override
	public Object visit(ASTProgram node, Object data) {
		System.out.println(node);
		node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTExp node, Object data) {
		System.out.println(node);
		node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTFactor node, Object data) {
		System.out.println(node);
		node.childrenAccept(this, data);
		return data;
	}



}
