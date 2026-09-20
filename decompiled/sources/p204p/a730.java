package p204p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class a730 extends njv0 {

    /* JADX INFO: renamed from: a */
    public final int f12933a;

    /* JADX INFO: renamed from: b */
    public final int f12934b;

    /* JADX INFO: renamed from: c */
    public final int f12935c;

    public a730(int i, int i2, int i3) {
        this.f12933a = i;
        this.f12934b = i2;
        this.f12935c = i3;
    }

    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        int iM968S = RecyclerView.m968S(view);
        if (iM968S == -1) {
            return;
        }
        boolean z = iM968S == 0;
        hjv0 adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z2 = iM968S == adapter.mo1617e() - 1;
        boolean z3 = recyclerView.getLayoutDirection() == 1;
        int i = this.f12933a;
        int i2 = z ? this.f12934b : i / 2;
        int i3 = z2 ? this.f12935c : i / 2;
        rect.left = z3 ? i3 : i2;
        if (!z3) {
            i2 = i3;
        }
        rect.right = i2;
    }
}
