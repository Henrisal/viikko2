//Did together with Aapo Halme and GPT was used for talk.isempty()
package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void Speak(String talk) {
        System.out.println(name + ": " + talk);
    }

    public void Run(int round){
        for(int i=0; i<round; i++){
            System.out.println(name+" juoksee kovaa vauhtia!");
        }
    }
    public void Empty() {
        System.out.println("Olen "+name+" ja ikäni on "+age+" vuotta, mutta antaisitko silti syötteen?");
    }
}
