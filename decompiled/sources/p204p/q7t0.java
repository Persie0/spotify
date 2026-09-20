package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q7t0 extends ck90 {

    /* JADX INFO: renamed from: Y */
    public final i7t0 f186167Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicReference f186168Z = new AtomicReference();

    public q7t0(Flowable flowable) {
        this.f186167Y = flowable;
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        p7t0 p7t0Var = new p7t0(this);
        this.f186168Z.set(p7t0Var);
        this.f186167Y.subscribe(p7t0Var);
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        ot51 ot51Var;
        p7t0 p7t0Var = (p7t0) this.f186168Z.getAndSet(null);
        if (p7t0Var == null || (ot51Var = (ot51) p7t0Var.get()) == null) {
            return;
        }
        ot51Var.cancel();
    }
}
