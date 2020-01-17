package tech.thkim.listscroll;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        // 아이템을 추가
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");
        listAdapter.add("리스트뷰 아이템입니다.");

        // 리스트뷰의 높이를 계산에서 layout 크기를 설정
        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++){
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);

        listView.setAdapter(listAdapter);
    }
}
