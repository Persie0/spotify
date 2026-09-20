package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f66515a;

    public f6y0(boolean z) {
        this.f66515a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6y0) && this.f66515a == ((f6y0) obj).f66515a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66515a);
    }
}
