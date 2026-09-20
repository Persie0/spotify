package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wga1 {

    /* JADX INFO: renamed from: a */
    public final int f251014a;

    /* JADX INFO: renamed from: b */
    public final int f251015b;

    public wga1(int i, int i2) {
        this.f251014a = i;
        this.f251015b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wga1)) {
            return false;
        }
        wga1 wga1Var = (wga1) obj;
        return this.f251014a == wga1Var.f251014a && this.f251015b == wga1Var.f251015b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f251015b) + (edb.m38547C(this.f251014a) * 31);
    }
}
