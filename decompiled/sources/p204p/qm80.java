package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qm80 {

    /* JADX INFO: renamed from: a */
    public final String f190154a;

    /* JADX INFO: renamed from: b */
    public final lm80 f190155b;

    public qm80(String str, lm80 lm80Var) {
        this.f190154a = str;
        this.f190155b = lm80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm80)) {
            return false;
        }
        qm80 qm80Var = (qm80) obj;
        return wj50.m88271j(this.f190154a, qm80Var.f190154a) && wj50.m88271j(this.f190155b, qm80Var.f190155b);
    }

    public final int hashCode() {
        String str = this.f190154a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        lm80 lm80Var = this.f190155b;
        return iHashCode + (lm80Var != null ? lm80Var.hashCode() : 0);
    }
}
