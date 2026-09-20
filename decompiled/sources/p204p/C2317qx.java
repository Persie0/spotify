package p204p;

/* JADX INFO: renamed from: p.qx */
/* JADX INFO: loaded from: classes8.dex */
public final class C2317qx implements InterfaceC2392sx {

    /* JADX INFO: renamed from: a */
    public final int f193441a;

    /* JADX INFO: renamed from: b */
    public final int f193442b;

    public C2317qx(int i, int i2) {
        this.f193441a = i;
        this.f193442b = i2;
        if (i2 < 1) {
            throw new IllegalArgumentException(s571.m77246e(i2, "tapCount must be at least 1, was ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2317qx)) {
            return false;
        }
        C2317qx c2317qx = (C2317qx) obj;
        return this.f193441a == c2317qx.f193441a && this.f193442b == c2317qx.f193442b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f193442b) + (edb.m38547C(this.f193441a) * 31);
    }
}
