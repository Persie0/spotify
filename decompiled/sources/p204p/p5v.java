package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p5v implements t5v {

    /* JADX INFO: renamed from: a */
    public final boolean f174236a;

    public p5v(boolean z) {
        this.f174236a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5v) && this.f174236a == ((p5v) obj).f174236a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174236a);
    }
}
