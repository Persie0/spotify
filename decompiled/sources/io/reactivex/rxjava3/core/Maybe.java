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
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseMultiObserver;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeJust;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.maybe.MaybePeek;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimer;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeUnsafeCreate;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rxdogtag2.C2684m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    /* JADX INFO: renamed from: f */
    public static MaybeJust m23363f(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new MaybeJust(obj);
    }

    /* JADX INFO: renamed from: m */
    public static MaybeTimer m23364m(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new MaybeTimer(Math.max(0L, j), timeUnit, scheduler);
    }

    /* JADX INFO: renamed from: p */
    public static Maybe m23365p(MaybeSource maybeSource) {
        if (maybeSource instanceof Maybe) {
            return (Maybe) maybeSource;
        }
        Objects.requireNonNull(maybeSource, "source is null");
        return new MaybeUnsafeCreate(maybeSource);
    }

    /* JADX INFO: renamed from: c */
    public final MaybeToSingle m23366c(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return new MaybeToSingle(this, obj);
    }

    /* JADX INFO: renamed from: d */
    public final MaybePeek m23367d(Consumer consumer) {
        Consumer consumer2 = Functions.f7228d;
        Action action = Functions.f7227c;
        return new MaybePeek(this, consumer2, consumer2, consumer, action, action, action);
    }

    /* JADX INFO: renamed from: e */
    public final MaybePeek m23368e(Consumer consumer) {
        Consumer consumer2 = Functions.f7228d;
        Action action = Functions.f7227c;
        return new MaybePeek(this, consumer2, consumer, consumer2, action, action, action);
    }

    /* JADX INFO: renamed from: g */
    public final MaybeMap m23369g(Function function) {
        Objects.requireNonNull(function, "mapper is null");
        return new MaybeMap(this, function);
    }

    /* JADX INFO: renamed from: h */
    public final MaybeObserveOn m23370h(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new MaybeObserveOn(this, scheduler);
    }

    /* JADX INFO: renamed from: i */
    public final Maybe m23371i() {
        Predicate predicate = Functions.f7232h;
        Objects.requireNonNull(predicate, "predicate is null");
        return new MaybeOnErrorComplete(this, predicate);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo23372j(MaybeObserver maybeObserver);

    /* JADX INFO: renamed from: k */
    public final MaybeSubscribeOn m23373k(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new MaybeSubscribeOn(this, scheduler);
    }

    /* JADX INFO: renamed from: l */
    public final MaybeSwitchIfEmptySingle m23374l(Single single) {
        Objects.requireNonNull(single, "other is null");
        return new MaybeSwitchIfEmptySingle(this, single);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final Flowable m23375n() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).mo23452b() : new MaybeToFlowable(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final Observable m23376o() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).mo23453a() : new MaybeToObservable(this);
    }

    public final Disposable subscribe() {
        return subscribe(Functions.f7228d, Functions.f7230f, Functions.f7227c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f7230f, Functions.f7227c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.f7227c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(consumer, consumer2, action);
        subscribe(maybeCallbackObserver);
        return maybeCallbackObserver;
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseMultiObserver disposableAutoReleaseMultiObserver = new DisposableAutoReleaseMultiObserver(consumer, consumer2, action, disposableContainer);
        disposableContainer.mo23393b(disposableAutoReleaseMultiObserver);
        subscribe(disposableAutoReleaseMultiObserver);
        return disposableAutoReleaseMultiObserver;
    }

    @Override // io.reactivex.rxjava3.core.MaybeSource
    public final void subscribe(MaybeObserver<? super T> maybeObserver) {
        Objects.requireNonNull(maybeObserver, "observer is null");
        C2684m c2684m = RxJavaPlugins.f10309c;
        if (c2684m != null) {
            try {
                maybeObserver = (MaybeObserver) c2684m.apply(this, maybeObserver);
            } catch (Throwable th) {
                throw ExceptionHelper.m23754f(th);
            }
        }
        Objects.requireNonNull(maybeObserver, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo23372j(maybeObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
