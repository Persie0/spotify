package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s6u0 {

    /* JADX INFO: renamed from: a */
    public final int f206205a;

    public s6u0(int i) {
        this.f206205a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6u0) && this.f206205a == ((s6u0) obj).f206205a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f206205a);
    }
}
