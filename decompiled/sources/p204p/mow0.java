package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mow0 extends now0 {

    /* JADX INFO: renamed from: a */
    public final xdj f145767a;

    /* JADX INFO: renamed from: b */
    public final long f145768b;

    public mow0(xdj xdjVar, long j) {
        this.f145767a = xdjVar;
        this.f145768b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mow0)) {
            return false;
        }
        mow0 mow0Var = (mow0) obj;
        return wj50.m88271j(this.f145767a, mow0Var.f145767a) && this.f145768b == mow0Var.f145768b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f145768b) + (this.f145767a.hashCode() * 31);
    }
}
