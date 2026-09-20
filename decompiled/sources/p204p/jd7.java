package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jd7 {

    /* JADX INFO: renamed from: a */
    public final hd7 f111273a;

    /* JADX INFO: renamed from: b */
    public final boolean f111274b;

    public jd7(hd7 hd7Var, boolean z) {
        this.f111273a = hd7Var;
        this.f111274b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd7)) {
            return false;
        }
        jd7 jd7Var = (jd7) obj;
        return wj50.m88271j(this.f111273a, jd7Var.f111273a) && this.f111274b == jd7Var.f111274b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111274b) + (this.f111273a.hashCode() * 31);
    }
}
