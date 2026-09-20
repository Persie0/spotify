package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cjt0 implements fjt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f38686a;

    public cjt0(boolean z) {
        this.f38686a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjt0) && this.f38686a == ((cjt0) obj).f38686a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38686a);
    }
}
