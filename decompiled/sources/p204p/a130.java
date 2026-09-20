package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a130 extends f130 {

    /* JADX INFO: renamed from: d */
    public final int f11294d;

    /* JADX INFO: renamed from: e */
    public final long f11295e;

    /* JADX INFO: renamed from: f */
    public final boolean f11296f;

    /* JADX INFO: renamed from: g */
    public final boolean f11297g;

    /* JADX INFO: renamed from: h */
    public final long f11298h;

    /* JADX INFO: renamed from: i */
    public final boolean f11299i;

    /* JADX INFO: renamed from: j */
    public final int f11300j;

    /* JADX INFO: renamed from: k */
    public final long f11301k;

    /* JADX INFO: renamed from: l */
    public final int f11302l;

    /* JADX INFO: renamed from: m */
    public final long f11303m;

    /* JADX INFO: renamed from: n */
    public final long f11304n;

    /* JADX INFO: renamed from: o */
    public final boolean f11305o;

    /* JADX INFO: renamed from: p */
    public final boolean f11306p;

    /* JADX INFO: renamed from: q */
    public final ahs f11307q;

    /* JADX INFO: renamed from: r */
    public final pf40 f11308r;

    /* JADX INFO: renamed from: s */
    public final pf40 f11309s;

    /* JADX INFO: renamed from: t */
    public final xf40 f11310t;

    /* JADX INFO: renamed from: u */
    public final long f11311u;

    /* JADX INFO: renamed from: v */
    public final z030 f11312v;

    /* JADX INFO: renamed from: w */
    public final pf40 f11313w;

    /* JADX INFO: renamed from: x */
    public final x030 f11314x;

    public a130(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, ahs ahsVar, List list2, List list3, z030 z030Var, Map map, List list4, x030 x030Var) {
        super(str, list, z3);
        this.f11294d = i;
        this.f11298h = j2;
        this.f11297g = z;
        this.f11299i = z2;
        this.f11300j = i2;
        this.f11301k = j3;
        this.f11302l = i3;
        this.f11303m = j4;
        this.f11304n = j5;
        this.f11305o = z4;
        this.f11306p = z5;
        this.f11307q = ahsVar;
        this.f11308r = pf40.m69791p(list2);
        this.f11309s = pf40.m69791p(list3);
        this.f11310t = xf40.m90451c(map);
        this.f11313w = pf40.m69791p(list4);
        this.f11314x = x030Var;
        if (!list3.isEmpty()) {
            v030 v030Var = (v030) nhg1.m64500t(list3);
            this.f11311u = v030Var.f267883e + v030Var.f267881c;
        } else if (list2.isEmpty()) {
            this.f11311u = 0L;
        } else {
            x030 x030Var2 = (x030) nhg1.m64500t(list2);
            this.f11311u = x030Var2.f267883e + x030Var2.f267881c;
        }
        this.f11295e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.f11311u, j) : Math.max(0L, this.f11311u + j) : -9223372036854775807L;
        this.f11296f = j >= 0;
        this.f11312v = z030Var;
    }

    @Override // p204p.x6z
    /* JADX INFO: renamed from: a */
    public final Object mo24415a(List list) {
        return this;
    }
}
