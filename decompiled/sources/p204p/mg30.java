package p204p;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
public final class mg30 implements ck31 {

    /* JADX INFO: renamed from: X */
    public final lg30 f143290X;

    /* JADX INFO: renamed from: Y */
    public int f143291Y;

    /* JADX INFO: renamed from: Z */
    public IOException f143292Z;

    /* JADX INFO: renamed from: a */
    public final int f143293a;

    /* JADX INFO: renamed from: b */
    public final fg30 f143294b;

    /* JADX INFO: renamed from: c */
    public final evd1 f143295c;

    /* JADX INFO: renamed from: d */
    public long f143296d;

    /* JADX INFO: renamed from: e */
    public long f143297e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f143298f;

    /* JADX INFO: renamed from: g */
    public boolean f143299g;

    /* JADX INFO: renamed from: h */
    public final kg30 f143300h;

    /* JADX INFO: renamed from: i */
    public final jg30 f143301i;

    /* JADX INFO: renamed from: t */
    public final lg30 f143302t;

    public mg30(int i, fg30 fg30Var, boolean z, boolean z2, sn20 sn20Var) {
        this.f143293a = i;
        this.f143294b = fg30Var;
        this.f143295c = new evd1(i);
        this.f143297e = fg30Var.f69191Q0.m90052a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f143298f = arrayDeque;
        this.f143300h = new kg30(this, fg30Var.f69190P0.m90052a(), z2);
        this.f143301i = new jg30(this, z);
        this.f143302t = new lg30(this);
        this.f143290X = new lg30(this);
        if (sn20Var == null) {
            if (!m61685g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m61685g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(sn20Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    /* JADX INFO: renamed from: a */
    public final void m61679a() {
        boolean z;
        boolean zM61686h;
        TimeZone timeZone = c0f1.f32774a;
        synchronized (this) {
            try {
                kg30 kg30Var = this.f143300h;
                if (kg30Var.f122288b || !kg30Var.f122291e) {
                    z = false;
                } else {
                    jg30 jg30Var = this.f143301i;
                    if (jg30Var.f112017a || jg30Var.f112019c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM61686h = m61686h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m61681c(9, null);
        } else {
            if (zM61686h) {
                return;
            }
            this.f143294b.m41566e(this.f143293a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m61680b() throws IOException {
        jg30 jg30Var = this.f143301i;
        if (jg30Var.f112019c) {
            throw new IOException("stream closed");
        }
        if (jg30Var.f112017a) {
            throw new IOException("stream finished");
        }
        if (m61684f() != 0) {
            IOException iOException = this.f143292Z;
            if (iOException != null) {
                throw iOException;
            }
            int iM61684f = m61684f();
            klh.m56843o(iM61684f);
            throw new StreamResetException(iM61684f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m61681c(int i, IOException iOException) {
        if (m61682d(i, iOException)) {
            this.f143294b.f69196V0.m64375i(this.f143293a, i);
        }
    }

    @Override // p204p.ck31
    public final void cancel() {
        m61683e(9);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61682d(int i, IOException iOException) {
        TimeZone timeZone = c0f1.f32774a;
        synchronized (this) {
            if (m61684f() != 0) {
                return false;
            }
            this.f143291Y = i;
            this.f143292Z = iOException;
            notifyAll();
            if (this.f143300h.f122288b && this.f143301i.f112017a) {
                return false;
            }
            this.f143294b.m41566e(this.f143293a);
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61683e(int i) {
        if (m61682d(i, null)) {
            this.f143294b.m41570i(this.f143293a, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m61684f() {
        int i;
        synchronized (this) {
            i = this.f143291Y;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61685g() {
        boolean z = (this.f143293a & 1) == 1;
        this.f143294b.getClass();
        return true == z;
    }

    @Override // p204p.ck31
    public final wt31 getSource() {
        return this.f143300h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61686h() {
        synchronized (this) {
            try {
                if (m61684f() != 0) {
                    return false;
                }
                kg30 kg30Var = this.f143300h;
                if (kg30Var.f122288b || kg30Var.f122291e) {
                    jg30 jg30Var = this.f143301i;
                    if ((jg30Var.f112017a || jg30Var.f112019c) && this.f143299g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m61687i(sn20 sn20Var, boolean z) {
        boolean zM61686h;
        TimeZone timeZone = c0f1.f32774a;
        synchronized (this) {
            try {
                if (this.f143299g && sn20Var.m78534b(":status") == null && sn20Var.m78534b(":method") == null) {
                    this.f143300h.getClass();
                } else {
                    this.f143299g = true;
                    this.f143298f.add(sn20Var);
                }
                if (z) {
                    this.f143300h.f122288b = true;
                }
                zM61686h = m61686h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM61686h) {
            return;
        }
        this.f143294b.m41566e(this.f143293a);
    }

    @Override // p204p.ck31
    /* JADX INFO: renamed from: q */
    public final ai21 mo33068q() {
        return this.f143301i;
    }
}
