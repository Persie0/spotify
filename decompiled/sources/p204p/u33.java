package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u33 extends w33 {

    /* JADX INFO: renamed from: a */
    public final String f226263a;

    /* JADX INFO: renamed from: b */
    public final String f226264b;

    public u33(String str, String str2) {
        this.f226263a = str;
        this.f226264b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u33)) {
            return false;
        }
        u33 u33Var = (u33) obj;
        return wj50.m88271j(this.f226263a, u33Var.f226263a) && wj50.m88271j(this.f226264b, u33Var.f226264b);
    }

    public final int hashCode() {
        int iHashCode = this.f226263a.hashCode() * 31;
        String str = this.f226264b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
