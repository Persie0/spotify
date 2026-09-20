package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zh20 implements ci20 {

    /* JADX INFO: renamed from: a */
    public final boolean f282782a;

    /* JADX INFO: renamed from: b */
    public final Integer f282783b;

    /* JADX INFO: renamed from: c */
    public final Double f282784c;

    /* JADX INFO: renamed from: d */
    public final Long f282785d;

    /* JADX INFO: renamed from: e */
    public final Boolean f282786e;

    public /* synthetic */ zh20(Double d, Long l) {
        this(false, null, d, l, Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh20)) {
            return false;
        }
        zh20 zh20Var = (zh20) obj;
        return this.f282782a == zh20Var.f282782a && wj50.m88271j(this.f282783b, zh20Var.f282783b) && wj50.m88271j(this.f282784c, zh20Var.f282784c) && wj50.m88271j(this.f282785d, zh20Var.f282785d) && wj50.m88271j(this.f282786e, zh20Var.f282786e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f282782a) * 31;
        Integer num = this.f282783b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.f282784c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.f282785d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.f282786e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public zh20(boolean z, Integer num, Double d, Long l, Boolean bool) {
        this.f282782a = z;
        this.f282783b = num;
        this.f282784c = d;
        this.f282785d = l;
        this.f282786e = bool;
    }
}
