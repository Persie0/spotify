package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class r0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f194516a;

    public r0l(boolean z) {
        this.f194516a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0l) && this.f194516a == ((r0l) obj).f194516a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194516a);
    }
}
