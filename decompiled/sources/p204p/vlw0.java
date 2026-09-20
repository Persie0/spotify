package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vlw0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f242612a;

    public vlw0(boolean z) {
        this.f242612a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlw0) && this.f242612a == ((vlw0) obj).f242612a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242612a);
    }
}
