package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j33 extends m33 {

    /* JADX INFO: renamed from: a */
    public final boolean f108274a;

    public j33(boolean z) {
        this.f108274a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j33) && this.f108274a == ((j33) obj).f108274a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108274a);
    }
}
