package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z2y {

    /* JADX INFO: renamed from: a */
    public final tw8 f278687a;

    /* JADX INFO: renamed from: b */
    public final phx0 f278688b;

    /* JADX INFO: renamed from: c */
    public final phx0 f278689c;

    /* JADX INFO: renamed from: d */
    public final phx0 f278690d;

    /* JADX INFO: renamed from: e */
    public final phx0 f278691e;

    /* JADX INFO: renamed from: f */
    public final String f278692f;

    /* JADX INFO: renamed from: g */
    public final boolean f278693g;

    public z2y(tw8 tw8Var, phx0 phx0Var, phx0 phx0Var2, phx0 phx0Var3, phx0 phx0Var4, String str, boolean z) {
        this.f278687a = tw8Var;
        this.f278688b = phx0Var;
        this.f278689c = phx0Var2;
        this.f278690d = phx0Var3;
        this.f278691e = phx0Var4;
        this.f278692f = str;
        this.f278693g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2y)) {
            return false;
        }
        z2y z2yVar = (z2y) obj;
        return wj50.m88271j(this.f278687a, z2yVar.f278687a) && wj50.m88271j(this.f278688b, z2yVar.f278688b) && wj50.m88271j(this.f278689c, z2yVar.f278689c) && wj50.m88271j(this.f278690d, z2yVar.f278690d) && wj50.m88271j(this.f278691e, z2yVar.f278691e) && wj50.m88271j(this.f278692f, z2yVar.f278692f) && this.f278693g == z2yVar.f278693g;
    }

    public final int hashCode() {
        int iHashCode = (this.f278691e.hashCode() + ((this.f278690d.hashCode() + ((this.f278689c.hashCode() + ((this.f278688b.hashCode() + (this.f278687a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f278692f;
        return Boolean.hashCode(this.f278693g) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
