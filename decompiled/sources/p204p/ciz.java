package p204p;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ciz extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final xq4 f38450a;

    public ciz(xq4 xq4Var) {
        this.f38450a = xq4Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f38450a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f38450a.m91815a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f38450a.f264863a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        tiv0 tiv0Var = (tiv0) this.f38450a.f264865c.invoke();
        rect.set(Math.round(tiv0Var.f220751a), Math.round(tiv0Var.f220752b), Math.round(tiv0Var.f220753c), Math.round(tiv0Var.f220754d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f38450a.m91815a(menu);
    }
}
