package shapefinder;

public class sphere extends Shape {
    sphere(int dim1 , int dim2){
        super(dim1 , dim2);
    }
    public int area(){
        return 4*this.dim1*this.dim2;
    }
}
