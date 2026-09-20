package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yg20 implements bh20 {

    /* JADX INFO: renamed from: a */
    public final int f272454a;

    public yg20(int i) {
        this.f272454a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg20) && this.f272454a == ((yg20) obj).f272454a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f272454a);
    }
}
