package p204p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
public final class kg30 implements wt31 {

    /* JADX INFO: renamed from: a */
    public final long f122287a;

    /* JADX INFO: renamed from: b */
    public boolean f122288b;

    /* JADX INFO: renamed from: c */
    public final npa f122289c = new npa();

    /* JADX INFO: renamed from: d */
    public final npa f122290d = new npa();

    /* JADX INFO: renamed from: e */
    public boolean f122291e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mg30 f122292f;

    public kg30(mg30 mg30Var, long j, boolean z) {
        this.f122292f = mg30Var;
        this.f122287a = j;
        this.f122288b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        mg30 mg30Var = this.f122292f;
        synchronized (mg30Var) {
            this.f122291e = true;
            npa npaVar = this.f122290d;
            j = npaVar.f156904b;
            npaVar.m65306c();
            mg30Var.notifyAll();
        }
        if (j > 0) {
            mg30 mg30Var2 = this.f122292f;
            TimeZone timeZone = c0f1.f32774a;
            mg30Var2.f143294b.m41568g(j);
        }
        this.f122292f.m61679a();
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long jMo27348g1;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        while (true) {
            mg30 mg30Var = this.f122292f;
            synchronized (mg30Var) {
                mg30Var.f143294b.getClass();
                jg30 jg30Var = mg30Var.f143301i;
                z = true;
                boolean z2 = jg30Var.f112019c || jg30Var.f112017a;
                if (z2) {
                    mg30Var.f143302t.m59473i();
                }
                try {
                    if (mg30Var.m61684f() == 0 || this.f122288b) {
                        streamResetException = null;
                    } else {
                        streamResetException = mg30Var.f143292Z;
                        if (streamResetException == null) {
                            int iM61684f = mg30Var.m61684f();
                            klh.m56843o(iM61684f);
                            streamResetException = new StreamResetException(iM61684f);
                        }
                    }
                    if (this.f122291e) {
                        throw new IOException("stream closed");
                    }
                    npa npaVar2 = this.f122290d;
                    long j3 = npaVar2.f156904b;
                    if (j3 > j2) {
                        jMo27348g1 = npaVar2.mo27348g1(npaVar, Math.min(j, j3));
                        evd1.m40105b(mg30Var.f143295c, jMo27348g1, 0L, 2);
                        long jM40106a = mg30Var.f143295c.m40106a();
                        if (streamResetException == null && jM40106a >= mg30Var.f143294b.f69190P0.m90052a() / 2) {
                            mg30Var.f143294b.m41571k(mg30Var.f143293a, jM40106a);
                            evd1.m40105b(mg30Var.f143295c, 0L, jM40106a, 1);
                        }
                        z = false;
                    } else {
                        if (this.f122288b || streamResetException != null) {
                            z = false;
                        } else {
                            try {
                                mg30Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jMo27348g1 = -1;
                    }
                    if (z2) {
                        mg30Var.f143302t.m58934m();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        mg30Var.f143302t.m58934m();
                    }
                    throw th;
                }
            }
            this.f122292f.f143294b.f69189O0.getClass();
            if (!z) {
                if (jMo27348g1 != -1) {
                    return jMo27348g1;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j2 = 0;
        }
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f122292f.f143302t;
    }
}
