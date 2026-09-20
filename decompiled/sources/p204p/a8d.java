package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a8d implements lad {

    /* JADX INFO: renamed from: a */
    public final boolean f13255a;

    public a8d(boolean z) {
        this.f13255a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8d) && this.f13255a == ((a8d) obj).f13255a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13255a);
    }
}
