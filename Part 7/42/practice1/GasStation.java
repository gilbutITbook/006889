// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

public class GasStation {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation(); // gasStation인스턴스 생성
        Suv suv = new Suv("suv"); // suv 인스턴스 생성
        Truck truck = new Truck("Truck"); // truck 인스턴스 생성
        Bus bus = new Bus("Bus"); // bus 인스턴스 생성

        // gasStation에서 suv에 기름을 넣습니다.
        gasStation.fill(suv);

        // gasStation에서 truck에 기름을 넣습니다.
        gasStation.fill(truck);

        // gasStation에서 bus에 기름을 넣습니다.
        gasStation.fill(bus);
    }

    public void fill(Car car) {
        System.out.println(car.name + "에 기름을 넣습니다.");
        car.gas += 10;
        System.out.println("기름이 " + car.gas + "리터 들어있습니다.");
    }
}
