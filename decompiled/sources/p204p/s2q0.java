package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s2q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f205051a;

    public s2q0(boolean z) {
        this.f205051a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2q0) && this.f205051a == ((s2q0) obj).f205051a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205051a);
    }
}
