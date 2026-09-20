package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eue1 {

    /* JADX INFO: renamed from: a */
    public final int f62966a;

    /* JADX INFO: renamed from: b */
    public final gwl0 f62967b;

    /* JADX INFO: renamed from: c */
    public final z9z0 f62968c;

    /* JADX INFO: renamed from: d */
    public final rn61 f62969d;

    public eue1(gwl0 gwl0Var) {
        z9z0 z9z0Var = new z9z0();
        rn61 rn61Var = new rn61();
        this.f62966a = 1;
        this.f62967b = gwl0Var;
        this.f62968c = z9z0Var;
        this.f62969d = rn61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eue1)) {
            return false;
        }
        eue1 eue1Var = (eue1) obj;
        return this.f62966a == eue1Var.f62966a && wj50.m88271j(this.f62967b, eue1Var.f62967b) && wj50.m88271j(this.f62968c, eue1Var.f62968c) && wj50.m88271j(this.f62969d, eue1Var.f62969d);
    }

    public final int hashCode() {
        return this.f62969d.hashCode() + ((this.f62968c.hashCode() + ((this.f62967b.hashCode() + (edb.m38547C(this.f62966a) * 31)) * 31)) * 31);
    }
}
