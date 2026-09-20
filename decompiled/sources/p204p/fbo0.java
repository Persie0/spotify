package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fbo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f67867a;

    /* JADX INFO: renamed from: b */
    public final d850 f67868b;

    public fbo0(String str, d850 d850Var) {
        this.f67867a = str;
        this.f67868b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbo0)) {
            return false;
        }
        fbo0 fbo0Var = (fbo0) obj;
        return wj50.m88271j(this.f67867a, fbo0Var.f67867a) && wj50.m88271j(this.f67868b, fbo0Var.f67868b);
    }

    public final int hashCode() {
        String str = this.f67867a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d850 d850Var = this.f67868b;
        return iHashCode + (d850Var != null ? d850Var.hashCode() : 0);
    }
}
