package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class gn41 implements na01 {

    /* JADX INFO: renamed from: b */
    public final String f81562b;

    /* JADX INFO: renamed from: c */
    public final Integer f81563c;

    /* JADX INFO: renamed from: d */
    public final Integer f81564d;

    /* JADX INFO: renamed from: e */
    public final yxf f81565e;

    /* JADX INFO: renamed from: f */
    public final Integer f81566f;

    /* JADX INFO: renamed from: g */
    public final xxf f81567g;

    /* JADX INFO: renamed from: h */
    public final fiz f81568h;

    /* JADX INFO: renamed from: i */
    public final g3e f81569i;

    /* JADX INFO: renamed from: j */
    public final fiz f81570j;

    /* JADX INFO: renamed from: k */
    public final fn41 f81571k;

    /* JADX INFO: renamed from: l */
    public final Map f81572l;

    public gn41(String str, Integer num, Integer num2, z9t z9tVar, Integer num3, xxf xxfVar, fiz fizVar, g3e g3eVar, fiz fizVar2, fn41 fn41Var, Map map, int i) {
        num2 = (i & 16) != 0 ? null : num2;
        z9tVar = (i & 64) != 0 ? null : z9tVar;
        num3 = (i & 128) != 0 ? null : num3;
        xxfVar = (i & 512) != 0 ? null : xxfVar;
        if ((i & 1024) != 0) {
            na01.f151903a.getClass();
            fizVar = jxq0.f117175L0;
        }
        fizVar2 = (i & 4096) != 0 ? new ysk(rdu.f198207a, 27) : fizVar2;
        map = (i & 16384) != 0 ? nau.f152117a : map;
        this.f81562b = str;
        this.f81563c = num;
        this.f81564d = num2;
        this.f81565e = z9tVar;
        this.f81566f = num3;
        this.f81567g = xxfVar;
        this.f81568h = fizVar;
        this.f81569i = g3eVar;
        this.f81570j = fizVar2;
        this.f81571k = fn41Var;
        this.f81572l = map;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty ID must be provided.");
        }
        lmg1.m59448s(new Object[]{num, null}, st31.f213774N0);
        lmg1.m59447r(new Object[]{num2, null, z9tVar}, st31.f213775O0);
        lmg1.m59447r(new Object[]{null, num3, xxfVar}, st31.f213776P0);
    }

    @Override // p204p.na01
    /* JADX INFO: renamed from: a */
    public final g3e mo45291a() {
        return this.f81569i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn41)) {
            return false;
        }
        gn41 gn41Var = (gn41) obj;
        return wj50.m88271j(this.f81562b, gn41Var.f81562b) && wj50.m88271j(this.f81563c, gn41Var.f81563c) && wj50.m88271j(this.f81564d, gn41Var.f81564d) && wj50.m88271j(this.f81565e, gn41Var.f81565e) && wj50.m88271j(this.f81566f, gn41Var.f81566f) && wj50.m88271j(this.f81567g, gn41Var.f81567g) && wj50.m88271j(this.f81568h, gn41Var.f81568h) && wj50.m88271j(this.f81569i, gn41Var.f81569i) && wj50.m88271j(this.f81570j, gn41Var.f81570j) && wj50.m88271j(this.f81571k, gn41Var.f81571k) && wj50.m88271j(this.f81572l, gn41Var.f81572l);
    }

    @Override // p204p.na01
    public final String getId() {
        return this.f81562b;
    }

    public final int hashCode() {
        int iHashCode = this.f81562b.hashCode() * 961;
        Integer num = this.f81563c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Integer num2 = this.f81564d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
        yxf yxfVar = this.f81565e;
        int iHashCode4 = (iHashCode3 + (yxfVar == null ? 0 : yxfVar.hashCode())) * 31;
        Integer num3 = this.f81566f;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 961;
        xxf xxfVar = this.f81567g;
        return this.f81572l.hashCode() + ((this.f81571k.hashCode() + ((this.f81570j.hashCode() + ((this.f81569i.hashCode() + ((this.f81568h.hashCode() + ((iHashCode5 + (xxfVar != null ? xxfVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p204p.na01
    public final fiz isVisible() {
        return this.f81568h;
    }
}
