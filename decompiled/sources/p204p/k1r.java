package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k1r {

    /* JADX INFO: renamed from: a */
    public final String f118415a;

    /* JADX INFO: renamed from: b */
    public final String f118416b;

    public k1r(String str, String str2) {
        this.f118415a = str;
        this.f118416b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1r)) {
            return false;
        }
        k1r k1rVar = (k1r) obj;
        return wj50.m88271j(this.f118415a, k1rVar.f118415a) && wj50.m88271j(this.f118416b, k1rVar.f118416b);
    }

    public final int hashCode() {
        return this.f118416b.hashCode() + (this.f118415a.hashCode() * 31);
    }
}
