package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zn20 implements i4e {

    /* JADX INFO: renamed from: a */
    public final String f284396a;

    /* JADX INFO: renamed from: b */
    public final String f284397b;

    public zn20(String str, String str2) {
        this.f284396a = str;
        this.f284397b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn20)) {
            return false;
        }
        zn20 zn20Var = (zn20) obj;
        return wj50.m88271j(this.f284396a, zn20Var.f284396a) && wj50.m88271j(this.f284397b, zn20Var.f284397b);
    }

    public final int hashCode() {
        int iHashCode = this.f284396a.hashCode() * 31;
        String str = this.f284397b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
