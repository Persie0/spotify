package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class st81 {

    /* JADX INFO: renamed from: f */
    public static final String f213849f;

    /* JADX INFO: renamed from: g */
    public static final String f213850g;

    /* JADX INFO: renamed from: h */
    public static final String f213851h;

    /* JADX INFO: renamed from: i */
    public static final String f213852i;

    /* JADX INFO: renamed from: a */
    public final int f213853a;

    /* JADX INFO: renamed from: b */
    public final kf81 f213854b;

    /* JADX INFO: renamed from: c */
    public final boolean f213855c;

    /* JADX INFO: renamed from: d */
    public final int[] f213856d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f213857e;

    static {
        String str = h0b1.f86200a;
        f213849f = Integer.toString(0, 36);
        f213850g = Integer.toString(1, 36);
        f213851h = Integer.toString(3, 36);
        f213852i = Integer.toString(4, 36);
    }

    public st81(kf81 kf81Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = kf81Var.f122099a;
        this.f213853a = i;
        boolean z2 = false;
        c95.m31843i(i == iArr.length && i == zArr.length);
        this.f213854b = kf81Var;
        if (z && i > 1) {
            z2 = true;
        }
        this.f213855c = z2;
        this.f213856d = (int[]) iArr.clone();
        this.f213857e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st81.class == obj.getClass()) {
            st81 st81Var = (st81) obj;
            if (this.f213855c == st81Var.f213855c && this.f213854b.equals(st81Var.f213854b) && Arrays.equals(this.f213856d, st81Var.f213856d) && Arrays.equals(this.f213857e, st81Var.f213857e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f213857e) + ((Arrays.hashCode(this.f213856d) + (((this.f213854b.hashCode() * 31) + (this.f213855c ? 1 : 0)) * 31)) * 31);
    }
}
