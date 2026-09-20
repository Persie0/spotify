package p204p;

/* JADX INFO: renamed from: p.zq */
/* JADX INFO: loaded from: classes4.dex */
public final class C2659zq {

    /* JADX INFO: renamed from: a */
    public final int f285269a;

    /* JADX INFO: renamed from: b */
    public final C1681av f285270b;

    /* JADX INFO: renamed from: c */
    public final qf40 f285271c;

    /* JADX INFO: renamed from: d */
    public final boolean f285272d;

    /* JADX INFO: renamed from: e */
    public final boolean f285273e;

    public C2659zq(int i, C1681av c1681av, qf40 qf40Var, boolean z, boolean z2) {
        this.f285269a = i;
        this.f285270b = c1681av;
        this.f285271c = qf40Var;
        this.f285272d = z;
        this.f285273e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2659zq)) {
            return false;
        }
        C2659zq c2659zq = (C2659zq) obj;
        return this.f285269a == c2659zq.f285269a && wj50.m88271j(this.f285270b, c2659zq.f285270b) && wj50.m88271j(this.f285271c, c2659zq.f285271c) && this.f285272d == c2659zq.f285272d && this.f285273e == c2659zq.f285273e;
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f285269a) * 31;
        C1681av c1681av = this.f285270b;
        int iHashCode = (iM38547C + (c1681av == null ? 0 : c1681av.hashCode())) * 31;
        qf40 qf40Var = this.f285271c;
        return Boolean.hashCode(this.f285273e) + s571.m77245d((iHashCode + (qf40Var != null ? qf40Var.hashCode() : 0)) * 31, 31, this.f285272d);
    }
}
