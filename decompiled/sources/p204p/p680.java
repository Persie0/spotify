package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p680 extends v680 {

    /* JADX INFO: renamed from: a */
    public final boolean f174315a;

    public p680(boolean z) {
        this.f174315a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p680) && this.f174315a == ((p680) obj).f174315a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174315a);
    }
}
