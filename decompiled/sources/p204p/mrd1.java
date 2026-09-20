package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mrd1 {

    /* JADX INFO: renamed from: a */
    public final api f146478a;

    /* JADX INFO: renamed from: b */
    public final boolean f146479b;

    public mrd1(api apiVar, boolean z) {
        this.f146478a = apiVar;
        this.f146479b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrd1)) {
            return false;
        }
        mrd1 mrd1Var = (mrd1) obj;
        return wj50.m88271j(this.f146478a, mrd1Var.f146478a) && this.f146479b == mrd1Var.f146479b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146479b) + (this.f146478a.hashCode() * 31);
    }
}
