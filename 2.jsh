double sphere(double d) {
    return (4.0 / 3.0) * Math.PI * Math.pow(d / 2.0, 3);
}

double volume = sphere(20.24);
System.out.println(volume);