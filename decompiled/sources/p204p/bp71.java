package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bp71 {

    /* JADX INFO: renamed from: h */
    public static final String f29336h;

    /* JADX INFO: renamed from: i */
    public static final String f29337i;

    /* JADX INFO: renamed from: j */
    public static final String f29338j;

    /* JADX INFO: renamed from: k */
    public static final String f29339k;

    /* JADX INFO: renamed from: l */
    public static final String f29340l;

    /* JADX INFO: renamed from: m */
    public static final String f29341m;

    /* JADX INFO: renamed from: n */
    public static final String f29342n;

    /* JADX INFO: renamed from: a */
    public Object f29343a;

    /* JADX INFO: renamed from: b */
    public Object f29344b;

    /* JADX INFO: renamed from: c */
    public int f29345c;

    /* JADX INFO: renamed from: d */
    public long f29346d;

    /* JADX INFO: renamed from: e */
    public long f29347e;

    /* JADX INFO: renamed from: f */
    public boolean f29348f;

    /* JADX INFO: renamed from: g */
    public kt0 f29349g = kt0.f126088f;

    static {
        String str = h0b1.f86200a;
        f29336h = Integer.toString(0, 36);
        f29337i = Integer.toString(1, 36);
        f29338j = Integer.toString(2, 36);
        f29339k = Integer.toString(3, 36);
        f29340l = Integer.toString(4, 36);
        f29341m = Integer.toString(5, 36);
        f29342n = Integer.toString(6, 36);
    }

    /* JADX INFO: renamed from: a */
    public final long m30104a(int i, int i2) {
        ht0 ht0VarM57289a = this.f29349g.m57289a(i);
        if (ht0VarM57289a.f94879b != -1) {
            return ht0VarM57289a.f94884g[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m30105b(long j) {
        ht0 ht0VarM57289a;
        int i;
        kt0 kt0Var = this.f29349g;
        long j2 = this.f29346d;
        int i2 = kt0Var.f126094a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = kt0Var.f126097d;
            while (i3 < i2 && ((kt0Var.m57289a(i3).f94878a != Long.MIN_VALUE && kt0Var.m57289a(i3).f94878a <= j) || ((i = (ht0VarM57289a = kt0Var.m57289a(i3)).f94879b) != -1 && ht0VarM57289a.m48566a(-1) >= i))) {
                i3++;
            }
            if (i3 < i2 && (j2 == -9223372036854775807L || kt0Var.m57289a(i3).f94878a <= j2)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX INFO: renamed from: c */
    public final int m30106c(long j) {
        int i;
        kt0 kt0Var = this.f29349g;
        long j2 = this.f29346d;
        int i2 = kt0Var.f126094a;
        int i3 = i2 - 1;
        if (i3 == i2 - 1) {
            ht0 ht0VarM57289a = kt0Var.m57289a(i3);
            if (ht0VarM57289a.f94889l && ht0VarM57289a.f94878a == Long.MIN_VALUE && ht0VarM57289a.f94879b == -1) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        int i4 = i3 - i;
        while (i4 >= 0 && j != Long.MIN_VALUE) {
            ht0 ht0VarM57289a2 = kt0Var.m57289a(i4);
            long j3 = ht0VarM57289a2.f94878a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i4--;
            } else {
                if (j2 != -9223372036854775807L && ((!ht0VarM57289a2.f94889l || j3 != Long.MIN_VALUE || ht0VarM57289a2.f94879b != -1) && j >= j2)) {
                    break;
                }
                i4--;
            }
        }
        if (i4 >= 0) {
            ht0 ht0VarM57289a3 = kt0Var.m57289a(i4);
            int i5 = ht0VarM57289a3.f94879b;
            if (i5 != -1) {
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = ht0VarM57289a3.f94883f[i6];
                    if (i7 != 0 && i7 != 1) {
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m30107d(int i) {
        return this.f29349g.m57289a(i).f94878a;
    }

    /* JADX INFO: renamed from: e */
    public final int m30108e(int i, int i2) {
        ht0 ht0VarM57289a = this.f29349g.m57289a(i);
        if (ht0VarM57289a.f94879b != -1) {
            return ht0VarM57289a.f94883f[i2];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bp71.class.equals(obj.getClass())) {
            bp71 bp71Var = (bp71) obj;
            if (Objects.equals(this.f29343a, bp71Var.f29343a) && Objects.equals(this.f29344b, bp71Var.f29344b) && this.f29345c == bp71Var.f29345c && this.f29346d == bp71Var.f29346d && this.f29347e == bp71Var.f29347e && this.f29348f == bp71Var.f29348f && Objects.equals(this.f29349g, bp71Var.f29349g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m30109f(int i) {
        return this.f29349g.m57289a(i).m48566a(-1);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m30110g(int i) {
        kt0 kt0Var = this.f29349g;
        int i2 = kt0Var.f126094a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        ht0 ht0VarM57289a = kt0Var.m57289a(i);
        return ht0VarM57289a.f94889l && ht0VarM57289a.f94878a == Long.MIN_VALUE && ht0VarM57289a.f94879b == -1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m30111h(int i) {
        return this.f29349g.m57289a(i).f94888k;
    }

    public final int hashCode() {
        Object obj = this.f29343a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f29344b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f29345c) * 31;
        long j = this.f29346d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f29347e;
        return this.f29349g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f29348f ? 1 : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final void m30112i(Object obj, Object obj2, int i, long j, long j2, kt0 kt0Var, boolean z) {
        this.f29343a = obj;
        this.f29344b = obj2;
        this.f29345c = i;
        this.f29346d = j;
        this.f29347e = j2;
        this.f29349g = kt0Var;
        this.f29348f = z;
    }
}
