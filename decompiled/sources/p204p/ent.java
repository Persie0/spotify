package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes11.dex */
public final class ent implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qe70 f61223a;

    /* JADX WARN: Multi-variable type inference failed */
    public ent(gh00 gh00Var) {
        this.f61223a = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.flatMapCompletable(new dnt(0, this.f61223a)).m23307y();
    }
}
