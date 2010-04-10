/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java2ruby.vorlesung;

/**
 *
 * @author jfischer
 */
public class BinaryTreeExample {

  static BinaryTree tree;

  public static void main(String[] arg) {
    int[] numbers = new int[] {9, 5, 4, 23, 2, 11, 67, 33, 19, 45};
    

    tree = new BinaryTree(1);

    for (int number : numbers) {
      tree.insert(number);
    }
    
    System.out.println( tree.traverse() );
  }
}
