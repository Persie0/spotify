package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wr00 implements xr00 {

    /* JADX INFO: renamed from: a */
    public final boolean f254233a;

    public wr00(boolean z) {
        this.f254233a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr00) && this.f254233a == ((wr00) obj).f254233a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254233a);
    }
}
