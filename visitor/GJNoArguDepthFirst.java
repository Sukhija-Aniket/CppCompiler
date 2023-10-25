//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class GJNoArguDepthFirst implements GJNoArguVisitor<String> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public String visit(NodeList n) {
      String _ret=null;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
      }
      return _ret;
   }

   public String visit(NodeListOptional n) {
      if ( n.present() ) {
         String _ret=null;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this);
         }
         return _ret;
      }
      else
         return null;
   }

   public String visit(NodeOptional n) {
      if ( n.present() )
         return n.node.accept(this);
      else
         return null;
   }

   public String visit(NodeSequence n) {
      String _ret=null;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
      }
      return _ret;
   }

   public String visit(NodeToken n) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Statement() )*
    * f1 -> <EOF>
    */
   public String visit(Goal n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> ModuleDeclaration()
    *       | ImportStatement()
    *       | ExportImportStatement()
    *       | ModuleStatement()
    *       | IncludeStatement()
    *       | OtherStatement()
    */
   public String visit(Statement n) {
      String _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> "export"
    * f1 -> "module"
    * f2 -> DotIdentifier()
    * f3 -> ";"
    */
   public String visit(ModuleDeclaration n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      return _ret;
   }

   /**
    * f0 -> "import"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public String visit(ImportStatement n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> "export"
    * f1 -> "import"
    * f2 -> DotIdentifier()
    * f3 -> ";"
    */
   public String visit(ExportImportStatement n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      return _ret;
   }

   /**
    * f0 -> "module"
    * f1 -> DotIdentifier()
    * f2 -> ";"
    */
   public String visit(ModuleStatement n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> "#"
    * f1 -> "include"
    * f2 -> ( <STRING_LITERAL> | Include() )
    */
   public String visit(IncludeStatement n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> "<"
    * f1 -> DotIdentifier()
    * f2 -> ">"
    */
   public String visit(Include n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( RemainingIdentifier() )*
    */
   public String visit(DotIdentifier n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> "."
    * f1 -> ( Identifier() | Asterisk() )
    */
   public String visit(RemainingIdentifier n) {
      String _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> <MULT>
    */
   public String visit(Asterisk n) {
      String _ret=null;
      n.f0.accept(this);
      return _ret;
   }

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
   public String visit(OtherStatement n) {
      String _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public String visit(Identifier n) {
      String _ret=null;
      n.f0.accept(this);
      return _ret;
   }

}