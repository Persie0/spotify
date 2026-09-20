package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gks {

    /* JADX INFO: renamed from: a */
    public final fks f80898a;

    /* JADX INFO: renamed from: b */
    public final y6s0 f80899b;

    public gks(fks fksVar, y6s0 y6s0Var) {
        this.f80898a = fksVar;
        this.f80899b = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gks)) {
            return false;
        }
        gks gksVar = (gks) obj;
        return wj50.m88271j(this.f80898a, gksVar.f80898a) && wj50.m88271j(this.f80899b, gksVar.f80899b);
    }

    public final int hashCode() {
        return this.f80899b.hashCode() + (this.f80898a.hashCode() * 31);
    }
}
