package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ekt implements xmt {

    /* JADX INFO: renamed from: a */
    public final dks f60531a;

    /* JADX INFO: renamed from: b */
    public final String f60532b;

    /* JADX INFO: renamed from: c */
    public final String f60533c;

    public ekt(dks dksVar, String str, String str2) {
        this.f60531a = dksVar;
        this.f60532b = str;
        this.f60533c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekt)) {
            return false;
        }
        ekt ektVar = (ekt) obj;
        if (!wj50.m88271j(this.f60531a, ektVar.f60531a) || !wj50.m88271j(this.f60532b, ektVar.f60532b)) {
            return false;
        }
        String str = ektVar.f60533c;
        wp6 wp6Var = hlq.f92726b;
        return wj50.m88271j(this.f60533c, str);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f60531a.hashCode() * 31, 31, this.f60532b);
        wp6 wp6Var = hlq.f92726b;
        return this.f60533c.hashCode() + iM77243b;
    }
}
