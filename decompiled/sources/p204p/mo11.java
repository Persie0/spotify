package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mo11 {

    /* JADX INFO: renamed from: a */
    public final ak11 f145545a;

    /* JADX INFO: renamed from: b */
    public final boolean f145546b;

    /* JADX INFO: renamed from: c */
    public final int f145547c;

    public mo11(ak11 ak11Var, boolean z, int i) {
        this.f145545a = ak11Var;
        this.f145546b = z;
        this.f145547c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo11)) {
            return false;
        }
        mo11 mo11Var = (mo11) obj;
        return wj50.m88271j(this.f145545a, mo11Var.f145545a) && this.f145546b == mo11Var.f145546b && this.f145547c == mo11Var.f145547c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145547c) + s571.m77245d(this.f145545a.hashCode() * 31, 31, this.f145546b);
    }
}
