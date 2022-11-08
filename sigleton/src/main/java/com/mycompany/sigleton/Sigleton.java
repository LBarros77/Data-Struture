package com.mycompany.sigleton;

/**
 *
 * @author Leonardo Barros
 */
public class Sigleton {

    public static void main(String[] args) {
      SingleObject object = SingleObject.getInstance();

      //show the message
//      object.showMessage();
      

        DemoSingleThread singleton = DemoSingleThread.getInstance("IF");
        DemoSingleThread anotherSingleton = DemoSingleThread.getInstance("Sertão");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        
//        Thread threadFoo = new Thread(new ThreadFoo());
//        Thread threadBar = new Thread(new ThreadBar());
//        
//        threadFoo.start();
//        threadBar.start();
    }
    
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            DemoSingleThread singleton = DemoSingleThread.getInstance("IF");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            DemoSingleThread singleton = DemoSingleThread.getInstance("Sertão");
            System.out.println(singleton.value);
        }
    }
}
