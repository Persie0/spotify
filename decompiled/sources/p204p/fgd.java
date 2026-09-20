package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fgd implements ggd {

    /* JADX INFO: renamed from: a */
    public final boolean f69286a;

    public fgd(boolean z) {
        this.f69286a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgd) && this.f69286a == ((fgd) obj).f69286a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69286a);
    }
}
