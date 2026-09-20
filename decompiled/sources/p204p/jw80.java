package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jw80 implements qw80 {

    /* JADX INFO: renamed from: a */
    public final int f116605a;

    /* JADX INFO: renamed from: b */
    public final lw80 f116606b;

    public jw80(int i, lw80 lw80Var) {
        this.f116605a = i;
        this.f116606b = lw80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw80)) {
            return false;
        }
        jw80 jw80Var = (jw80) obj;
        return this.f116605a == jw80Var.f116605a && wj50.m88271j(this.f116606b, jw80Var.f116606b);
    }

    public final int hashCode() {
        return this.f116606b.hashCode() + (Integer.hashCode(this.f116605a) * 31);
    }
}
