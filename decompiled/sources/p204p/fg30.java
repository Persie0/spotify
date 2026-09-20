package p204p;

import com.spotify.playbacknative.AudioDriver;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class fg30 implements Closeable {

    /* JADX INFO: renamed from: Y0 */
    public static final x601 f69185Y0;

    /* JADX INFO: renamed from: L0 */
    public long f69186L0;

    /* JADX INFO: renamed from: M0 */
    public long f69187M0;

    /* JADX INFO: renamed from: N0 */
    public long f69188N0;

    /* JADX INFO: renamed from: O0 */
    public final oiz f69189O0;

    /* JADX INFO: renamed from: P0 */
    public final x601 f69190P0;

    /* JADX INFO: renamed from: Q0 */
    public x601 f69191Q0;

    /* JADX INFO: renamed from: R0 */
    public final evd1 f69192R0;

    /* JADX INFO: renamed from: S0 */
    public long f69193S0;

    /* JADX INFO: renamed from: T0 */
    public long f69194T0;

    /* JADX INFO: renamed from: U0 */
    public final rb5 f69195U0;

    /* JADX INFO: renamed from: V0 */
    public final ng30 f69196V0;

    /* JADX INFO: renamed from: W0 */
    public final eg30 f69197W0;

    /* JADX INFO: renamed from: X */
    public final zhi0 f69198X;

    /* JADX INFO: renamed from: X0 */
    public final LinkedHashSet f69199X0;

    /* JADX INFO: renamed from: Y */
    public long f69200Y;

    /* JADX INFO: renamed from: Z */
    public long f69201Z;

    /* JADX INFO: renamed from: a */
    public final dg30 f69202a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f69203b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final String f69204c;

    /* JADX INFO: renamed from: d */
    public int f69205d;

    /* JADX INFO: renamed from: e */
    public int f69206e;

    /* JADX INFO: renamed from: f */
    public boolean f69207f;

    /* JADX INFO: renamed from: g */
    public final lv61 f69208g;

    /* JADX INFO: renamed from: h */
    public final kv61 f69209h;

    /* JADX INFO: renamed from: i */
    public final kv61 f69210i;

    /* JADX INFO: renamed from: t */
    public final kv61 f69211t;

    static {
        x601 x601Var = new x601();
        x601Var.m90053b(4, AudioDriver.SPOTIFY_MAX_VOLUME);
        x601Var.m90053b(5, 16384);
        f69185Y0 = x601Var;
    }

    public fg30(bg30 bg30Var) {
        this.f69202a = (dg30) bg30Var.f26824e;
        String str = (String) bg30Var.f26823d;
        if (str == null) {
            wj50.m88260d0("connectionName");
            throw null;
        }
        this.f69204c = str;
        this.f69206e = 3;
        lv61 lv61Var = (lv61) bg30Var.f26821b;
        this.f69208g = lv61Var;
        kv61 kv61VarM60068d = lv61Var.m60068d();
        this.f69209h = kv61VarM60068d;
        this.f69210i = lv61Var.m60068d();
        this.f69211t = lv61Var.m60068d();
        this.f69198X = zhi0.f282932X;
        this.f69189O0 = (oiz) bg30Var.f26825f;
        x601 x601Var = new x601();
        x601Var.m90053b(4, 16777216);
        this.f69190P0 = x601Var;
        x601 x601Var2 = f69185Y0;
        this.f69191Q0 = x601Var2;
        this.f69192R0 = new evd1(0);
        this.f69194T0 = x601Var2.m90052a();
        rb5 rb5Var = (rb5) bg30Var.f26822c;
        if (rb5Var == null) {
            wj50.m88260d0("socket");
            throw null;
        }
        this.f69195U0 = rb5Var;
        this.f69196V0 = new ng30((tuu0) rb5Var.f197473d);
        this.f69197W0 = new eg30(this, new ig30((vuu0) rb5Var.f197472c));
        this.f69199X0 = new LinkedHashSet();
        int i = bg30Var.f26820a;
        if (i != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            kv61VarM60068d.m57443d(new jv61(str.concat(" ping"), new eh00() { // from class: p.zf30
                @Override // p204p.eh00
                public final Object invoke() {
                    boolean z;
                    fg30 fg30Var = this.f282198a;
                    long j = nanos;
                    synchronized (fg30Var) {
                        long j2 = fg30Var.f69201Z;
                        long j3 = fg30Var.f69200Y;
                        if (j2 < j3) {
                            z = true;
                        } else {
                            fg30Var.f69200Y = j3 + 1;
                            z = false;
                        }
                    }
                    if (z) {
                        fg30Var.m41564a(2, 2, null);
                        j = -1;
                    } else {
                        try {
                            fg30Var.f69196V0.m64374h(1, 0, false);
                        } catch (IOException e) {
                            fg30Var.m41564a(2, 2, e);
                        }
                    }
                    return Long.valueOf(j);
                }
            }), nanos);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m41564a(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        TimeZone timeZone = c0f1.f32774a;
        try {
            m41567f(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f69203b.isEmpty()) {
                array = null;
            } else {
                array = this.f69203b.values().toArray(new mg30[0]);
                this.f69203b.clear();
            }
        }
        mg30[] mg30VarArr = (mg30[]) array;
        if (mg30VarArr != null) {
            for (mg30 mg30Var : mg30VarArr) {
                try {
                    mg30Var.m61681c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f69196V0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f69195U0.cancel();
        } catch (IOException unused4) {
        }
        this.f69209h.m57445g();
        this.f69210i.m57445g();
        this.f69211t.m57445g();
    }

    /* JADX INFO: renamed from: c */
    public final mg30 m41565c(int i) {
        mg30 mg30Var;
        synchronized (this) {
            mg30Var = (mg30) this.f69203b.get(Integer.valueOf(i));
        }
        return mg30Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m41564a(1, 9, null);
    }

    /* JADX INFO: renamed from: e */
    public final mg30 m41566e(int i) {
        mg30 mg30Var;
        synchronized (this) {
            mg30Var = (mg30) this.f69203b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return mg30Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m41567f(int i) {
        synchronized (this.f69196V0) {
            synchronized (this) {
                if (this.f69207f) {
                    return;
                }
                this.f69207f = true;
                this.f69196V0.m64372f(this.f69205d, a0f1.f11072a, i);
            }
        }
    }

    public final void flush() {
        this.f69196V0.flush();
    }

    /* JADX INFO: renamed from: g */
    public final void m41568g(long j) {
        synchronized (this) {
            try {
                evd1.m40105b(this.f69192R0, j, 0L, 2);
                long jM40106a = this.f69192R0.m40106a();
                if (jM40106a >= this.f69190P0.m90052a() / 2) {
                    m41571k(0, jM40106a);
                    evd1.m40105b(this.f69192R0, 0L, jM40106a, 1);
                }
                this.f69189O0.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m41569h(int i, boolean z, npa npaVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f69196V0.m64370c(z, i, npaVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f69193S0;
                            j3 = this.f69194T0;
                            if (j2 >= j3) {
                                if (!this.f69203b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f69196V0.f153542c);
                j4 = iMin;
                this.f69193S0 += j4;
            }
            j -= j4;
            this.f69196V0.m64370c(z && j == 0, i, npaVar, iMin);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m41570i(int i, int i2) {
        kv61.m57439c(this.f69209h, this.f69204c + '[' + i + "] writeSynReset", 0L, new vf30(this, i, i2, 0), 6);
    }

    /* JADX INFO: renamed from: k */
    public final void m41571k(final int i, final long j) {
        kv61.m57439c(this.f69209h, this.f69204c + '[' + i + "] windowUpdate", 0L, new eh00() { // from class: p.ag30
            @Override // p204p.eh00
            public final Object invoke() {
                fg30 fg30Var = this.f15276a;
                try {
                    fg30Var.f69196V0.m64376k(i, j);
                } catch (IOException e) {
                    fg30Var.m41564a(2, 2, e);
                }
                return w2a1.f247311a;
            }
        }, 6);
    }
}
