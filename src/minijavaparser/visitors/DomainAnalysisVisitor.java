package minijavaparser.visitors;

import java.util.LinkedList;

import minijavaparser.*;
import minijavaparser.simboltable.*;
import minijavaparser.simboltable.exceptions.*;

public class DomainAnalysisVisitor implements MiniJavaVisitor {

	@Override
	public Object visit(SimpleNode node, Object data) {
		node.childrenAccept(this, data);
		return null;
	}
	
	/*here I add the classes into the class table and into the type table, respectively. Also, I initialise the symbol table(s)*/
	@Override
	public Object visit(ASTProgram node, Object data) {		
		SymbolTable.init(); // we initialise the symbol table
		node.childrenAccept(this, null);
		SymbolTable.checkAllDefined(); // we verify if all used types were defined untill the end of the file
		SymbolTable.secondCheck(); //verify if there are superclasses defined after the subclasses for member duplicates 
		
		//verify then with the VariableCheckVisitor
		VariableCheckVisitor vis = new VariableCheckVisitor();
		node.jjtAccept(vis, null);
		
		return null;
	}

	
	@Override
	public Object visit(ASTTerm node, Object data) {
		//no need to do nothing
		return null;
	}

	@Override
	public Object visit(ASTExp node, Object data) { //here nothing to do
		//no need to do nothing
		return null;
	}
}
