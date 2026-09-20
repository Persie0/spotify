package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o2b1 {

    /* JADX INFO: renamed from: a */
    public final boolean f161015a;

    /* JADX INFO: renamed from: b */
    public final String f161016b;

    public o2b1(boolean z, String str) {
        this.f161015a = z;
        this.f161016b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2b1)) {
            return false;
        }
        o2b1 o2b1Var = (o2b1) obj;
        return this.f161015a == o2b1Var.f161015a && wj50.m88271j(this.f161016b, o2b1Var.f161016b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f161015a) * 31;
        String str = this.f161016b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
