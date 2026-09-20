package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dau0 implements fau0 {

    /* JADX INFO: renamed from: a */
    public final Integer f47108a;

    /* JADX INFO: renamed from: b */
    public final Double f47109b;

    /* JADX INFO: renamed from: c */
    public final Long f47110c;

    /* JADX INFO: renamed from: d */
    public final Boolean f47111d;

    public /* synthetic */ dau0(Double d, Long l, Boolean bool, int i) {
        this((Integer) null, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : l, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dau0)) {
            return false;
        }
        dau0 dau0Var = (dau0) obj;
        return wj50.m88271j(this.f47108a, dau0Var.f47108a) && wj50.m88271j(this.f47109b, dau0Var.f47109b) && wj50.m88271j(this.f47110c, dau0Var.f47110c) && wj50.m88271j(this.f47111d, dau0Var.f47111d);
    }

    public final int hashCode() {
        Integer num = this.f47108a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.f47109b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.f47110c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.f47111d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public dau0(Integer num, Double d, Long l, Boolean bool) {
        this.f47108a = num;
        this.f47109b = d;
        this.f47110c = l;
        this.f47111d = bool;
    }
}
