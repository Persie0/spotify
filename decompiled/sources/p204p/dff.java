package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dff {

    /* JADX INFO: renamed from: a */
    public final String f48593a;

    /* JADX INFO: renamed from: b */
    public final String f48594b;

    /* JADX INFO: renamed from: c */
    public final String f48595c;

    /* JADX INFO: renamed from: d */
    public final Long f48596d;

    /* JADX INFO: renamed from: e */
    public final String f48597e;

    public dff(Long l, String str, String str2, String str3, String str4) {
        this.f48593a = str;
        this.f48594b = str2;
        this.f48595c = str3;
        this.f48596d = l;
        this.f48597e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dff)) {
            return false;
        }
        dff dffVar = (dff) obj;
        return wj50.m88271j(this.f48593a, dffVar.f48593a) && wj50.m88271j(this.f48594b, dffVar.f48594b) && wj50.m88271j(this.f48595c, dffVar.f48595c) && wj50.m88271j(this.f48596d, dffVar.f48596d) && wj50.m88271j(this.f48597e, dffVar.f48597e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f48593a.hashCode() * 31, 31, this.f48594b), 31, this.f48595c);
        Long l = this.f48596d;
        int iHashCode = (iM77243b + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f48597e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
