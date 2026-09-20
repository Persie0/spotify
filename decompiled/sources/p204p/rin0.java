package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rin0 {

    /* JADX INFO: renamed from: a */
    public final qin0 f199580a;

    /* JADX INFO: renamed from: b */
    public final String f199581b;

    public rin0(qin0 qin0Var, String str) {
        this.f199580a = qin0Var;
        this.f199581b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rin0)) {
            return false;
        }
        rin0 rin0Var = (rin0) obj;
        return wj50.m88271j(this.f199580a, rin0Var.f199580a) && wj50.m88271j(this.f199581b, rin0Var.f199581b);
    }

    public final int hashCode() {
        qin0 qin0Var = this.f199580a;
        return this.f199581b.hashCode() + ((qin0Var == null ? 0 : qin0Var.hashCode()) * 31);
    }
}
