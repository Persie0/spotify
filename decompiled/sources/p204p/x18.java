package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x18 {

    /* JADX INFO: renamed from: h */
    public static final x18 f257082h;

    /* JADX INFO: renamed from: i */
    public static final x18 f257083i;

    /* JADX INFO: renamed from: a */
    public final String f257084a;

    /* JADX INFO: renamed from: b */
    public final String f257085b;

    /* JADX INFO: renamed from: c */
    public final boolean f257086c;

    /* JADX INFO: renamed from: d */
    public final boolean f257087d;

    /* JADX INFO: renamed from: e */
    public final Long f257088e;

    /* JADX INFO: renamed from: f */
    public final Long f257089f;

    /* JADX INFO: renamed from: g */
    public final Long f257090g;

    static {
        w18 w18Var = new w18();
        w18Var.f247008a = "";
        w18Var.f247009b = "";
        w18Var.f247012e = 0L;
        w18Var.f247013f = 0L;
        w18Var.f247010c = false;
        byte b = (byte) (w18Var.f247015h | 1);
        w18Var.f247011d = false;
        w18Var.f247015h = (byte) (b | 2);
        w18Var.f247014g = 0L;
        f257082h = w18Var.m86977a();
        w18 w18Var2 = new w18();
        w18Var2.f247008a = "";
        w18Var2.f247009b = "";
        w18Var2.f247012e = 0L;
        w18Var2.f247013f = 0L;
        w18Var2.f247010c = false;
        byte b2 = (byte) (w18Var2.f247015h | 1);
        w18Var2.f247011d = true;
        w18Var2.f247015h = (byte) (b2 | 2);
        w18Var2.f247014g = 0L;
        f257083i = w18Var2.m86977a();
    }

    public x18(String str, String str2, boolean z, boolean z2, Long l, Long l2, Long l3) {
        this.f257084a = str;
        this.f257085b = str2;
        this.f257086c = z;
        this.f257087d = z2;
        this.f257088e = l;
        this.f257089f = l2;
        this.f257090g = l3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89622a() {
        if (this.f257084a.length() == 0) {
            return false;
        }
        Long l = this.f257089f;
        return l.longValue() == 0 || !this.f257088e.equals(l);
    }

    /* JADX INFO: renamed from: b */
    public final w18 m89623b() {
        w18 w18Var = new w18();
        w18Var.f247008a = this.f257084a;
        w18Var.f247009b = this.f257085b;
        w18Var.f247010c = this.f257086c;
        w18Var.f247011d = this.f257087d;
        w18Var.f247012e = this.f257088e;
        w18Var.f247013f = this.f257089f;
        w18Var.f247014g = this.f257090g;
        w18Var.f247015h = (byte) 3;
        return w18Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x18)) {
            return false;
        }
        x18 x18Var = (x18) obj;
        return this.f257084a.equals(x18Var.f257084a) && this.f257085b.equals(x18Var.f257085b) && this.f257086c == x18Var.f257086c && this.f257087d == x18Var.f257087d && this.f257088e.equals(x18Var.f257088e) && this.f257089f.equals(x18Var.f257089f) && this.f257090g.equals(x18Var.f257090g);
    }

    public final int hashCode() {
        return ((((((((((((this.f257084a.hashCode() ^ 1000003) * 1000003) ^ this.f257085b.hashCode()) * 1000003) ^ (this.f257086c ? 1231 : 1237)) * 1000003) ^ (this.f257087d ? 1231 : 1237)) * 1000003) ^ this.f257088e.hashCode()) * 1000003) ^ this.f257089f.hashCode()) * 1000003) ^ this.f257090g.hashCode();
    }

    public final String toString() {
        StringBuilder sbM38573v = edb.m38573v("PreviewPlayerState{previewId=", this.f257084a, ", previewKey=", this.f257085b, ", isLoading=");
        sbM38573v.append(this.f257086c);
        sbM38573v.append(", isError=");
        sbM38573v.append(this.f257087d);
        sbM38573v.append(", position=");
        sbM38573v.append(this.f257088e);
        sbM38573v.append(", duration=");
        sbM38573v.append(this.f257089f);
        sbM38573v.append(", timestamp=");
        sbM38573v.append(this.f257090g);
        sbM38573v.append("}");
        return sbM38573v.toString();
    }
}
