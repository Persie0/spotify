package p204p;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes11.dex */
public final class pvx0 implements SingleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f181859a;

    public pvx0(hqb hqbVar) {
        this.f181859a = hqbVar;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f181859a.resumeWith(new c6x0(th));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        this.f181859a.mo42415l(new rv70(disposable, 20));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f181859a.resumeWith(obj);
    }
}
