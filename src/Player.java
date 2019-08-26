public class Player {
    public int TotalScore = 0;

    public int MilitaryWinsOne;
    public int MilitaryWinsThree;
    public int MilitaryWinsFive;
    public int MilitaryLosses;

    public int Gold;

    public int WonderPoints;

    public int CivilianPoints;

    public int tablets;
    public int gears;
    public int tools;

    //Todo: Implement Resources to have better counting, this area is subject to change since it it dependant on other buildings for counting points
    public int CommercialPoints;

    //Todo: Implement Resources to have better counting, this area is subject to change since it it dependant on other buildings for counting points you will not be able to implement this yet because I havent done resources
    public int GuildPoints;

    public void CalculateScore()
    {
        //Reset Score to 0
        TotalScore = 0;

        //Calculate Military Score
        TotalScore = TotalScore + MilitaryWinsOne + (MilitaryWinsThree * 3) + (MilitaryWinsFive * 5);
        TotalScore = TotalScore - MilitaryLosses;

        //Calculate Gold
        int GoldScore = (int)Mathf.Floor((Gold/3));
        TotalScore = TotalScore + GoldScore;

        //Calculate Wonder
        TotalScore = TotalScore + WonderPoints;

        //Calculate Civilian Points
        TotalScore = TotalScore + CivilianPoints;

        //Calculate Science
        int ScienceScore = ScoreScience(tablets, gears, tools);
        TotalScore = TotalScore + ScienceScore;

    }

    int ScoreScience(int t_tablets, int t_gears, int t_tools)
    {
        //Return Score
        int returnScienceScore = 0;

        //Square Values
        int TabletsScore = (int)Mathf.Pow(t_tablets, 2);
        int GearsScore = (int)Mathf.Pow(t_gears, 2);
        int ToolsScore = (int)Mathf.Pow(t_tools, 2);
        returnScienceScore = returnScienceScore + TabletsScore + GearsScore + ToolsScore;

        //Sets of 3
        if (t_tablets <= t_gears && t_tablets <= t_tools) {
            returnScienceScore = returnScienceScore + (t_tablets * 7);
        } else if (t_gears <= t_tablets && t_gears <= t_tools) {
            returnScienceScore = returnScienceScore + (t_gears * 7);
        } else if (t_tools <= t_tablets && t_tools <= t_gears) {
            returnScienceScore = returnScienceScore + (t_tools * 7);
        }

        return returnScienceScore;
    }
}
