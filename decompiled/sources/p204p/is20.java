package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class is20 {

    /* JADX INFO: renamed from: a */
    public final int f105106a;

    /* JADX INFO: renamed from: b */
    public final String f105107b;

    /* JADX INFO: renamed from: c */
    public final String f105108c;

    public is20(int i, String str, String str2) {
        this.f105106a = i;
        this.f105107b = str;
        this.f105108c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is20)) {
            return false;
        }
        is20 is20Var = (is20) obj;
        return this.f105106a == is20Var.f105106a && wj50.m88271j(this.f105107b, is20Var.f105107b) && wj50.m88271j(this.f105108c, is20Var.f105108c);
    }

    public final int hashCode() {
        return this.f105108c.hashCode() + s571.m77243b(edb.m38547C(this.f105106a) * 31, 31, this.f105107b);
    }
}
