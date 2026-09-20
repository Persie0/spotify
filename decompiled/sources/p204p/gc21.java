package p204p;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gc21 implements gro {

    /* JADX INFO: renamed from: a */
    public final fc21 f78459a;

    /* JADX INFO: renamed from: e */
    public final iro[] f78463e;

    /* JADX INFO: renamed from: f */
    public final jro[] f78464f;

    /* JADX INFO: renamed from: g */
    public int f78465g;

    /* JADX INFO: renamed from: h */
    public int f78466h;

    /* JADX INFO: renamed from: i */
    public iro f78467i;

    /* JADX INFO: renamed from: j */
    public DecoderException f78468j;

    /* JADX INFO: renamed from: k */
    public boolean f78469k;

    /* JADX INFO: renamed from: l */
    public boolean f78470l;

    /* JADX INFO: renamed from: b */
    public final Object f78460b = new Object();

    /* JADX INFO: renamed from: m */
    public long f78471m = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f78461c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f78462d = new ArrayDeque();

    public gc21(iro[] iroVarArr, jro[] jroVarArr) {
        this.f78463e = iroVarArr;
        this.f78465g = iroVarArr.length;
        for (int i = 0; i < this.f78465g; i++) {
            this.f78463e[i] = mo44276f();
        }
        this.f78464f = jroVarArr;
        this.f78466h = jroVarArr.length;
        for (int i2 = 0; i2 < this.f78466h; i2++) {
            this.f78464f[i2] = mo44277g();
        }
        fc21 fc21Var = new fc21(this);
        this.f78459a = fc21Var;
        fc21Var.start();
    }

    @Override // p204p.gro
    /* JADX INFO: renamed from: d */
    public final void mo44274d(long j) {
        synchronized (this.f78460b) {
            try {
                c95.m31855u(this.f78465g == this.f78463e.length || this.f78469k);
                this.f78471m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.gro
    /* JADX INFO: renamed from: e */
    public final Object mo44275e() {
        iro iroVar;
        synchronized (this.f78460b) {
            try {
                DecoderException decoderException = this.f78468j;
                if (decoderException != null) {
                    throw decoderException;
                }
                c95.m31855u(this.f78467i == null);
                int i = this.f78465g;
                if (i == 0) {
                    iroVar = null;
                } else {
                    iro[] iroVarArr = this.f78463e;
                    int i2 = i - 1;
                    this.f78465g = i2;
                    iroVar = iroVarArr[i2];
                }
                this.f78467i = iroVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iroVar;
    }

    /* JADX INFO: renamed from: f */
    public abstract iro mo44276f();

    @Override // p204p.gro
    public final void flush() {
        synchronized (this.f78460b) {
            try {
                this.f78469k = true;
                iro iroVar = this.f78467i;
                if (iroVar != null) {
                    iroVar.mo51465g();
                    iro[] iroVarArr = this.f78463e;
                    int i = this.f78465g;
                    this.f78465g = i + 1;
                    iroVarArr[i] = iroVar;
                    this.f78467i = null;
                }
                while (!this.f78461c.isEmpty()) {
                    iro iroVar2 = (iro) this.f78461c.removeFirst();
                    iroVar2.mo51465g();
                    iro[] iroVarArr2 = this.f78463e;
                    int i2 = this.f78465g;
                    this.f78465g = i2 + 1;
                    iroVarArr2[i2] = iroVar2;
                }
                while (!this.f78462d.isEmpty()) {
                    ((jro) this.f78462d.removeFirst()).mo54188h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract jro mo44277g();

    /* JADX INFO: renamed from: h */
    public abstract DecoderException mo44278h(Throwable th);

    /* JADX INFO: renamed from: i */
    public abstract DecoderException mo44279i(iro iroVar, jro jroVar, boolean z);

    /* JADX INFO: renamed from: j */
    public final boolean m44280j() {
        boolean z;
        DecoderException decoderExceptionMo44278h;
        synchronized (this.f78460b) {
            while (!this.f78470l) {
                try {
                    if (!this.f78461c.isEmpty() && this.f78466h > 0) {
                        break;
                    }
                    this.f78460b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f78470l) {
                return false;
            }
            iro iroVar = (iro) this.f78461c.removeFirst();
            jro[] jroVarArr = this.f78464f;
            int i = this.f78466h - 1;
            this.f78466h = i;
            jro jroVar = jroVarArr[i];
            boolean z2 = this.f78469k;
            this.f78469k = false;
            if (iroVar.m67519d(4)) {
                jroVar.m67518a(4);
            } else {
                jroVar.f115242b = iroVar.f105020f;
                if (iroVar.m67519d(134217728)) {
                    jroVar.m67518a(134217728);
                }
                long j = iroVar.f105020f;
                synchronized (this.f78460b) {
                    long j2 = this.f78471m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    jroVar.f115243c = true;
                }
                try {
                    decoderExceptionMo44278h = mo44279i(iroVar, jroVar, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionMo44278h = mo44278h(e);
                } catch (RuntimeException e2) {
                    decoderExceptionMo44278h = mo44278h(e2);
                }
                if (decoderExceptionMo44278h != null) {
                    synchronized (this.f78460b) {
                        this.f78468j = decoderExceptionMo44278h;
                    }
                    return false;
                }
            }
            synchronized (this.f78460b) {
                try {
                    if (this.f78469k || jroVar.f115243c) {
                        jroVar.mo54188h();
                    } else {
                        this.f78462d.addLast(jroVar);
                    }
                    iroVar.mo51465g();
                    iro[] iroVarArr = this.f78463e;
                    int i2 = this.f78465g;
                    this.f78465g = i2 + 1;
                    iroVarArr[i2] = iroVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p204p.gro
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final jro mo44272b() {
        synchronized (this.f78460b) {
            try {
                DecoderException decoderException = this.f78468j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.f78462d.isEmpty()) {
                    return null;
                }
                return (jro) this.f78462d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.gro
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void mo44273c(iro iroVar) {
        synchronized (this.f78460b) {
            try {
                DecoderException decoderException = this.f78468j;
                if (decoderException != null) {
                    throw decoderException;
                }
                c95.m31843i(iroVar == this.f78467i);
                this.f78461c.addLast(iroVar);
                if (!this.f78461c.isEmpty() && this.f78466h > 0) {
                    this.f78460b.notify();
                }
                this.f78467i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m44283m(jro jroVar) {
        synchronized (this.f78460b) {
            jroVar.mo54187g();
            jro[] jroVarArr = this.f78464f;
            int i = this.f78466h;
            this.f78466h = i + 1;
            jroVarArr[i] = jroVar;
            if (!this.f78461c.isEmpty() && this.f78466h > 0) {
                this.f78460b.notify();
            }
        }
    }

    @Override // p204p.gro
    public final void release() {
        synchronized (this.f78460b) {
            this.f78470l = true;
            this.f78460b.notify();
        }
        try {
            this.f78459a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
