package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j8m implements k8m {

    /* JADX INFO: renamed from: a */
    public final String f109966a;

    /* JADX INFO: renamed from: b */
    public final int f109967b;

    /* JADX INFO: renamed from: c */
    public final int f109968c;

    public j8m(String str, int i, int i2) {
        this.f109966a = str;
        this.f109967b = i;
        this.f109968c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8m)) {
            return false;
        }
        j8m j8mVar = (j8m) obj;
        return wj50.m88271j(this.f109966a, j8mVar.f109966a) && this.f109967b == j8mVar.f109967b && this.f109968c == j8mVar.f109968c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109968c) + mt60.m62800g(this.f109967b, this.f109966a.hashCode() * 31, 31);
    }
}
