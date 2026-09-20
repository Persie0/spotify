package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hlo {

    /* JADX INFO: renamed from: a */
    public final int f92713a;

    /* JADX INFO: renamed from: b */
    public final Integer f92714b;

    /* JADX INFO: renamed from: c */
    public final Integer f92715c;

    public hlo(int i, Integer num, Integer num2) {
        this.f92713a = i;
        this.f92714b = num;
        this.f92715c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlo)) {
            return false;
        }
        hlo hloVar = (hlo) obj;
        return this.f92713a == hloVar.f92713a && wj50.m88271j(this.f92714b, hloVar.f92714b) && wj50.m88271j(this.f92715c, hloVar.f92715c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f92713a) * 31;
        Integer num = this.f92714b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f92715c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
