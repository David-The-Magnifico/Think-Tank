public class ShapeDisplay {
    public static void main(String[] args) {
        displayBox();
        displayOval();
        displayArrow();
        displayDiamond();
    }

    public static void displayBox() {
        System.out.println("Box:");
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
	System.out.println("*       *");
	System.out.println("*       *");
	System.out.println("*       *");
	System.out.println("*       *");
	System.out.println("*       *");
        System.out.println("*********");
        System.out.println();
    }

    public static void displayOval() {
        System.out.println("Oval:");
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
 	System.out.println("*     *");
 	System.out.println("*     *");
 	System.out.println("*     *");
 	System.out.println("*     *");
 	System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
        System.out.println();
    }

    public static void displayArrow() {
        System.out.println("Arrow:");
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println("    *");
        System.out.println("    *");
	System.out.println("    *");
	System.out.println("    *");
	System.out.println("    *");
	System.out.println("    *");
        System.out.println();
    }

    public static void displayDiamond() {
        System.out.println("Diamond:");
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
	System.out.println(" *     *");
	System.out.println("*       *");
	System.out.println(" *     *");
	System.out.println("  *   *");
        System.out.println("   * *");
        System.out.println("    *");
    }
}