package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qil0 {

    /* JADX INFO: renamed from: a */
    public final int f189030a;

    /* JADX INFO: renamed from: b */
    public final oil0 f189031b;

    /* JADX INFO: renamed from: c */
    public final ghl0 f189032c;

    /* JADX INFO: renamed from: d */
    public final f5r f189033d;

    public qil0(int i, oil0 oil0Var, ghl0 ghl0Var, f5r f5rVar) {
        this.f189030a = i;
        this.f189031b = oil0Var;
        this.f189032c = ghl0Var;
        this.f189033d = f5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qil0)) {
            return false;
        }
        qil0 qil0Var = (qil0) obj;
        return this.f189030a == qil0Var.f189030a && wj50.m88271j(this.f189031b, qil0Var.f189031b) && wj50.m88271j(this.f189032c, qil0Var.f189032c) && wj50.m88271j(this.f189033d, qil0Var.f189033d);
    }

    public final int hashCode() {
        int iHashCode = (this.f189032c.hashCode() + ((this.f189031b.hashCode() + (Integer.hashCode(this.f189030a) * 31)) * 31)) * 31;
        f5r f5rVar = this.f189033d;
        return iHashCode + (f5rVar == null ? 0 : f5rVar.hashCode());
    }
}
