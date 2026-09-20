package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ps2 implements rs2 {

    /* JADX INFO: renamed from: a */
    public final voc1 f180715a;

    /* JADX INFO: renamed from: b */
    public final String f180716b;

    public ps2(String str, voc1 voc1Var) {
        this.f180715a = voc1Var;
        this.f180716b = str;
    }

    @Override // p204p.rs2
    /* JADX INFO: renamed from: a */
    public final voc1 mo70749a() {
        return this.f180715a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps2)) {
            return false;
        }
        ps2 ps2Var = (ps2) obj;
        return wj50.m88271j(this.f180715a, ps2Var.f180715a) && wj50.m88271j(this.f180716b, ps2Var.f180716b);
    }

    public final int hashCode() {
        return this.f180716b.hashCode() + (this.f180715a.f243453a.hashCode() * 31);
    }
}
