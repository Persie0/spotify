package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class dhb {

    /* JADX INFO: renamed from: a */
    public final j15 f49033a;

    /* JADX INFO: renamed from: b */
    public final n6f f49034b;

    /* JADX INFO: renamed from: c */
    public final j15 f49035c;

    /* JADX INFO: renamed from: d */
    public final n6f f49036d;

    /* JADX INFO: renamed from: e */
    public final j15 f49037e;

    /* JADX INFO: renamed from: f */
    public final n6f f49038f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f49039g;

    /* JADX INFO: renamed from: h */
    public final Long f49040h;

    /* JADX INFO: renamed from: i */
    public final Long f49041i;

    /* JADX INFO: renamed from: j */
    public final ejb f49042j;

    /* JADX INFO: renamed from: k */
    public final boolean f49043k;

    /* JADX INFO: renamed from: l */
    public final String f49044l;

    public dhb(j15 j15Var, n6f n6fVar, j15 j15Var2, n6f n6fVar2, j15 j15Var3, n6f n6fVar3, ArrayList arrayList, Long l, Long l2, ejb ejbVar, boolean z, String str) {
        this.f49033a = j15Var;
        this.f49034b = n6fVar;
        this.f49035c = j15Var2;
        this.f49036d = n6fVar2;
        this.f49037e = j15Var3;
        this.f49038f = n6fVar3;
        this.f49039g = arrayList;
        this.f49040h = l;
        this.f49041i = l2;
        this.f49042j = ejbVar;
        this.f49043k = z;
        this.f49044l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhb)) {
            return false;
        }
        dhb dhbVar = (dhb) obj;
        return wj50.m88271j(this.f49033a, dhbVar.f49033a) && wj50.m88271j(this.f49034b, dhbVar.f49034b) && wj50.m88271j(this.f49035c, dhbVar.f49035c) && wj50.m88271j(this.f49036d, dhbVar.f49036d) && wj50.m88271j(this.f49037e, dhbVar.f49037e) && wj50.m88271j(this.f49038f, dhbVar.f49038f) && this.f49039g.equals(dhbVar.f49039g) && wj50.m88271j(this.f49040h, dhbVar.f49040h) && wj50.m88271j(this.f49041i, dhbVar.f49041i) && wj50.m88271j(this.f49042j, dhbVar.f49042j) && this.f49043k == dhbVar.f49043k && this.f49044l.equals(dhbVar.f49044l);
    }

    public final int hashCode() {
        int iHashCode = this.f49033a.hashCode() * 31;
        n6f n6fVar = this.f49034b;
        int iHashCode2 = (this.f49035c.hashCode() + ((iHashCode + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31)) * 31;
        n6f n6fVar2 = this.f49036d;
        int iHashCode3 = (this.f49037e.hashCode() + ((iHashCode2 + (n6fVar2 == null ? 0 : Long.hashCode(n6fVar2.f150873a))) * 31)) * 31;
        n6f n6fVar3 = this.f49038f;
        int iM59700f = lq51.m59700f(this.f49039g, (iHashCode3 + (n6fVar3 == null ? 0 : Long.hashCode(n6fVar3.f150873a))) * 31, 31);
        Long l = this.f49040h;
        int iHashCode4 = (iM59700f + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f49041i;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ejb ejbVar = this.f49042j;
        return this.f49044l.hashCode() + s571.m77245d((iHashCode5 + (ejbVar != null ? ejbVar.hashCode() : 0)) * 31, 31, this.f49043k);
    }
}
