package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yct extends d1h1 {

    /* JADX INFO: renamed from: b */
    public final String f271567b;

    /* JADX INFO: renamed from: c */
    public final int f271568c;

    /* JADX INFO: renamed from: d */
    public final d850 f271569d;

    public yct(int i, String str, d850 d850Var) {
        this.f271567b = str;
        this.f271568c = i;
        this.f271569d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yct)) {
            return false;
        }
        yct yctVar = (yct) obj;
        return wj50.m88271j(this.f271567b, yctVar.f271567b) && this.f271568c == yctVar.f271568c && wj50.m88271j(this.f271569d, yctVar.f271569d);
    }

    public final int hashCode() {
        return this.f271569d.hashCode() + mt60.m62800g(this.f271568c, this.f271567b.hashCode() * 31, 31);
    }
}
