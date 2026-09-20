package p204p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class hlc1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public boolean f92669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uvu0 f92670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewTreeObserver f92671c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hqb f92672d;

    public hlc1(uvu0 uvu0Var, ViewTreeObserver viewTreeObserver, hqb hqbVar) {
        this.f92670b = uvu0Var;
        this.f92671c = viewTreeObserver;
        this.f92672d = hqbVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        uvu0 uvu0Var = this.f92670b;
        ci21 ci21VarM84070c = uvu0Var.m84070c();
        if (ci21VarM84070c != null) {
            ViewTreeObserver viewTreeObserver = this.f92671c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                uvu0Var.f234508a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f92669a) {
                this.f92669a = true;
                this.f92672d.resumeWith(ci21VarM84070c);
            }
        }
        return true;
    }
}
