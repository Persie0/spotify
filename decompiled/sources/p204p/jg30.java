package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class jg30 implements ai21 {

    /* JADX INFO: renamed from: a */
    public final boolean f112017a;

    /* JADX INFO: renamed from: b */
    public final npa f112018b = new npa();

    /* JADX INFO: renamed from: c */
    public boolean f112019c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mg30 f112020d;

    public jg30(mg30 mg30Var, boolean z) {
        this.f112020d = mg30Var;
        this.f112017a = z;
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: U0 */
    public final void mo25160U0(npa npaVar, long j) {
        TimeZone timeZone = c0f1.f32774a;
        npa npaVar2 = this.f112018b;
        npaVar2.mo25160U0(npaVar, j);
        while (npaVar2.f156904b >= PlaybackStateCompat.ACTION_PREPARE) {
            m53254a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m53254a(boolean z) {
        long jMin;
        boolean z2;
        mg30 mg30Var = this.f112020d;
        synchronized (mg30Var) {
            mg30Var.f143290X.m59473i();
            while (mg30Var.f143296d >= mg30Var.f143297e && !this.f112017a && !this.f112019c && mg30Var.m61684f() == 0) {
                try {
                    try {
                        mg30Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    mg30Var.f143290X.m58934m();
                    throw th;
                }
            }
            mg30Var.f143290X.m58934m();
            mg30Var.m61680b();
            jMin = Math.min(mg30Var.f143297e - mg30Var.f143296d, this.f112018b.f156904b);
            mg30Var.f143296d += jMin;
            z2 = z && jMin == this.f112018b.f156904b;
        }
        this.f112020d.f143290X.m59473i();
        try {
            mg30 mg30Var2 = this.f112020d;
            mg30Var2.f143294b.m41569h(mg30Var2.f143293a, z2, this.f112018b, jMin);
        } finally {
            this.f112020d.f143290X.m58934m();
        }
    }

    @Override // p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mg30 mg30Var = this.f112020d;
        TimeZone timeZone = c0f1.f32774a;
        synchronized (mg30Var) {
            if (this.f112019c) {
                return;
            }
            boolean z = mg30Var.m61684f() == 0;
            mg30 mg30Var2 = this.f112020d;
            if (!mg30Var2.f143301i.f112017a) {
                if (this.f112018b.f156904b > 0) {
                    while (this.f112018b.f156904b > 0) {
                        m53254a(true);
                    }
                } else if (z) {
                    mg30Var2.f143294b.m41569h(mg30Var2.f143293a, true, null, 0L);
                }
            }
            mg30 mg30Var3 = this.f112020d;
            synchronized (mg30Var3) {
                this.f112019c = true;
                mg30Var3.notifyAll();
            }
            this.f112020d.f143294b.flush();
            this.f112020d.m61679a();
        }
    }

    @Override // p204p.ai21, java.io.Flushable
    public final void flush() {
        mg30 mg30Var = this.f112020d;
        TimeZone timeZone = c0f1.f32774a;
        synchronized (mg30Var) {
            mg30Var.m61680b();
        }
        while (this.f112018b.f156904b > 0) {
            m53254a(false);
            this.f112020d.f143294b.flush();
        }
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: m */
    public final au71 mo25161m() {
        return this.f112020d.f143290X;
    }
}
