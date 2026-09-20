package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b681 {

    /* JADX INFO: renamed from: a */
    public final String f23878a;

    /* JADX INFO: renamed from: b */
    public final gkk f23879b;

    /* JADX INFO: renamed from: c */
    public final Integer f23880c;

    public b681(String str, gkk gkkVar, Integer num) {
        this.f23878a = str;
        this.f23879b = gkkVar;
        this.f23880c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b681)) {
            return false;
        }
        b681 b681Var = (b681) obj;
        return wj50.m88271j(this.f23878a, b681Var.f23878a) && this.f23879b == b681Var.f23879b && wj50.m88271j(this.f23880c, b681Var.f23880c);
    }

    public final int hashCode() {
        int iHashCode = this.f23878a.hashCode() * 31;
        gkk gkkVar = this.f23879b;
        int iHashCode2 = (iHashCode + (gkkVar == null ? 0 : gkkVar.hashCode())) * 31;
        Integer num = this.f23880c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
