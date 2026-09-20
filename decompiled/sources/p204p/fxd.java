package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fxd implements hxd {

    /* JADX INFO: renamed from: a */
    public final String f74344a;

    /* JADX INFO: renamed from: b */
    public final String f74345b;

    public fxd(String str, String str2) {
        this.f74344a = str;
        this.f74345b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxd)) {
            return false;
        }
        fxd fxdVar = (fxd) obj;
        return wj50.m88271j(this.f74344a, fxdVar.f74344a) && wj50.m88271j(this.f74345b, fxdVar.f74345b);
    }

    public final int hashCode() {
        int iHashCode = this.f74344a.hashCode() * 31;
        String str = this.f74345b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
