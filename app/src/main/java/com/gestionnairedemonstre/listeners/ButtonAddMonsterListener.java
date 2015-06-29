package com.gestionnairedemonstre.listeners;

import android.view.View;
import android.view.View.OnClickListener;

import com.gestionnairedemonstre.MainActivity;

/**
 * Listener to click on Button in charge of adding new Monstre.
 *
 * @author SGirousse
 */
public class ButtonAddMonsterListener implements OnClickListener {

    /**
     * The MainActivity which is the Button's context.
     */
    private final MainActivity _MainActivity;

    /**
     * Default constructor.
     *
     * @param main_activity The MainActivity Activity.
     */
    public ButtonAddMonsterListener(MainActivity main_activity) {
        _MainActivity = main_activity;
    }

    @Override
    public void onClick(View v) {
        // TODO start an intent or whatever needed.
    }
}