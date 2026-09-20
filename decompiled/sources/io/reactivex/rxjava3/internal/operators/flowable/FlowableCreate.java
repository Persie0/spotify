package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCreate<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final FlowableOnSubscribe f7629b;

    /* JADX INFO: renamed from: c */
    public final BackpressureStrategy f7630c;

    /* JADX INFO: loaded from: classes11.dex */
    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7631a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f7632b = new SequentialDisposable();

        public BaseEmitter(ft51 ft51Var) {
            this.f7631a = ft51Var;
        }

        /* JADX INFO: renamed from: a */
        public final void m23492a() {
            SequentialDisposable sequentialDisposable = this.f7632b;
            if (sequentialDisposable.isDisposed()) {
                return;
            }
            try {
                this.f7631a.onComplete();
            } finally {
                sequentialDisposable.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m23493b(Throwable th) {
            SequentialDisposable sequentialDisposable = this.f7632b;
            if (sequentialDisposable.isDisposed()) {
                return false;
            }
            try {
                this.f7631a.onError(th);
                return true;
            } finally {
                sequentialDisposable.dispose();
            }
        }

        /* JADX INFO: renamed from: c */
        public void mo23494c() {
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7632b.dispose();
            mo23495d();
        }

        /* JADX INFO: renamed from: d */
        public void mo23495d() {
        }

        /* JADX INFO: renamed from: e */
        public boolean mo23496e(Throwable th) {
            return m23493b(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final boolean isCancelled() {
            return this.f7632b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public void onComplete() {
            m23492a();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th) {
            if (th == null) {
                th = ExceptionHelper.m23750b("onError called with a null Throwable.");
            }
            if (mo23496e(th)) {
                return;
            }
            RxJavaPlugins.m23782b(th);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this, j);
                mo23494c();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            CancellableDisposable cancellableDisposable = new CancellableDisposable(cancellable);
            SequentialDisposable sequentialDisposable = this.f7632b;
            sequentialDisposable.getClass();
            DisposableHelper.m23417f(sequentialDisposable, cancellableDisposable);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return s571.m77252k(getClass().getSimpleName(), "{", super.toString(), "}");
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final boolean tryOnError(Throwable th) {
            if (th == null) {
                th = ExceptionHelper.m23750b("tryOnError called with a null Throwable.");
            }
            return mo23496e(th);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {

        /* JADX INFO: renamed from: c */
        public final SpscLinkedArrayQueue f7633c;

        /* JADX INFO: renamed from: d */
        public Throwable f7634d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f7635e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f7636f;

        public BufferAsyncEmitter(ft51 ft51Var, int i) {
            super(ft51Var);
            this.f7633c = new SpscLinkedArrayQueue(i);
            this.f7636f = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: c */
        public final void mo23494c() {
            m23497f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: d */
        public final void mo23495d() {
            if (this.f7636f.getAndIncrement() == 0) {
                this.f7633c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: e */
        public final boolean mo23496e(Throwable th) {
            if (this.f7635e || this.f7632b.isDisposed()) {
                return false;
            }
            this.f7634d = th;
            this.f7635e = true;
            m23497f();
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final void m23497f() {
            if (this.f7636f.getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f7631a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f7633c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f7632b.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.f7635e;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f7634d;
                        if (th != null) {
                            m23493b(th);
                            return;
                        } else {
                            m23492a();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ft51Var.onNext(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.f7632b.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z3 = this.f7635e;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.f7634d;
                        if (th2 != null) {
                            m23493b(th2);
                            return;
                        } else {
                            m23492a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m23746e(this, j2);
                }
                iAddAndGet = this.f7636f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            this.f7635e = true;
            m23497f();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public void onNext(T t) {
            if (this.f7635e || this.f7632b.isDisposed()) {
                return;
            }
            if (t == null) {
                onError(ExceptionHelper.m23750b("onNext called with a null value."));
            } else {
                this.f7633c.offer(t);
                m23497f();
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        public DropAsyncEmitter(ft51 ft51Var) {
            super(ft51Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        /* JADX INFO: renamed from: f */
        public final void mo23498f() {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        public ErrorAsyncEmitter(ft51 ft51Var) {
            super(ft51Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        /* JADX INFO: renamed from: f */
        public final void mo23498f() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {

        /* JADX INFO: renamed from: c */
        public final AtomicReference f7637c;

        /* JADX INFO: renamed from: d */
        public Throwable f7638d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f7639e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f7640f;

        public LatestAsyncEmitter(ft51 ft51Var) {
            super(ft51Var);
            this.f7637c = new AtomicReference();
            this.f7640f = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: c */
        public final void mo23494c() {
            m23499f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: d */
        public final void mo23495d() {
            if (this.f7640f.getAndIncrement() == 0) {
                this.f7637c.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: e */
        public final boolean mo23496e(Throwable th) {
            if (this.f7639e || this.f7632b.isDisposed()) {
                return false;
            }
            this.f7638d = th;
            this.f7639e = true;
            m23499f();
            return true;
        }

        /* JADX INFO: renamed from: f */
        public final void m23499f() {
            if (this.f7640f.getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f7631a;
            AtomicReference atomicReference = this.f7637c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.f7632b.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.f7639e;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        Throwable th = this.f7638d;
                        if (th != null) {
                            m23493b(th);
                            return;
                        } else {
                            m23492a();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    ft51Var.onNext(andSet);
                    j2++;
                }
                if (j2 == j) {
                    if (this.f7632b.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.f7639e;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.f7638d;
                        if (th2 != null) {
                            m23493b(th2);
                            return;
                        } else {
                            m23492a();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m23746e(this, j2);
                }
                iAddAndGet = this.f7640f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            this.f7639e = true;
            m23499f();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public void onNext(T t) {
            if (this.f7639e || this.f7632b.isDisposed()) {
                return;
            }
            if (t == null) {
                onError(ExceptionHelper.m23750b("onNext called with a null value."));
            } else {
                this.f7637c.set(t);
                m23499f();
            }
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        public MissingEmitter(ft51 ft51Var) {
            super(ft51Var);
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public void onNext(T t) {
            long j;
            if (this.f7632b.isDisposed()) {
                return;
            }
            if (t == null) {
                onError(ExceptionHelper.m23750b("onNext called with a null value."));
                return;
            }
            this.f7631a.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        /* JADX INFO: renamed from: f */
        public abstract void mo23498f();

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t) {
            if (this.f7632b.isDisposed()) {
                return;
            }
            if (t == null) {
                onError(ExceptionHelper.m23750b("onNext called with a null value."));
            } else if (get() == 0) {
                mo23498f();
            } else {
                this.f7631a.onNext(t);
                BackpressureHelper.m23746e(this, 1L);
            }
        }
    }

    public FlowableCreate(FlowableOnSubscribe flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.f7629b = flowableOnSubscribe;
        this.f7630c = backpressureStrategy;
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
        BaseEmitter missingEmitter;
        int iOrdinal = this.f7630c.ordinal();
        if (iOrdinal == 0) {
            missingEmitter = new MissingEmitter(ft51Var);
        } else if (iOrdinal == 1) {
            missingEmitter = new ErrorAsyncEmitter(ft51Var);
        } else if (iOrdinal != 3) {
            missingEmitter = iOrdinal != 4 ? new BufferAsyncEmitter(ft51Var, Flowable.f7192a) : new LatestAsyncEmitter(ft51Var);
        } else {
            missingEmitter = new DropAsyncEmitter(ft51Var);
        }
        ft51Var.onSubscribe(missingEmitter);
        try {
            this.f7629b.subscribe(missingEmitter);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            missingEmitter.onError(th);
        }
    }
}
