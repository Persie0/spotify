package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class say0 {

    /* JADX INFO: renamed from: a */
    public final float f207290a;

    /* JADX INFO: renamed from: b */
    public final long f207291b;

    /* JADX INFO: renamed from: c */
    public final w9z f207292c;

    public say0(float f, long j, w9z w9zVar) {
        this.f207290a = f;
        this.f207291b = j;
        this.f207292c = w9zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof say0)) {
            return false;
        }
        say0 say0Var = (say0) obj;
        return Float.compare(this.f207290a, say0Var.f207290a) == 0 && i591.m49768a(this.f207291b, say0Var.f207291b) && wj50.m88271j(this.f207292c, say0Var.f207292c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f207290a) * 31;
        int i = i591.f98850c;
        return this.f207292c.hashCode() + dq60.m36605e(iHashCode, this.f207291b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f207290a + ", transformOrigin=" + ((Object) i591.m49771d(this.f207291b)) + ", animationSpec=" + this.f207292c + ')';
    }
}
