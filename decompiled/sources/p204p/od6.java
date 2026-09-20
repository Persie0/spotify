package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class od6 {

    /* JADX INFO: renamed from: a */
    public final boolean f164104a;

    /* JADX INFO: renamed from: b */
    public final boolean f164105b;

    /* JADX INFO: renamed from: c */
    public final boolean f164106c;

    public od6(boolean z, boolean z2, boolean z3) {
        this.f164104a = z;
        this.f164105b = z2;
        this.f164106c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od6)) {
            return false;
        }
        od6 od6Var = (od6) obj;
        return this.f164104a == od6Var.f164104a && this.f164105b == od6Var.f164105b && this.f164106c == od6Var.f164106c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164106c) + s571.m77245d(Boolean.hashCode(this.f164104a) * 31, 31, this.f164105b);
    }
}
