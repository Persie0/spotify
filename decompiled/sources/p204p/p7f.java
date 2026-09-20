package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class p7f {

    /* JADX INFO: renamed from: h */
    public static final p7f f174667h = new p7f(1, 2, 3, null, -1, -1);

    /* JADX INFO: renamed from: i */
    public static final p7f f174668i = new p7f(1, 1, 2, null, -1, -1);

    /* JADX INFO: renamed from: j */
    public static final String f174669j;

    /* JADX INFO: renamed from: k */
    public static final String f174670k;

    /* JADX INFO: renamed from: l */
    public static final String f174671l;

    /* JADX INFO: renamed from: m */
    public static final String f174672m;

    /* JADX INFO: renamed from: n */
    public static final String f174673n;

    /* JADX INFO: renamed from: o */
    public static final String f174674o;

    /* JADX INFO: renamed from: a */
    public final int f174675a;

    /* JADX INFO: renamed from: b */
    public final int f174676b;

    /* JADX INFO: renamed from: c */
    public final int f174677c;

    /* JADX INFO: renamed from: d */
    public final byte[] f174678d;

    /* JADX INFO: renamed from: e */
    public final int f174679e;

    /* JADX INFO: renamed from: f */
    public final int f174680f;

    /* JADX INFO: renamed from: g */
    public int f174681g;

    static {
        String str = h0b1.f86200a;
        f174669j = Integer.toString(0, 36);
        f174670k = Integer.toString(1, 36);
        f174671l = Integer.toString(2, 36);
        f174672m = Integer.toString(3, 36);
        f174673n = Integer.toString(4, 36);
        f174674o = Integer.toString(5, 36);
    }

    public p7f(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f174675a = i;
        this.f174676b = i2;
        this.f174677c = i3;
        this.f174678d = bArr;
        this.f174679e = i4;
        this.f174680f = i5;
    }

    /* JADX INFO: renamed from: b */
    public static String m69255b(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? s571.m77246e(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: c */
    public static String m69256c(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? s571.m77246e(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: d */
    public static int m69257d(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 6) {
            return 16;
        }
        if (i != 7) {
            return i != 10 ? 1 : 4;
        }
        return 18;
    }

    /* JADX INFO: renamed from: e */
    public static String m69258e(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? s571.m77246e(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m69259g(p7f p7fVar) {
        if (p7fVar == null) {
            return true;
        }
        int i = p7fVar.f174675a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = p7fVar.f174676b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = p7fVar.f174677c;
        if ((i3 != -1 && i3 != 3) || p7fVar.f174678d != null) {
            return false;
        }
        int i4 = p7fVar.f174680f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = p7fVar.f174679e;
        return i5 == -1 || i5 == 8;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m69260h(p7f p7fVar) {
        if (p7fVar == null) {
            return false;
        }
        int i = p7fVar.f174677c;
        return i == 7 || i == 6;
    }

    /* JADX INFO: renamed from: i */
    public static int m69261i(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: j */
    public static int m69262j(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: a */
    public final o7f m69263a() {
        o7f o7fVar = new o7f();
        o7fVar.f162531a = this.f174675a;
        o7fVar.f162532b = this.f174676b;
        o7fVar.f162533c = this.f174677c;
        o7fVar.f162535e = this.f174678d;
        o7fVar.f162534d = this.f174679e;
        o7fVar.f162536f = this.f174680f;
        return o7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p7f.class == obj.getClass()) {
            p7f p7fVar = (p7f) obj;
            if (this.f174675a == p7fVar.f174675a && this.f174676b == p7fVar.f174676b && this.f174677c == p7fVar.f174677c && Arrays.equals(this.f174678d, p7fVar.f174678d) && this.f174679e == p7fVar.f174679e && this.f174680f == p7fVar.f174680f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m69264f() {
        return (this.f174675a == -1 || this.f174676b == -1 || this.f174677c == -1) ? false : true;
    }

    public final int hashCode() {
        if (this.f174681g == 0) {
            this.f174681g = ((tfe.m80647e((((((527 + this.f174675a) * 31) + this.f174676b) * 31) + this.f174677c) * 31, this.f174678d, 31) + this.f174679e) * 31) + this.f174680f;
        }
        return this.f174681g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m69256c(this.f174675a));
        sb.append(", ");
        sb.append(m69255b(this.f174676b));
        sb.append(", ");
        sb.append(m69258e(this.f174677c));
        sb.append(", ");
        sb.append(this.f174678d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f174679e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f174680f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return dq60.m36616p(str2, ")", sb);
    }
}
