package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tuq0 {

    /* JADX INFO: renamed from: a */
    public final q7z0 f223909a;

    /* JADX INFO: renamed from: b */
    public final nxq0 f223910b;

    public tuq0(q7z0 q7z0Var, nxq0 nxq0Var) {
        this.f223909a = q7z0Var;
        this.f223910b = nxq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuq0)) {
            return false;
        }
        tuq0 tuq0Var = (tuq0) obj;
        return wj50.m88271j(this.f223909a, tuq0Var.f223909a) && wj50.m88271j(this.f223910b, tuq0Var.f223910b);
    }

    public final int hashCode() {
        return this.f223910b.f159581a.hashCode() + (this.f223909a.hashCode() * 31);
    }
}
