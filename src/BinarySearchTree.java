public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {


    @Override
    public boolean isEmpty() {
        if(root == null){

            return true;

        }else{

            return false;

        }
    }

    @Override
    public void insert(T data) {

        root = BTSInsert(root, data);

    }

    @Override
    public void delete(T target) {

        root = BTSDelete(root, target);

    }

    @Override
    public boolean contains(T target) {

        return BTSContains(root, target);

    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    private class Node {

        Node left;
        Node right;
        T data;

        Node(T data){
            this.data = data;
            left = right = null;
        }

    }

    private Node root;

    private T getMin(Node node){

        if(node == null){

            return node.data;

        }else{

            return getMax(node.left);

        }

    }

    private T getMax(Node node){

        if(node == null){

            return node.data;

        }else{

            return getMax(node.right);

        }


    }

    private Node BTSInsert(Node root, T data){


        if(root == null){

            return new Node(data);

        }


        if(data.compareTo(root.data) < 0) {

            root.left = BTSInsert(root.left, data);

        }else if(data.compareTo(root.data) > 0){

            root.right = BTSInsert(root.right, data);

        }

        return root;

    }

    private Node BTSDelete(Node root, T data){

        if(root == null){

            return null;

        }else{

            if(data.compareTo(root.data) < 0){

                // less than
                root.left = BTSDelete(root.left, data);

            }else if(data.compareTo(root.data) > 0){

                // greater than
                root.right = BTSDelete(root.right, data);

            }else{

                // equal to
                if(root.right != null && root.left == null){

                    // left child null
                    return root.right;

                }else if(root.left != null && root.right == null){

                    // right child null
                    return root.left;

                }else if(root.left != null && root.right != null){

                    // neither null

                    root.data = getMin(root);

                    root.left = BTSDelete(root.left, root.data);

                }else{

                    //both null
                    return null;

                }

            }

        }

        return null;

    }

    private boolean BTSContains(Node root, T target){

        if(root == null){

            return false;

        }

        if(target == root.data){

            return true;

        }

        if(target.compareTo(root.data) < 0){

            root = root.left;
            BTSContains(root, target);

        }else{

            root = root.right;
            BTSContains(root, target);

        }



        return false;

    }

    public BinarySearchTree(){

        root = null;

    }

    public BinarySearchTree(T data){

        root = new Node(data);

    }


}
