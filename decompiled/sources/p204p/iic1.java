package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class iic1 {

    /* JADX INFO: renamed from: a */
    public final boolean f102509a;

    /* JADX INFO: renamed from: b */
    public final uga f102510b;

    public iic1(boolean z, uga ugaVar) {
        this.f102509a = z;
        this.f102510b = ugaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iic1)) {
            return false;
        }
        iic1 iic1Var = (iic1) obj;
        return this.f102509a == iic1Var.f102509a && wj50.m88271j(this.f102510b, iic1Var.f102510b);
    }

    public final int hashCode() {
        return this.f102510b.hashCode() + (Boolean.hashCode(this.f102509a) * 31);
    }
}
