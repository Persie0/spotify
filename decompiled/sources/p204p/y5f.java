package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y5f {

    /* JADX INFO: renamed from: a */
    public final boolean f269417a;

    /* JADX INFO: renamed from: b */
    public final boolean f269418b;

    /* JADX INFO: renamed from: c */
    public final boolean f269419c;

    public y5f(boolean z, boolean z2, boolean z3) {
        this.f269417a = z;
        this.f269418b = z2;
        this.f269419c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5f)) {
            return false;
        }
        y5f y5fVar = (y5f) obj;
        return this.f269417a == y5fVar.f269417a && this.f269418b == y5fVar.f269418b && this.f269419c == y5fVar.f269419c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269419c) + s571.m77245d(Boolean.hashCode(this.f269417a) * 31, 31, this.f269418b);
    }
}
