package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class o4i0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final int f161679a;

    public o4i0(int i) {
        c95.m31844j(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.f161679a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4i0) && this.f161679a == ((o4i0) obj).f161679a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161679a) + 527;
    }

    public final String toString() {
        return "Orientation= " + this.f161679a;
    }
}
