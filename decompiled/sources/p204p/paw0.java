package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class paw0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f175638a;

    /* JADX INFO: renamed from: b */
    public final Object f175639b;

    /* JADX INFO: renamed from: c */
    public final n250 f175640c;

    /* JADX INFO: renamed from: d */
    public final Optional f175641d;

    /* JADX INFO: renamed from: e */
    public final CompositeDisposable f175642e;

    /* JADX INFO: renamed from: f */
    public final AtomicLong f175643f;

    /* JADX INFO: renamed from: g */
    public final BehaviorSubject f175644g;

    public paw0(Scheduler scheduler, yaw0 yaw0Var, j7n0 j7n0Var, n250 n250Var, Optional optional) {
        this.f175638a = scheduler;
        this.f175639b = yaw0Var;
        this.f175640c = n250Var;
        this.f175641d = optional;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f175642e = compositeDisposable;
        this.f175643f = new AtomicLong(0L);
        this.f175644g = BehaviorSubject.m23796g(zy91.f287537a);
        Single singleMo28485a = yaw0Var.mo28485a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Completable completableFlatMapCompletable = singleMo28485a.timeout(5000L, timeUnit, scheduler).onErrorReturnItem(i951.f99913a).flatMapCompletable(new vnt0(this, 10));
        completableFlatMapCompletable.getClass();
        compositeDisposable.mo23393b(completableFlatMapCompletable.m23305v(15000L, timeUnit, Schedulers.f10369b, null).m23296h(new oaw0(this, 0)).m23299p(Functions.f7232h).subscribe());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.yaw0] */
    /* JADX INFO: renamed from: a */
    public final CompletableOnErrorComplete m69504a(int i) {
        CompletablePeek completablePeekM23296h = this.f175639b.mo28486b(i).compose(new t9w0(i, this, 1)).subscribeOn(this.f175638a).doOnSubscribe(u9w0.f228297d).doOnSuccess(new qmx(this, 26)).ignoreElement().m23296h(new oaw0(this, 1));
        oaw0 oaw0Var = new oaw0(this, 2);
        Consumer consumer = Functions.f7228d;
        Action action = Functions.f7227c;
        return completablePeekM23296h.m23297i(oaw0Var, consumer, action, action, action, action).m23296h(new oaw0(this, 3)).m23299p(Functions.f7232h);
    }

    /* JADX INFO: renamed from: b */
    public final Completable m69505b() {
        Completable completableIgnoreElement;
        BehaviorSubject behaviorSubject = (BehaviorSubject) this.f175641d.orElse(null);
        return (behaviorSubject == null || (completableIgnoreElement = behaviorSubject.filter(oyq0.f171868h).firstOrError().timeout(5L, TimeUnit.SECONDS, this.f175638a).ignoreElement()) == null) ? CompletableEmpty.f7437a : completableIgnoreElement;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f175642e.m23396g();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
