public class Triangle{
 private Point v1, v2, v3;

 public Triangle(Point a, Point b, Point c){
  v1 = a;
  v2 = b;
  v3 = c;
 }

 public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
  v1 = new Point(x1, y1);
  v2 = new Point(x2, y2);
  v3 = new Point(x3, y3);
 }

 public void setVertex(int index, Point newP){
  if (index == 0){
   v1 = newP;
  }else if (index == 1){
   v2 = newP;
  }else{
   v3 = newP;
  }
 }

 public double getPerimeter(){
  return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
 }

 public double getArea(){
  double s = (v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v1))/2;
  return s * (s - v1.distanceTo(v2)) * (s - v1.distanceTo(v3)) * (s - v2.distanceTo(v3));
 }

 public String classify(){
  double d1 = (Math.round(10000 * v1.distanceTo(v2)))/10000;
  double d2 = (Math.round(10000 * v1.distanceTo(v3)))/10000;
  double d3 = (Math.round(10000 * v2.distanceTo(v3)))/10000;
  if (d1 == d2 && d2 == d3){
   return "equilateral";
  }else if (d1 == d2 || d1 == d3 || d2 == d3){
   return "isosceles";
  }else{
   return "scalene";
  }
 }

 public String toString(){
  return "v1" + "("+ v1.getX() + ", "+ v1.getY() + ")" + " v2" + "("+ v2.getX() + ", "+ v2.getY() + ")" + " v3" + "("+ v3.getX() + ", "+ v3.getY() + ")";
 }

}