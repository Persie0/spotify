package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class viw0 implements wiw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f241802a;

    public viw0(boolean z) {
        this.f241802a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof viw0) && this.f241802a == ((viw0) obj).f241802a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241802a);
    }
}
