package project;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class tablemysql2 extends JFrame
{
    public tablemysql2()
    {
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();
        Connection connect=null;
    ResultSet rst=null;
    PreparedStatement pst=null;
 connect=(Connection)Course.connDB();
        //  Connect to an MySQL Database, run query, get result set
        
        String sql = "SELECT * FROM Faculty";

        // Java SE 7 has try-with-resources
        // This will ensure that the sql objects are closed when the program 
        // is finished with them
        try {
            Statement stmt=connect.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
        
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        //  Create table with database data    
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );

        JPanel buttonPanel = new JPanel();
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
    }

    public static void main(String[] args)
    {
        tablemysql2 frame = new tablemysql2();
        frame.pack();
        frame.setVisible(true);
    }
}