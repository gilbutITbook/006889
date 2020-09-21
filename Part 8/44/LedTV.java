// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public class LedTV implements TV {

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("켜다");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("끄다");
    }

    @Override
    public void changeVolume(int volume) {
        // TODO Auto-generated method stub
        System.out.println("볼륨을 조절하다");
    }

    @Override
    public void changeChannel(int channel) {
        // TODO Auto-generated method stub
        System.out.println("채널을 변경하다");
    }
}
