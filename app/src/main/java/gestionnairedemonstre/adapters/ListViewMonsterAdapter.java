package gestionnairedemonstre.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import gestionnairedemonstre.ennemies.Monster;

/**
 * Monster list view item adapter class.
 * @author SGirousse
 */
public class ListViewMonsterAdapter extends ArrayAdapter<Monster> {

    /** Application context. */
    private Context _context;

    /** Layout id. */
    private int _layoutId;

    /** List of monsters. */
    private List<Monster> _monsters;

    /**
     * Default constructor.
     *
     * @param pContext Application context.
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
