package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ebi0 {

    /* JADX INFO: renamed from: a */
    public final i35 f57942a;

    /* JADX INFO: renamed from: b */
    public final boolean f57943b;

    /* JADX INFO: renamed from: c */
    public final boolean f57944c;

    /* JADX INFO: renamed from: d */
    public final dbi0 f57945d;

    public ebi0(i35 i35Var, boolean z, boolean z2, dbi0 dbi0Var) {
        this.f57942a = i35Var;
        this.f57943b = z;
        this.f57944c = z2;
        this.f57945d = dbi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebi0)) {
            return false;
        }
        ebi0 ebi0Var = (ebi0) obj;
        return wj50.m88271j(this.f57942a, ebi0Var.f57942a) && this.f57943b == ebi0Var.f57943b && this.f57944c == ebi0Var.f57944c && wj50.m88271j(this.f57945d, ebi0Var.f57945d);
    }

    public final int hashCode() {
        return this.f57945d.hashCode() + s571.m77245d(s571.m77245d(this.f57942a.hashCode() * 31, 31, this.f57943b), 31, this.f57944c);
    }
}
