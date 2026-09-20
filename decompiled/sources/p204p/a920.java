package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a920 {

    /* JADX INFO: renamed from: a */
    public final boolean f13456a;

    /* JADX INFO: renamed from: b */
    public final eh00 f13457b;

    public a920(eh00 eh00Var, boolean z) {
        this.f13456a = z;
        this.f13457b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a920)) {
            return false;
        }
        a920 a920Var = (a920) obj;
        return this.f13456a == a920Var.f13456a && wj50.m88271j(this.f13457b, a920Var.f13457b);
    }

    public final int hashCode() {
        return this.f13457b.hashCode() + (Boolean.hashCode(this.f13456a) * 31);
    }
}
