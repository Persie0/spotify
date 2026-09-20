package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wd01 {

    /* JADX INFO: renamed from: a */
    public final wwu f250176a;

    /* JADX INFO: renamed from: b */
    public final Integer f250177b;

    /* JADX INFO: renamed from: c */
    public final String f250178c;

    /* JADX INFO: renamed from: d */
    public final Integer f250179d;

    /* JADX INFO: renamed from: e */
    public final vd01 f250180e;

    public wd01(wwu wwuVar, Integer num, String str, Integer num2, vd01 vd01Var, int i) {
        num = (i & 2) != 0 ? null : num;
        str = (i & 4) != 0 ? null : str;
        this.f250176a = wwuVar;
        this.f250177b = num;
        this.f250178c = str;
        this.f250179d = num2;
        this.f250180e = vd01Var;
        lmg1.m59448s(new Object[]{num, str}, n701.f151013X);
        lmg1.m59447r(new Object[]{num2, null}, n701.f151015Y);
    }

    /* JADX INFO: renamed from: a */
    public final vd01 m87809a() {
        return this.f250180e;
    }

    /* JADX INFO: renamed from: b */
    public final wwu m87810b() {
        return this.f250176a;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m87811c() {
        return this.f250179d;
    }

    /* JADX INFO: renamed from: d */
    public final String m87812d() {
        return this.f250178c;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m87813e() {
        return this.f250177b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd01)) {
            return false;
        }
        wd01 wd01Var = (wd01) obj;
        return wj50.m88271j(this.f250176a, wd01Var.f250176a) && wj50.m88271j(this.f250177b, wd01Var.f250177b) && wj50.m88271j(this.f250178c, wd01Var.f250178c) && wj50.m88271j(this.f250179d, wd01Var.f250179d) && this.f250180e.equals(wd01Var.f250180e);
    }

    public final int hashCode() {
        int iHashCode = this.f250176a.hashCode() * 31;
        Integer num = this.f250177b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f250178c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f250179d;
        return this.f250180e.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 961);
    }
}
