package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ccw0 implements jcw0 {

    /* JADX INFO: renamed from: a */
    public final int f36652a;

    /* JADX INFO: renamed from: b */
    public final fgr f36653b;

    /* JADX INFO: renamed from: c */
    public final psx0 f36654c;

    public ccw0(int i, fgr fgrVar, psx0 psx0Var) {
        this.f36652a = i;
        this.f36653b = fgrVar;
        this.f36654c = psx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccw0)) {
            return false;
        }
        ccw0 ccw0Var = (ccw0) obj;
        return this.f36652a == ccw0Var.f36652a && wj50.m88271j(this.f36653b, ccw0Var.f36653b) && wj50.m88271j(this.f36654c, ccw0Var.f36654c);
    }

    public final int hashCode() {
        return this.f36654c.hashCode() + ((this.f36653b.hashCode() + (Integer.hashCode(this.f36652a) * 31)) * 31);
    }
}
