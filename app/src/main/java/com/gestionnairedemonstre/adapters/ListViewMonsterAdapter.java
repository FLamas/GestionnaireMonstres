package com.gestionnairedemonstre.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.gestionnairedemonstre.R;
import com.gestionnairedemonstre.pojo.monsters.Monstre;

import java.util.List;

/**
 * Monstre list view item adapter class.
 *
 * @author SGirousse
 */
public class
        ListViewMonsterAdapter extends ArrayAdapter<Monstre> {

    /**
     * Application context.
     */
    private final Context _context;

    /**
     * Layout id.
     */
    private final int _layoutId;

    /**
     * List of monsters.
     */
    private final List<Monstre> _monstres;

    /**
     * Default constructor.
     *
     * @param pContext  Application context.
     * @param pLayoutId Id of layout.
     * @param pMonstres List of Monsters.
     */
    public ListViewMonsterAdapter(Context pContext, int pLayoutId, List<Monstre> pMonstres) {
        super(pContext, pLayoutId, pMonstres);

        _context = pContext;
        _layoutId = pLayoutId;
        _monstres = pMonstres;
    }

    @Override
    public View getView(int pPosition, View pConvertView, ViewGroup pParent) {
        LayoutInflater layoutInflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        pConvertView = layoutInflater.inflate(_layoutId, pParent, false);

        // Populate the monster layout.
        Monstre m = _monstres.get(pPosition);

        TextView textViewMonsterName = (TextView) pConvertView.findViewById(R.id.textViewMonsterName);
        textViewMonsterName.setText(m.get_nomMonstre());

        TextView textViewMonsterAP = (TextView) pConvertView.findViewById(R.id.textViewMonsterAttackPoints);
        textViewMonsterAP.setText(Integer.toString(m.get_pointsDegats()));

        return pConvertView;
    }
}
