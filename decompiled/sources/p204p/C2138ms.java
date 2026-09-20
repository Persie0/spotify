package p204p;

/* JADX INFO: renamed from: p.ms */
/* JADX INFO: loaded from: classes4.dex */
public final class C2138ms implements InterfaceC2188ns {

    /* JADX INFO: renamed from: a */
    public final C1681av f146654a;

    /* JADX INFO: renamed from: b */
    public final qf40 f146655b;

    public C2138ms(C1681av c1681av, qf40 qf40Var) {
        this.f146654a = c1681av;
        this.f146655b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2138ms)) {
            return false;
        }
        C2138ms c2138ms = (C2138ms) obj;
        return wj50.m88271j(this.f146654a, c2138ms.f146654a) && wj50.m88271j(this.f146655b, c2138ms.f146655b);
    }

    public final int hashCode() {
        C1681av c1681av = this.f146654a;
        return this.f146655b.hashCode() + ((c1681av == null ? 0 : c1681av.hashCode()) * 31);
    }
}
