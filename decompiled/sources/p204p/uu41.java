package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uu41 {

    /* JADX INFO: renamed from: a */
    public final boolean f234106a;

    /* JADX INFO: renamed from: b */
    public final boolean f234107b;

    public uu41(boolean z, boolean z2) {
        this.f234106a = z;
        this.f234107b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu41)) {
            return false;
        }
        uu41 uu41Var = (uu41) obj;
        return this.f234106a == uu41Var.f234106a && this.f234107b == uu41Var.f234107b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234107b) + (Boolean.hashCode(this.f234106a) * 31);
    }
}
