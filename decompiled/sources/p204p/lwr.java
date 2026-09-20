package p204p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lwr {

    /* JADX INFO: renamed from: a */
    public final CompositeDisposable f137623a = new CompositeDisposable();

    /* JADX INFO: renamed from: a */
    public final void m60127a(Disposable disposable) {
        this.f137623a.mo23393b(disposable);
    }

    /* JADX INFO: renamed from: b */
    public final void m60128b(Disposable... disposableArr) {
        this.f137623a.m23395f((Disposable[]) Arrays.copyOf(disposableArr, disposableArr.length));
    }

    /* JADX INFO: renamed from: c */
    public final void m60129c() {
        this.f137623a.m23396g();
    }
}
