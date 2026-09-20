package p204p;

import android.content.res.Resources;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ljc1 extends eqk {

    /* JADX INFO: renamed from: a */
    public njc1 f134058a;

    /* JADX INFO: renamed from: b */
    public int f134059b;

    /* JADX INFO: renamed from: c */
    public View f134060c;

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f134060c = view;
        try {
            coordinatorLayout.m378s(view, i);
            m59145t(view);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            Resources resources = view.getContext().getResources();
            Logger.m3973i("child id is %1$s and parent id is %2$s", view.getId() == -1 ? "no_id" : resources.getResourceEntryName(view.getId()), coordinatorLayout.getId() != -1 ? resources.getResourceEntryName(coordinatorLayout.getId()) : "no_id");
            throw e;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m59145t(View view) {
        if (this.f134058a == null) {
            this.f134058a = new njc1(view);
        }
        njc1 njc1Var = this.f134058a;
        View view2 = njc1Var.f154560a;
        njc1Var.f154561b = view2.getTop();
        njc1Var.f154562c = view2.getLeft();
        njc1Var.m64605a();
        int i = this.f134059b;
        if (i != 0) {
            njc1 njc1Var2 = this.f134058a;
            if (njc1Var2.f154563d != i) {
                njc1Var2.f154563d = i;
                njc1Var2.m64605a();
            }
            this.f134059b = 0;
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m59146u() {
        njc1 njc1Var = this.f134058a;
        if (njc1Var != null) {
            return njc1Var.f154563d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m59147v(int i) {
        njc1 njc1Var = this.f134058a;
        if (njc1Var == null) {
            this.f134059b = i;
            return false;
        }
        if (njc1Var.f154563d == i) {
            return false;
        }
        njc1Var.f154563d = i;
        njc1Var.m64605a();
        return true;
    }
}
