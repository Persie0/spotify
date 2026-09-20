package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class x2z0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z2z0 f257604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f257605b;

    public x2z0(z2z0 z2z0Var, int i) {
        this.f257604a = z2z0Var;
        this.f257605b = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        z2z0 z2z0Var = this.f257604a;
        z2z0Var.m95238b();
        int i = z2z0Var.f278717c;
        if (i == 7 && this.f257605b == z2z0Var.f278718d && i == 7) {
            z2z0Var.m95237a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
