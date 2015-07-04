package com.gestionnairedemonstre;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;

import com.gestionnairedemonstre.R.id;
import com.gestionnairedemonstre.R.layout;
import com.gestionnairedemonstre.R.menu;
import com.gestionnairedemonstre.adapters.ListViewMonsterAdapter;
import com.gestionnairedemonstre.listeners.ButtonAddMonsterListener;
import com.gestionnairedemonstre.listeners.ListViewMonsterListener;
import com.gestionnairedemonstre.pojo.monsters.Boss;
import com.gestionnairedemonstre.pojo.monsters.Monstre;

import java.util.ArrayList;
import java.util.List;

/**
 * Main activity class.
 *
 * @author FLamas
 * @author SGirousse
 */
public class MainActivity extends AppCompatActivity {

    /**
     * A List of Monsters showed on the screen.
     */
    private List<Monstre> _monstres;

    /**
     * An adapter to the monsters list view.
     */
    private ListViewMonsterAdapter _listViewMonsterAdapter;

    /**
     * A listener to events on the monsters list view.
     */
    private ListViewMonsterListener _listViewMonsterListener;

    /**
     * A listener to events on the add monster button.
     */
    private ButtonAddMonsterListener _buttonAddMonsterListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        _monstres = new ArrayList<>();


        _monstres.add(new Monstre());
        _monstres.add(new Monstre());
        _monstres.add(new Boss());

        // -- GUI elements -- //
        ListView lv_monsters = (ListView) findViewById(id.listViewMonsters);
        Button button_addMonster = (Button) findViewById(id.addMonster);

        // -- Adapters -- //
        _listViewMonsterAdapter = new ListViewMonsterAdapter(this, layout.monster_layout, _monstres);
        lv_monsters.setAdapter(_listViewMonsterAdapter);

        // -- Listeners -- //
        _listViewMonsterListener = new ListViewMonsterListener(this, _monstres);
        lv_monsters.setOnItemClickListener(_listViewMonsterListener);

        _buttonAddMonsterListener = new ButtonAddMonsterListener(this);
        button_addMonster.setOnClickListener(_buttonAddMonsterListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu pMenu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(menu.menu_main, pMenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem pItem) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int itemId = pItem.getItemId();

        //noinspection SimplifiableIfStatement
        if (itemId == id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(pItem);
    }

    /**
     * Monstre list getter.
     *
     * @return List of monsters.
     */
    public List<Monstre> get_monstres() {
        return _monstres;
    }

    /**
     * Monstre list setter.
     *
     * @param _monstres List of monsters.
     */
    public void set_monstres(List<Monstre> _monstres) {
        this._monstres = _monstres;
    }
}
