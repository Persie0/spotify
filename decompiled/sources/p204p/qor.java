package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qor extends uor {

    /* JADX INFO: renamed from: a */
    public final boolean f191033a;

    public qor(boolean z) {
        this.f191033a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qor) && this.f191033a == ((qor) obj).f191033a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191033a);
    }
}
