package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class way {

    /* JADX INFO: renamed from: a */
    public final String f249638a;

    /* JADX INFO: renamed from: b */
    public final String f249639b;

    /* JADX INFO: renamed from: c */
    public final String f249640c;

    /* JADX INFO: renamed from: d */
    public final cqj0 f249641d;

    /* JADX INFO: renamed from: e */
    public final mr20 f249642e;

    /* JADX INFO: renamed from: f */
    public final boolean f249643f;

    public way(String str, String str2, String str3, cqj0 cqj0Var, mr20 mr20Var, boolean z) {
        this.f249638a = str;
        this.f249639b = str2;
        this.f249640c = str3;
        this.f249641d = cqj0Var;
        this.f249642e = mr20Var;
        this.f249643f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof way)) {
            return false;
        }
        way wayVar = (way) obj;
        return wj50.m88271j(this.f249638a, wayVar.f249638a) && wj50.m88271j(this.f249639b, wayVar.f249639b) && wj50.m88271j(this.f249640c, wayVar.f249640c) && wj50.m88271j(this.f249641d, wayVar.f249641d) && wj50.m88271j(this.f249642e, wayVar.f249642e) && this.f249643f == wayVar.f249643f;
    }

    public final int hashCode() {
        int iHashCode = this.f249638a.hashCode() * 31;
        String str = this.f249639b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f249640c;
        int iHashCode3 = (this.f249641d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        mr20 mr20Var = this.f249642e;
        return Boolean.hashCode(this.f249643f) + ((iHashCode3 + (mr20Var != null ? mr20Var.hashCode() : 0)) * 31);
    }
}
