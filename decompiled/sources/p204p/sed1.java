package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sed1 {

    /* JADX INFO: renamed from: a */
    public final jiu f208278a;

    /* JADX INFO: renamed from: b */
    public final jiu f208279b;

    /* JADX INFO: renamed from: c */
    public final jiu f208280c;

    /* JADX INFO: renamed from: d */
    public final n6f f208281d;

    public sed1(jiu jiuVar, jiu jiuVar2, jiu jiuVar3, n6f n6fVar) {
        this.f208278a = jiuVar;
        this.f208279b = jiuVar2;
        this.f208280c = jiuVar3;
        this.f208281d = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sed1)) {
            return false;
        }
        sed1 sed1Var = (sed1) obj;
        return wj50.m88271j(this.f208278a, sed1Var.f208278a) && wj50.m88271j(this.f208279b, sed1Var.f208279b) && wj50.m88271j(this.f208280c, sed1Var.f208280c) && wj50.m88271j(this.f208281d, sed1Var.f208281d);
    }

    public final int hashCode() {
        jiu jiuVar = this.f208278a;
        int iHashCode = (jiuVar == null ? 0 : jiuVar.hashCode()) * 31;
        jiu jiuVar2 = this.f208279b;
        int iHashCode2 = (iHashCode + (jiuVar2 == null ? 0 : jiuVar2.hashCode())) * 31;
        jiu jiuVar3 = this.f208280c;
        int iHashCode3 = (iHashCode2 + (jiuVar3 == null ? 0 : jiuVar3.hashCode())) * 31;
        n6f n6fVar = this.f208281d;
        return iHashCode3 + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
