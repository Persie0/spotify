package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uj6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final boolean f230908a;

    /* JADX INFO: renamed from: b */
    public final boolean f230909b;

    /* JADX INFO: renamed from: c */
    public final boolean f230910c;

    /* JADX INFO: renamed from: d */
    public final boolean f230911d;

    public uj6(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f230908a = z;
        this.f230909b = z2;
        this.f230910c = z3;
        this.f230911d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj6)) {
            return false;
        }
        uj6 uj6Var = (uj6) obj;
        return this.f230908a == uj6Var.f230908a && this.f230909b == uj6Var.f230909b && this.f230910c == uj6Var.f230910c && this.f230911d == uj6Var.f230911d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230911d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f230908a) * 31, 31, this.f230909b), 31, this.f230910c);
    }
}
