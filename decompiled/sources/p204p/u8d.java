package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u8d implements lad {

    /* JADX INFO: renamed from: a */
    public final boolean f227906a;

    public u8d(boolean z) {
        this.f227906a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8d) && this.f227906a == ((u8d) obj).f227906a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227906a);
    }
}
