package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l1k {

    /* JADX INFO: renamed from: a */
    public final f1k f128749a;

    /* JADX INFO: renamed from: b */
    public final int f128750b;

    /* JADX INFO: renamed from: c */
    public final boolean f128751c;

    public l1k(f1k f1kVar, int i, boolean z) {
        this.f128749a = f1kVar;
        this.f128750b = i;
        this.f128751c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1k)) {
            return false;
        }
        l1k l1kVar = (l1k) obj;
        return wj50.m88271j(this.f128749a, l1kVar.f128749a) && this.f128750b == l1kVar.f128750b && this.f128751c == l1kVar.f128751c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128751c) + f710.m40938f(this.f128750b, this.f128749a.hashCode() * 31, 31);
    }
}
