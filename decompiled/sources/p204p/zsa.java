package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zsa {

    /* JADX INFO: renamed from: a */
    public final String f285895a;

    /* JADX INFO: renamed from: b */
    public final Integer f285896b;

    /* JADX INFO: renamed from: c */
    public final Integer f285897c;

    public zsa(String str, Integer num, Integer num2) {
        this.f285895a = str;
        this.f285896b = num;
        this.f285897c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsa)) {
            return false;
        }
        zsa zsaVar = (zsa) obj;
        return wj50.m88271j(this.f285895a, zsaVar.f285895a) && wj50.m88271j(this.f285896b, zsaVar.f285896b) && wj50.m88271j(this.f285897c, zsaVar.f285897c);
    }

    public final int hashCode() {
        int iHashCode = this.f285895a.hashCode() * 31;
        Integer num = this.f285896b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f285897c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
