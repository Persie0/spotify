package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sbi0 implements ubi0 {

    /* JADX INFO: renamed from: a */
    public final yxx0 f207515a;

    /* JADX INFO: renamed from: b */
    public final qe70 f207516b;

    /* JADX WARN: Multi-variable type inference failed */
    public sbi0(yxx0 yxx0Var, xh00 xh00Var) {
        this.f207515a = yxx0Var;
        this.f207516b = (qe70) xh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbi0)) {
            return false;
        }
        sbi0 sbi0Var = (sbi0) obj;
        return wj50.m88271j(this.f207515a, sbi0Var.f207515a) && this.f207516b.equals(sbi0Var.f207516b);
    }

    public final int hashCode() {
        return this.f207516b.hashCode() + (this.f207515a.f277335a.hashCode() * 31);
    }
}
