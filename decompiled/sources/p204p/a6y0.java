package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12892a;

    public a6y0(boolean z) {
        this.f12892a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6y0) && this.f12892a == ((a6y0) obj).f12892a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12892a);
    }
}
