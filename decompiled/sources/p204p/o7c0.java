package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f162513a;

    public o7c0(boolean z) {
        this.f162513a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7c0) && this.f162513a == ((o7c0) obj).f162513a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162513a);
    }
}
