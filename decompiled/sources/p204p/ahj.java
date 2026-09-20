package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ahj extends chj {

    /* JADX INFO: renamed from: a */
    public final lhj f15700a;

    /* JADX INFO: renamed from: b */
    public final String f15701b;

    /* JADX INFO: renamed from: c */
    public final b250 f15702c;

    public ahj(lhj lhjVar, String str, b250 b250Var) {
        this.f15700a = lhjVar;
        this.f15701b = str;
        this.f15702c = b250Var;
    }

    @Override // p204p.chj
    /* JADX INFO: renamed from: a */
    public final lhj mo25988a() {
        return this.f15700a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahj)) {
            return false;
        }
        ahj ahjVar = (ahj) obj;
        return wj50.m88271j(this.f15700a, ahjVar.f15700a) && wj50.m88271j(this.f15701b, ahjVar.f15701b) && wj50.m88271j(this.f15702c, ahjVar.f15702c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f15701b;
    }

    public final int hashCode() {
        return this.f15702c.hashCode() + s571.m77243b(this.f15700a.hashCode() * 31, 31, this.f15701b);
    }
}
