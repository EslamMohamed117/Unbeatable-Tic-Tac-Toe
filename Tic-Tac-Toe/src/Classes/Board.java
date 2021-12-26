package Classes;

public class Board {
    protected static char[] playGround= {'-','-','-','-','-','-','-','-','-'};
    public static boolean checkWin(char letter)
    {
        //Check rows
        for(int i = 0; i<9 ; i+=3)
        {        
            if(playGround[i] == letter && playGround[i+1] == letter && playGround[i+2] == letter) return true;
        }
        //Check coloumns
        for(int i = 0; i<3 ; i++)
        {        
            if(playGround[i] == letter && playGround[i+3] == letter && playGround[i+6] == letter) return true;
        }
        //Check Main diagonal    
        if(playGround[0] == letter && playGround[4] == letter && playGround[8] == letter)   return true;

        //Check reverse diagonal
        if(playGround[2] == letter && playGround[4] == letter && playGround[6] == letter)   return true;
        
        return false;
    }
    public static void assignPlay(char letter, int place)
    {
        playGround[place] = letter;   
    }
    public static boolean legalPlay(int place)
    {
        return playGround[place] == '-';
    }
}
