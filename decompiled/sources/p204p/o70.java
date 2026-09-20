package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o70 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final int f162444e;

    public o70(int i) {
        super(i, 1);
        this.f162444e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && this.f162444e == ((o70) obj).f162444e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162444e);
    }
}
