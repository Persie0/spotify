package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xk61 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f262290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yk61 f262291b;

    public xk61(yk61 yk61Var, View view) {
        this.f262291b = yk61Var;
        this.f262290a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f262290a;
        if (view2.getVisibility() == 0) {
            this.f262291b.m93967d(view2);
        }
    }
}
