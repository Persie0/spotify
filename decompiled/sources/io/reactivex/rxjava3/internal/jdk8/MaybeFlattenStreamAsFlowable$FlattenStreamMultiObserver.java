package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import p204p.ft51;
import p204p.ikc0;

/* JADX INFO: loaded from: classes11.dex */
final class MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T>, SingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public final ft51 f7268a;

    /* JADX INFO: renamed from: b */
    public final Function f7269b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f7270c = new AtomicLong();

    /* JADX INFO: renamed from: d */
    public Disposable f7271d;

    /* JADX INFO: renamed from: e */
    public volatile Iterator f7272e;

    /* JADX INFO: renamed from: f */
    public Stream f7273f;

    /* JADX INFO: renamed from: g */
    public boolean f7274g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f7275h;

    /* JADX INFO: renamed from: i */
    public boolean f7276i;

    /* JADX INFO: renamed from: t */
    public long f7277t;

    public MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver(ft51 ft51Var, Function function) {
        this.f7268a = ft51Var;
        this.f7269b = function;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        this.f7276i = true;
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m23454b() {
        if (getAndIncrement() != 0) {
            return;
        }
        ft51 ft51Var = this.f7268a;
        long j = this.f7277t;
        long j2 = this.f7270c.get();
        Iterator it = this.f7272e;
        int iAddAndGet = 1;
        while (true) {
            if (this.f7275h) {
                clear();
            } else if (this.f7276i) {
                if (it != null) {
                    ft51Var.onNext(null);
                    ft51Var.onComplete();
                }
            } else if (it != null && j != j2) {
                try {
                    Object next = it.next();
                    if (!this.f7275h) {
                        ft51Var.onNext(next);
                        j++;
                        if (!this.f7275h) {
                            try {
                                boolean zHasNext = it.hasNext();
                                if (!this.f7275h && !zHasNext) {
                                    ft51Var.onComplete();
                                    this.f7275h = true;
                                }
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                ft51Var.onError(th);
                                this.f7275h = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    ft51Var.onError(th2);
                    this.f7275h = true;
                }
            }
            this.f7277t = j;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            j2 = this.f7270c.get();
            if (it == null) {
                it = this.f7272e;
            }
        }
    }

    @Override // p204p.ot51
    public final void cancel() {
        this.f7275h = true;
        this.f7271d.dispose();
        if (this.f7276i) {
            return;
        }
        m23454b();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        this.f7272e = null;
        Stream stream = this.f7273f;
        this.f7273f = null;
        if (stream != null) {
            try {
                ikc0.m50943o(stream);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        Iterator it = this.f7272e;
        if (it == null) {
            return true;
        }
        if (!this.f7274g || it.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f7268a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f7268a.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f7271d, disposable)) {
            this.f7271d = disposable;
            this.f7268a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        try {
            Object objMo98394apply = this.f7269b.mo98394apply(obj);
            Objects.requireNonNull(objMo98394apply, "The mapper returned a null Stream");
            Stream stream = (Stream) objMo98394apply;
            Iterator<T> it = stream.iterator();
            if (it.hasNext()) {
                this.f7272e = it;
                this.f7273f = stream;
                m23454b();
            } else {
                this.f7268a.onComplete();
                try {
                    ikc0.m50943o(stream);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            this.f7268a.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        Iterator it = this.f7272e;
        if (it == null) {
            return null;
        }
        if (!this.f7274g) {
            this.f7274g = true;
        } else if (!it.hasNext()) {
            clear();
            return null;
        }
        return it.next();
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (SubscriptionHelper.m23732e(j)) {
            BackpressureHelper.m23742a(this.f7270c, j);
            m23454b();
        }
    }
}
