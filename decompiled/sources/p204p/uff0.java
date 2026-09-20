package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uff0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f229810a;

    public uff0(boolean z) {
        this.f229810a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uff0) && this.f229810a == ((uff0) obj).f229810a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229810a);
    }
}
