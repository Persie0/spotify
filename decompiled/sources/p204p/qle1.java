package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qle1 {

    /* JADX INFO: renamed from: a */
    public final boolean f189857a;

    /* JADX INFO: renamed from: b */
    public final ple1 f189858b;

    public qle1(boolean z, ple1 ple1Var) {
        this.f189857a = z;
        this.f189858b = ple1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qle1)) {
            return false;
        }
        qle1 qle1Var = (qle1) obj;
        return this.f189857a == qle1Var.f189857a && wj50.m88271j(this.f189858b, qle1Var.f189858b);
    }

    public final int hashCode() {
        return this.f189858b.hashCode() + (Boolean.hashCode(this.f189857a) * 31);
    }
}
