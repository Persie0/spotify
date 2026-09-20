package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j131 {

    /* JADX INFO: renamed from: a */
    public final boolean f107633a;

    /* JADX INFO: renamed from: b */
    public final i131 f107634b;

    public j131(boolean z, i131 i131Var) {
        this.f107633a = z;
        this.f107634b = i131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j131)) {
            return false;
        }
        j131 j131Var = (j131) obj;
        return this.f107633a == j131Var.f107633a && wj50.m88271j(this.f107634b, j131Var.f107634b);
    }

    public final int hashCode() {
        return this.f107634b.hashCode() + (Boolean.hashCode(this.f107633a) * 31);
    }
}
