package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class ubz implements Function {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f228905a;

    public ubz(AtomicBoolean atomicBoolean) {
        this.f228905a = atomicBoolean;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return this.f228905a.compareAndSet(false, true) ? Observable.just(obj) : Observable.timer(500L, TimeUnit.MILLISECONDS).map(new bre(obj));
    }

    public ubz() {
        this.f228905a = new AtomicBoolean(false);
    }
}
