package p204p;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ht0 {

    /* JADX INFO: renamed from: m */
    public static final String f94866m;

    /* JADX INFO: renamed from: n */
    public static final String f94867n;

    /* JADX INFO: renamed from: o */
    public static final String f94868o;

    /* JADX INFO: renamed from: p */
    public static final String f94869p;

    /* JADX INFO: renamed from: q */
    public static final String f94870q;

    /* JADX INFO: renamed from: r */
    public static final String f94871r;

    /* JADX INFO: renamed from: s */
    public static final String f94872s;

    /* JADX INFO: renamed from: t */
    public static final String f94873t;

    /* JADX INFO: renamed from: u */
    public static final String f94874u;

    /* JADX INFO: renamed from: v */
    public static final String f94875v;

    /* JADX INFO: renamed from: w */
    public static final String f94876w;

    /* JADX INFO: renamed from: x */
    public static final String f94877x;

    /* JADX INFO: renamed from: a */
    public final long f94878a;

    /* JADX INFO: renamed from: b */
    public final int f94879b;

    /* JADX INFO: renamed from: c */
    public final int f94880c;

    /* JADX INFO: renamed from: d */
    public final Uri[] f94881d;

    /* JADX INFO: renamed from: e */
    public final ufd0[] f94882e;

    /* JADX INFO: renamed from: f */
    public final int[] f94883f;

    /* JADX INFO: renamed from: g */
    public final long[] f94884g;

    /* JADX INFO: renamed from: h */
    public final String[] f94885h;

    /* JADX INFO: renamed from: i */
    public final it0[] f94886i;

    /* JADX INFO: renamed from: j */
    public final long f94887j;

    /* JADX INFO: renamed from: k */
    public final boolean f94888k;

    /* JADX INFO: renamed from: l */
    public final boolean f94889l;

    static {
        String str = h0b1.f86200a;
        f94866m = Integer.toString(0, 36);
        f94867n = Integer.toString(1, 36);
        f94868o = Integer.toString(2, 36);
        f94869p = Integer.toString(3, 36);
        f94870q = Integer.toString(4, 36);
        f94871r = Integer.toString(5, 36);
        f94872s = Integer.toString(6, 36);
        f94873t = Integer.toString(7, 36);
        f94874u = Integer.toString(8, 36);
        f94875v = Integer.toString(9, 36);
        f94876w = Integer.toString(10, 36);
        f94877x = Integer.toString(11, 36);
    }

    public ht0(long j, int i, int i2, int[] iArr, ufd0[] ufd0VarArr, long[] jArr, long j2, boolean z, String[] strArr, it0[] it0VarArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        c95.m31843i(iArr.length == ufd0VarArr.length);
        c95.m31843i(iArr.length == it0VarArr.length);
        this.f94878a = j;
        this.f94879b = i;
        this.f94880c = i2;
        this.f94883f = iArr;
        this.f94882e = ufd0VarArr;
        this.f94884g = jArr;
        this.f94887j = j2;
        this.f94888k = z;
        this.f94881d = new Uri[ufd0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f94881d;
            if (i3 >= uriArr.length) {
                this.f94885h = strArr;
                this.f94886i = it0VarArr;
                this.f94889l = z2;
                return;
            }
            ufd0 ufd0Var = ufd0VarArr[i3];
            if (ufd0Var == null) {
                uri = null;
            } else {
                ofd0 ofd0Var = ufd0Var.f229763b;
                ofd0Var.getClass();
                uri = ofd0Var.f164727a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m48566a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f94883f;
            if (i3 >= iArr.length || this.f94888k || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ht0.class == obj.getClass()) {
            ht0 ht0Var = (ht0) obj;
            if (this.f94878a == ht0Var.f94878a && this.f94879b == ht0Var.f94879b && this.f94880c == ht0Var.f94880c && Arrays.equals(this.f94882e, ht0Var.f94882e) && Arrays.equals(this.f94883f, ht0Var.f94883f) && Arrays.equals(this.f94884g, ht0Var.f94884g) && this.f94887j == ht0Var.f94887j && this.f94888k == ht0Var.f94888k && Arrays.equals(this.f94885h, ht0Var.f94885h) && Arrays.equals(this.f94886i, ht0Var.f94886i) && this.f94889l == ht0Var.f94889l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f94879b * 31) + this.f94880c) * 31;
        long j = this.f94878a;
        int iHashCode = (Arrays.hashCode(this.f94884g) + ((Arrays.hashCode(this.f94883f) + ((Arrays.hashCode(this.f94882e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.f94887j;
        return ((Arrays.hashCode(this.f94886i) + ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f94888k ? 1 : 0)) * 31) + Arrays.hashCode(this.f94885h)) * 31)) * 31) + (this.f94889l ? 1 : 0);
    }
}
