package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cr7 implements er7 {

    /* JADX INFO: renamed from: a */
    public final zew f41196a;

    /* JADX INFO: renamed from: b */
    public final String f41197b;

    /* JADX INFO: renamed from: c */
    public final String f41198c;

    public cr7(zew zewVar, String str, String str2) {
        this.f41196a = zewVar;
        this.f41197b = str;
        this.f41198c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr7)) {
            return false;
        }
        cr7 cr7Var = (cr7) obj;
        return this.f41196a == cr7Var.f41196a && wj50.m88271j(this.f41197b, cr7Var.f41197b) && wj50.m88271j(this.f41198c, cr7Var.f41198c);
    }

    public final int hashCode() {
        int iHashCode = this.f41196a.hashCode() * 31;
        String str = this.f41197b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41198c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
