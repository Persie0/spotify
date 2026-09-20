package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cl41 {

    /* JADX INFO: renamed from: a */
    public final String f39186a;

    /* JADX INFO: renamed from: b */
    public final boolean f39187b;

    public cl41(String str, boolean z) {
        this.f39186a = str;
        this.f39187b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl41)) {
            return false;
        }
        cl41 cl41Var = (cl41) obj;
        return wj50.m88271j(this.f39186a, cl41Var.f39186a) && this.f39187b == cl41Var.f39187b;
    }

    public final int hashCode() {
        String str = this.f39186a;
        return Boolean.hashCode(this.f39187b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
