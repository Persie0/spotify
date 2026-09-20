package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p8r implements r8r {

    /* JADX INFO: renamed from: a */
    public final Integer f175020a;

    /* JADX INFO: renamed from: b */
    public final Integer f175021b;

    public p8r(Integer num, Integer num2) {
        this.f175020a = num;
        this.f175021b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8r)) {
            return false;
        }
        p8r p8rVar = (p8r) obj;
        return wj50.m88271j(this.f175020a, p8rVar.f175020a) && wj50.m88271j(this.f175021b, p8rVar.f175021b);
    }

    public final int hashCode() {
        Integer num = this.f175020a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f175021b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
