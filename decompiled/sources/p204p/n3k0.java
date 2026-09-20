package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class n3k0 extends t3k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f150075a;

    public n3k0(boolean z) {
        this.f150075a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3k0) && this.f150075a == ((n3k0) obj).f150075a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150075a);
    }
}
