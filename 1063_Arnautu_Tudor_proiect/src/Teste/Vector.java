package Teste;

import java.util.ArrayList;

public class Vector {
    // initializeaza vector
    ArrayList<Integer> vector = new ArrayList<Integer>();

    public Vector(ArrayList<Integer> vectorNou) throws Exception {
        // verifica daca lista e null
        if (vectorNou == null) {
            throw new Exception("Vectorul este null");
        }
        
        for(int i = 0; i < vectorNou.size(); i++) {
            vector.add(vectorNou.get(i));
        }
    }

    public ArrayList<Integer> getVector() {
        return vector;
    }

    public void setVector(ArrayList<Integer> vector) throws Exception {
        // verifica daca lista e null
        if (vector == null) {
            throw new Exception("Vectorul este null");
        }
        this.vector = vector;
    }

    // suma elementelor vectorului
    public int sumaElemente() {
        int result = 0;

        for (int i = 0; i < vector.size(); i++) {
            result += vector.get(i);
        }

        return result;
    }

    // numarul maxim si par din colectie
    public int maximPar() throws Exception {
        if (this.vector.size() == 0) {
            throw new Exception("Nu sunt elemente");
        }
        
        int answer = vector.get(0);

        for (int i = 0; i < vector.size(); i++) {
            // folosim modulo 2
            if (Math.abs(vector.get(i)) % 2 == 0 && vector.get(i) > answer) {
                answer = vector.get(i);
            }
        }

        // primul elemet poate sa nu fie par
        // si sa nu mai existe alte elemente pare
        if (Math.abs(answer) % 2 != 0) {
            throw new Exception("Nu am gasit numere pare");
        }

        return answer;
    }
}