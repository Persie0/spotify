package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public final UnicastProcessor f10352b;

    /* JADX INFO: renamed from: c */
    public boolean f10353c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f10354d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10355e;

    public SerializedProcessor(UnicastProcessor unicastProcessor) {
        this.f10352b = unicastProcessor;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f10352b.subscribe(ft51Var);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m23792e0() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f10354d;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f10353c = false;
                        return;
                    }
                    this.f10354d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            appendOnlyLinkedArrayList.m23734a(this.f10352b);
        }
    }

    @Override // p204p.ft51
    public final void onComplete() {
        if (this.f10355e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f10355e) {
                    return;
                }
                this.f10355e = true;
                if (!this.f10353c) {
                    this.f10353c = true;
                    this.f10352b.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10354d;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f10354d = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m23735b(NotificationLite.f10261a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        if (this.f10355e) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f10355e) {
                    this.f10355e = true;
                    if (this.f10353c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10354d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f10354d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f10245a[0] = NotificationLite.m23763e(th);
                        return;
                    }
                    this.f10353c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.m23782b(th);
                } else {
                    this.f10352b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        if (this.f10355e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f10355e) {
                    return;
                }
                if (!this.f10353c) {
                    this.f10353c = true;
                    this.f10352b.onNext(obj);
                    m23792e0();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10354d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f10354d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m23735b(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        boolean z = true;
        if (!this.f10355e) {
            synchronized (this) {
                try {
                    if (!this.f10355e) {
                        if (this.f10353c) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10354d;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f10354d = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m23735b(NotificationLite.m23767i(ot51Var));
                            return;
                        }
                        this.f10353c = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            ot51Var.cancel();
        } else {
            this.f10352b.onSubscribe(ot51Var);
            m23792e0();
        }
    }
}
