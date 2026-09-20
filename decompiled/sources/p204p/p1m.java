package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p1m {

    /* JADX INFO: renamed from: a */
    public final String f173132a;

    /* JADX INFO: renamed from: b */
    public final int f173133b;

    public p1m(String str, int i) {
        this.f173132a = str;
        this.f173133b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1m)) {
            return false;
        }
        p1m p1mVar = (p1m) obj;
        return wj50.m88271j(this.f173132a, p1mVar.f173132a) && this.f173133b == p1mVar.f173133b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173133b) + (this.f173132a.hashCode() * 31);
    }
}
