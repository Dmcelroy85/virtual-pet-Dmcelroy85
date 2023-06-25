package virtual_pet;

public class PetNeeds {
    
    //Needs of Virtual Pet, what we need to keep them alive

    private String petName;
    private int hunger;
    private int thirst;
    private int attention;
    private int bladder;
    private int energy; 
    private int hygiene;

    public PetNeeds(String Kirby) {
        petName = Kirby;
        hunger = 1;
        thirst = 1;
        attention = 1;
        bladder = 1;
        energy = 1;
        hygiene = 1;
    }

        //Much like kirby's appearance, Changers!
        public void changeHunger(int h){
            hunger += h;
        }
    
        public void changeThirst(int t){
            thirst += t;
        }
    
        public void changeAttention(int a){
            attention += a;
        }
    
        public void changeEnergy(int e){
            hunger += e;
        }
    
        public void changeBladder(int b){
            hunger += b;
        }
    
        public void changeHygiene(int g)
        {
            hygiene += g;
        }
    
        //Go-Getters
        public String getPetName() {
            return petName;
        }
    
        public int getAttention() {
            return attention;
        }
    
        public int getBladder() {
            return bladder;
        }
    
        public int getEnergy() {
            return energy;
        }
    
        public int getHunger() {
            return hunger;
        }
    
        public int getThirst() {
            return thirst;
        }
    
        public int getHygiene() {
            return hygiene;
        }
    
        //Sa-Setters
        public void setAttention(int attention) {
            this.attention = attention;
        }
    
        public void setBladder(int bladder) {
            this.bladder = bladder;
        }
    
        public void setPetName(String petName) {
            this.petName = petName;
        }
    
        public void setEnergy(int energy) {
            this.energy = energy;
        }
    
        public void setHunger(int hunger) {
            this.hunger = hunger;
        }
    
        public void setThirst(int thirst) {
            this.thirst = thirst;
        }
    
        public void setHygiene(int hygiene) {
            this.hygiene = hygiene;
        }
}
