package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableConcatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: renamed from: b */
    public final Function f8713b;

    /* JADX INFO: renamed from: c */
    public final int f8714c;

    /* JADX INFO: renamed from: d */
    public final ErrorMode f8715d;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: X */
        public volatile boolean f8716X;

        /* JADX INFO: renamed from: Y */
        public int f8717Y;

        /* JADX INFO: renamed from: a */
        public final Observer f8718a;

        /* JADX INFO: renamed from: b */
        public final Function f8719b;

        /* JADX INFO: renamed from: c */
        public final int f8720c;

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f8721d = new AtomicThrowable();

        /* JADX INFO: renamed from: e */
        public final DelayErrorInnerObserver f8722e;

        /* JADX INFO: renamed from: f */
        public final boolean f8723f;

        /* JADX INFO: renamed from: g */
        public SimpleQueue f8724g;

        /* JADX INFO: renamed from: h */
        public Disposable f8725h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f8726i;

        /* JADX INFO: renamed from: t */
        public volatile boolean f8727t;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {

            /* JADX INFO: renamed from: a */
            public final Observer f8728a;

            /* JADX INFO: renamed from: b */
            public final ConcatMapDelayErrorObserver f8729b;

            public DelayErrorInnerObserver(Observer observer, ConcatMapDelayErrorObserver concatMapDelayErrorObserver) {
                this.f8728a = observer;
                this.f8729b = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.f8729b;
                concatMapDelayErrorObserver.f8726i = false;
                concatMapDelayErrorObserver.m23602a();
            }

            @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.f8729b;
                if (concatMapDelayErrorObserver.f8721d.m23737a(th)) {
                    if (!concatMapDelayErrorObserver.f8723f) {
                        concatMapDelayErrorObserver.f8725h.dispose();
                    }
                    concatMapDelayErrorObserver.f8726i = false;
                    concatMapDelayErrorObserver.m23602a();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                this.f8728a.onNext(obj);
            }

            @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23416c(this, disposable);
            }
        }

        public ConcatMapDelayErrorObserver(Observer observer, Function function, int i, boolean z) {
            this.f8718a = observer;
            this.f8719b = function;
            this.f8720c = i;
            this.f8723f = z;
            this.f8722e = new DelayErrorInnerObserver(observer, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        /* JADX INFO: renamed from: a */
        public final void m23602a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f8718a;
            SimpleQueue simpleQueue = this.f8724g;
            AtomicThrowable atomicThrowable = this.f8721d;
            while (true) {
                if (!this.f8726i) {
                    if (this.f8716X) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f8723f && ((Throwable) atomicThrowable.get()) != null) {
                        simpleQueue.clear();
                        this.f8716X = true;
                        atomicThrowable.m23740d(observer);
                        return;
                    }
                    boolean z = this.f8727t;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.f8716X = true;
                            atomicThrowable.m23740d(observer);
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objMo98394apply = this.f8719b.mo98394apply(objPoll);
                                Objects.requireNonNull(objMo98394apply, "The mapper returned a null ObservableSource");
                                ObservableSource observableSource = (ObservableSource) objMo98394apply;
                                if (observableSource instanceof Supplier) {
                                    try {
                                        Object obj = ((Supplier) observableSource).get();
                                        if (obj != null && !this.f8716X) {
                                            observer.onNext(obj);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.m23404a(th);
                                        atomicThrowable.m23737a(th);
                                    }
                                } else {
                                    this.f8726i = true;
                                    observableSource.subscribe(this.f8722e);
                                }
                            } catch (Throwable th2) {
                                Exceptions.m23404a(th2);
                                this.f8716X = true;
                                this.f8725h.dispose();
                                simpleQueue.clear();
                                atomicThrowable.m23737a(th2);
                                atomicThrowable.m23740d(observer);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.m23404a(th3);
                        this.f8716X = true;
                        this.f8725h.dispose();
                        atomicThrowable.m23737a(th3);
                        atomicThrowable.m23740d(observer);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8716X = true;
            this.f8725h.dispose();
            DelayErrorInnerObserver delayErrorInnerObserver = this.f8722e;
            delayErrorInnerObserver.getClass();
            DisposableHelper.m23414a(delayErrorInnerObserver);
            this.f8721d.m23738b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8716X;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8727t = true;
            m23602a();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f8721d.m23737a(th)) {
                this.f8727t = true;
                m23602a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f8717Y == 0) {
                this.f8724g.offer(obj);
            }
            m23602a();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8725h, disposable)) {
                this.f8725h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo23423a = queueDisposable.mo23423a(3);
                    if (iMo23423a == 1) {
                        this.f8717Y = iMo23423a;
                        this.f8724g = queueDisposable;
                        this.f8727t = true;
                        this.f8718a.onSubscribe(this);
                        m23602a();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f8717Y = iMo23423a;
                        this.f8724g = queueDisposable;
                        this.f8718a.onSubscribe(this);
                        return;
                    }
                }
                this.f8724g = new SpscLinkedArrayQueue(this.f8720c);
                this.f8718a.onSubscribe(this);
            }
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f8730a;

        /* JADX INFO: renamed from: b */
        public final Function f8731b;

        /* JADX INFO: renamed from: c */
        public final InnerObserver f8732c;

        /* JADX INFO: renamed from: d */
        public final int f8733d;

        /* JADX INFO: renamed from: e */
        public SimpleQueue f8734e;

        /* JADX INFO: renamed from: f */
        public Disposable f8735f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f8736g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8737h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f8738i;

        /* JADX INFO: renamed from: t */
        public int f8739t;

        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {

            /* JADX INFO: renamed from: a */
            public final SerializedObserver f8740a;

            /* JADX INFO: renamed from: b */
            public final SourceObserver f8741b;

            public InnerObserver(SerializedObserver serializedObserver, SourceObserver sourceObserver) {
                this.f8740a = serializedObserver;
                this.f8741b = sourceObserver;
            }

            @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                SourceObserver sourceObserver = this.f8741b;
                sourceObserver.f8736g = false;
                sourceObserver.m23603a();
            }

            @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                this.f8741b.dispose();
                this.f8740a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                this.f8740a.onNext(obj);
            }

            @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23416c(this, disposable);
            }
        }

        public SourceObserver(SerializedObserver serializedObserver, Function function, int i) {
            this.f8730a = serializedObserver;
            this.f8731b = function;
            this.f8733d = i;
            this.f8732c = new InnerObserver(serializedObserver, this);
        }

        /* JADX INFO: renamed from: a */
        public final void m23603a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f8737h) {
                if (!this.f8736g) {
                    boolean z = this.f8738i;
                    try {
                        Object objPoll = this.f8734e.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.f8737h = true;
                            this.f8730a.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objMo98394apply = this.f8731b.mo98394apply(objPoll);
                                Objects.requireNonNull(objMo98394apply, "The mapper returned a null ObservableSource");
                                ObservableSource observableSource = (ObservableSource) objMo98394apply;
                                this.f8736g = true;
                                observableSource.subscribe(this.f8732c);
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                dispose();
                                this.f8734e.clear();
                                this.f8730a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m23404a(th2);
                        dispose();
                        this.f8734e.clear();
                        this.f8730a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f8734e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8737h = true;
            InnerObserver innerObserver = this.f8732c;
            innerObserver.getClass();
            DisposableHelper.m23414a(innerObserver);
            this.f8735f.dispose();
            if (getAndIncrement() == 0) {
                this.f8734e.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8737h;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f8738i) {
                return;
            }
            this.f8738i = true;
            m23603a();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f8738i) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f8738i = true;
            dispose();
            this.f8730a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f8738i) {
                return;
            }
            if (this.f8739t == 0) {
                this.f8734e.offer(obj);
            }
            m23603a();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8735f, disposable)) {
                this.f8735f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo23423a = queueDisposable.mo23423a(3);
                    if (iMo23423a == 1) {
                        this.f8739t = iMo23423a;
                        this.f8734e = queueDisposable;
                        this.f8738i = true;
                        this.f8730a.onSubscribe(this);
                        m23603a();
                        return;
                    }
                    if (iMo23423a == 2) {
                        this.f8739t = iMo23423a;
                        this.f8734e = queueDisposable;
                        this.f8730a.onSubscribe(this);
                        return;
                    }
                }
                this.f8734e = new SpscLinkedArrayQueue(this.f8733d);
                this.f8730a.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(int i, ObservableSource observableSource, Function function, ErrorMode errorMode) {
        super(observableSource);
        this.f8713b = function;
        this.f8715d = errorMode;
        this.f8714c = Math.max(8, i);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.f8521a;
        Function function = this.f8713b;
        if (ObservableScalarXMap.m23679b(observableSource, observer, function)) {
            return;
        }
        ErrorMode errorMode = ErrorMode.f10254a;
        int i = this.f8714c;
        ErrorMode errorMode2 = this.f8715d;
        if (errorMode2 == errorMode) {
            observableSource.subscribe(new SourceObserver(new SerializedObserver(observer), function, i));
        } else {
            observableSource.subscribe(new ConcatMapDelayErrorObserver(observer, function, i, errorMode2 == ErrorMode.f10256c));
        }
    }
}
