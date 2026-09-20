package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tj6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final boolean f220833a;

    public tj6(boolean z) {
        this.f220833a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj6) && this.f220833a == ((tj6) obj).f220833a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220833a);
    }
}
