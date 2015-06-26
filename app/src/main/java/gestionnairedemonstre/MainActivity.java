package gestionnairedemonstre;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.user.gestionnairedemonstres.R;

import java.util.ArrayList;
import java.util.List;

import gestionnairedemonstre.adapters.ListViewMonsterAdapter;
import gestionnairedemonstre.ennemies.Monster;
import gestionnairedemonstre.listeners.ListViewMonsterListener;

/**
 * Main activity class.
 *
 * @author FLamas
 * @author SGirousse
 */
public class MainActivity extends Activity {

    /** A List of Monsters showed on the screen. */
    private List<Monster> _monsters;

    /** An adapter to the monsters list view. */
    private ListViewMonsterAdapter _listViewMonsterAdapter;

    /** A listener to events on the monsters list view. */
    private ListViewMonsterListener _listViewMonsterListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _monsters = new ArrayList<>();

        //Monsters list view.
        ListView lv_monsters = (ListView) findViewById(R.id.listViewMonsters);


        // -- Adapters -- //
        _listViewMonsterAdapter = new ListViewMonsterAdapter(this, R.layout.monster_layout, _monsters);
        lv_monsters.setAdapter(_listViewMonsterAdapter);

        // -- Listeners -- //
        _listViewMonsterListener = new ListViewMonsterListener(this, _monsters);
        lv_monsters.setOnItemClickListener(_listViewMonsterListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Monster list getter.
     * @return List of monsters.
     */
    public List<Monster> get_monsters() {
        return _monsters;
    }

    /**
     * Monster list setter.
     * @param _monsters List of monsters.
     */
    public void set_monsters(List<Monster> _monsters) {
        this._monsters = _monsters;
    }
}
