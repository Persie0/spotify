package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fae0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f67548a;

    public fae0(boolean z) {
        this.f67548a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fae0) && this.f67548a == ((fae0) obj).f67548a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67548a);
    }
}
