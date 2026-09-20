package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gad1 {

    /* JADX INFO: renamed from: a */
    public final jiu f78036a;

    /* JADX INFO: renamed from: b */
    public final jiu f78037b;

    /* JADX INFO: renamed from: c */
    public final jiu f78038c;

    /* JADX INFO: renamed from: d */
    public final n6f f78039d;

    public gad1(jiu jiuVar, jiu jiuVar2, jiu jiuVar3, n6f n6fVar) {
        this.f78036a = jiuVar;
        this.f78037b = jiuVar2;
        this.f78038c = jiuVar3;
        this.f78039d = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gad1)) {
            return false;
        }
        gad1 gad1Var = (gad1) obj;
        return wj50.m88271j(this.f78036a, gad1Var.f78036a) && wj50.m88271j(this.f78037b, gad1Var.f78037b) && wj50.m88271j(this.f78038c, gad1Var.f78038c) && wj50.m88271j(this.f78039d, gad1Var.f78039d);
    }

    public final int hashCode() {
        jiu jiuVar = this.f78036a;
        int iHashCode = (jiuVar == null ? 0 : jiuVar.hashCode()) * 31;
        jiu jiuVar2 = this.f78037b;
        int iHashCode2 = (iHashCode + (jiuVar2 == null ? 0 : jiuVar2.hashCode())) * 31;
        jiu jiuVar3 = this.f78038c;
        int iHashCode3 = (iHashCode2 + (jiuVar3 == null ? 0 : jiuVar3.hashCode())) * 31;
        n6f n6fVar = this.f78039d;
        return iHashCode3 + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
