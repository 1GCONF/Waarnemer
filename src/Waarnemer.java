import java.util.Scanner;
import java.util.Arrays;

public class Waarnemer {
    private int[] temperaturen;
    private int index;

    public Waarnemer() {
        this.temperaturen = new int[1];
        this.index = 0;
    }

    void typeTemeperaturen() {
        var scanner = new Scanner(System.in);
        var temp = scanner.nextInt();
        while (temp != 999) {
            if (this.index == this.temperaturen.length) {
                var biggerArray = new int[this.temperaturen.length + 1];
                for (int i = 0; i < this.temperaturen.length; i++) {
                    biggerArray[i] = this.temperaturen[i];
                }
                this.temperaturen = biggerArray;
            }
            temperaturen[index] = temp;
            index++;
            temp = scanner.nextInt();
        }
    }

    void totaalTemperaturen() {
        System.out.println(this.temperaturen.length);
    }

    void hoogsteTemperatuur() {
        Arrays.sort(this.temperaturen);
        System.out.println("Hoogste - "+this.temperaturen[this.temperaturen.length - 1]);
    }

    void laagsteTemperatuur() {
        Arrays.sort(this.temperaturen);
        System.out.println("Laagste - "+this.temperaturen[0]);
    }

    void gemiddeldeTemperatuur() {
        int totaal = 0;
        for (var t : temperaturen
        ) {
            totaal += t;
        }
        System.out.println("Gemiddelde - "+((int) (totaal) / (int) (temperaturen.length)));
    }
}
/*
- het aantal ingegeven temperaturen
- de hoogste temperatuur
- de laagste temperatuur
- de gemiddelde temperatuur
* */