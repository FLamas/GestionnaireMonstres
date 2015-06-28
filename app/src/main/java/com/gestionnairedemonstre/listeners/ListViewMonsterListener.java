package com.gestionnairedemonstre.listeners;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.gestionnairedemonstre.MainActivity;
import com.gestionnairedemonstre.pojo.monsters.Monster;

import java.util.List;

/**
 * Monster list view item listener class.
 *
 * @author SGirousse
 */
public class ListViewMonsterListener implements OnItemClickListener {

    /**
     * The MainActivity which is the List view's context.
     */
    private final MainActivity _MainActivity;

    /**
     * The Monster list which populate the List view.
     */
    private final List<Monster> _monsters;

    /**
     * Default constructor.
     *
     * @param pMainActivity MainActivity Activity.
     * @param pMonsters     List of Monsters from the activity.
     */
    public ListViewMonsterListener(MainActivity pMainActivity, List<Monster> pMonsters) {
        _MainActivity = pMainActivity;
        _monsters = pMonsters;
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        Log.i("TRACE", getClass() + " *** public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)");

        // TODO Get monster id in order to start intents or particular process.
    }
}