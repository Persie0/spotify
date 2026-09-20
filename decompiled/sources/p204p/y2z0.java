package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public final class y2z0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f268697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z2z0 f268698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f268699c;

    public y2z0(ViewGroup viewGroup, z2z0 z2z0Var, int i) {
        this.f268697a = viewGroup;
        this.f268698b = z2z0Var;
        this.f268699c = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f268697a.removeOnAttachStateChangeListener(this);
        z2z0 z2z0Var = this.f268698b;
        if (z2z0Var.f278717c == 7) {
            int i = z2z0Var.f278718d;
            int i2 = this.f268699c;
            if (i2 != i) {
                return;
            }
            z2z0Var.m95238b();
            z2z0Var.f278719e = view;
            x2z0 x2z0Var = new x2z0(z2z0Var, i2);
            z2z0Var.f278720f = x2z0Var;
            view.addOnAttachStateChangeListener(x2z0Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
