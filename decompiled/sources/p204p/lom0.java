package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lom0 implements n6d0 {

    /* JADX INFO: renamed from: a */
    public final List f135459a;

    /* JADX INFO: renamed from: b */
    public final int f135460b;

    /* JADX INFO: renamed from: c */
    public final int f135461c;

    /* JADX INFO: renamed from: d */
    public final int f135462d;

    /* JADX INFO: renamed from: e */
    public final vvl0 f135463e;

    /* JADX INFO: renamed from: f */
    public final int f135464f;

    /* JADX INFO: renamed from: g */
    public final int f135465g;

    /* JADX INFO: renamed from: h */
    public final int f135466h;

    /* JADX INFO: renamed from: i */
    public final s6d0 f135467i;

    /* JADX INFO: renamed from: j */
    public final s6d0 f135468j;

    /* JADX INFO: renamed from: k */
    public final float f135469k;

    /* JADX INFO: renamed from: l */
    public final int f135470l;

    /* JADX INFO: renamed from: m */
    public final boolean f135471m;

    /* JADX INFO: renamed from: n */
    public final fa31 f135472n;

    /* JADX INFO: renamed from: o */
    public final n6d0 f135473o;

    /* JADX INFO: renamed from: p */
    public final boolean f135474p;

    /* JADX INFO: renamed from: q */
    public final List f135475q;

    /* JADX INFO: renamed from: r */
    public final List f135476r;

    /* JADX INFO: renamed from: s */
    public final xuk f135477s;

    /* JADX INFO: renamed from: t */
    public final yqq f135478t;

    /* JADX INFO: renamed from: u */
    public final long f135479u;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ lom0(int i, int i2, int i3, vvl0 vvl0Var, int i4, int i5, int i6, fa31 fa31Var, n6d0 n6d0Var, xuk xukVar, yqq yqqVar, long j) {
        lau lauVar = lau.f131415a;
        this(lauVar, i, i2, i3, vvl0Var, i4, i5, i6, null, null, 0.0f, 0, false, fa31Var, n6d0Var, false, lauVar, lauVar, xukVar, yqqVar, j);
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: a */
    public final void mo27119a() {
        this.f135473o.mo27119a();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: b */
    public final int mo27120b() {
        return this.f135473o.mo27120b();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: c */
    public final Map mo27121c() {
        return this.f135473o.mo27121c();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: d */
    public final int mo27122d() {
        return this.f135473o.mo27122d();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: e */
    public final gh00 mo31376e() {
        return this.f135473o.mo31376e();
    }

    /* JADX INFO: renamed from: f */
    public final lom0 m59575f(int i) {
        int i2;
        int i3 = this.f135460b + this.f135461c;
        if (this.f135474p) {
            return null;
        }
        List list = this.f135459a;
        if (list.isEmpty() || this.f135467i == null || (i2 = this.f135470l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.f135469k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.f135468j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        s6d0 s6d0Var = (s6d0) g6f.m43741q0(list);
        s6d0 s6d0Var2 = (s6d0) g6f.m43687A0(list);
        int i4 = this.f135465g;
        int i5 = this.f135464f;
        if (i < 0) {
            if (Math.min((s6d0Var.f206095k + i3) - i5, (s6d0Var2.f206095k + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - s6d0Var.f206095k, i4 - s6d0Var2.f206095k) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((s6d0) list.get(i6)).m77324a(i);
        }
        List list2 = this.f135475q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((s6d0) list2.get(i7)).m77324a(i);
        }
        List list3 = this.f135476r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((s6d0) list3.get(i8)).m77324a(i);
        }
        return new lom0(this.f135459a, this.f135460b, this.f135461c, this.f135462d, this.f135463e, this.f135464f, this.f135465g, this.f135466h, this.f135467i, this.f135468j, f, i2, this.f135471m || i > 0, this.f135472n, this.f135473o, this.f135474p, this.f135475q, this.f135476r, this.f135477s, this.f135478t, this.f135479u);
    }

    /* JADX INFO: renamed from: g */
    public final long m59576g() {
        n6d0 n6d0Var = this.f135473o;
        return (((long) n6d0Var.mo27122d()) << 32) | (((long) n6d0Var.mo27120b()) & 4294967295L);
    }

    public lom0(List list, int i, int i2, int i3, vvl0 vvl0Var, int i4, int i5, int i6, s6d0 s6d0Var, s6d0 s6d0Var2, float f, int i7, boolean z, fa31 fa31Var, n6d0 n6d0Var, boolean z2, List list2, List list3, xuk xukVar, yqq yqqVar, long j) {
        this.f135459a = list;
        this.f135460b = i;
        this.f135461c = i2;
        this.f135462d = i3;
        this.f135463e = vvl0Var;
        this.f135464f = i4;
        this.f135465g = i5;
        this.f135466h = i6;
        this.f135467i = s6d0Var;
        this.f135468j = s6d0Var2;
        this.f135469k = f;
        this.f135470l = i7;
        this.f135471m = z;
        this.f135472n = fa31Var;
        this.f135473o = n6d0Var;
        this.f135474p = z2;
        this.f135475q = list2;
        this.f135476r = list3;
        this.f135477s = xukVar;
        this.f135478t = yqqVar;
        this.f135479u = j;
    }
}
