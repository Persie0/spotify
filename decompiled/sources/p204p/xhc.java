package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xhc implements yhc {

    /* JADX INFO: renamed from: a */
    public final boolean f261518a;

    public xhc(boolean z) {
        this.f261518a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhc) && this.f261518a == ((xhc) obj).f261518a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261518a);
    }
}
