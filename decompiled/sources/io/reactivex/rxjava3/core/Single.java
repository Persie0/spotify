package io.reactivex.rxjava3.core;

import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.FuseToMaybe;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.jdk8.CompletionStageConsumer;
import io.reactivex.rxjava3.internal.jdk8.SingleFlattenStreamAsFlowable;
import io.reactivex.rxjava3.internal.jdk8.SingleFlattenStreamAsObservable;
import io.reactivex.rxjava3.internal.jdk8.SingleFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.SingleMapOptional;
import io.reactivex.rxjava3.internal.observers.BiConsumerSingleObserver;
import io.reactivex.rxjava3.internal.observers.BlockingDisposableMultiObserver;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.observers.ConsumerSingleObserver;
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseMultiObserver;
import io.reactivex.rxjava3.internal.observers.FutureMultiObserver;
import io.reactivex.rxjava3.internal.observers.SafeSingleObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToFlowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapSinglePublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromFuture;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFromSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElement;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapSinglePublisher;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapSinglePublisher;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.internal.operators.single.SingleAmb;
import io.reactivex.rxjava3.internal.operators.single.SingleCache;
import io.reactivex.rxjava3.internal.operators.single.SingleContains;
import io.reactivex.rxjava3.internal.operators.single.SingleCreate;
import io.reactivex.rxjava3.internal.operators.single.SingleDefer;
import io.reactivex.rxjava3.internal.operators.single.SingleDelay;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithSingle;
import io.reactivex.rxjava3.internal.operators.single.SingleDematerialize;
import io.reactivex.rxjava3.internal.operators.single.SingleDetach;
import io.reactivex.rxjava3.internal.operators.single.SingleDoAfterSuccess;
import io.reactivex.rxjava3.internal.operators.single.SingleDoAfterTerminate;
import io.reactivex.rxjava3.internal.operators.single.SingleDoFinally;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnDispose;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnError;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnEvent;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnTerminate;
import io.reactivex.rxjava3.internal.operators.single.SingleEquals;
import io.reactivex.rxjava3.internal.operators.single.SingleError;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMap;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapBiSelector;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapIterableFlowable;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapNotification;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleFromCallable;
import io.reactivex.rxjava3.internal.operators.single.SingleFromPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleFromSupplier;
import io.reactivex.rxjava3.internal.operators.single.SingleFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.single.SingleHide;
import io.reactivex.rxjava3.internal.operators.single.SingleInternalHelper;
import io.reactivex.rxjava3.internal.operators.single.SingleJust;
import io.reactivex.rxjava3.internal.operators.single.SingleLift;
import io.reactivex.rxjava3.internal.operators.single.SingleMap;
import io.reactivex.rxjava3.internal.operators.single.SingleMaterialize;
import io.reactivex.rxjava3.internal.operators.single.SingleNever;
import io.reactivex.rxjava3.internal.operators.single.SingleObserveOn;
import io.reactivex.rxjava3.internal.operators.single.SingleOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.single.SingleResumeNext;
import io.reactivex.rxjava3.internal.operators.single.SingleSubscribeOn;
import io.reactivex.rxjava3.internal.operators.single.SingleTakeUntil;
import io.reactivex.rxjava3.internal.operators.single.SingleTimeInterval;
import io.reactivex.rxjava3.internal.operators.single.SingleTimeout;
import io.reactivex.rxjava3.internal.operators.single.SingleTimer;
import io.reactivex.rxjava3.internal.operators.single.SingleToFlowable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.single.SingleUsing;
import io.reactivex.rxjava3.internal.operators.single.SingleZipArray;
import io.reactivex.rxjava3.internal.operators.single.SingleZipIterable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observers.TestObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import p204p.i7t0;
import p204p.stz0;
import rxdogtag2.C2684m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Single<T> implements SingleSource<T> {
    public static <T> Single<T> amb(Iterable<? extends SingleSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new SingleAmb(null, iterable);
    }

    @SafeVarargs
    public static <T> Single<T> ambArray(SingleSource<? extends T>... singleSourceArr) {
        Objects.requireNonNull(singleSourceArr, "sources is null");
        if (singleSourceArr.length == 0) {
            return error((Supplier<? extends Throwable>) SingleInternalHelper.m23706a());
        }
        return singleSourceArr.length == 1 ? wrap(singleSourceArr[0]) : new SingleAmb(singleSourceArr, null);
    }

    public static <T> Flowable<T> concat(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.m23310F(iterable).m23352p(Functions.f7225a, false, 2);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArray(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.m23309E(singleSourceArr).m23352p(Functions.f7225a, false, 2);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArrayDelayError(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.m23309E(singleSourceArr).m23352p(Functions.f7225a, true, 2);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArrayEager(SingleSource<? extends T>... singleSourceArr) {
        Flowable flowableM23309E = Flowable.m23309E(singleSourceArr);
        Function functionM23707b = SingleInternalHelper.m23707b();
        int i = Flowable.f7192a;
        return flowableM23309E.m23350n(functionM23707b, i, i);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArrayEagerDelayError(SingleSource<? extends T>... singleSourceArr) {
        Flowable flowableM23309E = Flowable.m23309E(singleSourceArr);
        Function functionM23707b = SingleInternalHelper.m23707b();
        int i = Flowable.f7192a;
        return flowableM23309E.m23351o(functionM23707b, true, i, i);
    }

    public static <T> Flowable<T> concatDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.m23310F(iterable).m23352p(Functions.f7225a, true, 2);
    }

    public static <T> Flowable<T> concatEager(Iterable<? extends SingleSource<? extends T>> iterable) {
        FlowableFromIterable flowableFromIterableM23310F = Flowable.m23310F(iterable);
        Function functionM23707b = SingleInternalHelper.m23707b();
        int i = Flowable.f7192a;
        return flowableFromIterableM23310F.m23351o(functionM23707b, false, i, i);
    }

    public static <T> Flowable<T> concatEagerDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        FlowableFromIterable flowableFromIterableM23310F = Flowable.m23310F(iterable);
        Function functionM23707b = SingleInternalHelper.m23707b();
        int i = Flowable.f7192a;
        return flowableFromIterableM23310F.m23351o(functionM23707b, true, i, i);
    }

    public static <T> Single<T> create(SingleOnSubscribe<T> singleOnSubscribe) {
        Objects.requireNonNull(singleOnSubscribe, "source is null");
        return new SingleCreate(singleOnSubscribe);
    }

    public static <T> Single<T> defer(Supplier<? extends SingleSource<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new SingleDefer(supplier);
    }

    public static <T> Single<T> error(Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new SingleError(supplier);
    }

    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return new SingleFromCallable(callable);
    }

    public static <T> Single<T> fromCompletionStage(CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return new SingleFromCompletionStage(completionStage);
    }

    public static <T> Single<T> fromFuture(Future<? extends T> future) {
        int i = Flowable.f7192a;
        Objects.requireNonNull(future, "future is null");
        return toSingle(new FlowableFromFuture(future, 0L, null));
    }

    public static <T> Single<T> fromMaybe(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return new MaybeToSingle(maybeSource, null);
    }

    public static <T> Single<T> fromObservable(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "observable is null");
        return new ObservableSingleSingle(observableSource, null);
    }

    public static <T> Single<T> fromPublisher(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "publisher is null");
        return new SingleFromPublisher(i7t0Var);
    }

    public static <T> Single<T> fromSupplier(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new SingleFromSupplier(supplier);
    }

    public static <T> Single<T> just(T t) {
        Objects.requireNonNull(t, "item is null");
        return new SingleJust(t);
    }

    public static <T> Flowable<T> merge(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.m23310F(iterable).m23330D(Functions.f7225a, false, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @SafeVarargs
    public static <T> Flowable<T> mergeArray(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.m23309E(singleSourceArr).m23330D(Functions.f7225a, false, Math.max(1, singleSourceArr.length));
    }

    @SafeVarargs
    public static <T> Flowable<T> mergeArrayDelayError(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.m23309E(singleSourceArr).m23330D(Functions.f7225a, true, Math.max(1, singleSourceArr.length));
    }

    public static <T> Flowable<T> mergeDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.m23310F(iterable).m23330D(Functions.f7225a, true, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static <T> Single<T> never() {
        return SingleNever.f10011a;
    }

    public static <T> Single<Boolean> sequenceEqual(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return new SingleEquals(singleSource, singleSource2);
    }

    public static <T> Flowable<T> switchOnNext(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "sources is null");
        return new FlowableSwitchMapSinglePublisher(i7t0Var, Functions.f7225a, false);
    }

    public static <T> Flowable<T> switchOnNextDelayError(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "sources is null");
        return new FlowableSwitchMapSinglePublisher(i7t0Var, Functions.f7225a, true);
    }

    private Single<T> timeout0(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimeout(this, j, timeUnit, scheduler, singleSource);
    }

    public static Single<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.f10369b);
    }

    private static <T> Single<T> toSingle(Flowable<T> flowable) {
        return new FlowableSingleSingle(flowable);
    }

    public static <T> Single<T> unsafeCreate(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "onSubscribe is null");
        if (singleSource instanceof Single) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return new SingleFromUnsafeSource(singleSource);
    }

    public static <T, U> Single<T> using(Supplier<U> supplier, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer) {
        return using(supplier, function, consumer, true);
    }

    public static <T> Single<T> wrap(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return singleSource instanceof Single ? (Single) singleSource : new SingleFromUnsafeSource(singleSource);
    }

    public static <T, R> Single<R> zip(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return new SingleZipIterable(iterable, function);
    }

    @SafeVarargs
    public static <T, R> Single<R> zipArray(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(singleSourceArr, "sources is null");
        return singleSourceArr.length == 0 ? error(new NoSuchElementException()) : new SingleZipArray(function, singleSourceArr);
    }

    public final Single<T> ambWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return ambArray(this, singleSource);
    }

    public final T blockingGet() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return (T) blockingMultiObserver.m23463b();
    }

    public final void blockingSubscribe() {
        blockingSubscribe(Functions.f7228d, Functions.f7229e);
    }

    public final Single<T> cache() {
        return new SingleCache(this);
    }

    public final <U> Single<U> cast(Class<? extends U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (Single<U>) map(Functions.m23425b(cls));
    }

    public final <R> Single<R> compose(SingleTransformer<? super T, ? extends R> singleTransformer) {
        Objects.requireNonNull(singleTransformer, "transformer is null");
        return wrap(singleTransformer.mo23389V(this));
    }

    public final <R> Single<R> concatMap(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMap(this, function);
    }

    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function);
    }

    public final <R> Maybe<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function);
    }

    public final Flowable<T> concatWith(SingleSource<? extends T> singleSource) {
        return concat(this, singleSource);
    }

    public final Single<Boolean> contains(Object obj) {
        return contains(obj, ObjectHelper.f7265a);
    }

    public final Single<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.f10369b, false);
    }

    public final Single<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.f10369b);
    }

    public final <R> Maybe<R> dematerialize(Function<? super T, Notification<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return new SingleDematerialize(this, function);
    }

    public final Single<T> doAfterSuccess(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterSuccess is null");
        return new SingleDoAfterSuccess(this, consumer);
    }

    public final Single<T> doAfterTerminate(Action action) {
        Objects.requireNonNull(action, "onAfterTerminate is null");
        return new SingleDoAfterTerminate(this, action);
    }

    public final Single<T> doFinally(Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return new SingleDoFinally(this, action);
    }

    public final Single<T> doOnDispose(Action action) {
        Objects.requireNonNull(action, "onDispose is null");
        return new SingleDoOnDispose(this, action);
    }

    public final Single<T> doOnError(Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onError is null");
        return new SingleDoOnError(this, consumer);
    }

    public final Single<T> doOnEvent(BiConsumer<? super T, ? super Throwable> biConsumer) {
        Objects.requireNonNull(biConsumer, "onEvent is null");
        return new SingleDoOnEvent(this, biConsumer);
    }

    public final Single<T> doOnLifecycle(Consumer<? super Disposable> consumer, Action action) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(action, "onDispose is null");
        return new SingleDoOnLifecycle(this, consumer, action);
    }

    public final Single<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        return new SingleDoOnSubscribe(this, consumer);
    }

    public final Single<T> doOnSuccess(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        return new SingleDoOnSuccess(this, consumer);
    }

    public final Single<T> doOnTerminate(Action action) {
        Objects.requireNonNull(action, "onTerminate is null");
        return new SingleDoOnTerminate(this, action);
    }

    public final Maybe<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new MaybeFilterSingle(this, predicate);
    }

    public final <R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMap(this, function);
    }

    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapCompletable(this, function);
    }

    public final <R> Maybe<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapMaybe(this, function);
    }

    public final <R> Observable<R> flatMapObservable(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapObservable(this, function);
    }

    public final <R> Flowable<R> flatMapPublisher(Function<? super T, ? extends i7t0> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapPublisher(this, function);
    }

    public final <U> Flowable<U> flattenAsFlowable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapIterableFlowable(this, function);
    }

    public final <U> Observable<U> flattenAsObservable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapIterableObservable(this, function);
    }

    public final <R> Flowable<R> flattenStreamAsFlowable(Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlattenStreamAsFlowable(this, function);
    }

    public final <R> Observable<R> flattenStreamAsObservable(Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlattenStreamAsObservable(this, function);
    }

    public final Single<T> hide() {
        return new SingleHide(this);
    }

    public final Completable ignoreElement() {
        return new CompletableFromSingle(this);
    }

    public final <R> Single<R> lift(SingleOperator<? extends R, ? super T> singleOperator) {
        Objects.requireNonNull(singleOperator, "lift is null");
        return new SingleLift(this);
    }

    public final <R> Single<R> map(Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleMap(this, function);
    }

    public final <R> Maybe<R> mapOptional(Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleMapOptional(this, function);
    }

    public final Single<Notification<T>> materialize() {
        return new SingleMaterialize(this);
    }

    public final Flowable<T> mergeWith(SingleSource<? extends T> singleSource) {
        return merge(this, singleSource);
    }

    public final Single<T> observeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleObserveOn(this, scheduler);
    }

    public final <U> Maybe<U> ofType(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        Maybe<T> maybeFilter = filter(Functions.m23429f(cls));
        maybeFilter.getClass();
        return maybeFilter.m23369g(Functions.m23425b(cls));
    }

    public final Maybe<T> onErrorComplete() {
        return onErrorComplete(Functions.f7232h);
    }

    public final Single<T> onErrorResumeNext(Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return new SingleResumeNext(this, function);
    }

    public final Single<T> onErrorResumeWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "fallback is null");
        return onErrorResumeNext(Functions.m23430g(singleSource));
    }

    public final Single<T> onErrorReturn(Function<Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return new SingleOnErrorReturn(this, function, null);
    }

    public final Single<T> onErrorReturnItem(T t) {
        Objects.requireNonNull(t, "item is null");
        return new SingleOnErrorReturn(this, null, t);
    }

    public final Single<T> onTerminateDetach() {
        return new SingleDetach(this);
    }

    public final Flowable<T> repeat() {
        return toFlowable().m23335P(Long.MAX_VALUE);
    }

    public final Flowable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return new FlowableRepeatUntil(flowable, booleanSupplier);
    }

    public final Flowable<T> repeatWhen(Function<? super Flowable<Object>, ? extends i7t0> function) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(function, "handler is null");
        return new FlowableRepeatWhen(flowable, function);
    }

    public final Single<T> retry() {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        return toSingle(flowable.m23337R(Long.MAX_VALUE, Functions.f7232h));
    }

    public final Single<T> retryUntil(BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.m23437n(booleanSupplier));
    }

    public final Single<T> retryWhen(Function<? super Flowable<Throwable>, ? extends i7t0> function) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(function, "handler is null");
        return toSingle(new FlowableRetryWhen(flowable, function));
    }

    public final void safeSubscribe(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        subscribe(new SafeSingleObserver(singleObserver));
    }

    public final Flowable<T> startWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return Flowable.m23324k(Completable.m23284A(completableSource).m23306x(), toFlowable());
    }

    public final Disposable subscribe() {
        return subscribe(Functions.f7228d, Functions.f7230f);
    }

    public abstract void subscribeActual(SingleObserver<? super T> singleObserver);

    public final Single<T> subscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleSubscribeOn(this, scheduler);
    }

    public final <E extends SingleObserver<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final Single<T> takeUntil(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return takeUntil(new CompletableToFlowable(completableSource));
    }

    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        return testObserver;
    }

    public final Single<Timed<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.f10369b);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, Schedulers.f10369b, null);
    }

    public final Single<Timed<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.f10369b);
    }

    /* JADX INFO: renamed from: to */
    public final <R> R m23388to(SingleConverter<T, ? extends R> singleConverter) {
        Objects.requireNonNull(singleConverter, "converter is null");
        stz0.m79357k(singleConverter);
        throw null;
    }

    public final CompletionStage<T> toCompletionStage() {
        return (CompletionStage) subscribeWith(new CompletionStageConsumer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable<T> toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).mo23452b() : new SingleToFlowable(this);
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureMultiObserver());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Maybe<T> toMaybe() {
        return this instanceof FuseToMaybe ? new MaybeIgnoreElement(((MaybeIgnoreElementCompletable) ((FuseToMaybe) this)).f8299a) : new MaybeFromSingle(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable<T> toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).mo23453a() : new SingleToObservable(this);
    }

    public final Single<T> unsubscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleUnsubscribeOn(this, scheduler);
    }

    public final <U, R> Single<R> zipWith(SingleSource<U> singleSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return zip(this, singleSource, biFunction);
    }

    public static <T, U> Single<T> using(Supplier<U> supplier, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer, boolean z) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return new SingleUsing(supplier, function, consumer, z);
    }

    public static <T> Single<T> error(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return error((Supplier<? extends Throwable>) Functions.m23431h(th));
    }

    public static <T> Single<T> fromMaybe(MaybeSource<T> maybeSource, T t) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        Objects.requireNonNull(t, "defaultItem is null");
        return new MaybeToSingle(maybeSource, t);
    }

    public static Single<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimer(j, timeUnit, scheduler);
    }

    public final void blockingSubscribe(Consumer<? super T> consumer) {
        blockingSubscribe(consumer, Functions.f7229e);
    }

    public final Single<Boolean> contains(Object obj, BiPredicate<Object, Object> biPredicate) {
        Objects.requireNonNull(obj, "item is null");
        Objects.requireNonNull(biPredicate, "comparer is null");
        return new SingleContains(this, obj, biPredicate);
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, Schedulers.f10369b, z);
    }

    public final Single<T> delaySubscription(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "subscriptionIndicator is null");
        return new SingleDelayWithCompletable(this, completableSource);
    }

    public final <U, R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return new SingleFlatMapBiSelector(this, function, biFunction);
    }

    public final Maybe<T> onErrorComplete(Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new SingleOnErrorComplete(this, predicate);
    }

    public final Flowable<T> repeat(long j) {
        return toFlowable().m23335P(j);
    }

    public final Flowable<T> startWith(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return Flowable.m23324k(wrap(singleSource).toFlowable(), toFlowable());
    }

    public final Disposable subscribe(BiConsumer<? super T, ? super Throwable> biConsumer) {
        Objects.requireNonNull(biConsumer, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(biConsumer);
        subscribe(biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    public final <E> Single<T> takeUntil(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "other is null");
        return new SingleTakeUntil(this, i7t0Var);
    }

    public final TestObserver<T> test(boolean z) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }

    public final Single<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.f10369b);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    public final Single<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.f10369b);
    }

    public static <T> Observable<T> concat(ObservableSource<? extends SingleSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return new ObservableConcatMapSingle(2, observableSource, Functions.f7225a, ErrorMode.f10254a);
    }

    public static <T> Flowable<T> concatDelayError(i7t0 i7t0Var) {
        return Flowable.m23311G(i7t0Var).m23352p(Functions.f7225a, true, 2);
    }

    public static <T> Flowable<T> concatEager(Iterable<? extends SingleSource<? extends T>> iterable, int i) {
        return Flowable.m23310F(iterable).m23351o(SingleInternalHelper.m23707b(), false, i, 1);
    }

    public static <T> Flowable<T> concatEagerDelayError(Iterable<? extends SingleSource<? extends T>> iterable, int i) {
        return Flowable.m23310F(iterable).m23351o(SingleInternalHelper.m23707b(), true, i, 1);
    }

    public static <T> Flowable<T> merge(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "sources is null");
        return new FlowableFlatMapSinglePublisher(i7t0Var, Functions.f7225a, false);
    }

    public static <T> Flowable<T> mergeDelayError(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "sources is null");
        return new FlowableFlatMapSinglePublisher(i7t0Var, Functions.f7225a, true);
    }

    public static <T1, T2, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.m23439p(biFunction), singleSource, singleSource2);
    }

    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        blockingMultiObserver.m23462a(consumer, consumer2, Functions.f7227c);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "fallback is null");
        return timeout0(j, timeUnit, scheduler, singleSource);
    }

    public static <T> Flowable<T> concatEager(i7t0 i7t0Var) {
        Flowable flowableM23311G = Flowable.m23311G(i7t0Var);
        Function functionM23707b = SingleInternalHelper.m23707b();
        int i = Flowable.f7192a;
        return flowableM23311G.m23350n(functionM23707b, i, i);
    }

    public static <T> Flowable<T> concatEagerDelayError(i7t0 i7t0Var) {
        Flowable flowableM23311G = Flowable.m23311G(i7t0Var);
        Function functionM23707b = SingleInternalHelper.m23707b();
        int i = Flowable.f7192a;
        return flowableM23311G.m23351o(functionM23707b, true, i, i);
    }

    public static <T> Single<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        int i = Flowable.f7192a;
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return toSingle(new FlowableFromFuture(future, j, timeUnit));
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    public final <U> Single<T> delaySubscription(SingleSource<U> singleSource) {
        Objects.requireNonNull(singleSource, "subscriptionIndicator is null");
        return new SingleDelayWithSingle(this, singleSource);
    }

    public final Single<T> retry(long j) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        return toSingle(flowable.m23337R(j, Functions.f7232h));
    }

    public final Flowable<T> startWith(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return Flowable.m23324k(Maybe.m23365p(maybeSource).m23375n(), toFlowable());
    }

    public final <E> Single<T> takeUntil(SingleSource<? extends E> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return takeUntil(new SingleToFlowable(singleSource));
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleDelay(this, j, timeUnit, scheduler, z);
    }

    public final <R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends R>> function, Function<? super Throwable, ? extends SingleSource<? extends R>> function2) {
        Objects.requireNonNull(function, "onSuccessMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        return new SingleFlatMapNotification(this, function, function2);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f7230f);
    }

    public final Single<Timed<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "fallback is null");
        return timeout0(j, timeUnit, Schedulers.f10369b, singleSource);
    }

    public final Single<Timed<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    public static <T> Flowable<T> concatDelayError(i7t0 i7t0Var, int i) {
        return Flowable.m23311G(i7t0Var).m23352p(Functions.f7225a, true, i);
    }

    public final <U> Single<T> delaySubscription(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "subscriptionIndicator is null");
        return new SingleDelayWithObservable(this, observableSource);
    }

    public final Observable<T> startWith(ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return Observable.wrap(observableSource).concatWith(toObservable());
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public final Single<Timed<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimeInterval(this, timeUnit, scheduler, true);
    }

    public final Single<Timed<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimeInterval(this, timeUnit, scheduler, false);
    }

    public static <T> Flowable<T> concat(i7t0 i7t0Var) {
        return concat(i7t0Var, 2);
    }

    public static <T> Flowable<T> concatEager(i7t0 i7t0Var, int i) {
        return Flowable.m23311G(i7t0Var).m23350n(SingleInternalHelper.m23707b(), i, 1);
    }

    public static <T> Flowable<T> concatEagerDelayError(i7t0 i7t0Var, int i) {
        return Flowable.m23311G(i7t0Var).m23351o(SingleInternalHelper.m23707b(), true, i, 1);
    }

    public static <T> Single<T> merge(SingleSource<? extends SingleSource<? extends T>> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return new SingleFlatMap(singleSource, Functions.f7225a);
    }

    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return Flowable.m23309E(singleSource, singleSource2).m23330D(Functions.f7225a, true, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static <T1, T2, T3, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(function3, "zipper is null");
        return zipArray(Functions.m23440q(function3), singleSource, singleSource2, singleSource3);
    }

    public static <T> Flowable<T> concat(i7t0 i7t0Var, int i) {
        Objects.requireNonNull(i7t0Var, "sources is null");
        ObjectHelper.m23450a(i, "prefetch");
        return new FlowableConcatMapSinglePublisher(i7t0Var, Functions.f7225a, i);
    }

    public final void blockingSubscribe(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        BlockingDisposableMultiObserver blockingDisposableMultiObserver = new BlockingDisposableMultiObserver();
        singleObserver.onSubscribe(blockingDisposableMultiObserver);
        subscribe(blockingDisposableMultiObserver);
        blockingDisposableMultiObserver.m23461a(singleObserver);
    }

    public final <U> Single<T> delaySubscription(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "subscriptionIndicator is null");
        return new SingleDelayWithPublisher(this, i7t0Var);
    }

    public final Single<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(biPredicate, "predicate is null");
        return toSingle(new FlowableRetryBiPredicate(flowable, biPredicate));
    }

    public final Flowable<T> startWith(i7t0 i7t0Var) {
        Objects.requireNonNull(i7t0Var, "other is null");
        return toFlowable().m23339T(i7t0Var);
    }

    public final Single<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(Observable.timer(j, timeUnit, scheduler));
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseMultiObserver disposableAutoReleaseMultiObserver = new DisposableAutoReleaseMultiObserver(consumer, consumer2, Functions.f7227c, disposableContainer);
        disposableContainer.mo23393b(disposableAutoReleaseMultiObserver);
        subscribe(disposableAutoReleaseMultiObserver);
        return disposableAutoReleaseMultiObserver;
    }

    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return Flowable.m23309E(singleSource, singleSource2).m23330D(Functions.f7225a, false, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        return Flowable.m23309E(singleSource, singleSource2, singleSource3).m23330D(Functions.f7225a, true, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static <T1, T2, T3, T4, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(function4, "zipper is null");
        return zipArray(Functions.m23441r(function4), singleSource, singleSource2, singleSource3, singleSource4);
    }

    public final Single<T> retry(long j, Predicate<? super Throwable> predicate) {
        return toSingle(toFlowable().m23337R(j, predicate));
    }

    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return Flowable.m23309E(singleSource, singleSource2).m23352p(Functions.f7225a, false, 2);
    }

    public final Single<T> retry(Predicate<? super Throwable> predicate) {
        return toSingle(toFlowable().m23337R(Long.MAX_VALUE, predicate));
    }

    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        return Flowable.m23309E(singleSource, singleSource2, singleSource3).m23330D(Functions.f7225a, false, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // io.reactivex.rxjava3.core.SingleSource
    public final void subscribe(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        C2684m c2684m = RxJavaPlugins.f10311e;
        if (c2684m != null) {
            try {
                singleObserver = (SingleObserver) c2684m.apply(this, singleObserver);
            } catch (Throwable th) {
                throw ExceptionHelper.m23754f(th);
            }
        }
        Objects.requireNonNull(singleObserver, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        return Flowable.m23309E(singleSource, singleSource2, singleSource3).m23352p(Functions.f7225a, false, 2);
    }

    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        return Flowable.m23309E(singleSource, singleSource2, singleSource3, singleSource4).m23330D(Functions.f7225a, true, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static <T1, T2, T3, T4, T5, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(function5, "zipper is null");
        return zipArray(Functions.m23442s(function5), singleSource, singleSource2, singleSource3, singleSource4, singleSource5);
    }

    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        return Flowable.m23309E(singleSource, singleSource2, singleSource3, singleSource4).m23330D(Functions.f7225a, false, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        return Flowable.m23309E(singleSource, singleSource2, singleSource3, singleSource4).m23352p(Functions.f7225a, false, 2);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(function6, "zipper is null");
        return zipArray(Functions.m23443t(function6), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(singleSource7, "source7 is null");
        Objects.requireNonNull(function7, "zipper is null");
        return zipArray(Functions.m23444u(function7), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, SingleSource<? extends T8> singleSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(singleSource7, "source7 is null");
        Objects.requireNonNull(singleSource8, "source8 is null");
        Objects.requireNonNull(function8, "zipper is null");
        return zipArray(Functions.m23445v(function8), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, SingleSource<? extends T8> singleSource8, SingleSource<? extends T9> singleSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(singleSource7, "source7 is null");
        Objects.requireNonNull(singleSource8, "source8 is null");
        Objects.requireNonNull(singleSource9, "source9 is null");
        Objects.requireNonNull(function9, "zipper is null");
        return zipArray(Functions.m23446w(function9), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, singleSource9);
    }
}
