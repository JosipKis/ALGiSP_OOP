package pckg_adt_queue;

public class QUEUEARR<E> implements ADTQUEUE<E>{

    private int front;
    private int capacity;
    private static final int CAPACITY = 10;
    private int size;
    private E[] queue;

    // constructors
    public QUEUEARR(){
        this.capacity = CAPACITY;
        this.size = 0;
        this.front = 0;
        this.queue = (E[]) new Object[capacity];
    }

    public QUEUEARR(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.queue = (E[]) new Object[capacity];
    }

    // interface methods
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E first() {
        E element = null;
        if (isEmpty()){
            System.out.println("Queue is empty!");
        }else {
            element = queue[front];
        }
        return element;
    }

    @Override
    public void enqueue(E element) {
        if (this.size < this.capacity){
            System.out.println("Adding new element in the queue...");
            int idx = (front + size) % capacity;
            queue[idx] = element;
            System.out.println("Added at the index postion: "+ idx);
            size++;
        }else {
            System.out.println("The queue is full - nothing to add!");
        }
    }

    @Override
    public E dequeue() {
        E element = null;
        if (isEmpty()){
            System.out.println("Nothing to process - the queue is empty!");
        }else {
            element = queue[front];
            queue[front] = null;
            front = (front + 1) % capacity;
            size--;
            System.out.println("Processing element: "+ element);
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    // toString
    @Override
    public String toString(){
        String front = "Front: ";
        String sz = "Size: ";
        String representation = "";
        if (isEmpty()){
            sz += size;
        }else {
            front += this.front;
            sz += size;
            for (int k = 0; k < capacity; k++){
                if (k == this.front){
                    representation += ">>[ " + queue[this.front] + " ]<<";
                }else {
                    representation += "[ " + queue[k] + " ]";
                }
            }
        }
        return "Size: " + size + "\n" + front + "\n" + representation + "\n";
    }
}
