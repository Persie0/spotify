package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x211 {

    /* JADX INFO: renamed from: a */
    public final String f257330a;

    /* JADX INFO: renamed from: b */
    public final String f257331b;

    /* JADX INFO: renamed from: c */
    public final String f257332c;

    /* JADX INFO: renamed from: d */
    public final u311 f257333d;

    /* JADX INFO: renamed from: e */
    public final ox01 f257334e;

    public x211(String str, String str2, String str3, ox01 ox01Var, u311 u311Var) {
        this.f257330a = str;
        this.f257331b = str2;
        this.f257332c = str3;
        this.f257333d = u311Var;
        this.f257334e = ox01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x211)) {
            return false;
        }
        x211 x211Var = (x211) obj;
        return wj50.m88271j(this.f257330a, x211Var.f257330a) && wj50.m88271j(this.f257331b, x211Var.f257331b) && wj50.m88271j(this.f257332c, x211Var.f257332c) && wj50.m88271j(this.f257333d, x211Var.f257333d) && wj50.m88271j(this.f257334e, x211Var.f257334e);
    }

    public final int hashCode() {
        return this.f257334e.hashCode() + ((this.f257333d.hashCode() + s571.m77243b(s571.m77243b(this.f257330a.hashCode() * 31, 31, this.f257331b), 31, this.f257332c)) * 31);
    }
}
