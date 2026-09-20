package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s48 extends b58 {

    /* JADX INFO: renamed from: a */
    public final boolean f205510a;

    public s48(boolean z) {
        this.f205510a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s48) && this.f205510a == ((s48) obj).f205510a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205510a);
    }
}
