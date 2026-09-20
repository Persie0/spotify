package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public final class aee1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aee1(int i, Object obj, Object obj2) {
        super(0);
        this.f14856a = i;
        this.f14857b = obj;
        this.f14858c = obj2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f14856a) {
            case 0:
                r7e1 r7e1Var = ((bee1) this.f14857b).f26341a;
                q2c q2cVar = (q2c) this.f14858c;
                luk lukVarM94576x = ysr.m94576x();
                jy3 jy3Var = new jy3(false, (bji) r7e1Var.f196507a);
                m011 m011Var = (m011) r7e1Var.f196508b;
                jg31.m53271i(m011Var);
                dq51 dq51Var = (dq51) r7e1Var.f196510d;
                hc80 hc80Var = (hc80) ((Activity) r7e1Var.f196516j);
                pzs0 pzs0Var = (pzs0) r7e1Var.f196511e;
                y0i0 y0i0Var = (y0i0) r7e1Var.f196512f;
                gu6 gu6Var = new gu6(lukVarM94576x, jy3Var, m011Var, q2cVar, dq51Var, hc80Var, pzs0Var, y0i0Var, (xre) r7e1Var.f196513g);
                oix0 oix0Var = (oix0) r7e1Var.f196509c;
                leh0 leh0Var = (leh0) r7e1Var.f196514h;
                jg31.m53271i(leh0Var);
                return new cjc0(new ew6(gu6Var, new h1l0(oix0Var, leh0Var, (kv91) r7e1Var.f196515i, y0i0Var)), ube1.f228731f);
            case 1:
                if (((yle1) this.f14857b).f274005a.m47160g()) {
                    return new xzo(((eju) this.f14858c).f60295c.f49744b, 26);
                }
                return null;
            default:
                int[] iArr = (int[]) this.f14857b;
                int i = iArr[0];
                bsa bsaVar = ((zs70) this.f14858c).f285863d;
                boolean z = i == ((vum0) bsaVar.f30267c).m86437v() ? iArr[1] > ((vum0) bsaVar.f30268d).m86437v() : iArr[0] > ((vum0) bsaVar.f30267c).m86437v();
                iArr[0] = ((vum0) bsaVar.f30267c).m86437v();
                iArr[1] = ((vum0) bsaVar.f30268d).m86437v();
                return Boolean.valueOf(z);
        }
    }
}
