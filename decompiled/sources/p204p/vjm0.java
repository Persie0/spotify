package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vjm0 {

    /* JADX INFO: renamed from: a */
    public final String f242016a;

    /* JADX INFO: renamed from: b */
    public final gkk f242017b;

    /* JADX INFO: renamed from: c */
    public final Integer f242018c;

    public vjm0(String str, gkk gkkVar, Integer num) {
        this.f242016a = str;
        this.f242017b = gkkVar;
        this.f242018c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjm0)) {
            return false;
        }
        vjm0 vjm0Var = (vjm0) obj;
        return wj50.m88271j(this.f242016a, vjm0Var.f242016a) && this.f242017b == vjm0Var.f242017b && wj50.m88271j(this.f242018c, vjm0Var.f242018c);
    }

    public final int hashCode() {
        int iHashCode = this.f242016a.hashCode() * 31;
        gkk gkkVar = this.f242017b;
        int iHashCode2 = (iHashCode + (gkkVar == null ? 0 : gkkVar.hashCode())) * 31;
        Integer num = this.f242018c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
