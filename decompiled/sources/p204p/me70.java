package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class me70 {

    /* JADX INFO: renamed from: a */
    public final String f142624a;

    /* JADX INFO: renamed from: b */
    public final String f142625b;

    /* JADX INFO: renamed from: c */
    public final boolean f142626c;

    public me70(String str, String str2, boolean z) {
        this.f142624a = str;
        this.f142625b = str2;
        this.f142626c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me70)) {
            return false;
        }
        me70 me70Var = (me70) obj;
        return wj50.m88271j(this.f142624a, me70Var.f142624a) && wj50.m88271j(this.f142625b, me70Var.f142625b) && this.f142626c == me70Var.f142626c;
    }

    public final int hashCode() {
        int iHashCode = this.f142624a.hashCode() * 31;
        String str = this.f142625b;
        return Boolean.hashCode(this.f142626c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
