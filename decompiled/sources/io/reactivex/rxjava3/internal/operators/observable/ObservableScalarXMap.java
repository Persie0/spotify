package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {

        /* JADX INFO: renamed from: a */
        public final Observer f9396a;

        /* JADX INFO: renamed from: b */
        public final Object f9397b;

        public ScalarDisposable(Observer observer, Object obj) {
            this.f9396a = observer;
            this.f9397b = obj;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f9397b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                Object obj = this.f9397b;
                Observer observer = this.f9396a;
                observer.onNext(obj);
                if (get() == 2) {
                    lazySet(3);
                    observer.onComplete();
                }
            }
        }
    }

    public static final class ScalarXMapObservable<T, R> extends Observable<R> {

        /* JADX INFO: renamed from: a */
        public final Object f9398a;

        /* JADX INFO: renamed from: b */
        public final Function f9399b;

        public ScalarXMapObservable(Object obj, Function function) {
            this.f9398a = obj;
            this.f9399b = function;
        }

        @Override // io.reactivex.rxjava3.core.Observable
        public final void subscribeActual(Observer observer) {
            try {
                Object objMo98394apply = this.f9399b.mo98394apply(this.f9398a);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objMo98394apply;
                if (!(observableSource instanceof Supplier)) {
                    observableSource.subscribe(observer);
                    return;
                }
                try {
                    Object obj = ((Supplier) observableSource).get();
                    if (obj == null) {
                        EmptyDisposable.m23420b(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj);
                    observer.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    EmptyDisposable.m23421c(th, observer);
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                EmptyDisposable.m23421c(th2, observer);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Observable m23678a(Object obj, Function function) {
        return new ScalarXMapObservable(obj, function);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23679b(ObservableSource observableSource, Observer observer, Function function) {
        if (!(observableSource instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) observableSource).get();
            if (obj == null) {
                EmptyDisposable.m23420b(observer);
                return true;
            }
            try {
                Object objMo98394apply = function.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) objMo98394apply;
                if (observableSource2 instanceof Supplier) {
                    try {
                        Object obj2 = ((Supplier) observableSource2).get();
                        if (obj2 == null) {
                            EmptyDisposable.m23420b(observer);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj2);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        EmptyDisposable.m23421c(th, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                EmptyDisposable.m23421c(th2, observer);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.m23404a(th3);
            EmptyDisposable.m23421c(th3, observer);
            return true;
        }
    }
}
