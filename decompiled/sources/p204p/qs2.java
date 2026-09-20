package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qs2 implements rs2 {

    /* JADX INFO: renamed from: a */
    public final voc1 f191955a;

    /* JADX INFO: renamed from: b */
    public final String f191956b;

    /* JADX INFO: renamed from: c */
    public final String f191957c;

    public qs2(String str, String str2, voc1 voc1Var) {
        this.f191955a = voc1Var;
        this.f191956b = str;
        this.f191957c = str2;
    }

    @Override // p204p.rs2
    /* JADX INFO: renamed from: a */
    public final voc1 mo70749a() {
        return this.f191955a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs2)) {
            return false;
        }
        qs2 qs2Var = (qs2) obj;
        return wj50.m88271j(this.f191955a, qs2Var.f191955a) && wj50.m88271j(this.f191956b, qs2Var.f191956b) && wj50.m88271j(this.f191957c, qs2Var.f191957c);
    }

    public final int hashCode() {
        return this.f191957c.hashCode() + s571.m77243b(this.f191955a.f243453a.hashCode() * 31, 31, this.f191956b);
    }
}
