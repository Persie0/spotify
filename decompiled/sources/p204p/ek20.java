package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ek20 {

    /* JADX INFO: renamed from: a */
    public final String f60340a;

    /* JADX INFO: renamed from: b */
    public final String f60341b;

    /* JADX INFO: renamed from: c */
    public final int f60342c;

    /* JADX INFO: renamed from: d */
    public final int f60343d;

    public ek20(int i, String str, int i2, String str2) {
        this.f60340a = str;
        this.f60341b = str2;
        this.f60342c = i;
        this.f60343d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek20)) {
            return false;
        }
        ek20 ek20Var = (ek20) obj;
        return wj50.m88271j(this.f60340a, ek20Var.f60340a) && wj50.m88271j(this.f60341b, ek20Var.f60341b) && this.f60342c == ek20Var.f60342c && this.f60343d == ek20Var.f60343d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f60343d) + f710.m40938f(this.f60342c, s571.m77243b(this.f60340a.hashCode() * 31, 31, this.f60341b), 31);
    }
}
