package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u2s {

    /* JADX INFO: renamed from: a */
    public final x9s f226156a;

    /* JADX INFO: renamed from: b */
    public final String f226157b;

    /* JADX INFO: renamed from: c */
    public final String f226158c;

    /* JADX INFO: renamed from: d */
    public final String f226159d;

    public u2s(x9s x9sVar, String str, String str2, String str3, int i) {
        str = (i & 2) != 0 ? String.valueOf(x9sVar.hashCode()) : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.f226156a = x9sVar;
        this.f226157b = str;
        this.f226158c = str2;
        this.f226159d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2s)) {
            return false;
        }
        u2s u2sVar = (u2s) obj;
        return wj50.m88271j(this.f226156a, u2sVar.f226156a) && wj50.m88271j(this.f226157b, u2sVar.f226157b) && wj50.m88271j(this.f226158c, u2sVar.f226158c) && wj50.m88271j(this.f226159d, u2sVar.f226159d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f226156a.hashCode() * 31, 31, this.f226157b);
        String str = this.f226158c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f226159d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
