package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u2e {

    /* JADX INFO: renamed from: a */
    public final boolean f226072a;

    /* JADX INFO: renamed from: b */
    public final boolean f226073b;

    /* JADX INFO: renamed from: c */
    public final boolean f226074c;

    public u2e(boolean z, boolean z2, boolean z3) {
        this.f226072a = z;
        this.f226073b = z2;
        this.f226074c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e)) {
            return false;
        }
        u2e u2eVar = (u2e) obj;
        return this.f226072a == u2eVar.f226072a && this.f226073b == u2eVar.f226073b && this.f226074c == u2eVar.f226074c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226074c) + s571.m77245d(Boolean.hashCode(this.f226072a) * 31, 31, this.f226073b);
    }
}
