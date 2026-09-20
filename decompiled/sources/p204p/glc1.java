package p204p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class glc1 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uvu0 f81054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserver f81055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hlc1 f81056c;

    public glc1(uvu0 uvu0Var, ViewTreeObserver viewTreeObserver, hlc1 hlc1Var) {
        this.f81054a = uvu0Var;
        this.f81055b = viewTreeObserver;
        this.f81056c = hlc1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f81055b;
        boolean zIsAlive = viewTreeObserver.isAlive();
        hlc1 hlc1Var = this.f81056c;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(hlc1Var);
        } else {
            this.f81054a.f234508a.getViewTreeObserver().removeOnPreDrawListener(hlc1Var);
        }
        return w2a1.f247311a;
    }
}
