public class Height_of_tree {
    static class NOde {
        int data;
        NOde left; 
        NOde right;
        NOde (int data){
            this.data= data;
            this.left= null;
            this.right = null;
        }

    }
    public static int height (NOde root ){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[]args){
        NOde root = new NOde(1);
        root.left=new NOde(2);
        root.right=new NOde(2);
        root.left.left=new NOde(3);
        root.right.right=new NOde(4);

        System.out.println(height(root));
    }
}
