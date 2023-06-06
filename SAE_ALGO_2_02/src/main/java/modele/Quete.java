package modele;

import java.util.Arrays;
import java.util.Scanner;

/**
 * La classe Quete représente une quête avec ses attributs.
 */
public class Quete {
    private int chNumero;
    private int [] chPos = new int [2];
    private int [] chPrecond = new int [4];
    private int chDuree;
    private int chExp;
    private String chIntitule;

    /**
     * Constructeur de la classe Quete.
     *
     * @param parLigne (String) La ligne contenant les informations de la quête.
     */
    public Quete(String parLigne){
        Scanner scanner = new Scanner(parLigne).useDelimiter("\\|");
        while (scanner.hasNext()){
            this.chNumero = scanner.nextInt();
            String pos = scanner.next();
            this.chPos = extraitPos(pos);
            String precond = scanner.next();
            this.chPrecond = extraitPrecond(precond);
            this.chDuree = scanner.nextInt();
            this.chExp = scanner.nextInt();
            this.chIntitule = scanner.next();
        }
    }
    /**
     * Extrait les préconditions à partir d'une chaîne de caractères.
     *
     * @param parPrecond La chaîne de caractères contenant les préconditions.
     * @return Un tableau d'entiers représentant les préconditions.
     */
    public int [] extraitPrecond(String parPrecond){
        int [] preconditions = new int [4];
        parPrecond = parPrecond.replace("(","");
        parPrecond = parPrecond.replace(")","");
        parPrecond = parPrecond.replace(" ","");
        Scanner scanPrecondition = new Scanner(parPrecond).useDelimiter(",");
        int i = 0;
        while (scanPrecondition.hasNext()){
            String extrait = scanPrecondition.next();
            if (! extrait.equals(""))
                preconditions[i] = Integer.parseInt(extrait);
            i++;
        }
        return preconditions;
    }

    /**
     * Extrait la position à partir d'une chaîne de caractères.
     *
     * @param parPos La chaîne de caractères contenant la position.
     * @return Un tableau d'entiers représentant la position.
     */
    public int [] extraitPos(String parPos){
        int [] tabPos = new int [2];
        parPos = parPos.replace("(","");
        parPos = parPos.replace(")","");
        parPos = parPos.replace(" ","");
        Scanner scanPos = new Scanner(parPos).useDelimiter(",");
        int i = 0;
        while (scanPos.hasNext()){
            String extrait = scanPos.next();
            if (! extrait.equals(""))
                tabPos[i] = Integer.parseInt(extrait);
            i++;
        }
        return tabPos;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Quete.
     *
     * @return La représentation de la quête.
     */
    public String toString(){
        return chNumero + " - " + Arrays.toString(chPos) + " - " + Arrays.toString(chPrecond) + " - " + chDuree + " - " + chExp + " - " + chIntitule;
    }

    /**
     * Retourne le numéro de la quête.
     *
     * @return Le numéro de la quête.
     */
    public int getNumero(){
        return chNumero;
    }

    /**
     * Retourne les préconditions de la quête.
     *
     * @return Les préconditions de la quête.
     */
    public int [] getPrecond(){
        return chPrecond;
    }

    /**
     * Retourne la position de la quête.
     *
     * @return La position de la quête.
     */
    public int [] getPos(){
        return chPos;
    }

    /**
     * Retourne la durée de la quête.
     *
     * @return La durée de la quête.
     */
    public int getDuree(){
        return chDuree;
    }

    /**
     * Retourne l'expérience que tu gagnes de la quête.
     *
     * @return L'expérience que tu gagnes de la quête.
     */
    public int getExp(){
        return chExp;
    }

    /**
     * Retourne l'intitule de la quête.
     *
     * @return L'intitule de la quête.
     */
    public String getIntitule(){
        return chIntitule;
    }

    /**
     * Retourne les préconditions de la quête.
     *
     * @return Les préconditions de la quête sous forme de String.
     */
    public String getPrecondAsString(){ return Arrays.toString(chPrecond);}

    /**
     * Retourne la position de la quête.
     *
     * @return La position de la quête sous forme de String.
     */
    public String getPosAsString(){ return Arrays.toString(chPos);}

    /**
     * Retourne l'expérience que tu gagnes de la quête.
     *
     * @return L'expérience que tu gagnes de la quête sous forme de string.
     */
    public String getExpAsString(){ return Integer.toString(chExp);}
}

