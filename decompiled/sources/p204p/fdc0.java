package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fdc0 extends mdc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f68459a;

    public fdc0(boolean z) {
        this.f68459a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdc0) && this.f68459a == ((fdc0) obj).f68459a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68459a);
    }
}
