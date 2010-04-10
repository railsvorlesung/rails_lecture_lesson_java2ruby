package java2ruby.vorlesung;

/**
 * Sehr einfache Implementierung eines B-treees.
 * @author jfischer
 */
public class BinaryTree {

  // linker Teilbaum
  BinaryTree left;

  // rechter Teilbaum
  BinaryTree right;
  
  int content;

  /**
   * Konstruktor
   * @param number
   * @return
   */
  public BinaryTree(int number) {
    this.left = null;
    this.right = null;
    this.content = number;
  }

  public void insert(int value) {
    if (value < content) {
      
      // in linken Teilbaum einfuegen
      if (left == null) {
        left = new BinaryTree(value);
      } else {
        left.insert(value);
      }
    } else {

      // in rechten Teilbaum einfügen
      if (right == null) {
        right = new BinaryTree(value);
      } else {
        right.insert(value);
      }
    }
  }

  public String traverse() {
    StringBuffer ret = new StringBuffer();

    if (left != null) {
      ret.append( left.traverse() );
    }

    ret.append(content);
    ret.append(" ");
    
    
    if (right != null) {
      ret.append( right.traverse() );
    }

    return ret.toString();
  }
}
