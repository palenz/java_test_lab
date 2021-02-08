public class waterBottle {

    public int content;

    public waterBottle(){
        this.content = 100;
    }


    public int drink() {
        return this.content -= 10;
    }

    public int empty() {
        return this.content = 0;
    }

    public int fill() {
        return this.content = 100;
    }
}
