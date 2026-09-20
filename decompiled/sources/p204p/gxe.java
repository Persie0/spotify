package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes7.dex */
public final class gxe implements ub40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingleEmitter f85271a;

    public gxe(SingleEmitter singleEmitter) {
        this.f85271a = singleEmitter;
    }

    @Override // p204p.ub40
    /* JADX INFO: renamed from: c */
    public final void mo37209c(vb40 vb40Var, fgw fgwVar) {
        Object obj = vb40Var.f239400b;
        Throwable th = fgwVar.f69412c;
        this.f85271a.tryOnError(new RuntimeException("Error getting bitmap for " + obj + " with message " + th.getMessage(), th.getCause()));
    }
}
