package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kcz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f121570a;

    public kcz0(boolean z) {
        this.f121570a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcz0) && this.f121570a == ((kcz0) obj).f121570a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121570a);
    }
}
