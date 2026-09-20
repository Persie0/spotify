package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ocm0 {

    /* JADX INFO: renamed from: a */
    public final kbm0 f163959a;

    /* JADX INFO: renamed from: b */
    public final String f163960b;

    /* JADX INFO: renamed from: c */
    public final String f163961c;

    /* JADX INFO: renamed from: d */
    public final Integer f163962d;

    public ocm0(kbm0 kbm0Var, String str, String str2, Integer num) {
        this.f163959a = kbm0Var;
        this.f163960b = str;
        this.f163961c = str2;
        this.f163962d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocm0)) {
            return false;
        }
        ocm0 ocm0Var = (ocm0) obj;
        return wj50.m88271j(this.f163959a, ocm0Var.f163959a) && wj50.m88271j(this.f163960b, ocm0Var.f163960b) && wj50.m88271j(this.f163961c, ocm0Var.f163961c) && wj50.m88271j(this.f163962d, ocm0Var.f163962d);
    }

    public final int hashCode() {
        kbm0 kbm0Var = this.f163959a;
        int iHashCode = (kbm0Var == null ? 0 : kbm0Var.f121231a.hashCode()) * 31;
        String str = this.f163960b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f163961c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f163962d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
