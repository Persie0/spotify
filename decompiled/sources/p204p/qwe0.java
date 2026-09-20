package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qwe0 implements pa90 {

    /* JADX INFO: renamed from: a */
    public final boolean f193335a;

    public qwe0(boolean z) {
        this.f193335a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwe0) && this.f193335a == ((qwe0) obj).f193335a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193335a);
    }
}
