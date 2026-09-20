package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.edb;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements ot51 {

    /* JADX INFO: renamed from: a */
    public ot51 f10235a;

    /* JADX INFO: renamed from: b */
    public long f10236b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10237c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f10238d = new AtomicLong();

    /* JADX INFO: renamed from: e */
    public final AtomicLong f10239e = new AtomicLong();

    /* JADX INFO: renamed from: f */
    public final boolean f10240f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f10241g;

    /* JADX INFO: renamed from: h */
    public boolean f10242h;

    public SubscriptionArbiter(boolean z) {
        this.f10240f = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m23725c() {
        int iAddAndGet = 1;
        long jM23744c = 0;
        ot51 ot51Var = null;
        do {
            ot51 ot51Var2 = (ot51) this.f10237c.get();
            if (ot51Var2 != null) {
                ot51Var2 = (ot51) this.f10237c.getAndSet(null);
            }
            long andSet = this.f10238d.get();
            if (andSet != 0) {
                andSet = this.f10238d.getAndSet(0L);
            }
            long andSet2 = this.f10239e.get();
            if (andSet2 != 0) {
                andSet2 = this.f10239e.getAndSet(0L);
            }
            ot51 ot51Var3 = this.f10235a;
            if (this.f10241g) {
                if (ot51Var3 != null) {
                    ot51Var3.cancel();
                    this.f10235a = null;
                }
                if (ot51Var2 != null) {
                    ot51Var2.cancel();
                }
            } else {
                long jM23744c2 = this.f10236b;
                if (jM23744c2 != Long.MAX_VALUE) {
                    jM23744c2 = BackpressureHelper.m23744c(jM23744c2, andSet);
                    if (jM23744c2 != Long.MAX_VALUE) {
                        jM23744c2 -= andSet2;
                        if (jM23744c2 < 0) {
                            RxJavaPlugins.m23782b(new ProtocolViolationException(edb.m38561j(jM23744c2, "More produced than requested: ")));
                            jM23744c2 = 0;
                        }
                    }
                    this.f10236b = jM23744c2;
                }
                if (ot51Var2 != null) {
                    if (ot51Var3 != null && this.f10240f) {
                        ot51Var3.cancel();
                    }
                    this.f10235a = ot51Var2;
                    if (jM23744c2 != 0) {
                        jM23744c = BackpressureHelper.m23744c(jM23744c, jM23744c2);
                        ot51Var = ot51Var2;
                    }
                } else if (ot51Var3 != null && andSet != 0) {
                    jM23744c = BackpressureHelper.m23744c(jM23744c, andSet);
                    ot51Var = ot51Var3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jM23744c != 0) {
            ot51Var.request(jM23744c);
        }
    }

    public void cancel() {
        if (this.f10241g) {
            return;
        }
        this.f10241g = true;
        if (getAndIncrement() != 0) {
            return;
        }
        m23725c();
    }

    /* JADX INFO: renamed from: d */
    public final void m23726d(long j) {
        if (this.f10242h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m23742a(this.f10239e, j);
            if (getAndIncrement() != 0) {
                return;
            }
            m23725c();
            return;
        }
        long j2 = this.f10236b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.m23782b(new ProtocolViolationException(edb.m38561j(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.f10236b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m23725c();
    }

    /* JADX INFO: renamed from: e */
    public final void m23727e(ot51 ot51Var) {
        if (this.f10241g) {
            ot51Var.cancel();
            return;
        }
        Objects.requireNonNull(ot51Var, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            ot51 ot51Var2 = (ot51) this.f10237c.getAndSet(ot51Var);
            if (ot51Var2 != null && this.f10240f) {
                ot51Var2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            m23725c();
            return;
        }
        ot51 ot51Var3 = this.f10235a;
        if (ot51Var3 != null && this.f10240f) {
            ot51Var3.cancel();
        }
        this.f10235a = ot51Var;
        long j = this.f10236b;
        if (decrementAndGet() != 0) {
            m23725c();
        }
        if (j != 0) {
            ot51Var.request(j);
        }
    }

    public void onSubscribe(ot51 ot51Var) {
        m23727e(ot51Var);
    }

    @Override // p204p.ot51
    public final void request(long j) {
        if (!SubscriptionHelper.m23732e(j) || this.f10242h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m23742a(this.f10238d, j);
            if (getAndIncrement() != 0) {
                return;
            }
            m23725c();
            return;
        }
        long j2 = this.f10236b;
        if (j2 != Long.MAX_VALUE) {
            long jM23744c = BackpressureHelper.m23744c(j2, j);
            this.f10236b = jM23744c;
            if (jM23744c == Long.MAX_VALUE) {
                this.f10242h = true;
            }
        }
        ot51 ot51Var = this.f10235a;
        if (decrementAndGet() != 0) {
            m23725c();
        }
        if (ot51Var != null) {
            ot51Var.request(j);
        }
    }
}
