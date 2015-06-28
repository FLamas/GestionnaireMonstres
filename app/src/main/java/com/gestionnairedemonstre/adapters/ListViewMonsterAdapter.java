package com.gestionnairedemonstre.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.gestionnairedemonstre.pojo.monsters.Monster;

import java.util.List;

/**
 * Monster list view item adapter class.
 *
 * @author SGirousse
 */
public class ListViewMonsterAdapter extends ArrayAdapter<Monster> {

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
    private final List<Monster> _monsters;

    /**
     * Default constructor.
     *
     * @param pContext  Application context.
     * @param pLayoutId Id of layout.
     * @param pMonsters List of Monsters.
     */
    public ListViewMonsterAdapter(Context pContext, int pLayoutId, List<Monster> pMonsters) {
        super(pContext, pLayoutId, pMonsters);

        _context = pContext;
        _layoutId = pLayoutId;
        _monsters = pMonsters;
    }

    @Override
    public View getView(int pPosition, View pConvertView, ViewGroup pParent) {
        LayoutInflater layoutInflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        pConvertView = layoutInflater.inflate(_layoutId, pParent, false);

        Monster m = _monsters.get(pPosition);

        // TODO update monster_layout view.

        return pConvertView;
    }
}
