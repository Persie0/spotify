package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, ot51 {

    /* JADX INFO: renamed from: a */
    public final ft51 f10449a;

    /* JADX INFO: renamed from: b */
    public ot51 f10450b;

    /* JADX INFO: renamed from: c */
    public boolean f10451c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f10452d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10453e;

    public SerializedSubscriber(ft51 ft51Var) {
        this.f10449a = ft51Var;
    }

    @Override // p204p.ot51
    public final void cancel() {
        this.f10450b.cancel();
    }

    @Override // p204p.ft51
    public final void onComplete() {
        if (this.f10453e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f10453e) {
                    return;
                }
                if (!this.f10451c) {
                    this.f10453e = true;
                    this.f10451c = true;
                    this.f10449a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10452d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f10452d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m23735b(NotificationLite.f10261a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        if (this.f10453e) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f10453e) {
                    if (this.f10451c) {
                        this.f10453e = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10452d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f10452d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f10245a[0] = NotificationLite.m23763e(th);
                        return;
                    }
                    this.f10453e = true;
                    this.f10451c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.m23782b(th);
                } else {
                    this.f10449a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        if (this.f10453e) {
            return;
        }
        if (obj == null) {
            this.f10450b.cancel();
            onError(ExceptionHelper.m23750b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f10453e) {
                    return;
                }
                if (this.f10451c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.f10452d;
                    if (appendOnlyLinkedArrayList2 == null) {
                        appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList();
                        this.f10452d = appendOnlyLinkedArrayList2;
                    }
                    appendOnlyLinkedArrayList2.m23735b(obj);
                    return;
                }
                this.f10451c = true;
                this.f10449a.onNext(obj);
                do {
                    synchronized (this) {
                        try {
                            appendOnlyLinkedArrayList = this.f10452d;
                            if (appendOnlyLinkedArrayList == null) {
                                this.f10451c = false;
                                return;
                            }
                            this.f10452d = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (!appendOnlyLinkedArrayList.m23734a(this.f10449a));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23733f(this.f10450b, ot51Var)) {
            this.f10450b = ot51Var;
            this.f10449a.onSubscribe(this);
        }
    }

    @Override // p204p.ot51
    public final void request(long j) {
        this.f10450b.request(j);
    }
}
