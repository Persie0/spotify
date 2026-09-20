package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tl9 {

    /* JADX INFO: renamed from: a */
    public final cc81 f221394a;

    /* JADX INFO: renamed from: b */
    public final boolean f221395b;

    public tl9(cc81 cc81Var, boolean z) {
        this.f221394a = cc81Var;
        this.f221395b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl9)) {
            return false;
        }
        tl9 tl9Var = (tl9) obj;
        return wj50.m88271j(this.f221394a, tl9Var.f221394a) && this.f221395b == tl9Var.f221395b;
    }

    public final int hashCode() {
        cc81 cc81Var = this.f221394a;
        return Boolean.hashCode(this.f221395b) + ((cc81Var == null ? 0 : cc81Var.hashCode()) * 31);
    }
}
