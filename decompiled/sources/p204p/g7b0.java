package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f77237a;

    public g7b0(boolean z) {
        this.f77237a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7b0) && this.f77237a == ((g7b0) obj).f77237a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77237a);
    }
}
