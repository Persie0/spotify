package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class unc1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f232145a;

    /* JADX INFO: renamed from: b */
    public snc1 f232146b;

    /* JADX INFO: renamed from: c */
    public di41 f232147c;

    /* JADX INFO: renamed from: d */
    public tnc1 f232148d;

    /* JADX INFO: renamed from: e */
    public boolean f232149e;

    public unc1(View view) {
        this.f232145a = view;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m83546a() {
        try {
            di41 di41Var = this.f232147c;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            qg10 qg10Var = qg10.f188337a;
            n5q n5qVar = xsr.f265651a;
            this.f232147c = x0h1.m89578u(qg10Var, pvb0.f181680a.f197428f, 0, new r611(this, null, 23), 2);
            this.f232146b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tnc1 tnc1Var = this.f232148d;
        if (tnc1Var == null) {
            return;
        }
        this.f232149e = true;
        tnc1Var.f221939a.m48896a(tnc1Var.f221940b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        tnc1 tnc1Var = this.f232148d;
        if (tnc1Var != null) {
            tnc1Var.m81171d();
        }
    }
}
