package weijiangtao.bwie.com.zhoukaoer.activity;

import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import weijiangtao.bwie.com.zhoukaoer.R;
import weijiangtao.bwie.com.zhoukaoer.view.MyView;

public class MainActivity extends AppCompatActivity {
    
    private int screenWidth;
    private int screenHeight;
    private int lastX, lastY;
    private MyView myhaha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myhaha = (MyView) findViewById(R.id.myhaha);
//        DisplayMetrics dm = getResources().getDisplayMetrics();
//        screenWidth = dm.widthPixels+150;
//        screenHeight = dm.heightPixels ;
//
//        myhaha.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        
//                        lastX = (int) event.getRawX();
//                        lastY = (int) event.getRawY();
////          System.out.println("lastX:"+lastX+",lastY:"+lastY);  
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        int dx = (int) event.getRawX() - lastX;
//                        int dy = (int) event.getRawY() - lastY;
//
//                        int left = v.getLeft() + dx;
//                        int top = v.getTop() + dy;
//                        int right = v.getRight() + dx;
//                        int bottom = v.getBottom() + dy;
//
//                        System.out.println("left:" + left);
//                        System.out.println("top:" + top);
//                        System.out.println("right:" + right);
//                        System.out.println("bottom:" + bottom);
//
//                        // 设置不能出界  
//                        if (left < 0) {
//                            left = 0;
//                            right = left + v.getWidth();
//                        }
//
//                        if (right > screenWidth) {
//                            right = screenWidth;
//                            left = right - v.getWidth();
//                        }
//
//                        if (top < 0) {
//                            top = 0;
//                            bottom = top + v.getHeight();
//                        }
//
//                        if (bottom > screenHeight) {
//                            bottom = screenHeight;
//                            top = bottom - v.getHeight();
//                        }
//                        v.layout(left, top, right, bottom);
//
//                        lastX = (int) event.getRawX();
//                        lastY = (int) event.getRawY();
//
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        break;
//                }
//                return true;
//            }
//        });
    }
}
