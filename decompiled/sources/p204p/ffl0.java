package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ffl0 extends mfl0 {

    /* JADX INFO: renamed from: a */
    public final String f69032a;

    /* JADX INFO: renamed from: b */
    public final boolean f69033b;

    public ffl0(String str, boolean z) {
        this.f69032a = str;
        this.f69033b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffl0)) {
            return false;
        }
        ffl0 ffl0Var = (ffl0) obj;
        return wj50.m88271j(this.f69032a, ffl0Var.f69032a) && this.f69033b == ffl0Var.f69033b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69033b) + (this.f69032a.hashCode() * 31);
    }
}
