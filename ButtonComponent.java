package OOP;

public  class ButtonComponent extends AbstractButton{
    public void click(){
        System.out.println("Button was clicked");
    }

    public void onClick(){
        System.out.println("I handle the click event");
    }

}
