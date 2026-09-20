package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f206334a;

    public s7c0(boolean z) {
        this.f206334a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7c0) && this.f206334a == ((s7c0) obj).f206334a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206334a);
    }
}
