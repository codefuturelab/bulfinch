package com.stuffwithstuff.bulfinch;

public class NameExpr implements Expr {
  public NameExpr(final String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }

  @Override
  public String toString() {
    return mName;
  }

  public <A,R> R accept(ExprVisitor<A,R> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  private final String mName;
}
