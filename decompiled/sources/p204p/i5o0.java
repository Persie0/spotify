package p204p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class i5o0 implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j5o0 f98998a;

    public i5o0(j5o0 j5o0Var) {
        this.f98998a = j5o0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p.gh00, p.qe70] */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j5o0 j5o0Var = this.f98998a;
        Object objInvoke = j5o0Var.f109025b.invoke(Boolean.valueOf(j5o0.m52460c(j5o0Var.f109028e, j5o0Var.f109027d)));
        if (objInvoke != null) {
            j5o0Var.f109026c.invoke(objInvoke);
        }
    }
}
