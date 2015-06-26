package gestionnairedemonstre.listeners;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import java.util.List;

import gestionnairedemonstre.MainActivity;
import gestionnairedemonstre.ennemies.Monster;

/**
 * Monster list view item listener class.
 * @author SGirousse
 */
public class ListViewMonsterListener implements AdapterView.OnItemClickListener {

    private MainActivity _MainActivity;
    private List<Monster> _monsters;

    public ListViewMonsterListener(MainActivity pMainActivity, List<Monster> pMonsters){
        _MainActivity=pMainActivity;
        _monsters=pMonsters;
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        Log.i("TRACE", this.getClass() +" *** public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)");

        // TODO Get monster id in order to start intents or particular process.
    }
}