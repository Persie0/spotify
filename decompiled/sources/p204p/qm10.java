package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qm10 extends rm10 {

    /* JADX INFO: renamed from: a */
    public final String f190006a;

    /* JADX INFO: renamed from: b */
    public final int f190007b;

    /* JADX INFO: renamed from: c */
    public final String f190008c;

    /* JADX INFO: renamed from: d */
    public final long f190009d;

    public qm10(int i, String str, String str2, long j) {
        this.f190006a = str;
        this.f190007b = i;
        this.f190008c = str2;
        this.f190009d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm10)) {
            return false;
        }
        qm10 qm10Var = (qm10) obj;
        return wj50.m88271j(this.f190006a, qm10Var.f190006a) && this.f190007b == qm10Var.f190007b && wj50.m88271j(this.f190008c, qm10Var.f190008c) && this.f190009d == qm10Var.f190009d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f190009d) + s571.m77243b(f710.m40938f(this.f190007b, this.f190006a.hashCode() * 31, 31), 31, this.f190008c);
    }
}
