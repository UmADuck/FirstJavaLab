public record Car(String CarBrand, int MaxSpeed, int EnginePower,
                  int PreviousUsers, String FuelType) {

    public static int YearOfRelease = 1999;

    public Car(String CarBrand, int MaxSpeed, int EnginePower){

        this(CarBrand, MaxSpeed, EnginePower,0, "patrol");
    }

    public static int StaticFieldReturn(){

        return YearOfRelease;
    }

    public String toString(){

        return "Car{"
                +"CarBrand=" + CarBrand
                +", FuelType=" + FuelType
                +", PreviousUsers=" + PreviousUsers
                +", EnginePower=" + EnginePower
                +", MaxSpeed=" + MaxSpeed
                +", YearOfRelease=" + YearOfRelease
                +'}';
    }
}
