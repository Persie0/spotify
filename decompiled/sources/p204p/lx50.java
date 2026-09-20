package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lx50 {

    /* JADX INFO: renamed from: a */
    public final String f137729a;

    /* JADX INFO: renamed from: b */
    public final String f137730b;

    public lx50(String str, String str2) {
        this.f137729a = str;
        this.f137730b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx50)) {
            return false;
        }
        lx50 lx50Var = (lx50) obj;
        return wj50.m88271j(this.f137729a, lx50Var.f137729a) && wj50.m88271j(this.f137730b, lx50Var.f137730b);
    }

    public final int hashCode() {
        return this.f137730b.hashCode() + (this.f137729a.hashCode() * 31);
    }
}
