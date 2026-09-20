package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f137225a;

    /* JADX INFO: renamed from: b */
    public final d850 f137226b;

    public lv5(String str, d850 d850Var) {
        this.f137225a = str;
        this.f137226b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv5)) {
            return false;
        }
        lv5 lv5Var = (lv5) obj;
        return wj50.m88271j(this.f137225a, lv5Var.f137225a) && wj50.m88271j(this.f137226b, lv5Var.f137226b);
    }

    public final int hashCode() {
        return this.f137226b.hashCode() + (this.f137225a.hashCode() * 31);
    }
}
