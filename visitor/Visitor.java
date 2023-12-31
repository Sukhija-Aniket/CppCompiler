//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Statement() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n);

   /**
    * f0 -> ModuleDeclaration()
    *       | ImportStatement()
    *       | ExportImportStatement()
    *       | ModuleStatement()
    *       | IncludeStatement()
    *       | OtherStatement()
    */
   public void visit(Statement n);

   /**
    * f0 -> "export"
    * f1 -> "module"
    * f2 -> DotIdentifier()
    * f3 -> ";"
    */
   public void visit(ModuleDeclaration n);

   /**
    * f0 -> "import"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(ImportStatement n);

   /**
    * f0 -> "export"
    * f1 -> "import"
    * f2 -> DotIdentifier()
    * f3 -> ";"
    */
   public void visit(ExportImportStatement n);

   /**
    * f0 -> "module"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public void visit(ModuleStatement n);

   /**
    * f0 -> "#"
    * f1 -> "include"
    * f2 -> ( <STRING_LITERAL> | Include() )
    */
   public void visit(IncludeStatement n);

   /**
    * f0 -> "<"
    * f1 -> DotIdentifier()
    * f2 -> ">"
    */
   public void visit(Include n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( RemainingIdentifier() )*
    */
   public void visit(DotIdentifier n);

   /**
    * f0 -> "."
    * f1 -> ( Identifier() | Asterisk() )
    */
   public void visit(RemainingIdentifier n);

   /**
    * f0 -> <MULT>
    */
   public void visit(Asterisk n);

   /**
    * f0 -> <LPAREN>
    *       | <RPAREN>
    *       | <LSQPAREN>
    *       | <RSQPAREN>
    *       | <LBRACE>
    *       | <RBRACE>
    *       | <AT>
    *       | <HASH>
    *       | <DEFINE>
    *       | <QUOTE>
    *       | <SEMICOLON>
    *       | <COLON>
    *       | <TILDE>
    *       | <DOT>
    *       | <COMMA>
    *       | <ASSIGN>
    *       | <GREATER>
    *       | <GE>
    *       | <LESS>
    *       | <LE>
    *       | <NE>
    *       | <PLUS>
    *       | <FLOAT>
    *       | <MINUS>
    *       | <MULT>
    *       | <DIV>
    *       | <AND>
    *       | <OR>
    *       | <PIPE>
    *       | <BIT_AND>
    *       | <NOT>
    *       | <BOOLEAN>
    *       | <CLASS>
    *       | <INTERFACE>
    *       | <ELSE>
    *       | <EXTENDS>
    *       | <FALSE>
    *       | <IF>
    *       | <WHILE>
    *       | <INTEGER>
    *       | <MAIN>
    *       | <NEW>
    *       | <PUBLIC>
    *       | <RETURN>
    *       | <STATIC>
    *       | <STRING>
    *       | <THIS>
    *       | <TRUE>
    *       | <PRINT>
    *       | <VOID>
    *       | <OBJECT>
    *       | <INTEGER_LITERAL>
    *       | <FLOAT_LITERAL>
    *       | <STRING_LITERAL>
    *       | <IDENTIFIER>
    */
   public void visit(OtherStatement n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n);

}

