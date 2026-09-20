package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes2.dex */
public final class vbp0 implements ObservableSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Observable f239550a;

    public vbp0(Observable observable) {
        this.f239550a = observable.filter(wej0.f250566g).onErrorReturnItem(new ubp0()).distinctUntilChanged().map(s2z.f205114Y0);
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(Observer observer) {
        this.f239550a.subscribe(observer);
    }
}
