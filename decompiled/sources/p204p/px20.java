package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class px20 {

    /* JADX INFO: renamed from: a */
    public final boolean f182188a;

    /* JADX INFO: renamed from: b */
    public final boolean f182189b;

    /* JADX INFO: renamed from: c */
    public final boolean f182190c;

    public px20(boolean z, boolean z2, boolean z3) {
        this.f182188a = z;
        this.f182189b = z2;
        this.f182190c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px20)) {
            return false;
        }
        px20 px20Var = (px20) obj;
        return this.f182188a == px20Var.f182188a && this.f182189b == px20Var.f182189b && this.f182190c == px20Var.f182190c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182190c) + s571.m77245d(Boolean.hashCode(this.f182188a) * 31, 31, this.f182189b);
    }
}
