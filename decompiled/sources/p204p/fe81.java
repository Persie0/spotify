package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fe81 implements hwf {

    /* JADX INFO: renamed from: a */
    public final x64 f68713a;

    public fe81(x64 x64Var) {
        this.f68713a = x64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe81) && this.f68713a == ((fe81) obj).f68713a;
    }

    public final int hashCode() {
        return this.f68713a.hashCode();
    }
}
