package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p70 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final int f174533e;

    public p70(int i) {
        super(i, 1);
        this.f174533e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p70) && this.f174533e == ((p70) obj).f174533e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174533e);
    }
}
