package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ja21 {

    /* JADX INFO: renamed from: a */
    public final String f110309a;

    /* JADX INFO: renamed from: b */
    public final String f110310b;

    /* JADX INFO: renamed from: c */
    public final String f110311c;

    /* JADX INFO: renamed from: d */
    public final String f110312d;

    public ja21(String str, String str2, String str3, String str4) {
        this.f110309a = str;
        this.f110310b = str2;
        this.f110311c = str3;
        this.f110312d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja21)) {
            return false;
        }
        ja21 ja21Var = (ja21) obj;
        return wj50.m88271j(this.f110309a, ja21Var.f110309a) && wj50.m88271j(this.f110310b, ja21Var.f110310b) && wj50.m88271j(this.f110311c, ja21Var.f110311c) && wj50.m88271j(this.f110312d, ja21Var.f110312d);
    }

    public final int hashCode() {
        return this.f110312d.hashCode() + s571.m77243b(s571.m77243b(this.f110309a.hashCode() * 31, 31, this.f110310b), 31, this.f110311c);
    }
}
