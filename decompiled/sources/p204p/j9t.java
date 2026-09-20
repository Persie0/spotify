package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j9t {

    /* JADX INFO: renamed from: a */
    public final String f110245a;

    /* JADX INFO: renamed from: b */
    public final String f110246b;

    public j9t(String str, String str2) {
        this.f110245a = str;
        this.f110246b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9t)) {
            return false;
        }
        j9t j9tVar = (j9t) obj;
        return wj50.m88271j(this.f110245a, j9tVar.f110245a) && wj50.m88271j(this.f110246b, j9tVar.f110246b);
    }

    public final int hashCode() {
        return this.f110246b.hashCode() + (this.f110245a.hashCode() * 31);
    }
}
