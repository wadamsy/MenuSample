package wadamasaya.menusample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuListActivity extends AppCompatActivity {

    private ListView _lvMenu;
    private List<Map<String, Object>> _menuList;
    private static final String[] FROM = {"name","price"};
    private static final int[] TO = {R.id.tvMenuName,R.id.tvMenuPrice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        _lvMenu = findViewById(R.id.lvMenu);
        _menuList = createTeishokuList();

        SimpleAdapter adapter = new SimpleAdapter(MenuListActivity.this, _menuList, R.layout.row,FROM,TO);
        _lvMenu.setAdapter(adapter);
        _lvMenu.setOnItemClickListener(new ListItemClickListener());
    }
    


    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Map<String,Object> item = (Map<String,Object>) parent.getItemAtPosition(position);
            String menuName = (String) item.get("name");
            Integer menuPrice = (Integer) item.get("price");
            Intent intent = new Intent(MenuListActivity.this,MenuThanksActivity.class);
            intent.putExtra("menuName",menuName);
            intent.putExtra("menuPrice",menuPrice + "円");
            startActivity(intent);
        }
    }

    private List<Map<String,Object>> createTeishokuList(){
        List<Map<String, Object>> menuList = new ArrayList<>();

        Map<String, Object> menu = new HashMap<>();
        menu.put("name", "から揚げ定食");
        menu.put("price", 800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 850);
        menu.put("desc","ハンバーグ定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "生姜焼き定食");
        menu.put("price", 850);
        menu.put("desc","生姜焼き定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ステーキ定食");
        menu.put("price", 1000);
        menu.put("desc","ステーキ定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", 750);
        menu.put("desc","野菜炒め定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", 900);
        menu.put("desc","とんかつ定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ミンチカツ定食");
        menu.put("price", 850);
        menu.put("desc","ミンチカツ定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "チキンカツ定食");
        menu.put("price", 900);
        menu.put("desc","チキンカツ定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "コロッケ定食");
        menu.put("price", 850);
        menu.put("desc","コロッケ定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", 800);
        menu.put("desc","焼き魚定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼肉定食");
        menu.put("price", 1000);
        menu.put("desc","焼肉定食にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        return menuList;

    }
}
