package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fv3 {

    /* JADX INFO: renamed from: a */
    public final boolean f73627a;

    public fv3(boolean z) {
        this.f73627a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv3) && this.f73627a == ((fv3) obj).f73627a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73627a);
    }
}
