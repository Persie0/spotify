package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class t0r0 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean f215961X;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f215962a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h2r0 f215963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f215964c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f215965d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f215966e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ eh00 f215967f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f215968g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f215969h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f215970i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ gh00 f215971t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0r0(List list, h2r0 h2r0Var, boolean z, gh00 gh00Var, kqi0 kqi0Var, eh00 eh00Var, boolean z2, List list2, boolean z3, gh00 gh00Var2, boolean z4) {
        super(3);
        this.f215962a = list;
        this.f215963b = h2r0Var;
        this.f215964c = z;
        this.f215965d = gh00Var;
        this.f215966e = kqi0Var;
        this.f215967f = eh00Var;
        this.f215968g = z2;
        this.f215969h = list2;
        this.f215970i = z3;
        this.f215971t = gh00Var2;
        this.f215961X = z4;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        xq00 xq00Var = (xq00) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        ia7 ia7Var = t6x0.f217647t;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= xq00Var.m91762e(iIntValue) ? 4 : 2;
        }
        if (xq00Var.m91752Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            h2r0 h2r0Var = (h2r0) this.f215962a.get(iIntValue);
            xq00Var.m91771i0(658855515);
            boolean zM88271j = wj50.m88271j(this.f215963b, h2r0Var);
            boolean z2 = (h2r0Var instanceof e2r0) && this.f215964c && zM88271j;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("mixing_preset_id_type_" + h2r0Var + "_" + zM88271j, cxh0Var);
            fyf fyfVarM75772x = rkk.m75772x(597400197, new qwo0(h2r0Var, 16), xq00Var);
            gh00 gh00Var = this.f215965d;
            if (z2) {
                xq00Var.m91771i0(659503879);
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
                soh.f211194A.getClass();
                C2087le c2087le = roh.f201257b;
                if (xq00Var.f264811a == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                qju qjuVar = new qju(8);
                boolean zM91766g = xq00Var.m91766g(gh00Var) | xq00Var.m91766g(h2r0Var);
                Object objM91750T = xq00Var.m91750T();
                if (zM91766g || objM91750T == ia7Var) {
                    objM91750T = new uvp0(12, gh00Var, h2r0Var);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00 eh00Var = (eh00) objM91750T;
                Object objM91750T2 = xq00Var.m91750T();
                kqi0 kqi0Var = this.f215966e;
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = new ftf0(kqi0Var, 17);
                    xq00Var.m91793t0(objM91750T2);
                }
                emk.m39434c(zM88271j, eh00Var, (eh00) objM91750T2, qjuVar, fxh0VarM39673I, null, fyfVarM75772x, xq00Var, 1573248);
                boolean zBooleanValue = ((Boolean) kqi0Var.getValue()).booleanValue();
                Object objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == ia7Var) {
                    objM91750T3 = new ftf0(kqi0Var, 18);
                    xq00Var.m91793t0(objM91750T3);
                }
                lh4.m58945a(zBooleanValue, (eh00) objM91750T3, epv0.m39673I("mixing_auto_options_dropdown", cxh0Var), 0L, null, null, null, 0L, 0.0f, 0.0f, rkk.m75772x(1788488758, new s0r0(this.f215967f, this.f215968g, this.f215969h, this.f215970i, this.f215971t, this.f215961X, this.f215966e), xq00Var), xq00Var, 432, 2040);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
                z = false;
            } else {
                z = false;
                xq00Var.m91771i0(662862574);
                qju qjuVar2 = new qju(8);
                boolean zM91766g2 = xq00Var.m91766g(gh00Var) | xq00Var.m91766g(h2r0Var);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91766g2 || objM91750T4 == ia7Var) {
                    objM91750T4 = new guq0(3, gh00Var, h2r0Var);
                    xq00Var.m91793t0(objM91750T4);
                }
                emk.m39432a(zM88271j, (gh00) objM91750T4, qjuVar2, fxh0VarM39673I, null, fyfVarM75772x, xq00Var, 196608);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(z);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }
}
