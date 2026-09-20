package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uf91 {

    /* JADX INFO: renamed from: a */
    public final boolean f229726a;

    /* JADX INFO: renamed from: b */
    public final String f229727b;

    /* JADX INFO: renamed from: c */
    public final boolean f229728c;

    /* JADX INFO: renamed from: d */
    public final boolean f229729d;

    public uf91(String str, boolean z, boolean z2, boolean z3) {
        this.f229726a = z;
        this.f229727b = str;
        this.f229728c = z2;
        this.f229729d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf91)) {
            return false;
        }
        uf91 uf91Var = (uf91) obj;
        return this.f229726a == uf91Var.f229726a && wj50.m88271j(this.f229727b, uf91Var.f229727b) && this.f229728c == uf91Var.f229728c && this.f229729d == uf91Var.f229729d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f229726a) * 31;
        String str = this.f229727b;
        return Boolean.hashCode(this.f229729d) + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229728c);
    }
}
