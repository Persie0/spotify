package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mps0 {

    /* JADX INFO: renamed from: a */
    public final boolean f146085a;

    /* JADX INFO: renamed from: b */
    public final c4m f146086b;

    public mps0(boolean z, c4m c4mVar) {
        this.f146085a = z;
        this.f146086b = c4mVar;
    }

    /* JADX INFO: renamed from: a */
    public static mps0 m62501a(mps0 mps0Var, boolean z, c4m c4mVar, int i) {
        if ((i & 1) != 0) {
            z = mps0Var.f146085a;
        }
        if ((i & 2) != 0) {
            c4mVar = mps0Var.f146086b;
        }
        mps0Var.getClass();
        return new mps0(z, c4mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mps0)) {
            return false;
        }
        mps0 mps0Var = (mps0) obj;
        return this.f146085a == mps0Var.f146085a && wj50.m88271j(this.f146086b, mps0Var.f146086b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f146085a) * 31;
        c4m c4mVar = this.f146086b;
        return iHashCode + (c4mVar == null ? 0 : c4mVar.hashCode());
    }
}
