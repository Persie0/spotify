package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e6y0 extends l6y0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56776a;

    public e6y0(boolean z) {
        this.f56776a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6y0) && this.f56776a == ((e6y0) obj).f56776a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56776a);
    }
}
