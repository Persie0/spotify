package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a6m0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12824a;

    public a6m0(boolean z) {
        this.f12824a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6m0) && this.f12824a == ((a6m0) obj).f12824a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12824a);
    }
}
