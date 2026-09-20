package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: renamed from: b */
    public final Function f9509b;

    /* JADX INFO: renamed from: c */
    public final int f9510c;

    /* JADX INFO: renamed from: d */
    public final boolean f9511d;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {

        /* JADX INFO: renamed from: a */
        public final SwitchMapObserver f9512a;

        /* JADX INFO: renamed from: b */
        public final long f9513b;

        /* JADX INFO: renamed from: c */
        public final int f9514c;

        /* JADX INFO: renamed from: d */
        public volatile SimpleQueue f9515d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f9516e;

        public SwitchMapInnerObserver(SwitchMapObserver switchMapObserver, long j, int i) {
            this.f9512a = switchMapObserver;
            this.f9513b = j;
            this.f9514c = i;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f9513b == this.f9512a.f9527t) {
                this.f9516e = true;
                this.f9512a.m23683a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            SwitchMapObserver switchMapObserver = this.f9512a;
            switchMapObserver.getClass();
            if (this.f9513b == switchMapObserver.f9527t) {
                AtomicThrowable atomicThrowable = switchMapObserver.f9522e;
                atomicThrowable.getClass();
                if (ExceptionHelper.m23749a(atomicThrowable, th)) {
                    if (!switchMapObserver.f9521d) {
                        switchMapObserver.f9525h.dispose();
                        switchMapObserver.f9523f = true;
                    }
                    this.f9516e = true;
                    switchMapObserver.m23683a();
                    return;
                }
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f9513b == this.f9512a.f9527t) {
                if (obj != null) {
                    this.f9515d.offer(obj);
                }
                this.f9512a.m23683a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iMo23423a = queueDisposable.mo23423a(7);
                    if (iMo23423a == 1) {
                        this.f9515d = queueDisposable;
                        this.f9516e = true;
                        this.f9512a.m23683a();
                        return;
                    } else if (iMo23423a == 2) {
                        this.f9515d = queueDisposable;
                        return;
                    }
                }
                this.f9515d = new SpscLinkedArrayQueue(this.f9514c);
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: X */
        public static final SwitchMapInnerObserver f9517X;

        /* JADX INFO: renamed from: a */
        public final Observer f9518a;

        /* JADX INFO: renamed from: b */
        public final Function f9519b;

        /* JADX INFO: renamed from: c */
        public final int f9520c;

        /* JADX INFO: renamed from: d */
        public final boolean f9521d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f9523f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f9524g;

        /* JADX INFO: renamed from: h */
        public Disposable f9525h;

        /* JADX INFO: renamed from: t */
        public volatile long f9527t;

        /* JADX INFO: renamed from: i */
        public final AtomicReference f9526i = new AtomicReference();

        /* JADX INFO: renamed from: e */
        public final AtomicThrowable f9522e = new AtomicThrowable();

        static {
            SwitchMapInnerObserver switchMapInnerObserver = new SwitchMapInnerObserver(null, -1L, 1);
            f9517X = switchMapInnerObserver;
            DisposableHelper.m23414a(switchMapInnerObserver);
        }

        public SwitchMapObserver(Observer observer, Function function, int i, boolean z) {
            this.f9518a = observer;
            this.f9519b = function;
            this.f9520c = i;
            this.f9521d = z;
        }

        /* JADX WARN: Code duplicated, block: B:89:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0010 A[SYNTHETIC] */
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
        public final void m23683a() {
            SimpleQueue simpleQueue;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f9518a;
            AtomicReference atomicReference = this.f9526i;
            boolean z = this.f9521d;
            int iAddAndGet = 1;
            while (!this.f9524g) {
                if (this.f9523f) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2) {
                            Throwable th = this.f9522e.get();
                            if (th != null) {
                                observer.onError(th);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.f9522e.get() != null) {
                        this.f9522e.m23740d(observer);
                        return;
                    } else if (z2) {
                        observer.onComplete();
                        return;
                    }
                }
                SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) atomicReference.get();
                if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.f9515d) != null) {
                    boolean z3 = false;
                    while (!this.f9524g) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (!z && this.f9522e.get() != null) {
                                this.f9522e.m23740d(observer);
                                return;
                            }
                            boolean z4 = switchMapInnerObserver.f9516e;
                            try {
                                objPoll = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.m23404a(th2);
                                this.f9522e.m23737a(th2);
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                                if (z) {
                                    DisposableHelper.m23414a(switchMapInnerObserver);
                                } else {
                                    SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) this.f9526i.getAndSet(f9517X);
                                    if (switchMapInnerObserver2 != null) {
                                        DisposableHelper.m23414a(switchMapInnerObserver2);
                                    }
                                    this.f9525h.dispose();
                                    this.f9523f = true;
                                }
                                z3 = true;
                                objPoll = null;
                            }
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                            } else if (!z5) {
                                observer.onNext(objPoll);
                            }
                            if (z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (z3) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f9524g) {
                return;
            }
            this.f9524g = true;
            this.f9525h.dispose();
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.f9526i.getAndSet(f9517X);
            if (switchMapInnerObserver != null) {
                DisposableHelper.m23414a(switchMapInnerObserver);
            }
            this.f9522e.m23738b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9524g;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f9523f) {
                return;
            }
            this.f9523f = true;
            m23683a();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            SwitchMapInnerObserver switchMapInnerObserver;
            if (!this.f9523f) {
                AtomicThrowable atomicThrowable = this.f9522e;
                atomicThrowable.getClass();
                if (ExceptionHelper.m23749a(atomicThrowable, th)) {
                    if (!this.f9521d && (switchMapInnerObserver = (SwitchMapInnerObserver) this.f9526i.getAndSet(f9517X)) != null) {
                        DisposableHelper.m23414a(switchMapInnerObserver);
                    }
                    this.f9523f = true;
                    m23683a();
                    return;
                }
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            long j = this.f9527t + 1;
            this.f9527t = j;
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.f9526i.get();
            if (switchMapInnerObserver != null) {
                DisposableHelper.m23414a(switchMapInnerObserver);
            }
            try {
                Object objMo98394apply = this.f9519b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The ObservableSource returned is null");
                ObservableSource observableSource = (ObservableSource) objMo98394apply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this, j, this.f9520c);
                while (true) {
                    SwitchMapInnerObserver switchMapInnerObserver3 = (SwitchMapInnerObserver) this.f9526i.get();
                    if (switchMapInnerObserver3 == f9517X) {
                        return;
                    }
                    AtomicReference atomicReference = this.f9526i;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2)) {
                            observableSource.subscribe(switchMapInnerObserver2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerObserver3);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f9525h.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9525h, disposable)) {
                this.f9525h = disposable;
                this.f9518a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMap(ObservableSource observableSource, Function function, int i, boolean z) {
        super(observableSource);
        this.f9509b = function;
        this.f9510c = i;
        this.f9511d = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.f8521a;
        Function function = this.f9509b;
        if (ObservableScalarXMap.m23679b(observableSource, observer, function)) {
            return;
        }
        observableSource.subscribe(new SwitchMapObserver(observer, function, this.f9510c, this.f9511d));
    }
}
