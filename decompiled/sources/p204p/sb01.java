package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class sb01 {

    /* JADX INFO: renamed from: a */
    public final wwu f207311a;

    /* JADX INFO: renamed from: b */
    public final p1x0 f207312b;

    /* JADX INFO: renamed from: c */
    public final agy f207313c;

    /* JADX INFO: renamed from: d */
    public final List f207314d;

    /* JADX INFO: renamed from: e */
    public final List f207315e;

    public sb01(wwu wwuVar, p1x0 p1x0Var, agy agyVar, List list, List list2) {
        this.f207311a = wwuVar;
        this.f207312b = p1x0Var;
        this.f207313c = agyVar;
        this.f207314d = list;
        this.f207315e = list2;
    }

    /* JADX INFO: renamed from: a */
    public final agy m77703a() {
        return this.f207313c;
    }

    /* JADX INFO: renamed from: b */
    public final njg1 m77704b() {
        return this.f207312b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb01)) {
            return false;
        }
        sb01 sb01Var = (sb01) obj;
        return wj50.m88271j(this.f207311a, sb01Var.f207311a) && wj50.m88271j(this.f207312b, sb01Var.f207312b) && wj50.m88271j(this.f207313c, sb01Var.f207313c) && wj50.m88271j(this.f207314d, sb01Var.f207314d) && wj50.m88271j(this.f207315e, sb01Var.f207315e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f207312b.f173185c, this.f207311a.hashCode() * 31, 31);
        agy agyVar = this.f207313c;
        return this.f207315e.hashCode() + s571.m77244c((iM62800g + (agyVar == null ? 0 : agyVar.hashCode())) * 31, 31, this.f207314d);
    }

    public /* synthetic */ sb01(wwu wwuVar, p1x0 p1x0Var, List list, List list2, int i) {
        this(wwuVar, p1x0Var, (agy) null, list, (i & 16) != 0 ? lau.f131415a : list2);
    }
}
