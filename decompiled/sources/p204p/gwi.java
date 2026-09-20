package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gwi {

    /* JADX INFO: renamed from: a */
    public final boolean f85012a;

    public gwi(boolean z) {
        this.f85012a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwi) && this.f85012a == ((gwi) obj).f85012a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85012a);
    }
}
