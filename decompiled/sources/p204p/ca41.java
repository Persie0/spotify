package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ca41 implements da41 {

    /* JADX INFO: renamed from: a */
    public final long f35723a;

    /* JADX INFO: renamed from: b */
    public final long f35724b;

    /* JADX INFO: renamed from: c */
    public final String f35725c;

    public ca41(long j, String str, long j2) {
        this.f35723a = j;
        this.f35724b = j2;
        this.f35725c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca41)) {
            return false;
        }
        ca41 ca41Var = (ca41) obj;
        return this.f35723a == ca41Var.f35723a && this.f35724b == ca41Var.f35724b && wj50.m88271j(this.f35725c, ca41Var.f35725c);
    }

    public final int hashCode() {
        return this.f35725c.hashCode() + dq60.m36605e(Long.hashCode(this.f35723a) * 31, this.f35724b, 31);
    }
}
