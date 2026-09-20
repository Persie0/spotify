package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ztj extends juj {

    /* JADX INFO: renamed from: a */
    public final String f286196a;

    /* JADX INFO: renamed from: b */
    public final String f286197b;

    /* JADX INFO: renamed from: c */
    public final String f286198c;

    /* JADX INFO: renamed from: d */
    public final String f286199d;

    public ztj(String str, String str2, String str3, String str4) {
        this.f286196a = str;
        this.f286197b = str2;
        this.f286198c = str3;
        this.f286199d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztj)) {
            return false;
        }
        ztj ztjVar = (ztj) obj;
        return wj50.m88271j(this.f286196a, ztjVar.f286196a) && wj50.m88271j(this.f286197b, ztjVar.f286197b) && wj50.m88271j(this.f286198c, ztjVar.f286198c) && wj50.m88271j(this.f286199d, ztjVar.f286199d);
    }

    public final int hashCode() {
        int iHashCode = this.f286196a.hashCode() * 31;
        String str = this.f286197b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f286198c;
        return this.f286199d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
