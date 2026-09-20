package p204p;

import com.google.android.recaptcha.internal.zzagk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v9f1 {

    /* JADX INFO: renamed from: a */
    public int f238938a;

    /* JADX INFO: renamed from: b */
    public int f238939b;

    /* JADX INFO: renamed from: c */
    public gx8 f238940c;

    /* JADX INFO: renamed from: e */
    public static t9f1 m84963e(int i, byte[] bArr, int i2) {
        t9f1 t9f1Var = new t9f1(bArr, i, i2);
        try {
            t9f1Var.mo80287a(i2);
            return t9f1Var;
        } catch (zzagk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m84964f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: g */
    public static long m84965g(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo80287a(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo80288b(int i);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo80289c();

    /* JADX INFO: renamed from: d */
    public abstract int mo80290d();

    /* JADX INFO: renamed from: h */
    public abstract int mo80291h();

    /* JADX INFO: renamed from: i */
    public abstract void mo80292i();

    /* JADX INFO: renamed from: j */
    public abstract double mo80293j();

    /* JADX INFO: renamed from: k */
    public abstract float mo80294k();

    /* JADX INFO: renamed from: l */
    public abstract long mo80295l();

    /* JADX INFO: renamed from: m */
    public abstract long mo80296m();

    /* JADX INFO: renamed from: n */
    public abstract int mo80297n();

    /* JADX INFO: renamed from: o */
    public abstract long mo80298o();

    /* JADX INFO: renamed from: p */
    public abstract int mo80299p();

    /* JADX INFO: renamed from: q */
    public abstract boolean mo80300q();

    /* JADX INFO: renamed from: r */
    public abstract String mo80301r();

    /* JADX INFO: renamed from: s */
    public abstract String mo80302s();

    /* JADX INFO: renamed from: t */
    public abstract r9f1 mo80303t();

    /* JADX INFO: renamed from: u */
    public abstract int mo80304u();

    /* JADX INFO: renamed from: v */
    public abstract int mo80305v();

    /* JADX INFO: renamed from: w */
    public abstract int mo80306w();

    /* JADX INFO: renamed from: x */
    public abstract long mo80307x();

    /* JADX INFO: renamed from: y */
    public abstract int mo80308y();

    /* JADX INFO: renamed from: z */
    public abstract long mo80309z();
}
