package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zcm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281545a;

    /* JADX INFO: renamed from: b */
    public final boolean f281546b;

    /* JADX INFO: renamed from: c */
    public final boolean f281547c;

    public zcm0(boolean z, boolean z2, boolean z3) {
        this.f281545a = z;
        this.f281546b = z2;
        this.f281547c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcm0)) {
            return false;
        }
        zcm0 zcm0Var = (zcm0) obj;
        return this.f281545a == zcm0Var.f281545a && this.f281546b == zcm0Var.f281546b && this.f281547c == zcm0Var.f281547c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281547c) + s571.m77245d(Boolean.hashCode(this.f281545a) * 31, 31, this.f281546b);
    }
}
