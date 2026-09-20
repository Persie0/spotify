package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class emr0 {

    /* JADX INFO: renamed from: a */
    public final String f60974a;

    /* JADX INFO: renamed from: b */
    public final String f60975b;

    /* JADX INFO: renamed from: c */
    public final Integer f60976c;

    public emr0(Integer num, String str, String str2) {
        this.f60974a = str;
        this.f60975b = str2;
        this.f60976c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emr0)) {
            return false;
        }
        emr0 emr0Var = (emr0) obj;
        return wj50.m88271j(this.f60974a, emr0Var.f60974a) && wj50.m88271j(this.f60975b, emr0Var.f60975b) && wj50.m88271j(this.f60976c, emr0Var.f60976c);
    }

    public final int hashCode() {
        int iHashCode = this.f60974a.hashCode() * 31;
        String str = this.f60975b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f60976c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
