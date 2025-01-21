package LAB;
class Box {
double width ;
double height ;
double depth ;
// compute and r e t u r n volume
double volume ( ) {
return height * width * depth ;
}
// s e t s d imen s i on s o f Box
void setDim (double w, double h , double d ) {
width = w;
height = h ;
depth = d ;
}
}
class BoxDemo {
public s t a t i c void main ( S t ri n g a rg s [ ] ) {
Box mybox = new Box ( ) ;
double vol ;
// i n i t i a l i z e mybox
mybox . setDim (10 , 20 , 1 5 ) ;
// g e t volume o f box
vol = mybox . volume ( ) ;
System . out . p r i n t l n ( ”Volume : ” + vol ) ;
}
}