package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fbd0 {

    /* JADX INFO: renamed from: a */
    public final String f67795a;

    /* JADX INFO: renamed from: b */
    public final int f67796b;

    /* JADX INFO: renamed from: c */
    public final String f67797c;

    public fbd0(String str, int i, String str2) {
        this.f67795a = str;
        this.f67796b = i;
        this.f67797c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd0)) {
            return false;
        }
        fbd0 fbd0Var = (fbd0) obj;
        return wj50.m88271j(this.f67795a, fbd0Var.f67795a) && this.f67796b == fbd0Var.f67796b && wj50.m88271j(this.f67797c, fbd0Var.f67797c);
    }

    public final int hashCode() {
        return this.f67797c.hashCode() + f710.m40938f(this.f67796b, this.f67795a.hashCode() * 31, 31);
    }
}
