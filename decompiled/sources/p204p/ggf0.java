package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ggf0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f79654a;

    public ggf0(boolean z) {
        this.f79654a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggf0) && this.f79654a == ((ggf0) obj).f79654a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79654a);
    }
}
