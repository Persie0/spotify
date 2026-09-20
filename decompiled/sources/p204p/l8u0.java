package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l8u0 {

    /* JADX INFO: renamed from: a */
    public final String f130934a;

    /* JADX INFO: renamed from: b */
    public final int f130935b;

    /* JADX INFO: renamed from: c */
    public final boolean f130936c;

    public l8u0(String str, int i, boolean z) {
        this.f130934a = str;
        this.f130935b = i;
        this.f130936c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8u0)) {
            return false;
        }
        l8u0 l8u0Var = (l8u0) obj;
        return wj50.m88271j(this.f130934a, l8u0Var.f130934a) && this.f130935b == l8u0Var.f130935b && this.f130936c == l8u0Var.f130936c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130936c) + mt60.m62800g(this.f130935b, this.f130934a.hashCode() * 31, 31);
    }
}
