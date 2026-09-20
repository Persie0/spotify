package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bsj extends dsj {

    /* JADX INFO: renamed from: a */
    public final String f30337a;

    /* JADX INFO: renamed from: b */
    public final ln21 f30338b;

    public bsj(String str, ln21 ln21Var) {
        this.f30337a = str;
        this.f30338b = ln21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsj)) {
            return false;
        }
        bsj bsjVar = (bsj) obj;
        return wj50.m88271j(this.f30337a, bsjVar.f30337a) && this.f30338b == bsjVar.f30338b;
    }

    public final int hashCode() {
        return this.f30338b.hashCode() + (this.f30337a.hashCode() * 31);
    }
}
