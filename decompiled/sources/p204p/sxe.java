package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sxe {

    /* JADX INFO: renamed from: a */
    public final qla1 f214877a;

    public sxe(qla1 qla1Var) {
        this.f214877a = qla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxe) && wj50.m88271j(this.f214877a, ((sxe) obj).f214877a);
    }

    public final int hashCode() {
        qla1 qla1Var = this.f214877a;
        if (qla1Var == null) {
            return 0;
        }
        return qla1Var.hashCode();
    }
}
