package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class duj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f53061a;

    /* JADX INFO: renamed from: b */
    public final String f53062b;

    /* JADX INFO: renamed from: c */
    public final String f53063c;

    /* JADX INFO: renamed from: d */
    public final String f53064d;

    public duj(String str, String str2, String str3, String str4) {
        this.f53061a = str;
        this.f53062b = str2;
        this.f53063c = str3;
        this.f53064d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duj)) {
            return false;
        }
        duj dujVar = (duj) obj;
        return wj50.m88271j(this.f53061a, dujVar.f53061a) && wj50.m88271j(this.f53062b, dujVar.f53062b) && wj50.m88271j(this.f53063c, dujVar.f53063c) && wj50.m88271j(this.f53064d, dujVar.f53064d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f53061a.hashCode() * 31, 31, this.f53062b);
        String str = this.f53063c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53064d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
