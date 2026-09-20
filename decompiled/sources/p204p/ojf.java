package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ojf {

    /* JADX INFO: renamed from: a */
    public final boolean f166063a;

    /* JADX INFO: renamed from: b */
    public final qm70 f166064b;

    /* JADX INFO: renamed from: c */
    public final boolean f166065c;

    public ojf(boolean z, qm70 qm70Var, boolean z2) {
        this.f166063a = z;
        this.f166064b = qm70Var;
        this.f166065c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojf)) {
            return false;
        }
        ojf ojfVar = (ojf) obj;
        return this.f166063a == ojfVar.f166063a && wj50.m88271j(this.f166064b, ojfVar.f166064b) && this.f166065c == ojfVar.f166065c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f166063a) * 31;
        qm70 qm70Var = this.f166064b;
        return Boolean.hashCode(this.f166065c) + ((iHashCode + (qm70Var == null ? 0 : qm70Var.hashCode())) * 31);
    }
}
