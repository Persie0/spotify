package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final String f188401a;

    /* JADX INFO: renamed from: b */
    public final lc8 f188402b;

    /* JADX INFO: renamed from: c */
    public final String f188403c;

    /* JADX INFO: renamed from: d */
    public final hg8 f188404d;

    public qg8(String str, lc8 lc8Var, String str2, hg8 hg8Var) {
        this.f188401a = str;
        this.f188402b = lc8Var;
        this.f188403c = str2;
        this.f188404d = hg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg8)) {
            return false;
        }
        qg8 qg8Var = (qg8) obj;
        return wj50.m88271j(this.f188401a, qg8Var.f188401a) && wj50.m88271j(this.f188402b, qg8Var.f188402b) && wj50.m88271j(this.f188403c, qg8Var.f188403c) && this.f188404d == qg8Var.f188404d;
    }

    public final int hashCode() {
        return this.f188404d.hashCode() + s571.m77243b((this.f188402b.hashCode() + (this.f188401a.hashCode() * 31)) * 31, 31, this.f188403c);
    }
}
