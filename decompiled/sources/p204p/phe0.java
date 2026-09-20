package p204p;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class phe0 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f177642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qhe0 f177643b;

    public phe0(qhe0 qhe0Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f177643b = qhe0Var;
        this.f177642a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f177642a.onMenuItemActionCollapse(this.f177643b.m44553i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f177642a.onMenuItemActionExpand(this.f177643b.m44553i(menuItem));
    }
}
