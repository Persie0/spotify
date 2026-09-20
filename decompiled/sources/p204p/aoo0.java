package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aoo0 {

    /* JADX INFO: renamed from: a */
    public final k3w f17727a;

    /* JADX INFO: renamed from: b */
    public final long f17728b;

    /* JADX INFO: renamed from: c */
    public final u3h1 f17729c;

    /* JADX INFO: renamed from: d */
    public final edo f17730d;

    /* JADX INFO: renamed from: e */
    public final boolean f17731e;

    public aoo0(k3w k3wVar, long j, u3h1 u3h1Var, edo edoVar, boolean z) {
        this.f17727a = k3wVar;
        this.f17728b = j;
        this.f17729c = u3h1Var;
        this.f17730d = edoVar;
        this.f17731e = z;
    }

    /* JADX INFO: renamed from: a */
    public static aoo0 m26612a(aoo0 aoo0Var, k3w k3wVar, long j, u3h1 u3h1Var, int i) {
        if ((i & 1) != 0) {
            k3wVar = aoo0Var.f17727a;
        }
        k3w k3wVar2 = k3wVar;
        if ((i & 2) != 0) {
            j = aoo0Var.f17728b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            u3h1Var = aoo0Var.f17729c;
        }
        u3h1 u3h1Var2 = u3h1Var;
        edo edoVar = aoo0Var.f17730d;
        boolean z = (i & 16) != 0 ? aoo0Var.f17731e : true;
        aoo0Var.getClass();
        return new aoo0(k3wVar2, j2, u3h1Var2, edoVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoo0)) {
            return false;
        }
        aoo0 aoo0Var = (aoo0) obj;
        return wj50.m88271j(this.f17727a, aoo0Var.f17727a) && this.f17728b == aoo0Var.f17728b && wj50.m88271j(this.f17729c, aoo0Var.f17729c) && wj50.m88271j(this.f17730d, aoo0Var.f17730d) && this.f17731e == aoo0Var.f17731e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17731e) + ((this.f17730d.hashCode() + ((this.f17729c.hashCode() + dq60.m36605e(this.f17727a.hashCode() * 31, this.f17728b, 31)) * 31)) * 31);
    }
}
