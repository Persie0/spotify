package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ziw0 {

    /* JADX INFO: renamed from: a */
    public final String f283259a;

    /* JADX INFO: renamed from: b */
    public final boolean f283260b;

    /* JADX INFO: renamed from: c */
    public final boolean f283261c;

    /* JADX INFO: renamed from: d */
    public final k8j0 f283262d;

    public ziw0(String str, boolean z, boolean z2, k8j0 k8j0Var) {
        this.f283259a = str;
        this.f283260b = z;
        this.f283261c = z2;
        this.f283262d = k8j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziw0)) {
            return false;
        }
        ziw0 ziw0Var = (ziw0) obj;
        return wj50.m88271j(this.f283259a, ziw0Var.f283259a) && this.f283260b == ziw0Var.f283260b && this.f283261c == ziw0Var.f283261c && this.f283262d == ziw0Var.f283262d;
    }

    public final int hashCode() {
        return this.f283262d.hashCode() + s571.m77245d(s571.m77245d(this.f283259a.hashCode() * 31, 31, this.f283260b), 31, this.f283261c);
    }
}
