package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p8d implements lad {

    /* JADX INFO: renamed from: a */
    public final int f174942a;

    public p8d(int i) {
        this.f174942a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8d) && this.f174942a == ((p8d) obj).f174942a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174942a);
    }
}
