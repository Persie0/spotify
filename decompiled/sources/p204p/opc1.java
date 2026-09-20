package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class opc1 {

    /* JADX INFO: renamed from: e */
    public static final opc1 f167865e = new opc1(0.0f, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final long f167866a;

    /* JADX INFO: renamed from: b */
    public final float f167867b;

    /* JADX INFO: renamed from: c */
    public final long f167868c;

    /* JADX INFO: renamed from: d */
    public final long f167869d;

    public opc1(float f, long j, long j2, long j3) {
        this.f167866a = j;
        this.f167867b = f;
        this.f167868c = j2;
        this.f167869d = j3;
    }

    /* JADX INFO: renamed from: a */
    public static opc1 m67522a(opc1 opc1Var, long j, float f, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j = opc1Var.f167866a;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            f = opc1Var.f167867b;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = opc1Var.f167868c;
        }
        long j5 = j2;
        if ((i & 8) != 0) {
            j3 = opc1Var.f167869d;
        }
        opc1Var.getClass();
        return new opc1(f2, j4, j5, j3);
    }

    /* JADX INFO: renamed from: c */
    public static opc1 m67523c(opc1 opc1Var, uk91 uk91Var) {
        opc1Var.getClass();
        long j = uk91Var.f231266c;
        if (j <= 0 || opc1Var.f167867b <= 0.0f) {
            return opc1Var;
        }
        float f = (uk91Var.f231264a + uk91Var.f231265b) / 2.0f;
        float f2 = (j / 0.3f) / 2.0f;
        return m67522a(opc1Var, 0L, 0.0f, (long) (f - f2), (long) (f + f2), 3);
    }

    /* JADX INFO: renamed from: b */
    public final float m67524b() {
        long j = this.f167869d;
        long j2 = this.f167868c;
        if (j - j2 <= 0) {
            return 0.0f;
        }
        return this.f167867b / (j - j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opc1)) {
            return false;
        }
        opc1 opc1Var = (opc1) obj;
        return this.f167866a == opc1Var.f167866a && Float.compare(this.f167867b, opc1Var.f167867b) == 0 && this.f167868c == opc1Var.f167868c && this.f167869d == opc1Var.f167869d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f167869d) + dq60.m36605e(AbstractC0000a.m8g(Long.hashCode(this.f167866a) * 31, 31, this.f167867b), this.f167868c, 31);
    }
}
