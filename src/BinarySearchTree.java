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

        }else{

            if(data.compareTo(root.data) < 0) {

                root = root.left;
                return BTSInsert(root, data);

            }else{

                root = root.right;
                return BTSInsert(root, data);

            }
        }

    }

    private Node BTSDelete(Node root, T data){

        

    }

    private boolean BTSContains(Node root, T target){

        if(root == null){

            return false;

        }else{

            if(target == root){

                return true;

            }else{

                if(target.compareTo(root.data) < 0){

                    root = root.left;

                    return BTSContains(root, target);

                }else{

                    root = root.right;
                    return BTSContains(root, target);

                }

            }

        }

    }

    public BinarySearchTree(){

        root = null;

    }

    public BinarySearchTree(T data){

        root = new Node(data);

    }

}
