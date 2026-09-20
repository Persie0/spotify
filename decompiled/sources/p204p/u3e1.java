package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u3e1 {

    /* JADX INFO: renamed from: a */
    public final boolean f226366a;

    /* JADX INFO: renamed from: b */
    public final boolean f226367b;

    /* JADX INFO: renamed from: c */
    public final boolean f226368c;

    public u3e1(boolean z, boolean z2, boolean z3) {
        this.f226366a = z;
        this.f226367b = z2;
        this.f226368c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3e1)) {
            return false;
        }
        u3e1 u3e1Var = (u3e1) obj;
        return this.f226366a == u3e1Var.f226366a && this.f226367b == u3e1Var.f226367b && this.f226368c == u3e1Var.f226368c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226368c) + s571.m77245d(Boolean.hashCode(this.f226366a) * 31, 31, this.f226367b);
    }
}
