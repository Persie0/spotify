package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aj41 {

    /* JADX INFO: renamed from: a */
    public final Boolean f16168a;

    /* JADX INFO: renamed from: b */
    public final boolean f16169b;

    /* JADX INFO: renamed from: c */
    public final boolean f16170c;

    /* JADX INFO: renamed from: d */
    public final ti41 f16171d;

    public aj41(Boolean bool, boolean z, boolean z2, ti41 ti41Var) {
        this.f16168a = bool;
        this.f16169b = z;
        this.f16170c = z2;
        this.f16171d = ti41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj41)) {
            return false;
        }
        aj41 aj41Var = (aj41) obj;
        return wj50.m88271j(this.f16168a, aj41Var.f16168a) && this.f16169b == aj41Var.f16169b && this.f16170c == aj41Var.f16170c && wj50.m88271j(this.f16171d, aj41Var.f16171d);
    }

    public final int hashCode() {
        Boolean bool = this.f16168a;
        return this.f16171d.hashCode() + s571.m77245d(s571.m77245d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f16169b), 31, this.f16170c);
    }
}
