package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zim0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283197a;

    /* JADX INFO: renamed from: b */
    public final String f283198b;

    /* JADX INFO: renamed from: c */
    public final gkm0 f283199c;

    public zim0(boolean z, String str, gkm0 gkm0Var) {
        this.f283197a = z;
        this.f283198b = str;
        this.f283199c = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zim0)) {
            return false;
        }
        zim0 zim0Var = (zim0) obj;
        return this.f283197a == zim0Var.f283197a && wj50.m88271j(this.f283198b, zim0Var.f283198b) && wj50.m88271j(this.f283199c, zim0Var.f283199c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f283197a) * 31;
        String str = this.f283198b;
        return this.f283199c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
