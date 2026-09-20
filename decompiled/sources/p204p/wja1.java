package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wja1 {

    /* JADX INFO: renamed from: a */
    public final String f251922a;

    /* JADX INFO: renamed from: b */
    public final vja1 f251923b;

    public wja1(String str, vja1 vja1Var) {
        this.f251922a = str;
        this.f251923b = vja1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wja1)) {
            return false;
        }
        wja1 wja1Var = (wja1) obj;
        return wj50.m88271j(this.f251922a, wja1Var.f251922a) && wj50.m88271j(this.f251923b, wja1Var.f251923b);
    }

    public final int hashCode() {
        return this.f251923b.hashCode() + (this.f251922a.hashCode() * 31);
    }
}
