package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dbv0 {

    /* JADX INFO: renamed from: a */
    public final String f47373a;

    /* JADX INFO: renamed from: b */
    public final String f47374b;

    /* JADX INFO: renamed from: c */
    public final String f47375c;

    /* JADX INFO: renamed from: d */
    public final String f47376d;

    /* JADX INFO: renamed from: e */
    public final int f47377e;

    public dbv0(int i, String str, String str2, String str3, String str4) {
        this.f47373a = str;
        this.f47374b = str2;
        this.f47375c = str3;
        this.f47376d = str4;
        this.f47377e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbv0)) {
            return false;
        }
        dbv0 dbv0Var = (dbv0) obj;
        return wj50.m88271j(this.f47373a, dbv0Var.f47373a) && wj50.m88271j(this.f47374b, dbv0Var.f47374b) && wj50.m88271j(this.f47375c, dbv0Var.f47375c) && wj50.m88271j(this.f47376d, dbv0Var.f47376d) && this.f47377e == dbv0Var.f47377e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f47373a.hashCode() * 31, 31, this.f47374b);
        String str = this.f47375c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47376d;
        return edb.m38547C(this.f47377e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
