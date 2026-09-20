package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t0f {

    /* JADX INFO: renamed from: a */
    public final f1f f215874a;

    /* JADX INFO: renamed from: b */
    public final z650 f215875b;

    /* JADX INFO: renamed from: c */
    public final boolean f215876c;

    public t0f(f1f f1fVar, z650 z650Var, boolean z) {
        this.f215874a = f1fVar;
        this.f215875b = z650Var;
        this.f215876c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0f)) {
            return false;
        }
        t0f t0fVar = (t0f) obj;
        return wj50.m88271j(this.f215874a, t0fVar.f215874a) && wj50.m88271j(this.f215875b, t0fVar.f215875b) && this.f215876c == t0fVar.f215876c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f215876c) + s571.m77243b(this.f215874a.hashCode() * 31, 31, this.f215875b.f279709a);
    }
}
