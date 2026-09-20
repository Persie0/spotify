package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lqe1 {

    /* JADX INFO: renamed from: a */
    public final b7z f136031a;

    /* JADX INFO: renamed from: b */
    public final Integer f136032b;

    /* JADX INFO: renamed from: c */
    public final ibj f136033c;

    public lqe1(b7z b7zVar, Integer num, ibj ibjVar) {
        this.f136031a = b7zVar;
        this.f136032b = num;
        this.f136033c = ibjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqe1)) {
            return false;
        }
        lqe1 lqe1Var = (lqe1) obj;
        return wj50.m88271j(this.f136031a, lqe1Var.f136031a) && wj50.m88271j(this.f136032b, lqe1Var.f136032b) && wj50.m88271j(this.f136033c, lqe1Var.f136033c);
    }

    public final int hashCode() {
        int iHashCode = this.f136031a.hashCode() * 31;
        Integer num = this.f136032b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ibj ibjVar = this.f136033c;
        return iHashCode2 + (ibjVar != null ? ibjVar.hashCode() : 0);
    }
}
