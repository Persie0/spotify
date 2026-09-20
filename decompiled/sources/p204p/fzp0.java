package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fzp0 implements gzp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f75146a;

    public fzp0(boolean z) {
        this.f75146a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzp0) && this.f75146a == ((fzp0) obj).f75146a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75146a);
    }
}
