/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares.ljug.urcommades;

import net.cofares.ljug.event.CommandesCallback;

/**
 *
 * @author pfares
 */
public class CommandsLang {
    //CommandCallback lesSemantiques;
    public static void parse(CommandesCallback lesSemantiques, URCTokenizer scan) {
        CommandeUR cur;
        System.out.flush();
        System.out.printf("\n$> ");
        System.out.flush();
        scan.nToken();
        while (true) {            
            cur = CommandeUR.parse(lesSemantiques, scan);
            if (cur == null) {
                //skip pour essayer de reprendre
                //System.out.print("Pas une commande correcte " + scan.getTok());
                //System.out.printf("\n$> ");
                scan.nToken();
                continue;
            }
            cur.eval();
            System.out.printf("\n$> ");
        }
        /**/
    }
}
