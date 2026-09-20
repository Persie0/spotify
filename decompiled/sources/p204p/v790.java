package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v790 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f238105b;

    public /* synthetic */ v790(AtomicBoolean atomicBoolean, int i) {
        this.f238104a = i;
        this.f238105b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f238104a) {
            case 0:
                this.f238105b.set(true);
                break;
            default:
                this.f238105b.set(true);
                break;
        }
    }
}
