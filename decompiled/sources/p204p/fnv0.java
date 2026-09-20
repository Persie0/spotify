package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fnv0 {

    /* JADX INFO: renamed from: a */
    public final hz80 f71364a;

    /* JADX INFO: renamed from: b */
    public final boolean f71365b;

    public fnv0(hz80 hz80Var, boolean z) {
        this.f71364a = hz80Var;
        this.f71365b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnv0)) {
            return false;
        }
        fnv0 fnv0Var = (fnv0) obj;
        return wj50.m88271j(this.f71364a, fnv0Var.f71364a) && this.f71365b == fnv0Var.f71365b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71365b) + (this.f71364a.hashCode() * 31);
    }
}
