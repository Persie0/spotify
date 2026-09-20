package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class da61 implements ia61 {

    /* JADX INFO: renamed from: a */
    public final boolean f46986a;

    public da61(boolean z) {
        this.f46986a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da61) && this.f46986a == ((da61) obj).f46986a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46986a);
    }
}
