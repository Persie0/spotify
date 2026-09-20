package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g111 {

    /* JADX INFO: renamed from: a */
    public final String f75507a;

    /* JADX INFO: renamed from: b */
    public final String f75508b;

    /* JADX INFO: renamed from: c */
    public final String f75509c;

    /* JADX INFO: renamed from: d */
    public final u311 f75510d;

    /* JADX INFO: renamed from: e */
    public final ox01 f75511e;

    /* JADX INFO: renamed from: f */
    public final String f75512f;

    public g111(String str, String str2, String str3, u311 u311Var, ox01 ox01Var, String str4) {
        this.f75507a = str;
        this.f75508b = str2;
        this.f75509c = str3;
        this.f75510d = u311Var;
        this.f75511e = ox01Var;
        this.f75512f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g111)) {
            return false;
        }
        g111 g111Var = (g111) obj;
        return wj50.m88271j(this.f75507a, g111Var.f75507a) && wj50.m88271j(this.f75508b, g111Var.f75508b) && wj50.m88271j(this.f75509c, g111Var.f75509c) && wj50.m88271j(this.f75510d, g111Var.f75510d) && wj50.m88271j(this.f75511e, g111Var.f75511e) && wj50.m88271j(this.f75512f, g111Var.f75512f);
    }

    public final int hashCode() {
        int iHashCode = (this.f75511e.hashCode() + ((this.f75510d.hashCode() + s571.m77243b(s571.m77243b(this.f75507a.hashCode() * 31, 31, this.f75508b), 31, this.f75509c)) * 31)) * 31;
        String str = this.f75512f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
