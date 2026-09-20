package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wd61 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f250223a;

    /* JADX INFO: renamed from: b */
    public final long f250224b;

    /* JADX INFO: renamed from: c */
    public final long f250225c;

    /* JADX INFO: renamed from: d */
    public final Integer f250226d;

    public wd61(String str, long j, long j2, Integer num) {
        this.f250223a = str;
        this.f250224b = j;
        this.f250225c = j2;
        this.f250226d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd61)) {
            return false;
        }
        wd61 wd61Var = (wd61) obj;
        return wj50.m88271j(this.f250223a, wd61Var.f250223a) && this.f250224b == wd61Var.f250224b && this.f250225c == wd61Var.f250225c && wj50.m88271j(this.f250226d, wd61Var.f250226d);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(this.f250223a.hashCode() * 31, this.f250224b, 31), this.f250225c, 31);
        Integer num = this.f250226d;
        return iM36605e + (num == null ? 0 : num.hashCode());
    }
}
