package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseMultiObserver;
import io.reactivex.rxjava3.internal.observers.EmptyCompletableObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcatArray;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeArray;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimeout;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToFlowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToObservable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rxdogtag2.C2684m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Completable implements CompletableSource {
    /* JADX INFO: renamed from: A */
    public static Completable m23284A(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "source is null");
        return completableSource instanceof Completable ? (Completable) completableSource : new CompletableFromUnsafeSource(completableSource);
    }

    /* JADX INFO: renamed from: f */
    public static Completable m23285f(CompletableSource... completableSourceArr) {
        Objects.requireNonNull(completableSourceArr, "sources is null");
        if (completableSourceArr.length == 0) {
            return CompletableEmpty.f7437a;
        }
        return completableSourceArr.length == 1 ? m23284A(completableSourceArr[0]) : new CompletableConcatArray(completableSourceArr);
    }

    /* JADX INFO: renamed from: j */
    public static CompletableError m23286j(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new CompletableError(th);
    }

    /* JADX INFO: renamed from: k */
    public static CompletableFromRunnable m23287k(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new CompletableFromRunnable(runnable);
    }

    /* JADX INFO: renamed from: l */
    public static CompletableFromSingle m23288l(Single single) {
        Objects.requireNonNull(single, "single is null");
        return new CompletableFromSingle(single);
    }

    /* JADX INFO: renamed from: m */
    public static CompletableMergeIterable m23289m(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new CompletableMergeIterable(iterable);
    }

    /* JADX INFO: renamed from: n */
    public static Completable m23290n(CompletableSource... completableSourceArr) {
        if (completableSourceArr.length == 0) {
            return CompletableEmpty.f7437a;
        }
        return completableSourceArr.length == 1 ? m23284A(completableSourceArr[0]) : new CompletableMergeArray(completableSourceArr);
    }

    /* JADX INFO: renamed from: w */
    public static CompletableTimer m23291w(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableTimer(j, timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: c */
    public final CompletableAndThenCompletable m23292c(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "next is null");
        return new CompletableAndThenCompletable(this, completableSource);
    }

    /* JADX INFO: renamed from: d */
    public final CompletableAndThenObservable m23293d(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "next is null");
        return new CompletableAndThenObservable(this, observableSource);
    }

    /* JADX INFO: renamed from: e */
    public final SingleDelayWithCompletable m23294e(Single single) {
        Objects.requireNonNull(single, "next is null");
        return new SingleDelayWithCompletable(single, this);
    }

    /* JADX INFO: renamed from: g */
    public final CompletablePeek m23295g(Action action) {
        Consumer consumer = Functions.f7228d;
        Action action2 = Functions.f7227c;
        return m23297i(consumer, consumer, action, action2, action2, action2);
    }

    /* JADX INFO: renamed from: h */
    public final CompletablePeek m23296h(Consumer consumer) {
        Consumer consumer2 = Functions.f7228d;
        Action action = Functions.f7227c;
        return m23297i(consumer2, consumer, action, action, action, action);
    }

    /* JADX INFO: renamed from: i */
    public final CompletablePeek m23297i(Consumer consumer, Consumer consumer2, Action action, Action action2, Action action3, Action action4) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onTerminate is null");
        Objects.requireNonNull(action3, "onAfterTerminate is null");
        Objects.requireNonNull(action4, "onDispose is null");
        return new CompletablePeek(this, consumer, consumer2, action, action2, action3, action4);
    }

    /* JADX INFO: renamed from: o */
    public final CompletableObserveOn m23298o(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableObserveOn(this, scheduler);
    }

    /* JADX INFO: renamed from: p */
    public final CompletableOnErrorComplete m23299p(Predicate predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new CompletableOnErrorComplete(this, predicate);
    }

    /* JADX INFO: renamed from: q */
    public final CompletableResumeNext m23300q(Function function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return new CompletableResumeNext(this, function);
    }

    /* JADX INFO: renamed from: r */
    public final Completable m23301r(Completable completable) {
        Objects.requireNonNull(completable, "other is null");
        return m23285f(completable, this);
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo23302s(CompletableObserver completableObserver);

    public final Disposable subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    /* JADX INFO: renamed from: t */
    public final CompletableSubscribeOn m23303t(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableSubscribeOn(this, scheduler);
    }

    /* JADX INFO: renamed from: u */
    public final CompletableTimeout m23304u(long j, CompletableError completableError) {
        return m23305v(j, TimeUnit.SECONDS, Schedulers.f10369b, completableError);
    }

    /* JADX INFO: renamed from: v */
    public final CompletableTimeout m23305v(long j, TimeUnit timeUnit, Scheduler scheduler, CompletableError completableError) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableTimeout(this, j, timeUnit, scheduler, completableError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final Flowable m23306x() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).mo23452b() : new CompletableToFlowable(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final Observable m23307y() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).mo23453a() : new CompletableToObservable(this);
    }

    /* JADX INFO: renamed from: z */
    public final CompletableToSingle m23308z(Object obj) {
        Objects.requireNonNull(obj, "completionValue is null");
        return new CompletableToSingle(this, null, obj);
    }

    @Override // io.reactivex.rxjava3.core.CompletableSource
    public final void subscribe(CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        try {
            C2684m c2684m = RxJavaPlugins.f10312f;
            if (c2684m != null) {
                try {
                    completableObserver = (CompletableObserver) c2684m.apply(this, completableObserver);
                } catch (Throwable th) {
                    throw ExceptionHelper.m23754f(th);
                }
            }
            Objects.requireNonNull(completableObserver, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo23302s(completableObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer, DisposableContainer disposableContainer) {
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseMultiObserver disposableAutoReleaseMultiObserver = new DisposableAutoReleaseMultiObserver(Functions.f7228d, consumer, action, disposableContainer);
        disposableContainer.mo23393b(disposableAutoReleaseMultiObserver);
        subscribe(disposableAutoReleaseMultiObserver);
        return disposableAutoReleaseMultiObserver;
    }

    public final Disposable subscribe(Action action) {
        return subscribe(action, Functions.f7230f);
    }
}
