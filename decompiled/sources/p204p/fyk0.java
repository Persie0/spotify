package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fyk0 {

    /* JADX INFO: renamed from: a */
    public final String f74763a;

    /* JADX INFO: renamed from: b */
    public final String f74764b;

    /* JADX INFO: renamed from: c */
    public final wwu f74765c;

    /* JADX INFO: renamed from: d */
    public final qf40 f74766d;

    public fyk0(String str, String str2, wwu wwuVar, qf40 qf40Var) {
        this.f74763a = str;
        this.f74764b = str2;
        this.f74765c = wwuVar;
        this.f74766d = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyk0)) {
            return false;
        }
        fyk0 fyk0Var = (fyk0) obj;
        return wj50.m88271j(this.f74763a, fyk0Var.f74763a) && wj50.m88271j(this.f74764b, fyk0Var.f74764b) && wj50.m88271j(this.f74765c, fyk0Var.f74765c) && wj50.m88271j(this.f74766d, fyk0Var.f74766d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f74763a.hashCode() * 31, 31, this.f74764b);
        wwu wwuVar = this.f74765c;
        return this.f74766d.hashCode() + ((iM77243b + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31);
    }
}
