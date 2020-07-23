/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval;

import java.util.Scanner;

/**
 *
 * @author jules.rachet
 */
public class Q1 {
// Programme qui inverse les nombre d'un tableau ex : Tab[#1] devient Tab[#9]
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [] Tab;
        int i;
        final int Ord;
        int decount;
        int Swap1;
        int Swap2;
        int Nb;
        Scanner reader = new Scanner(System.in);

        Ord = 10;
        decount = 9;
        Tab = new int[Ord];


        for(i = 0; i < Ord ; i++)
        {
            Nb = reader.nextInt();
            Tab[i] = Nb;
        }

        for (i = 0;  i <= 4 ; i++ )
        {
            Swap2 = Tab[i];
            Swap1 = Tab[decount];
            Tab[i] = Swap1;
            Tab[decount] = Swap2;
            decount--;

        }
        for (i = 0; i < Ord; i++)
        {
            System.out.print(Tab[i] + "\t");
        }
    }
}
