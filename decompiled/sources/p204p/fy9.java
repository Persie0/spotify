package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fy9 implements iy9 {

    /* JADX INFO: renamed from: a */
    public final w0b0 f74658a;

    /* JADX INFO: renamed from: b */
    public final rk7 f74659b;

    public fy9(w0b0 w0b0Var, rk7 rk7Var) {
        this.f74658a = w0b0Var;
        this.f74659b = rk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy9)) {
            return false;
        }
        fy9 fy9Var = (fy9) obj;
        return wj50.m88271j(this.f74658a, fy9Var.f74658a) && this.f74659b == fy9Var.f74659b;
    }

    public final int hashCode() {
        return this.f74659b.hashCode() + (this.f74658a.hashCode() * 31);
    }
}
