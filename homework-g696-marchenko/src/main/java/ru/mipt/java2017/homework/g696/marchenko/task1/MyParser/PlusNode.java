package ru.mipt.java2017.homework.g696.marchenko.task1.MyParser;

public class PlusNode extends MyExpression {

  private MyExpression leftNode;
  private MyExpression rightNode;

  PlusNode(MyExpression left, MyExpression right) {
    leftNode = left;
    rightNode = right;
  }

  @Override
  public double count() {
    return leftNode.count() + rightNode.count();
  }
}
