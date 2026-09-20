package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cns {

    /* JADX INFO: renamed from: c */
    public static final cns f40075c = new cns(0, 0);

    /* JADX INFO: renamed from: d */
    public static final cns f40076d = new cns(1, 8);

    /* JADX INFO: renamed from: e */
    public static final cns f40077e = new cns(3, 10);

    /* JADX INFO: renamed from: f */
    public static final cns f40078f = new cns(4, 10);

    /* JADX INFO: renamed from: g */
    public static final cns f40079g = new cns(5, 10);

    /* JADX INFO: renamed from: h */
    public static final cns f40080h = new cns(6, 10);

    /* JADX INFO: renamed from: i */
    public static final cns f40081i = new cns(6, 8);

    /* JADX INFO: renamed from: a */
    public final int f40082a;

    /* JADX INFO: renamed from: b */
    public final int f40083b;

    public cns(int i, int i2) {
        this.f40082a = i;
        this.f40083b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33466a() {
        return m33467b() && this.f40082a != 1 && this.f40083b == 10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33467b() {
        int i = this.f40082a;
        return (i == 0 || i == 2 || this.f40083b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cns) {
            cns cnsVar = (cns) obj;
            if (this.f40082a == cnsVar.f40082a && this.f40083b == cnsVar.f40083b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f40082a ^ 1000003) * 1000003) ^ this.f40083b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f40082a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return klh.m56832d(this.f40083b, "}", sb);
    }
}
