package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mcc1 {

    /* JADX INFO: renamed from: a */
    public final String f142126a;

    /* JADX INFO: renamed from: b */
    public final ki71 f142127b;

    /* JADX INFO: renamed from: c */
    public final Integer f142128c;

    /* JADX INFO: renamed from: d */
    public final Integer f142129d;

    public mcc1(String str, ki71 ki71Var, Integer num, Integer num2) {
        this.f142126a = str;
        this.f142127b = ki71Var;
        this.f142128c = num;
        this.f142129d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc1)) {
            return false;
        }
        mcc1 mcc1Var = (mcc1) obj;
        return wj50.m88271j(this.f142126a, mcc1Var.f142126a) && wj50.m88271j(this.f142127b, mcc1Var.f142127b) && wj50.m88271j(this.f142128c, mcc1Var.f142128c) && wj50.m88271j(this.f142129d, mcc1Var.f142129d);
    }

    public final int hashCode() {
        int iHashCode = this.f142126a.hashCode() * 31;
        ki71 ki71Var = this.f142127b;
        int iHashCode2 = (iHashCode + (ki71Var == null ? 0 : ki71Var.hashCode())) * 31;
        Integer num = this.f142128c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f142129d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}
