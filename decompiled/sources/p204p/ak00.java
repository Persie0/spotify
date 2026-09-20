package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ak00 implements awr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f16382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ awr f16383b;

    public /* synthetic */ ak00(AtomicBoolean atomicBoolean, awr awrVar) {
        this.f16382a = atomicBoolean;
        this.f16383b = awrVar;
    }

    @Override // p204p.awr
    public final void dispose() {
        this.f16382a.set(true);
        this.f16383b.dispose();
    }
}
