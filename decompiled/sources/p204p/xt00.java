package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xt00 implements du00 {

    /* JADX INFO: renamed from: a */
    public final String f265718a;

    /* JADX INFO: renamed from: b */
    public final int f265719b;

    /* JADX INFO: renamed from: c */
    public final boolean f265720c;

    public xt00(String str, int i, boolean z) {
        this.f265718a = str;
        this.f265719b = i;
        this.f265720c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m91998a() {
        return this.f265718a;
    }

    /* JADX INFO: renamed from: b */
    public final int m91999b() {
        return this.f265719b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92000c() {
        return this.f265720c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt00)) {
            return false;
        }
        xt00 xt00Var = (xt00) obj;
        return wj50.m88271j(this.f265718a, xt00Var.f265718a) && this.f265719b == xt00Var.f265719b && this.f265720c == xt00Var.f265720c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265720c) + f710.m40938f(this.f265719b, this.f265718a.hashCode() * 31, 31);
    }
}
