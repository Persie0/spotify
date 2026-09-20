package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s8u0 implements v8u0 {

    /* JADX INFO: renamed from: a */
    public final int f206796a;

    public s8u0(int i) {
        this.f206796a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8u0) && this.f206796a == ((s8u0) obj).f206796a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f206796a);
    }
}
