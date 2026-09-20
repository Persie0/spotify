package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ock {

    /* JADX INFO: renamed from: a */
    public final String f163937a;

    /* JADX INFO: renamed from: b */
    public final pwb f163938b;

    /* JADX INFO: renamed from: c */
    public final hra f163939c;

    /* JADX INFO: renamed from: d */
    public final String f163940d;

    /* JADX INFO: renamed from: e */
    public final Long f163941e;

    /* JADX INFO: renamed from: f */
    public final Long f163942f;

    /* JADX INFO: renamed from: g */
    public final yik f163943g;

    public ock(String str, pwb pwbVar, hra hraVar, String str2, Long l, Long l2, yik yikVar) {
        this.f163937a = str;
        this.f163938b = pwbVar;
        this.f163939c = hraVar;
        this.f163940d = str2;
        this.f163941e = l;
        this.f163942f = l2;
        this.f163943g = yikVar;
    }

    /* JADX INFO: renamed from: a */
    public final Long m66717a() {
        return this.f163941e;
    }

    /* JADX INFO: renamed from: b */
    public final String m66718b() {
        return this.f163940d;
    }

    /* JADX INFO: renamed from: c */
    public final hra m66719c() {
        return this.f163939c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ock)) {
            return false;
        }
        ock ockVar = (ock) obj;
        return wj50.m88271j(this.f163937a, ockVar.f163937a) && wj50.m88271j(this.f163938b, ockVar.f163938b) && wj50.m88271j(this.f163939c, ockVar.f163939c) && wj50.m88271j(this.f163940d, ockVar.f163940d) && wj50.m88271j(this.f163941e, ockVar.f163941e) && wj50.m88271j(this.f163942f, ockVar.f163942f) && this.f163943g == ockVar.f163943g;
    }

    public final int hashCode() {
        int iHashCode = (this.f163939c.hashCode() + ((this.f163938b.hashCode() + (this.f163937a.hashCode() * 31)) * 31)) * 31;
        String str = this.f163940d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f163941e;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f163942f;
        return this.f163943g.hashCode() + ((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }
}
