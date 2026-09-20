package p204p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m6t0 extends AtomicBoolean implements Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f140574a;

    /* JADX INFO: renamed from: b */
    public final n6t0 f140575b;

    public m6t0(Observer observer, n6t0 n6t0Var) {
        this.f140574a = observer;
        this.f140575b = n6t0Var;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (compareAndSet(false, true)) {
            this.f140575b.m63787a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get();
    }
}
