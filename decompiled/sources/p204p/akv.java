package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class akv {

    /* JADX INFO: renamed from: a */
    public final fkv f16653a;

    /* JADX INFO: renamed from: b */
    public final yjv f16654b;

    /* JADX INFO: renamed from: c */
    public final dkv f16655c;

    /* JADX INFO: renamed from: d */
    public final ekv f16656d;

    /* JADX INFO: renamed from: e */
    public final aug1 f16657e;

    /* JADX INFO: renamed from: f */
    public final viv f16658f;

    /* JADX INFO: renamed from: g */
    public final yiv f16659g;

    /* JADX INFO: renamed from: h */
    public final zjv f16660h;

    /* JADX INFO: renamed from: i */
    public final int f16661i;

    /* JADX INFO: renamed from: j */
    public final oiv f16662j;

    /* JADX INFO: renamed from: k */
    public final ljv f16663k;

    /* JADX INFO: renamed from: l */
    public final njv f16664l;

    /* JADX INFO: renamed from: m */
    public final int f16665m;

    /* JADX INFO: renamed from: n */
    public final bjv f16666n;

    /* JADX INFO: renamed from: o */
    public final wg61 f16667o;

    public akv(fkv fkvVar, yjv yjvVar, dkv dkvVar, ekv ekvVar, aug1 aug1Var, viv vivVar, yiv yivVar, zjv zjvVar, int i, oiv oivVar, ljv ljvVar, njv njvVar, int i2, bjv bjvVar) {
        this.f16653a = fkvVar;
        this.f16654b = yjvVar;
        this.f16655c = dkvVar;
        this.f16656d = ekvVar;
        this.f16657e = aug1Var;
        this.f16658f = vivVar;
        this.f16659g = yivVar;
        this.f16660h = zjvVar;
        this.f16661i = i;
        this.f16662j = oivVar;
        this.f16663k = ljvVar;
        this.f16664l = njvVar;
        this.f16665m = i2;
        this.f16666n = bjvVar;
        this.f16667o = new wg61(new fts(this, 24));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akv)) {
            return false;
        }
        akv akvVar = (akv) obj;
        return wj50.m88271j(this.f16653a, akvVar.f16653a) && wj50.m88271j(this.f16654b, akvVar.f16654b) && wj50.m88271j(this.f16655c, akvVar.f16655c) && wj50.m88271j(this.f16656d, akvVar.f16656d) && wj50.m88271j(this.f16657e, akvVar.f16657e) && wj50.m88271j(this.f16658f, akvVar.f16658f) && wj50.m88271j(this.f16659g, akvVar.f16659g) && wj50.m88271j(this.f16660h, akvVar.f16660h) && this.f16661i == akvVar.f16661i && wj50.m88271j(this.f16662j, akvVar.f16662j) && wj50.m88271j(this.f16663k, akvVar.f16663k) && wj50.m88271j(this.f16664l, akvVar.f16664l) && this.f16665m == akvVar.f16665m && wj50.m88271j(this.f16666n, akvVar.f16666n);
    }

    public final int hashCode() {
        int iHashCode = this.f16653a.hashCode() * 31;
        yjv yjvVar = this.f16654b;
        int iHashCode2 = (iHashCode + (yjvVar == null ? 0 : yjvVar.hashCode())) * 31;
        dkv dkvVar = this.f16655c;
        int iHashCode3 = (iHashCode2 + (dkvVar == null ? 0 : dkvVar.hashCode())) * 31;
        ekv ekvVar = this.f16656d;
        int iHashCode4 = (iHashCode3 + (ekvVar == null ? 0 : ekvVar.hashCode())) * 31;
        aug1 aug1Var = this.f16657e;
        int iHashCode5 = (iHashCode4 + (aug1Var == null ? 0 : aug1Var.hashCode())) * 31;
        viv vivVar = this.f16658f;
        int iHashCode6 = (iHashCode5 + (vivVar == null ? 0 : vivVar.hashCode())) * 31;
        yiv yivVar = this.f16659g;
        int iHashCode7 = (iHashCode6 + (yivVar == null ? 0 : yivVar.hashCode())) * 31;
        zjv zjvVar = this.f16660h;
        int iM40938f = f710.m40938f(this.f16661i, (iHashCode7 + (zjvVar == null ? 0 : zjvVar.hashCode())) * 31, 31);
        oiv oivVar = this.f16662j;
        int iHashCode8 = (iM40938f + (oivVar == null ? 0 : oivVar.hashCode())) * 31;
        ljv ljvVar = this.f16663k;
        int iHashCode9 = (iHashCode8 + (ljvVar == null ? 0 : ljvVar.hashCode())) * 31;
        njv njvVar = this.f16664l;
        return this.f16666n.hashCode() + f710.m40938f(this.f16665m, (iHashCode9 + (njvVar != null ? njvVar.hashCode() : 0)) * 31, 31);
    }

    public /* synthetic */ akv(fkv fkvVar, yjv yjvVar, dkv dkvVar, ekv ekvVar, aug1 aug1Var, viv vivVar, zjv zjvVar, oiv oivVar, bjv bjvVar, int i) {
        this(fkvVar, yjvVar, (i & 4) != 0 ? null : dkvVar, ekvVar, (i & 16) != 0 ? null : aug1Var, (i & 32) != 0 ? null : vivVar, null, (i & 128) != 0 ? null : zjvVar, 4, (i & 512) != 0 ? null : oivVar, null, null, 3, (i & 8192) != 0 ? ziv.f283247a : bjvVar);
    }
}
