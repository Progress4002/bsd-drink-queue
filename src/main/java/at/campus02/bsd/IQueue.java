package at.campus02.bsd;

public interface IQueue {

    boolean offer(String obj);

    String poll();

    String remove();

    String peek();

    String element();
}