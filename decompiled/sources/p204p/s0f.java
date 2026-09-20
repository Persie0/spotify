package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s0f {

    /* JADX INFO: renamed from: a */
    public final z650 f204373a;

    /* JADX INFO: renamed from: b */
    public final boolean f204374b;

    public s0f(z650 z650Var, boolean z) {
        this.f204373a = z650Var;
        this.f204374b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0f)) {
            return false;
        }
        s0f s0fVar = (s0f) obj;
        return wj50.m88271j(this.f204373a, s0fVar.f204373a) && this.f204374b == s0fVar.f204374b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204374b) + (this.f204373a.f279709a.hashCode() * 31);
    }
}
