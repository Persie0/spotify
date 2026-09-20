package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class gr51 extends zge0 implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final lhe0 f83645A;

    /* JADX INFO: renamed from: z */
    public final zge0 f83646z;

    public gr51(Context context, zge0 zge0Var, lhe0 lhe0Var) {
        super(context);
        this.f83646z = zge0Var;
        this.f83645A = lhe0Var;
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: e */
    public final boolean mo45457e(lhe0 lhe0Var) {
        return this.f83646z.mo45457e(lhe0Var);
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: f */
    public final boolean mo45458f(zge0 zge0Var, lhe0 lhe0Var) {
        return super.mo45458f(zge0Var, lhe0Var) || this.f83646z.mo45458f(zge0Var, lhe0Var);
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: g */
    public final boolean mo45459g(lhe0 lhe0Var) {
        return this.f83646z.mo45459g(lhe0Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f83645A;
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: k */
    public final String mo45460k() {
        lhe0 lhe0Var = this.f83645A;
        int i = lhe0Var != null ? lhe0Var.f133528a : 0;
        if (i == 0) {
            return null;
        }
        return s571.m77246e(i, "android:menu:actionviewstates:");
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: l */
    public final zge0 mo45461l() {
        return this.f83646z.mo45461l();
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: n */
    public final boolean mo45462n() {
        return this.f83646z.mo45462n();
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: o */
    public final boolean mo45463o() {
        return this.f83646z.mo45463o();
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: p */
    public final boolean mo45464p() {
        return this.f83646z.mo45464p();
    }

    @Override // p204p.zge0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f83646z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m96075x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m96075x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m96075x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f83645A.setIcon(drawable);
        return this;
    }

    @Override // p204p.zge0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f83646z.setQwertyMode(z);
    }

    @Override // p204p.zge0
    /* JADX INFO: renamed from: w */
    public final void mo45465w(xge0 xge0Var) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m96075x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m96075x(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f83645A.setIcon(i);
        return this;
    }
}
