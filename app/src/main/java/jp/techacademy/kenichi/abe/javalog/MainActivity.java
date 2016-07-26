package jp.techacademy.kenichi.abe.javalog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        Human human = new Human("人間", 1,"ゲーム");     // 名前を人間、年齢1歳、趣味はゲームでhumanのインスタンスを作る
        human.say();
        human.think();
    }
}
