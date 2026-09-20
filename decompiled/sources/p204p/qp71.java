package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qp71 {

    /* JADX INFO: renamed from: a */
    public static final ap71 f191180a = new ap71();

    /* JADX INFO: renamed from: b */
    public static final String f191181b;

    /* JADX INFO: renamed from: c */
    public static final String f191182c;

    /* JADX INFO: renamed from: d */
    public static final String f191183d;

    static {
        String str = h0b1.f86200a;
        f191181b = Integer.toString(0, 36);
        f191182c = Integer.toString(1, 36);
        f191183d = Integer.toString(2, 36);
    }

    /* JADX INFO: renamed from: a */
    public int mo33542a(boolean z) {
        return m73436p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo26650b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo33543c(boolean z) {
        if (m73436p()) {
            return -1;
        }
        return mo26655o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m73432d(int i, bp71 bp71Var, mp71 mp71Var, int i2, boolean z) {
        int i3 = mo26651f(i, bp71Var, false).f29345c;
        if (mo26654n(i3, mp71Var, 0L).f145940o != i) {
            return i + 1;
        }
        int iMo33544e = mo33544e(i3, i2, z);
        if (iMo33544e == -1) {
            return -1;
        }
        return mo26654n(iMo33544e, mp71Var, 0L).f145939n;
    }

    /* JADX INFO: renamed from: e */
    public int mo33544e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo33543c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo33543c(z) ? mo33542a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iMo33543c;
        if (this != obj) {
            if (obj instanceof qp71) {
                qp71 qp71Var = (qp71) obj;
                if (qp71Var.mo26655o() == mo26655o() && qp71Var.mo26652h() == mo26652h()) {
                    mp71 mp71Var = new mp71();
                    bp71 bp71Var = new bp71();
                    mp71 mp71Var2 = new mp71();
                    bp71 bp71Var2 = new bp71();
                    for (int i = 0; i < mo26655o(); i++) {
                        if (mo26654n(i, mp71Var, 0L).equals(qp71Var.mo26654n(i, mp71Var2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo26652h(); i2++) {
                        if (mo26651f(i2, bp71Var, true).equals(qp71Var.mo26651f(i2, bp71Var2, true))) {
                        }
                    }
                    int iMo33542a = mo33542a(true);
                    if (iMo33542a == qp71Var.mo33542a(true) && (iMo33543c = mo33543c(true)) == qp71Var.mo33543c(true)) {
                        while (iMo33542a != iMo33543c) {
                            int iMo33544e = mo33544e(iMo33542a, 0, true);
                            if (iMo33544e == qp71Var.mo33544e(iMo33542a, 0, true)) {
                                iMo33542a = iMo33544e;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract bp71 mo26651f(int i, bp71 bp71Var, boolean z);

    /* JADX INFO: renamed from: g */
    public bp71 mo46978g(Object obj, bp71 bp71Var) {
        return mo26651f(mo26650b(obj), bp71Var, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo26652h();

    public int hashCode() {
        mp71 mp71Var = new mp71();
        bp71 bp71Var = new bp71();
        int iMo26655o = mo26655o() + 217;
        for (int i = 0; i < mo26655o(); i++) {
            iMo26655o = (iMo26655o * 31) + mo26654n(i, mp71Var, 0L).hashCode();
        }
        int iMo26652h = mo26652h() + (iMo26655o * 31);
        for (int i2 = 0; i2 < mo26652h(); i2++) {
            iMo26652h = (iMo26652h * 31) + mo26651f(i2, bp71Var, true).hashCode();
        }
        int iMo33542a = mo33542a(true);
        while (iMo33542a != -1) {
            iMo26652h = (iMo26652h * 31) + iMo33542a;
            iMo33542a = mo33544e(iMo33542a, 0, true);
        }
        return iMo26652h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m73433i(mp71 mp71Var, bp71 bp71Var, int i, long j) {
        Pair pairM73434j = m73434j(mp71Var, bp71Var, i, j, 0L);
        pairM73434j.getClass();
        return pairM73434j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m73434j(mp71 mp71Var, bp71 bp71Var, int i, long j, long j2) {
        c95.m31847m(i, mo26655o());
        mo26654n(i, mp71Var, j2);
        if (j == -9223372036854775807L) {
            j = mp71Var.f145937l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = mp71Var.f145939n;
        mo26651f(i2, bp71Var, false);
        while (i2 < mp71Var.f145940o && bp71Var.f29347e != j) {
            int i3 = i2 + 1;
            if (mo26651f(i3, bp71Var, false).f29347e > j) {
                break;
            }
            i2 = i3;
        }
        mo26651f(i2, bp71Var, true);
        long jMin = j - bp71Var.f29347e;
        long j3 = bp71Var.f29346d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bp71Var.f29344b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo33545k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo33542a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo33542a(z) ? mo33543c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo26653l(int i);

    /* JADX INFO: renamed from: m */
    public final mp71 m73435m(int i, mp71 mp71Var) {
        return mo26654n(i, mp71Var, 0L);
    }

    /* JADX INFO: renamed from: n */
    public abstract mp71 mo26654n(int i, mp71 mp71Var, long j);

    /* JADX INFO: renamed from: o */
    public abstract int mo26655o();

    /* JADX INFO: renamed from: p */
    public final boolean m73436p() {
        return mo26655o() == 0;
    }
}
