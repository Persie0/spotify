package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gt41 extends pv41 {

    /* JADX INFO: renamed from: a */
    public final String f84089a;

    /* JADX INFO: renamed from: b */
    public final String f84090b;

    /* JADX INFO: renamed from: c */
    public final Integer f84091c;

    public gt41(Integer num, String str, String str2) {
        this.f84089a = str;
        this.f84090b = str2;
        this.f84091c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt41)) {
            return false;
        }
        gt41 gt41Var = (gt41) obj;
        return wj50.m88271j(this.f84089a, gt41Var.f84089a) && wj50.m88271j(this.f84090b, gt41Var.f84090b) && wj50.m88271j(this.f84091c, gt41Var.f84091c);
    }

    public final int hashCode() {
        String str = this.f84089a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f84090b);
        Integer num = this.f84091c;
        return iM77243b + (num != null ? num.hashCode() : 0);
    }
}
