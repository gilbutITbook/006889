// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

package javaStudy;

//정상적인 실행을 위한 코드입니다. 이 아래는 수정하지 마세요.
public class SongTest {

    public static void main(String[] args) {
        Song song = new Song();
        song.songTitle = "밤편지";
        song.singer = "아이유";
        song.albumName = "Palette";
        song.trackNumber = 8;

        System.out.println(
            "[songTitle=" +
            song.songTitle +
            ", " +
            "singer=" +
            song.singer +
            ", " +
            "albumName=" +
            song.albumName +
            ", " +
            "trackNumber=" +
            song.trackNumber +
            "]"
        );
    }
}
