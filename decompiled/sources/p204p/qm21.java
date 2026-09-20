package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qm21 {

    /* JADX INFO: renamed from: a */
    public final String f190025a;

    /* JADX INFO: renamed from: b */
    public final boolean f190026b;

    /* JADX INFO: renamed from: c */
    public final am81 f190027c;

    public qm21(String str, boolean z, am81 am81Var) {
        this.f190025a = str;
        this.f190026b = z;
        this.f190027c = am81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm21)) {
            return false;
        }
        qm21 qm21Var = (qm21) obj;
        return wj50.m88271j(this.f190025a, qm21Var.f190025a) && this.f190026b == qm21Var.f190026b && wj50.m88271j(this.f190027c, qm21Var.f190027c);
    }

    public final int hashCode() {
        return this.f190027c.hashCode() + s571.m77245d(this.f190025a.hashCode() * 31, 31, this.f190026b);
    }
}
