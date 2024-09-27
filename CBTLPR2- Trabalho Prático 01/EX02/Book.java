package EX02;

//@author Maria Eduarda Fodor CB3025063
//@author Pedro Xavier Oliveira CB3027376



import EX01.Author;

public class Book
{
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() 
    {
        return name;
    }

    public Author[] getAuthors()
    {
        return authors;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String toString()
    {
        String authorsString = "";
        for (Author author : authors) 
        {
            authorsString += author.toString() + ",";
        }
        return "Book[ name = " + name + ", authors = { " + authorsString + "}, price = " + price + ", qty = " + qty + " ]";
    }

    public String getAuthorNames()
    {
        String authorNames = "";
        for (Author author : authors) 
        {
            authorNames += author.getName() + ", ";
        }
    
        if (authorNames.length() > 0) 
        {
            authorNames = authorNames.substring(0, authorNames.length() - 2);
        }
    
        return authorNames;
    }
    
}