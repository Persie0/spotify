package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pbt0 extends qbt0 {

    /* JADX INFO: renamed from: a */
    public final jp20 f175905a;

    /* JADX INFO: renamed from: b */
    public final boolean f175906b;

    public pbt0(jp20 jp20Var, boolean z) {
        this.f175905a = jp20Var;
        this.f175906b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbt0)) {
            return false;
        }
        pbt0 pbt0Var = (pbt0) obj;
        return wj50.m88271j(this.f175905a, pbt0Var.f175905a) && this.f175906b == pbt0Var.f175906b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175906b) + (this.f175905a.hashCode() * 31);
    }
}
