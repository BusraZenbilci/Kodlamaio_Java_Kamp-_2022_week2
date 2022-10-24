public class Product {

    public Product(int id, String name, String descrition, int price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı.");
        this._id = id;
        this._name = name;
        this._description=descrition;
        this._price=price;
        this._stockAmount=stockAmount;
        this._renk=renk;
    }
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;

    private String _renk;

    public int getId(){ return _id; }
    public void setId( int id ) {
        _id = id;
    }

    public String get_name() { return _name; };

    public void set_name ( String name) {
        _name = name;
    }

    public String get_description() { return _description; };

    public void set_description ( String description) {
        _description = description;
    }

    public double get_price() { return _price; }

    public void set_price ( double price) {
        _price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount (int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String get_kod() {
        return _renk;
    }

    public void set_kod (String kod) {
        _renk = kod;
    }


}
