package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ejl {

    /* JADX INFO: renamed from: a */
    public final int f60243a;

    /* JADX INFO: renamed from: b */
    public final int f60244b;

    /* JADX INFO: renamed from: c */
    public final cjl f60245c;

    public ejl(int i, int i2, cjl cjlVar) {
        this.f60243a = i;
        this.f60244b = i2;
        this.f60245c = cjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejl)) {
            return false;
        }
        ejl ejlVar = (ejl) obj;
        return this.f60243a == ejlVar.f60243a && this.f60244b == ejlVar.f60244b && this.f60245c.equals(ejlVar.f60245c);
    }

    public final int hashCode() {
        return this.f60245c.hashCode() + mt60.m62800g(this.f60244b, edb.m38547C(this.f60243a) * 31, 31);
    }
}
