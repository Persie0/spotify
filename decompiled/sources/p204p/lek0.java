package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lek0 implements nek0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f132596a;

    /* JADX INFO: renamed from: b */
    public final Integer f132597b;

    public lek0(lwb0 lwb0Var, Integer num) {
        this.f132596a = lwb0Var;
        this.f132597b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lek0)) {
            return false;
        }
        lek0 lek0Var = (lek0) obj;
        return wj50.m88271j(this.f132596a, lek0Var.f132596a) && wj50.m88271j(this.f132597b, lek0Var.f132597b);
    }

    public final int hashCode() {
        eh00 eh00Var = this.f132596a;
        int iHashCode = (eh00Var == null ? 0 : eh00Var.hashCode()) * 31;
        Integer num = this.f132597b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
