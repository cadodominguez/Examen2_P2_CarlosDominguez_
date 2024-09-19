
package examen2_carlosdominguez;

public class Tortuga {
    private String Nombre;
    private int miliS;
    private int edad;
    private int wins;
    private int añoI;
    private int añoR;

    public Tortuga(String Nombre, int miliS, int edad, int wins, int añoI, int añoR) {
        this.Nombre = Nombre;
        this.miliS = miliS;
        this.edad = edad;
        this.wins = wins;
        this.añoI = añoI;
        this.añoR = añoR;
    }

    public int getAñoR() {
        return añoR;
    }

    public void setAñoR(int añoR) {
        this.añoR = añoR;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMiliS() {
        return miliS;
    }

    public void setMiliS(int miliS) {
        this.miliS = miliS;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getAñoI() {
        return añoI;
    }

    public void setAñoI(int añoI) {
        this.añoI = añoI;
    }
    
}
