package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes11.dex */
public final class ao50 extends vf60 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17579f = AtomicIntegerFieldUpdater.newUpdater(ao50.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e */
    public final cv8 f17580e;

    public ao50(cv8 cv8Var) {
        this.f17580e = cv8Var;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: i */
    public final boolean mo25338i() {
        return true;
    }

    @Override // p204p.vf60
    /* JADX INFO: renamed from: j */
    public final void mo25339j(Throwable th) {
        if (f17579f.compareAndSet(this, 0, 1)) {
            this.f17580e.invoke(th);
        }
    }
}
