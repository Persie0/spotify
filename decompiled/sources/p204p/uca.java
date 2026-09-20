package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class uca implements rr1 {

    /* JADX INFO: renamed from: a */
    public final pfm0 f228977a;

    /* JADX INFO: renamed from: b */
    public final tl4 f228978b;

    /* JADX INFO: renamed from: c */
    public final phn0 f228979c;

    /* JADX INFO: renamed from: d */
    public final Resources f228980d;

    /* JADX INFO: renamed from: e */
    public final qr1 f228981e;

    /* JADX INFO: renamed from: f */
    public final int f228982f;

    /* JADX INFO: renamed from: g */
    public fda f228983g;

    /* JADX INFO: renamed from: h */
    public boolean f228984h;

    public uca(pfm0 pfm0Var, fda fdaVar, tl4 tl4Var, phn0 phn0Var, Resources resources, qr1 qr1Var) {
        this.f228977a = pfm0Var;
        this.f228978b = tl4Var;
        this.f228979c = phn0Var;
        this.f228980d = resources;
        this.f228981e = qr1Var;
        this.f228982f = resources.getDisplayMetrics().heightPixels;
        this.f228983g = fdaVar;
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: a */
    public final void mo63695a() {
        this.f228984h = true;
        fda fdaVarM41363a = fda.m41363a(this.f228983g, null, null, 0, false, true, 1791);
        this.f228983g = fdaVarM41363a;
        this.f228977a.m69810a(fdaVarM41363a);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    @Override // p204p.rr1
    /* JADX INFO: renamed from: b */
    public final int mo27506b(tca tcaVar) {
        char c;
        if (this.f228981e.f191700i) {
            c = 1;
        } else {
            if (ohn0.f165511a[((tl4) this.f228979c.f177692b).m81039i().ordinal()] == 1) {
                c = 2;
            } else {
                c = 1;
            }
        }
        int iM68215h = c == 2 ? oxg1.m68215h(tcaVar, this.f228980d.getDisplayMetrics().heightPixels, this.f228978b.m81037g()) : 0;
        int i = this.f228982f;
        boolean z = c == 1 || (c == 2 && (tcaVar.f219048a + tcaVar.f219051d) + tcaVar.f219053f >= ((int) (((double) i) * 0.5d)));
        if (z) {
            iM68215h = i;
        }
        fda fdaVarM41363a = fda.m41363a(this.f228983g, Integer.valueOf(iM68215h), z ? bda.f26062b : bda.f26061a, z ? 1 : 2, false, this.f228984h || z, 1780);
        this.f228983g = fdaVarM41363a;
        this.f228977a.m69810a(fdaVarM41363a);
        return iM68215h;
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: c */
    public final boolean mo27507c() {
        Integer num = this.f228983g.f68403a;
        return (num != null ? num.intValue() : 0) < this.f228982f;
    }
}
