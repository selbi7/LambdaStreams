package enams;

public class DBConnections {

    public static void main(String[] args) {


        String database="OracleSQL";
        if(database.equalsIgnoreCase(Databases.POSTGRESQL.toString())){
            System.out.println("Connecting to PostgreSQL");
        }else if(database.equalsIgnoreCase(Databases.COSMOSDB.toString())){
            System.out.println("Connecting to CosmosDB");
        }else if(database.equalsIgnoreCase(Databases.ORACLESQL.toString())){
            System.out.println("Connecting to OracleSQL");
        }

    }


}
