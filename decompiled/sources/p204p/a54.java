package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a54 {

    /* JADX INFO: renamed from: a */
    public final boolean f12418a;

    public a54(boolean z) {
        this.f12418a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a54) && this.f12418a == ((a54) obj).f12418a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12418a);
    }
}
