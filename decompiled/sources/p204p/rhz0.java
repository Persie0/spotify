package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rhz0 implements zhz0 {

    /* JADX INFO: renamed from: a */
    public final uks f199402a;

    public rhz0(uks uksVar) {
        this.f199402a = uksVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhz0) && this.f199402a == ((rhz0) obj).f199402a;
    }

    public final int hashCode() {
        return this.f199402a.hashCode();
    }
}
