package p204p;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class mjc1 extends eqk {

    /* JADX INFO: renamed from: a */
    public ojc1 f144232a;

    /* JADX INFO: renamed from: b */
    public int f144233b = 0;

    public mjc1() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo42049u(coordinatorLayout, view, i);
        if (this.f144232a == null) {
            this.f144232a = new ojc1(view);
        }
        ojc1 ojc1Var = this.f144232a;
        View view2 = ojc1Var.f166039a;
        ojc1Var.f166040b = view2.getTop();
        ojc1Var.f166041c = view2.getLeft();
        this.f144232a.m67109a();
        int i2 = this.f144233b;
        if (i2 == 0) {
            return true;
        }
        this.f144232a.m67110b(i2);
        this.f144233b = 0;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final int m61963t() {
        ojc1 ojc1Var = this.f144232a;
        if (ojc1Var != null) {
            return ojc1Var.f166042d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public void mo42049u(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m378s(view, i);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m61964v(int i) {
        ojc1 ojc1Var = this.f144232a;
        if (ojc1Var != null) {
            return ojc1Var.m67110b(i);
        }
        this.f144233b = i;
        return false;
    }

    public mjc1(int i) {
    }
}
