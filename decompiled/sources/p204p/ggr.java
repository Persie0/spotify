package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ggr extends igr {

    /* JADX INFO: renamed from: a */
    public final RuntimeException f79734a;

    public ggr(RuntimeException runtimeException) {
        this.f79734a = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggr) && this.f79734a.equals(((ggr) obj).f79734a);
    }

    public final int hashCode() {
        return this.f79734a.hashCode();
    }
}
