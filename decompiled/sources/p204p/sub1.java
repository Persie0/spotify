package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sub1 {

    /* JADX INFO: renamed from: a */
    public final boolean f214047a;

    /* JADX INFO: renamed from: b */
    public final boolean f214048b;

    public sub1(boolean z, boolean z2) {
        this.f214047a = z;
        this.f214048b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sub1)) {
            return false;
        }
        sub1 sub1Var = (sub1) obj;
        return this.f214047a == sub1Var.f214047a && this.f214048b == sub1Var.f214048b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214048b) + (Boolean.hashCode(this.f214047a) * 31);
    }
}
