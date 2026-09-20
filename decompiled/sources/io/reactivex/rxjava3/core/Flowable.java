package io.reactivex.rxjava3.core;

import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDelay;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInterval;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRange;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeat;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.rxjava3.internal.subscribers.DisposableAutoReleaseSubscriber;
import io.reactivex.rxjava3.internal.subscribers.LambdaSubscriber;
import io.reactivex.rxjava3.internal.subscribers.StrictSubscriber;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p204p.edb;
import p204p.ft51;
import p204p.i7t0;
import p204p.s571;
import rxdogtag2.C2684m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Flowable<T> implements i7t0 {

    /* JADX INFO: renamed from: a */
    public static final int f7192a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    /* JADX INFO: renamed from: E */
    public static Flowable m23309E(Object... objArr) {
        Objects.requireNonNull(objArr, "items is null");
        if (objArr.length == 0) {
            return FlowableEmpty.f7745b;
        }
        return objArr.length == 1 ? m23313I(objArr[0]) : new FlowableFromArray(objArr);
    }

    /* JADX INFO: renamed from: F */
    public static FlowableFromIterable m23310F(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new FlowableFromIterable(iterable);
    }

    /* JADX INFO: renamed from: G */
    public static Flowable m23311G(i7t0 i7t0Var) {
        if (i7t0Var instanceof Flowable) {
            return (Flowable) i7t0Var;
        }
        Objects.requireNonNull(i7t0Var, "publisher is null");
        return new FlowableFromPublisher(i7t0Var);
    }

    /* JADX INFO: renamed from: H */
    public static FlowableInterval m23312H(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: I */
    public static FlowableJust m23313I(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new FlowableJust(obj);
    }

    /* JADX INFO: renamed from: K */
    public static Flowable m23314K(Flowable flowable, i7t0 i7t0Var) {
        Objects.requireNonNull(flowable, "source1 is null");
        Objects.requireNonNull(i7t0Var, "source2 is null");
        return m23309E(flowable, i7t0Var).m23328B(Functions.f7225a, 2, f7192a);
    }

    /* JADX INFO: renamed from: O */
    public static Flowable m23315O(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(s571.m77246e(i2, "count >= 0 required but it was "));
        }
        if (i2 == 0) {
            return FlowableEmpty.f7745b;
        }
        if (i2 == 1) {
            return m23313I(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return new FlowableRange(i, i2);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    /* JADX INFO: renamed from: a */
    public static Flowable m23316a(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, Flowable flowable3, Flowable flowable4, Function5 function5) {
        Objects.requireNonNull(flowable4, "source5 is null");
        return m23323i(new i7t0[]{flowableMap, flowable, flowable2, flowable3, flowable4}, Functions.m23442s(function5), f7192a);
    }

    /* JADX INFO: renamed from: a0 */
    public static FlowableTimer m23317a0(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableTimer(Math.max(0L, j), timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: c */
    public static Flowable m23318c(i7t0 i7t0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, Flowable flowable4, Flowable flowable5, Function6 function6) {
        Objects.requireNonNull(i7t0Var, "source1 is null");
        Objects.requireNonNull(flowable, "source2 is null");
        Objects.requireNonNull(flowable2, "source3 is null");
        Objects.requireNonNull(flowable4, "source5 is null");
        Objects.requireNonNull(flowable5, "source6 is null");
        return m23323i(new i7t0[]{i7t0Var, flowable, flowable2, flowable3, flowable4, flowable5}, Functions.m23443t(function6), f7192a);
    }

    /* JADX INFO: renamed from: d */
    public static Flowable m23319d(i7t0 i7t0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, Flowable flowable4, i7t0 i7t0Var2, Flowable flowable5, Flowable flowable6, Function8 function8) {
        Objects.requireNonNull(flowable2, "source3 is null");
        Objects.requireNonNull(flowable3, "source4 is null");
        Objects.requireNonNull(flowable4, "source5 is null");
        Objects.requireNonNull(flowable5, "source7 is null");
        Objects.requireNonNull(flowable6, "source8 is null");
        return m23323i(new i7t0[]{i7t0Var, flowable, flowable2, flowable3, flowable4, i7t0Var2, flowable5, flowable6}, Functions.m23445v(function8), f7192a);
    }

    /* JADX INFO: renamed from: e */
    public static Flowable m23320e(i7t0 i7t0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, Function4 function4) {
        Objects.requireNonNull(i7t0Var, "source1 is null");
        Objects.requireNonNull(flowable, "source2 is null");
        Objects.requireNonNull(flowable2, "source3 is null");
        Objects.requireNonNull(flowable3, "source4 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return m23323i(new i7t0[]{i7t0Var, flowable, flowable2, flowable3}, Functions.m23441r(function4), f7192a);
    }

    /* JADX INFO: renamed from: g */
    public static Flowable m23321g(i7t0 i7t0Var, Flowable flowable, Flowable flowable2, Function3 function3) {
        Objects.requireNonNull(i7t0Var, "source1 is null");
        Objects.requireNonNull(flowable, "source2 is null");
        Objects.requireNonNull(flowable2, "source3 is null");
        return m23323i(new i7t0[]{i7t0Var, flowable, flowable2}, Functions.m23440q(function3), f7192a);
    }

    /* JADX INFO: renamed from: h */
    public static Flowable m23322h(i7t0 i7t0Var, i7t0 i7t0Var2, BiFunction biFunction) {
        Objects.requireNonNull(i7t0Var, "source1 is null");
        Objects.requireNonNull(i7t0Var2, "source2 is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return m23323i(new i7t0[]{i7t0Var, i7t0Var2}, Functions.m23439p(biFunction), f7192a);
    }

    /* JADX INFO: renamed from: i */
    public static Flowable m23323i(i7t0[] i7t0VarArr, Function function, int i) {
        if (i7t0VarArr.length == 0) {
            return FlowableEmpty.f7745b;
        }
        ObjectHelper.m23450a(i, "bufferSize");
        return new FlowableCombineLatest(i7t0VarArr, function, i);
    }

    /* JADX INFO: renamed from: k */
    public static Flowable m23324k(Flowable flowable, Flowable flowable2) {
        Objects.requireNonNull(flowable, "source1 is null");
        Objects.requireNonNull(flowable2, "source2 is null");
        return m23325l(flowable, flowable2);
    }

    /* JADX INFO: renamed from: l */
    public static Flowable m23325l(i7t0... i7t0VarArr) {
        if (i7t0VarArr.length == 0) {
            return FlowableEmpty.f7745b;
        }
        return i7t0VarArr.length == 1 ? m23311G(i7t0VarArr[0]) : new FlowableConcatArray(i7t0VarArr);
    }

    /* JADX INFO: renamed from: x */
    public static FlowableError m23326x(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new FlowableError(Functions.m23431h(th));
    }

    /* JADX INFO: renamed from: A */
    public final Single m23327A() {
        return new FlowableElementAtSingle(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final Flowable m23328B(Function function, int i, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.m23450a(i, "maxConcurrency");
        ObjectHelper.m23450a(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new FlowableFlatMap(this, function, i, i2);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? FlowableEmpty.f7745b : FlowableScalarXMap.m23556a(obj, function);
    }

    /* JADX INFO: renamed from: C */
    public final Completable m23329C(Function function) {
        ObjectHelper.m23450a(Alert.DURATION_SHOW_INDEFINITELY, "maxConcurrency");
        return new FlowableFlatMapCompletableCompletable(this, function);
    }

    /* JADX INFO: renamed from: D */
    public final FlowableFlatMapSingle m23330D(Function function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.m23450a(i, "maxConcurrency");
        return new FlowableFlatMapSingle(this, function, z, i);
    }

    /* JADX INFO: renamed from: J */
    public final FlowableMap m23331J(Function function) {
        Objects.requireNonNull(function, "mapper is null");
        return new FlowableMap(this, function);
    }

    /* JADX INFO: renamed from: L */
    public final FlowableObserveOn m23332L(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        int i = f7192a;
        ObjectHelper.m23450a(i, "bufferSize");
        return new FlowableObserveOn(this, scheduler, i);
    }

    /* JADX INFO: renamed from: M */
    public final FlowableOnErrorReturn m23333M(Function function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return new FlowableOnErrorReturn(this, function);
    }

    /* JADX INFO: renamed from: N */
    public final FlowableOnErrorReturn m23334N(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return m23333M(Functions.m23430g(obj));
    }

    /* JADX INFO: renamed from: P */
    public final Flowable m23335P(long j) {
        if (j >= 0) {
            return j == 0 ? FlowableEmpty.f7745b : new FlowableRepeat(this, j);
        }
        throw new IllegalArgumentException(edb.m38561j(j, "times >= 0 required but it was "));
    }

    /* JADX INFO: renamed from: Q */
    public final FlowableReplay m23336Q() {
        ObjectHelper.m23450a(1, "bufferSize");
        return FlowableReplay.m23545f0(this);
    }

    /* JADX INFO: renamed from: R */
    public final FlowableRetryPredicate m23337R(long j, Predicate predicate) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "times >= 0 required but it was "));
        }
        Objects.requireNonNull(predicate, "predicate is null");
        return new FlowableRetryPredicate(this, j, predicate);
    }

    /* JADX INFO: renamed from: S */
    public final FlowableSampleTimed m23338S(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableSampleTimed(this, j, timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: T */
    public final Flowable m23339T(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "other is null");
        return m23325l(i7t0Var, this);
    }

    /* JADX INFO: renamed from: U */
    public final Flowable m23340U(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return m23325l(m23313I(obj), this);
    }

    /* JADX INFO: renamed from: V */
    public abstract void mo23341V(ft51 ft51Var);

    /* JADX INFO: renamed from: W */
    public final FlowableSubscribeOn m23342W(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableSubscribeOn(this, scheduler, !(this instanceof FlowableCreate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final Flowable m23343X(Function function) {
        int i = f7192a;
        ObjectHelper.m23450a(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new FlowableSwitchMap(this, function, i);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? FlowableEmpty.f7745b : FlowableScalarXMap.m23556a(obj, function);
    }

    /* JADX INFO: renamed from: Y */
    public final FlowableTimeoutTimed m23344Y(long j, FlowableError flowableError) {
        return m23345Z(j, TimeUnit.SECONDS, flowableError, Schedulers.f10369b);
    }

    /* JADX INFO: renamed from: Z */
    public final FlowableTimeoutTimed m23345Z(long j, TimeUnit timeUnit, FlowableError flowableError, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableTimeoutTimed(this, j, timeUnit, scheduler, flowableError);
    }

    /* JADX INFO: renamed from: b0 */
    public final FlowableWithLatestFrom m23346b0(i7t0 i7t0Var, BiFunction biFunction) {
        Objects.requireNonNull(i7t0Var, "other is null");
        return new FlowableWithLatestFrom(this, biFunction, i7t0Var);
    }

    /* JADX INFO: renamed from: c0 */
    public final FlowableZip m23347c0(Flowable flowable, BiFunction biFunction) {
        Objects.requireNonNull(flowable, "other is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        Function functionM23439p = Functions.m23439p(biFunction);
        i7t0[] i7t0VarArr = {this, flowable};
        int i = f7192a;
        ObjectHelper.m23450a(i, "bufferSize");
        return new FlowableZip(i7t0VarArr, functionM23439p, i);
    }

    /* JADX INFO: renamed from: j */
    public final Flowable m23348j(FlowableTransformer flowableTransformer) {
        Objects.requireNonNull(flowableTransformer, "composer is null");
        return m23311G(flowableTransformer.mo23362a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final Flowable m23349m(Function function) {
        ObjectHelper.m23450a(2, "prefetch");
        if (!(this instanceof ScalarSupplier)) {
            return new FlowableConcatMap(this, function);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? FlowableEmpty.f7745b : FlowableScalarXMap.m23556a(obj, function);
    }

    /* JADX INFO: renamed from: n */
    public final FlowableConcatMapEager m23350n(Function function, int i, int i2) {
        ObjectHelper.m23450a(i, "maxConcurrency");
        ObjectHelper.m23450a(i2, "prefetch");
        return new FlowableConcatMapEager(this, function, i, i2, ErrorMode.f10254a);
    }

    /* JADX INFO: renamed from: o */
    public final FlowableConcatMapEager m23351o(Function function, boolean z, int i, int i2) {
        ObjectHelper.m23450a(i, "maxConcurrency");
        ObjectHelper.m23450a(i2, "prefetch");
        return new FlowableConcatMapEager(this, function, i, i2, z ? ErrorMode.f10256c : ErrorMode.f10255b);
    }

    /* JADX INFO: renamed from: p */
    public final FlowableConcatMapSingle m23352p(Function function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.m23450a(i, "prefetch");
        return new FlowableConcatMapSingle(this, function, z ? ErrorMode.f10256c : ErrorMode.f10255b, i);
    }

    /* JADX INFO: renamed from: q */
    public final FlowableDebounceTimed m23353q(long j, TimeUnit timeUnit) {
        Scheduler scheduler = Schedulers.f10369b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableDebounceTimed(this, j, timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: r */
    public final FlowableDelay m23354r(long j, Scheduler scheduler) {
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableDelay(this, Math.max(0L, j), scheduler);
    }

    /* JADX INFO: renamed from: s */
    public final FlowableDistinctUntilChanged m23355s(BiPredicate biPredicate) {
        Objects.requireNonNull(biPredicate, "comparer is null");
        return new FlowableDistinctUntilChanged(this, Functions.f7225a, biPredicate);
    }

    public final Disposable subscribe() {
        return subscribe(Functions.f7228d, Functions.f7230f, Functions.f7227c);
    }

    /* JADX INFO: renamed from: t */
    public final FlowableDistinctUntilChanged m23356t(Function function) {
        Objects.requireNonNull(function, "keySelector is null");
        return new FlowableDistinctUntilChanged(this, function, ObjectHelper.f7265a);
    }

    /* JADX INFO: renamed from: u */
    public final FlowableDoOnEach m23357u(Consumer consumer, Consumer consumer2, Action action, Action action2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onAfterTerminate is null");
        return new FlowableDoOnEach(this, consumer, consumer2, action, action2);
    }

    /* JADX INFO: renamed from: v */
    public final FlowableDoOnEach m23358v(Consumer consumer) {
        Consumer consumer2 = Functions.f7228d;
        Action action = Functions.f7227c;
        return m23357u(consumer, consumer2, action, action);
    }

    /* JADX INFO: renamed from: w */
    public final FlowableDoOnLifecycle m23359w(Consumer consumer) {
        LongConsumer longConsumer = Functions.f7231g;
        Action action = Functions.f7227c;
        Objects.requireNonNull(longConsumer, "onRequest is null");
        Objects.requireNonNull(action, "onCancel is null");
        return new FlowableDoOnLifecycle(this, consumer, longConsumer, action);
    }

    /* JADX INFO: renamed from: y */
    public final FlowableFilter m23360y(Predicate predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new FlowableFilter(this, predicate);
    }

    /* JADX INFO: renamed from: z */
    public final Single m23361z(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return new FlowableElementAtSingle(this, obj);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f7230f, Functions.f7227c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.f7227c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action);
        subscribe((FlowableSubscriber) lambdaSubscriber);
        return lambdaSubscriber;
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseSubscriber disposableAutoReleaseSubscriber = new DisposableAutoReleaseSubscriber(consumer, consumer2, action, disposableContainer);
        disposableContainer.mo23393b(disposableAutoReleaseSubscriber);
        subscribe((FlowableSubscriber) disposableAutoReleaseSubscriber);
        return disposableAutoReleaseSubscriber;
    }

    @Override // p204p.i7t0
    public final void subscribe(ft51 ft51Var) {
        if (ft51Var instanceof FlowableSubscriber) {
            subscribe((FlowableSubscriber) ft51Var);
        } else {
            Objects.requireNonNull(ft51Var, "subscriber is null");
            subscribe((FlowableSubscriber) new StrictSubscriber(ft51Var));
        }
    }

    public final void subscribe(FlowableSubscriber<? super T> flowableSubscriber) {
        Objects.requireNonNull(flowableSubscriber, "subscriber is null");
        try {
            C2684m c2684m = RxJavaPlugins.f10308b;
            if (c2684m != null) {
                try {
                    flowableSubscriber = (FlowableSubscriber<? super T>) ((ft51) c2684m.apply(this, flowableSubscriber));
                } catch (Throwable th) {
                    throw ExceptionHelper.m23754f(th);
                }
            }
            Objects.requireNonNull(flowableSubscriber, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo23341V(flowableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
