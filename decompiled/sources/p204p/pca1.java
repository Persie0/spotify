package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pca1 implements wca1 {

    /* JADX INFO: renamed from: a */
    public final boolean f176000a;

    public pca1(boolean z) {
        this.f176000a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pca1) && this.f176000a == ((pca1) obj).f176000a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176000a);
    }
}
