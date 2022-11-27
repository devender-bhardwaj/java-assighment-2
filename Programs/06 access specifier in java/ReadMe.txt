Rectangle is our class which has members as
    length : private
    width : package private
    getPerimeter : protectecd
    getArea : public

Rectangle :
All members of Rectangle are visible from Rectangle

Driver :
This class is same package as Rectangle
    It cannot access private (i.e length)
    It can access all others members

Square : 
This is outside package and extends Rectangle
    It cannot access private and package private
    It can access public and protected members

Main :
This is outside the package
    It can only access public members