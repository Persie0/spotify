package p204p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class o6u0 {

    /* JADX INFO: renamed from: a */
    public final urt0 f162417a;

    /* JADX INFO: renamed from: b */
    public final wra0 f162418b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f162419c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final PublishSubject f162420d;

    public o6u0(urt0 urt0Var, wra0 wra0Var) {
        this.f162417a = urt0Var;
        this.f162418b = wra0Var;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        PublishSubject publishSubject = new PublishSubject();
        this.f162420d = publishSubject;
        compositeDisposable.mo23393b(Single.fromCallable(new ic9(urt0Var, 19)).map(hvi0.f95729X).subscribeOn(Schedulers.f10370c).subscribe(new qmx(this, 25), new n6u0(this, 0)));
        compositeDisposable.mo23393b(publishSubject.concatMap(new bcm0(this, 26)).subscribe(new n6u0(this, 1), new n6u0(this, 2)));
    }

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap m66366c() {
        return this.f162419c;
    }

    /* JADX INFO: renamed from: d */
    public final void m66367d(String str) {
        LinkedHashMap linkedHashMap = this.f162419c;
        Integer num = (Integer) linkedHashMap.get(str);
        linkedHashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        this.f162420d.onNext(str);
    }
}
