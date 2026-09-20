package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mh11 {

    /* JADX INFO: renamed from: a */
    public final ph11 f143685a;

    /* JADX INFO: renamed from: b */
    public final ih11 f143686b;

    public mh11(ph11 ph11Var, ih11 ih11Var) {
        this.f143685a = ph11Var;
        this.f143686b = ih11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh11)) {
            return false;
        }
        mh11 mh11Var = (mh11) obj;
        return wj50.m88271j(this.f143685a, mh11Var.f143685a) && wj50.m88271j(this.f143686b, mh11Var.f143686b);
    }

    public final int hashCode() {
        return this.f143686b.hashCode() + (this.f143685a.hashCode() * 31);
    }
}
