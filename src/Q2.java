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
public class Q2 {
// Programme qui inverse les nombre d'un tableau ex : Tab[#1] devient Tab[#9]
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [][] Tab;
        final int OrdI;
        final int OrdJ;
        int i;
        int j;
        int Max;
        int Min;
        int Amp;

        Scanner reader = new Scanner(System.in);

        OrdI = 5;
        OrdJ = 2;
        Tab = new int[OrdI][OrdJ];


        for(i = 0; i < OrdI ; i++)
        {
            for(j = 0; j < OrdJ; j++)
            {
                System.out.printf("Entrez votre nombre [%d][%d] : ", i+1, j+1);
                Tab[i][j] = reader.nextInt();
            }
        }

        Max =  Tab[0][0];
        Min = Tab[0][0];
        for (i = 0;  i < OrdI ; i++ )
        {
            for(j = 0; j < OrdJ; j++)
            {
                if (Tab[i][j] > Max)
                    Max = Tab[i][j];
                else if (Tab[i][j] < Min)
                    Min = Tab[i][j];
            }

        }
        Amp = Max - Min;
        for (i = 0; i < OrdI; i++)
        {
            System.out.print("\n");
            for(j = 0; j < OrdJ; j++)
            {
            System.out.print(Tab[i][j] + "\t");
            }
        }
        System.out.print("L'amplitude vaut : " + Amp + "\n");
    }
}
