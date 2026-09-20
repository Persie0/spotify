package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes.dex */
public final class x7x implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f259003a;

    /* JADX INFO: renamed from: b */
    public Disposable f259004b;

    /* JADX INFO: renamed from: c */
    public final PublishSubject f259005c = new PublishSubject();

    public x7x(i4t0 i4t0Var) {
        this.f259003a = i4t0Var;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        Disposable disposable = this.f259004b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
