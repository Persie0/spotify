package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o1y {

    /* JADX INFO: renamed from: a */
    public final q9t f160881a;

    /* JADX INFO: renamed from: b */
    public final Integer f160882b;

    public o1y(q9t q9tVar, Integer num) {
        this.f160881a = q9tVar;
        this.f160882b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1y)) {
            return false;
        }
        o1y o1yVar = (o1y) obj;
        return wj50.m88271j(this.f160881a, o1yVar.f160881a) && wj50.m88271j(this.f160882b, o1yVar.f160882b);
    }

    public final int hashCode() {
        int iHashCode = this.f160881a.hashCode() * 31;
        Integer num = this.f160882b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
