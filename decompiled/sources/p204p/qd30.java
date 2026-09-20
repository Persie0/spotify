package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final String f187467a;

    /* JADX INFO: renamed from: b */
    public final qm0 f187468b;

    public qd30(String str, qm0 qm0Var) {
        this.f187467a = str;
        this.f187468b = qm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd30)) {
            return false;
        }
        qd30 qd30Var = (qd30) obj;
        return wj50.m88271j(this.f187467a, qd30Var.f187467a) && this.f187468b == qd30Var.f187468b;
    }

    public final int hashCode() {
        return this.f187468b.hashCode() + (this.f187467a.hashCode() * 31);
    }
}
