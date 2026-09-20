package p204p;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class ii10 {

    /* JADX INFO: renamed from: g */
    public static final Set f102400g;

    /* JADX INFO: renamed from: a */
    public final GlueToolbar f102401a;

    /* JADX INFO: renamed from: b */
    public final hi10 f102402b;

    /* JADX INFO: renamed from: c */
    public final Window f102403c;

    /* JADX INFO: renamed from: d */
    public boolean f102404d;

    /* JADX INFO: renamed from: e */
    public boolean f102405e;

    /* JADX INFO: renamed from: f */
    public final StateListAnimatorImageButton f102406f;

    static {
        Object[] objArr = {Integer.valueOf(R.id.actionbar_item_profile), Integer.valueOf(R.id.toolbar_up_button)};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(klh.m56833e(obj, "duplicate element: "));
            }
        }
        f102400g = Collections.unmodifiableSet(hashSet);
    }

    public ii10(GlueToolbar glueToolbar, Window window, View.OnClickListener onClickListener) {
        this.f102401a = glueToolbar;
        Window.Callback callback = window.getCallback();
        hi10 hi10Var = callback instanceof hi10 ? (hi10) callback : new hi10(this, callback);
        this.f102402b = hi10Var;
        this.f102403c = window;
        window.setCallback(hi10Var);
        Context context = glueToolbar.getView().getContext();
        this.f102406f = new StateListAnimatorImageButton(context);
        this.f102406f.setImageDrawable(new tc41(context, vc41.ARROW_LEFT, context.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size)));
        StateListAnimatorImageButton stateListAnimatorImageButton = this.f102406f;
        WeakHashMap weakHashMap = mec1.f142677a;
        stateListAnimatorImageButton.setBackground(null);
        this.f102406f.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f102406f.setOnClickListener(onClickListener);
        this.f102406f.setContentDescription(context.getResources().getText(R.string.content_description_toolbar_back_button));
    }

    /* JADX INFO: renamed from: a */
    public final void m50675a(Context context, zge0 zge0Var) {
        Set set;
        q081 q081Var = new q081(context, zge0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        lhe0 lhe0Var = null;
        for (int i = 0; i < zge0Var.f282605f.size(); i++) {
            MenuItem item = zge0Var.getItem(i);
            if (item.isVisible()) {
                lhe0 lhe0Var2 = (lhe0) item;
                if ((lhe0Var2.f133552y & 2) != 2) {
                    arrayList.add(lhe0Var2);
                } else if (lhe0Var2.f133528a == R.id.actionbar_item_shuffle_play) {
                    lhe0Var = lhe0Var2;
                } else {
                    arrayList2.add(lhe0Var2);
                }
            }
        }
        ToolbarSide toolbarSide = ToolbarSide.END;
        GlueToolbar glueToolbar = this.f102401a;
        glueToolbar.clear(toolbarSide);
        glueToolbar.clear(ToolbarSide.START);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                glueToolbar.addOverflowItem((MenuItem) it.next());
            }
        }
        if (this.f102405e) {
            glueToolbar.addView(ToolbarSide.START, this.f102406f, R.id.toolbar_up_button);
        }
        int size = arrayList2.size();
        while (true) {
            size--;
            set = f102400g;
            if (size < 0) {
                break;
            }
            MenuItem menuItem = (MenuItem) arrayList2.get(size);
            View actionView = menuItem.getActionView();
            ToolbarSide toolbarSide2 = set.contains(Integer.valueOf(menuItem.getItemId())) ? ToolbarSide.START : ToolbarSide.END;
            if (actionView != null) {
                glueToolbar.addView(toolbarSide2, actionView, menuItem.getItemId());
            } else {
                boolean z = menuItem instanceof s561;
                glueToolbar.addView(toolbarSide2, ((z ? ((s561) menuItem).mo58969b() : null) != null ? z ? ((s561) menuItem).mo58969b() : null : q081Var).mo64476c(menuItem), menuItem.getItemId());
            }
        }
        if (lhe0Var != null) {
            int i2 = lhe0Var.f133528a;
            glueToolbar.addView(set.contains(Integer.valueOf(i2)) ? ToolbarSide.START : ToolbarSide.END, lhe0Var.getActionView(), i2);
        }
    }
}
