package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qsl {

    /* JADX INFO: renamed from: a */
    public final ktl f192148a;

    /* JADX INFO: renamed from: b */
    public final v140 f192149b;

    public qsl(ktl ktlVar, v140 v140Var) {
        this.f192148a = ktlVar;
        this.f192149b = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsl)) {
            return false;
        }
        qsl qslVar = (qsl) obj;
        return wj50.m88271j(this.f192148a, qslVar.f192148a) && wj50.m88271j(this.f192149b, qslVar.f192149b);
    }

    public final int hashCode() {
        int iHashCode = this.f192148a.hashCode() * 31;
        v140 v140Var = this.f192149b;
        return iHashCode + (v140Var == null ? 0 : v140Var.hashCode());
    }
}
