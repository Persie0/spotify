package p204p;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class xw41 implements Runnable {

    /* JADX INFO: renamed from: h */
    public static final Object f266574h = new Object();

    /* JADX INFO: renamed from: a */
    public final Executor f266575a;

    /* JADX INFO: renamed from: b */
    public final mmk0 f266576b;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f266578d;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f266577c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e */
    public Object f266579e = f266574h;

    /* JADX INFO: renamed from: f */
    public int f266580f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f266581g = false;

    public xw41(AtomicReference atomicReference, Executor executor, mmk0 mmk0Var) {
        this.f266578d = atomicReference;
        this.f266575a = executor;
        this.f266576b = mmk0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m92279a(int i) {
        synchronized (this) {
            try {
                if (this.f266577c.get()) {
                    if (i <= this.f266580f) {
                        return;
                    }
                    this.f266580f = i;
                    if (this.f266581g) {
                        return;
                    }
                    this.f266581g = true;
                    try {
                        this.f266575a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f266581g = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f266577c.get()) {
                    this.f266581g = false;
                    return;
                }
                Object obj = this.f266578d.get();
                int i = this.f266580f;
                while (true) {
                    if (!Objects.equals(this.f266579e, obj)) {
                        this.f266579e = obj;
                        if (obj instanceof e28) {
                            this.f266576b.onError(null);
                        } else {
                            this.f266576b.mo49913c(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f266580f || !this.f266577c.get()) {
                                break;
                                break;
                            } else {
                                obj = this.f266578d.get();
                                i = this.f266580f;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f266581g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
