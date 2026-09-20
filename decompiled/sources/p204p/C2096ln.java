package p204p;

/* JADX INFO: renamed from: p.ln */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096ln implements InterfaceC2183nn {

    /* JADX INFO: renamed from: a */
    public final String f135059a;

    /* JADX INFO: renamed from: b */
    public final String f135060b;

    /* JADX INFO: renamed from: c */
    public final String f135061c;

    public C2096ln(String str, String str2, String str3) {
        this.f135059a = str;
        this.f135060b = str2;
        this.f135061c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2096ln)) {
            return false;
        }
        C2096ln c2096ln = (C2096ln) obj;
        return wj50.m88271j(this.f135059a, c2096ln.f135059a) && wj50.m88271j(this.f135060b, c2096ln.f135060b) && wj50.m88271j(this.f135061c, c2096ln.f135061c);
    }

    public final int hashCode() {
        String str = this.f135059a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f135060b;
        return this.f135061c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
