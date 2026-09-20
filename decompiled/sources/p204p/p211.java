package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p211 extends w211 {

    /* JADX INFO: renamed from: a */
    public final int f173209a;

    /* JADX INFO: renamed from: b */
    public final String f173210b;

    /* JADX INFO: renamed from: c */
    public final boolean f173211c;

    public p211(String str, int i, boolean z) {
        this.f173209a = i;
        this.f173210b = str;
        this.f173211c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p211)) {
            return false;
        }
        p211 p211Var = (p211) obj;
        return this.f173209a == p211Var.f173209a && wj50.m88271j(this.f173210b, p211Var.f173210b) && this.f173211c == p211Var.f173211c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173211c) + s571.m77243b(Integer.hashCode(this.f173209a) * 31, 31, this.f173210b);
    }
}
