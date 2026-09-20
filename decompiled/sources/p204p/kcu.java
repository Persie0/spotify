package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kcu {

    /* JADX INFO: renamed from: a */
    public final String f121547a;

    /* JADX INFO: renamed from: b */
    public final String f121548b;

    /* JADX INFO: renamed from: c */
    public final String f121549c;

    /* JADX INFO: renamed from: d */
    public final String f121550d;

    /* JADX INFO: renamed from: e */
    public final boolean f121551e;

    public kcu(String str, String str2, String str3, String str4, boolean z) {
        this.f121547a = str;
        this.f121548b = str2;
        this.f121549c = str3;
        this.f121550d = str4;
        this.f121551e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcu)) {
            return false;
        }
        kcu kcuVar = (kcu) obj;
        return wj50.m88271j(this.f121547a, kcuVar.f121547a) && wj50.m88271j(this.f121548b, kcuVar.f121548b) && wj50.m88271j(this.f121549c, kcuVar.f121549c) && wj50.m88271j(this.f121550d, kcuVar.f121550d) && this.f121551e == kcuVar.f121551e;
    }

    public final int hashCode() {
        int iHashCode = this.f121547a.hashCode() * 31;
        String str = this.f121548b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121549c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f121550d;
        return Boolean.hashCode(this.f121551e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
