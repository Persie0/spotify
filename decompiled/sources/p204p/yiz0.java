package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yiz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f273228a;

    /* JADX INFO: renamed from: b */
    public final boolean f273229b;

    /* JADX INFO: renamed from: c */
    public final boolean f273230c;

    public yiz0(boolean z, boolean z2, boolean z3) {
        this.f273228a = z;
        this.f273229b = z2;
        this.f273230c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiz0)) {
            return false;
        }
        yiz0 yiz0Var = (yiz0) obj;
        return this.f273228a == yiz0Var.f273228a && this.f273229b == yiz0Var.f273229b && this.f273230c == yiz0Var.f273230c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273230c) + s571.m77245d(Boolean.hashCode(this.f273228a) * 31, 31, this.f273229b);
    }
}
