package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zd6 {

    /* JADX INFO: renamed from: a */
    public final String f281628a;

    /* JADX INFO: renamed from: b */
    public final String f281629b;

    public zd6(String str, String str2) {
        this.f281628a = str;
        this.f281629b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd6)) {
            return false;
        }
        zd6 zd6Var = (zd6) obj;
        return wj50.m88271j(this.f281628a, zd6Var.f281628a) && wj50.m88271j(this.f281629b, zd6Var.f281629b);
    }

    public final int hashCode() {
        int iHashCode = this.f281628a.hashCode() * 31;
        String str = this.f281629b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
