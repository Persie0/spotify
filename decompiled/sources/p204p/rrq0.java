package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rrq0 {

    /* JADX INFO: renamed from: a */
    public final String f202101a;

    /* JADX INFO: renamed from: b */
    public final int f202102b;

    /* JADX INFO: renamed from: c */
    public final t2b0 f202103c;

    public rrq0(String str, int i, t2b0 t2b0Var) {
        this.f202101a = str;
        this.f202102b = i;
        this.f202103c = t2b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrq0)) {
            return false;
        }
        rrq0 rrq0Var = (rrq0) obj;
        return this.f202101a.equals(rrq0Var.f202101a) && this.f202102b == rrq0Var.f202102b && this.f202103c.equals(rrq0Var.f202103c);
    }

    public final int hashCode() {
        return this.f202103c.hashCode() + mt60.m62800g(this.f202102b, this.f202101a.hashCode() * 31, 31);
    }
}
