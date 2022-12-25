package HelpingClasses;

import Backend_Classes.Route;
public class HelpingAddRouteClass
{
    public static Route addroute[]=new Route[5];
    private static int route=0;

    public static void Routefill()
    {
        for(int i=0;i<5;i++)
        {
            addroute[i]=new Route();
            addroute[i].setBSource("");
            addroute[i].setBDestination("");
        }
    }

    public static int getRoute()
    {
        return route;
    }
    public static void addRoute()
    {
        route += 1;
    }
    public static void DeleteRoute()
    {
        route-= 1;
    }


    //-------------------------------------------------- Setters -------------------------------------------------//
    public static void setSource(String To, int r)
    {
        addroute[r].setBSource(To);
        System.out.println(" set from panel SetBSourcem "+addroute[r].getBSource());
    }
    public static void setDestination(String From, int r)
    {
        addroute[r].setBDestination(From);
        System.out.println(" set from panel SetBDestenation "+addroute[r].getBDestination());

    }
    //-------------------------------------------------------------------------------------------------------------//
    public static String getSource(int r)
    {
        System.out.println(" set from panel SetBSource "+addroute[r].getBSource());
        return addroute[r].getBSource();
    }
    public static String getDestination(int r)
    {
        System.out.println(" set from panel SetBDestenation "+addroute[r].getBDestination());
        return addroute[r].getBDestination();
    }

    //-----------------------------------------------------------------------------------------------------//

    public static void DeleteRoute(int r)
    {

       addroute[r].setBSource("");
       addroute[r].setBDestination("");


        for (int i = r; i < route; i++)
        {
            addroute[r].setBSource(getSource(i));
            addroute[r].setBDestination(getDestination(i));
        }

        DeleteRoute();
    }

}
