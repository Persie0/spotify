package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lt51 implements nt51 {

    /* JADX INFO: renamed from: a */
    public final boolean f136702a;

    public lt51(boolean z) {
        this.f136702a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lt51) && this.f136702a == ((lt51) obj).f136702a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136702a);
    }
}
