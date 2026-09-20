package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sgo0 implements aho0 {

    /* JADX INFO: renamed from: a */
    public final String f208914a;

    /* JADX INFO: renamed from: b */
    public final String f208915b;

    /* JADX INFO: renamed from: c */
    public final Long f208916c;

    public sgo0(Long l, String str, String str2) {
        this.f208914a = str;
        this.f208915b = str2;
        this.f208916c = l;
    }

    @Override // p204p.aho0
    /* JADX INFO: renamed from: a */
    public final String mo25991a() {
        return this.f208915b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgo0)) {
            return false;
        }
        sgo0 sgo0Var = (sgo0) obj;
        return wj50.m88271j(this.f208914a, sgo0Var.f208914a) && wj50.m88271j(this.f208915b, sgo0Var.f208915b) && wj50.m88271j(this.f208916c, sgo0Var.f208916c);
    }

    @Override // p204p.aho0
    public final String getContextUri() {
        return this.f208914a;
    }

    public final int hashCode() {
        int iHashCode = this.f208914a.hashCode() * 31;
        String str = this.f208915b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f208916c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
