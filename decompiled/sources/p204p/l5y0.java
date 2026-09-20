package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l5y0 extends nsf1 {

    /* JADX INFO: renamed from: d */
    public final boolean f130111d;

    public l5y0(boolean z) {
        this.f130111d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5y0) && this.f130111d == ((l5y0) obj).f130111d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130111d);
    }
}
