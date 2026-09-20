package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ct41 implements hv41 {

    /* JADX INFO: renamed from: a */
    public final int f41768a;

    /* JADX INFO: renamed from: b */
    public final String f41769b;

    public ct41(int i, String str) {
        this.f41768a = i;
        this.f41769b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct41)) {
            return false;
        }
        ct41 ct41Var = (ct41) obj;
        return this.f41768a == ct41Var.f41768a && wj50.m88271j(this.f41769b, ct41Var.f41769b);
    }

    public final int hashCode() {
        return this.f41769b.hashCode() + (edb.m38547C(this.f41768a) * 31);
    }
}
