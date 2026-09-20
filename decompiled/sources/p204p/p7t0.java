package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p7t0 extends AtomicReference implements ft51 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q7t0 f174762a;

    public p7t0(q7t0 q7t0Var) {
        this.f174762a = q7t0Var;
    }

    @Override // p204p.ft51
    public final void onComplete() {
        o7t0.m66396j(this.f174762a.f186168Z, this);
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        o7t0.m66396j(this.f174762a.f186168Z, this);
        ki5.m56473e().m42761b(new ig10(th, 25));
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        this.f174762a.m33101j(obj);
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (compareAndSet(null, ot51Var)) {
            ot51Var.request(Long.MAX_VALUE);
        } else {
            ot51Var.cancel();
        }
    }
}
