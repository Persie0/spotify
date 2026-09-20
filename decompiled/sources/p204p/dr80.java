package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public final class dr80 implements ObservableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9p f52192b;

    public /* synthetic */ dr80(z9p z9pVar, int i) {
        this.f52191a = i;
        this.f52192b = z9pVar;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        int i = this.f52191a;
        z9p z9pVar = this.f52192b;
        switch (i) {
            case 0:
                cr80 cr80Var = cr80.f41204h;
                return observable.map(new oh5()).compose((ObservableTransformer) ((wg61) z9pVar.f280847f).getValue()).map(haz.f89334i);
            default:
                return observable.observeOn((Scheduler) z9pVar.f280843b).scan(kaz.f121009t).distinctUntilChanged().switchMap(new s780(z9pVar, 2));
        }
    }
}
