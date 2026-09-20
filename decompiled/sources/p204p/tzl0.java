package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tzl0 implements gs20 {

    /* JADX INFO: renamed from: a */
    public final fs20 f225262a;

    /* JADX INFO: renamed from: b */
    public final fs20 f225263b;

    public tzl0(fs20 fs20Var, fs20 fs20Var2) {
        this.f225262a = fs20Var;
        this.f225263b = fs20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzl0)) {
            return false;
        }
        tzl0 tzl0Var = (tzl0) obj;
        return wj50.m88271j(this.f225262a, tzl0Var.f225262a) && wj50.m88271j(this.f225263b, tzl0Var.f225263b);
    }

    public final int hashCode() {
        return this.f225263b.hashCode() + (this.f225262a.hashCode() * 31);
    }
}
