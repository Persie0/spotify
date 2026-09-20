package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes11.dex */
public final class a2e1 implements Disposable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11655c = AtomicIntegerFieldUpdater.newUpdater(a2e1.class, "isDisposedField$volatile");

    /* JADX INFO: renamed from: a */
    public final hwr f11656a;

    /* JADX INFO: renamed from: b */
    public final hwr f11657b;
    private volatile /* synthetic */ int isDisposedField$volatile;

    public a2e1(hwr hwrVar, hwr hwrVar2) {
        this.f11656a = hwrVar;
        this.f11657b = hwrVar2;
    }

    /* JADX INFO: renamed from: a */
    public final hwr m24511a() {
        return this.f11657b;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        f11655c.set(this, 1);
        this.f11656a.dispose();
        this.f11657b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return f11655c.get(this) == 1;
    }

    public final String toString() {
        return "WorkerTaskDisposable(isDisposed=" + isDisposed() + ')';
    }
}
