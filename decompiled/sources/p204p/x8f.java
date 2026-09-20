package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x8f {

    /* JADX INFO: renamed from: a */
    public final jiu f259137a;

    /* JADX INFO: renamed from: b */
    public final jiu f259138b;

    /* JADX INFO: renamed from: c */
    public final jiu f259139c;

    /* JADX INFO: renamed from: d */
    public final n6f f259140d;

    public x8f(jiu jiuVar, jiu jiuVar2, jiu jiuVar3, n6f n6fVar) {
        this.f259137a = jiuVar;
        this.f259138b = jiuVar2;
        this.f259139c = jiuVar3;
        this.f259140d = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8f)) {
            return false;
        }
        x8f x8fVar = (x8f) obj;
        return wj50.m88271j(this.f259137a, x8fVar.f259137a) && wj50.m88271j(this.f259138b, x8fVar.f259138b) && wj50.m88271j(this.f259139c, x8fVar.f259139c) && wj50.m88271j(this.f259140d, x8fVar.f259140d);
    }

    public final int hashCode() {
        jiu jiuVar = this.f259137a;
        int iHashCode = (jiuVar == null ? 0 : jiuVar.hashCode()) * 31;
        jiu jiuVar2 = this.f259138b;
        int iHashCode2 = (iHashCode + (jiuVar2 == null ? 0 : jiuVar2.hashCode())) * 31;
        jiu jiuVar3 = this.f259139c;
        int iHashCode3 = (iHashCode2 + (jiuVar3 == null ? 0 : jiuVar3.hashCode())) * 31;
        n6f n6fVar = this.f259140d;
        return iHashCode3 + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
