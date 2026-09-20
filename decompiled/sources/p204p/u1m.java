package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u1m {

    /* JADX INFO: renamed from: a */
    public final String f225860a;

    /* JADX INFO: renamed from: b */
    public final String f225861b;

    /* JADX INFO: renamed from: c */
    public final String f225862c;

    public u1m(String str, String str2, String str3) {
        this.f225860a = str;
        this.f225861b = str2;
        this.f225862c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1m)) {
            return false;
        }
        u1m u1mVar = (u1m) obj;
        return wj50.m88271j(this.f225860a, u1mVar.f225860a) && wj50.m88271j(this.f225861b, u1mVar.f225861b) && wj50.m88271j(this.f225862c, u1mVar.f225862c);
    }

    public final int hashCode() {
        int iHashCode = this.f225860a.hashCode() * 31;
        String str = this.f225861b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225862c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
