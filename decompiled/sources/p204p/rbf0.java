package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rbf0 implements sbf0 {

    /* JADX INFO: renamed from: b */
    public final qcf0 f197587b;

    /* JADX INFO: renamed from: c */
    public final Long f197588c;

    public rbf0(qcf0 qcf0Var, Long l) {
        this.f197587b = qcf0Var;
        this.f197588c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbf0)) {
            return false;
        }
        rbf0 rbf0Var = (rbf0) obj;
        return wj50.m88271j(this.f197587b, rbf0Var.f197587b) && wj50.m88271j(this.f197588c, rbf0Var.f197588c);
    }

    public final int hashCode() {
        int iHashCode = this.f197587b.hashCode() * 31;
        Long l = this.f197588c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
