package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ikc0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableInterval extends Flowable<Long> {

    /* JADX INFO: renamed from: b */
    public final Scheduler f7877b;

    /* JADX INFO: renamed from: c */
    public final long f7878c;

    /* JADX INFO: renamed from: d */
    public final long f7879d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f7880e;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class IntervalSubscriber extends AtomicLong implements ot51, Runnable {

        /* JADX INFO: renamed from: a */
        public final ft51 f7881a;

        /* JADX INFO: renamed from: b */
        public long f7882b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f7883c = new AtomicReference();

        public IntervalSubscriber(ft51 ft51Var) {
            this.f7881a = ft51Var;
        }

        /* JADX INFO: renamed from: a */
        public final void m23523a(Disposable disposable) {
            DisposableHelper.m23418g(this.f7883c, disposable);
        }

        @Override // p204p.ot51
        public final void cancel() {
            DisposableHelper.m23414a(this.f7883c);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference atomicReference = this.f7883c;
            if (atomicReference.get() != DisposableHelper.f7218a) {
                long j = get();
                ft51 ft51Var = this.f7881a;
                if (j == 0) {
                    ft51Var.onError(new MissingBackpressureException(ikc0.m50938j(this.f7882b, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.m23414a(atomicReference);
                } else {
                    long j2 = this.f7882b;
                    this.f7882b = j2 + 1;
                    ft51Var.onNext(Long.valueOf(j2));
                    BackpressureHelper.m23746e(this, 1L);
                }
            }
        }
    }

    public FlowableInterval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f7878c = j;
        this.f7879d = j2;
        this.f7880e = timeUnit;
        this.f7877b = scheduler;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(ft51Var);
        ft51Var.onSubscribe(intervalSubscriber);
        Scheduler scheduler = this.f7877b;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalSubscriber.m23523a(scheduler.mo23385e(intervalSubscriber, this.f7878c, this.f7879d, this.f7880e));
        } else {
            Scheduler.Worker workerMo23281b = scheduler.mo23281b();
            intervalSubscriber.m23523a(workerMo23281b);
            workerMo23281b.m23387c(intervalSubscriber, this.f7878c, this.f7879d, this.f7880e);
        }
    }
}
