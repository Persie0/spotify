package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iq01 {

    /* JADX INFO: renamed from: a */
    public final ho01 f104590a;

    /* JADX INFO: renamed from: b */
    public final a611 f104591b;

    /* JADX INFO: renamed from: c */
    public final String f104592c;

    /* JADX INFO: renamed from: d */
    public final String f104593d;

    /* JADX INFO: renamed from: e */
    public final String f104594e;

    /* JADX INFO: renamed from: f */
    public final xr01 f104595f;

    /* JADX INFO: renamed from: g */
    public final String f104596g;

    /* JADX INFO: renamed from: h */
    public final xr01 f104597h;

    public iq01(String str, String str2, String str3, String str4, ho01 ho01Var, xr01 xr01Var, xr01 xr01Var2, a611 a611Var) {
        this.f104590a = ho01Var;
        this.f104591b = a611Var;
        this.f104592c = str;
        this.f104593d = str2;
        this.f104594e = str3;
        this.f104595f = xr01Var;
        this.f104596g = str4;
        this.f104597h = xr01Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq01)) {
            return false;
        }
        iq01 iq01Var = (iq01) obj;
        return wj50.m88271j(this.f104590a, iq01Var.f104590a) && wj50.m88271j(this.f104591b, iq01Var.f104591b) && wj50.m88271j(this.f104592c, iq01Var.f104592c) && wj50.m88271j(this.f104593d, iq01Var.f104593d) && wj50.m88271j(this.f104594e, iq01Var.f104594e) && wj50.m88271j(this.f104595f, iq01Var.f104595f) && wj50.m88271j(this.f104596g, iq01Var.f104596g) && wj50.m88271j(this.f104597h, iq01Var.f104597h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((this.f104591b.hashCode() + (this.f104590a.hashCode() * 31)) * 31, 31, this.f104592c), 31, this.f104593d), 31, this.f104594e);
        xr01 xr01Var = this.f104595f;
        int iHashCode = (iM77243b + (xr01Var == null ? 0 : xr01Var.f265192a.hashCode())) * 31;
        String str = this.f104596g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        xr01 xr01Var2 = this.f104597h;
        return iHashCode2 + (xr01Var2 != null ? xr01Var2.f265192a.hashCode() : 0);
    }
}
