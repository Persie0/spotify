package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lqa1 implements mqa1 {

    /* JADX INFO: renamed from: a */
    public final ip20 f136000a;

    /* JADX INFO: renamed from: b */
    public final bqa1 f136001b;

    public lqa1(ip20 ip20Var, bqa1 bqa1Var) {
        this.f136000a = ip20Var;
        this.f136001b = bqa1Var;
    }

    @Override // p204p.mqa1
    /* JADX INFO: renamed from: a */
    public final jp20 mo57087a() {
        return this.f136000a;
    }

    @Override // p204p.mqa1
    /* JADX INFO: renamed from: b */
    public final bqa1 mo57088b() {
        return this.f136001b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqa1)) {
            return false;
        }
        lqa1 lqa1Var = (lqa1) obj;
        return wj50.m88271j(this.f136000a, lqa1Var.f136000a) && wj50.m88271j(this.f136001b, lqa1Var.f136001b);
    }

    public final int hashCode() {
        return this.f136001b.hashCode() + (this.f136000a.f104368a.hashCode() * 31);
    }
}
