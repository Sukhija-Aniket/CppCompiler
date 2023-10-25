//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
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
public class OtherStatement implements Node {
   public NodeChoice f0;

   public OtherStatement(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
