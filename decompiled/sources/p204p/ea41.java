package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ea41 implements ktx {

    /* JADX INFO: renamed from: a */
    public final da41 f57582a;

    public ea41(da41 da41Var) {
        this.f57582a = da41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea41) && wj50.m88271j(this.f57582a, ((ea41) obj).f57582a);
    }

    public final int hashCode() {
        da41 da41Var = this.f57582a;
        if (da41Var == null) {
            return 0;
        }
        return da41Var.hashCode();
    }
}
