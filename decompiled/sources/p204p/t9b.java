package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t9b implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f218230a;

    /* JADX INFO: renamed from: b */
    public final s9b f218231b;

    /* JADX INFO: renamed from: c */
    public final String f218232c;

    /* JADX INFO: renamed from: d */
    public final String f218233d;

    /* JADX INFO: renamed from: e */
    public final String f218234e;

    /* JADX INFO: renamed from: f */
    public final String f218235f;

    public t9b(String str, s9b s9bVar, String str2, String str3, String str4, String str5) {
        this.f218230a = str;
        this.f218231b = s9bVar;
        this.f218232c = str2;
        this.f218233d = str3;
        this.f218234e = str4;
        this.f218235f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9b)) {
            return false;
        }
        t9b t9bVar = (t9b) obj;
        return wj50.m88271j(this.f218230a, t9bVar.f218230a) && wj50.m88271j(this.f218231b, t9bVar.f218231b) && wj50.m88271j(this.f218232c, t9bVar.f218232c) && wj50.m88271j(this.f218233d, t9bVar.f218233d) && wj50.m88271j(this.f218234e, t9bVar.f218234e) && wj50.m88271j(this.f218235f, t9bVar.f218235f);
    }

    public final int hashCode() {
        int iHashCode = this.f218230a.hashCode() * 31;
        s9b s9bVar = this.f218231b;
        return this.f218235f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (s9bVar == null ? 0 : s9bVar.hashCode())) * 31, 31, this.f218232c), 31, this.f218233d), 31, this.f218234e);
    }
}
