package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wxz0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f256161a;

    /* JADX INFO: renamed from: b */
    public final Double f256162b;

    /* JADX INFO: renamed from: c */
    public final Integer f256163c;

    /* JADX INFO: renamed from: d */
    public final Integer f256164d;

    /* JADX INFO: renamed from: e */
    public final Long f256165e;

    public wxz0(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f256161a = bool;
        this.f256162b = d;
        this.f256163c = num;
        this.f256164d = num2;
        this.f256165e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxz0)) {
            return false;
        }
        wxz0 wxz0Var = (wxz0) obj;
        return wj50.m88271j(this.f256161a, wxz0Var.f256161a) && wj50.m88271j(this.f256162b, wxz0Var.f256162b) && wj50.m88271j(this.f256163c, wxz0Var.f256163c) && wj50.m88271j(this.f256164d, wxz0Var.f256164d) && wj50.m88271j(this.f256165e, wxz0Var.f256165e);
    }

    public final int hashCode() {
        Boolean bool = this.f256161a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f256162b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f256163c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f256164d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f256165e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f256161a + ", sessionSamplingRate=" + this.f256162b + ", sessionRestartTimeout=" + this.f256163c + ", cacheDuration=" + this.f256164d + ", cacheUpdatedTime=" + this.f256165e + ')';
    }
}
