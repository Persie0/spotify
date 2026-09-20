package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iln0 implements pur {

    /* JADX INFO: renamed from: a */
    public final int f103437a;

    public iln0(int i) {
        this.f103437a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iln0) && this.f103437a == ((iln0) obj).f103437a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103437a);
    }
}
