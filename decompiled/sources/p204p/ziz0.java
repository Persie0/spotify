package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ziz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283304a;

    /* JADX INFO: renamed from: b */
    public final boolean f283305b;

    /* JADX INFO: renamed from: c */
    public final boolean f283306c;

    public ziz0(boolean z, boolean z2, boolean z3) {
        this.f283304a = z;
        this.f283305b = z2;
        this.f283306c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziz0)) {
            return false;
        }
        ziz0 ziz0Var = (ziz0) obj;
        return this.f283304a == ziz0Var.f283304a && this.f283305b == ziz0Var.f283305b && this.f283306c == ziz0Var.f283306c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283306c) + s571.m77245d(Boolean.hashCode(this.f283304a) * 31, 31, this.f283305b);
    }
}
