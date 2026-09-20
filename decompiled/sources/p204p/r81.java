package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r81 {

    /* JADX INFO: renamed from: a */
    public final String f196688a;

    /* JADX INFO: renamed from: b */
    public final k1n0 f196689b;

    /* JADX INFO: renamed from: c */
    public final boolean f196690c;

    /* JADX INFO: renamed from: d */
    public final boolean f196691d;

    public r81(String str, k1n0 k1n0Var, boolean z, boolean z2) {
        this.f196688a = str;
        this.f196689b = k1n0Var;
        this.f196690c = z;
        this.f196691d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r81)) {
            return false;
        }
        r81 r81Var = (r81) obj;
        return wj50.m88271j(this.f196688a, r81Var.f196688a) && this.f196689b == r81Var.f196689b && this.f196690c == r81Var.f196690c && this.f196691d == r81Var.f196691d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196691d) + s571.m77245d((this.f196689b.hashCode() + (this.f196688a.hashCode() * 31)) * 31, 31, this.f196690c);
    }
}
