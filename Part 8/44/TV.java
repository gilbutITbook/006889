// 본문의 코드를 소개한 파일입니다.
// 경우에 따라 컴파일이 되지 않거나 원하는 결과가 나오지 않을 수 있으니
// 참고용으로 사용해주시고, 반드시 코드를 확인 후 컴파일하기 바랍니다.

package javaStudy;

public interface TV {
    public int MIN_VOLUME = 0;
    public int Max_VOLUME = 100;

    public void turnOn();

    public void turnOff();

    public void changeVolume(int volume);

    public void changeChannel(int channel);
}
