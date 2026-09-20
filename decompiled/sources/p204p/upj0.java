package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class upj0 {

    /* JADX INFO: renamed from: a */
    public final h6x0 f232712a;

    /* JADX INFO: renamed from: b */
    public final boolean f232713b;

    public upj0(h6x0 h6x0Var, boolean z) {
        this.f232712a = h6x0Var;
        this.f232713b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upj0)) {
            return false;
        }
        upj0 upj0Var = (upj0) obj;
        return wj50.m88271j(this.f232712a, upj0Var.f232712a) && this.f232713b == upj0Var.f232713b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232713b) + (this.f232712a.hashCode() * 31);
    }
}
