package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zn40 {

    /* JADX INFO: renamed from: a */
    public final String f284405a;

    /* JADX INFO: renamed from: b */
    public final String f284406b;

    public zn40(String str, String str2) {
        this.f284405a = str;
        this.f284406b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn40)) {
            return false;
        }
        zn40 zn40Var = (zn40) obj;
        return wj50.m88271j(this.f284405a, zn40Var.f284405a) && wj50.m88271j(this.f284406b, zn40Var.f284406b);
    }

    public final int hashCode() {
        return this.f284406b.hashCode() + (this.f284405a.hashCode() * 31);
    }
}
