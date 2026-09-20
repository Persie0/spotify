package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class slb1 implements jlb1 {

    /* JADX INFO: renamed from: X */
    public final fu3 f210361X;

    /* JADX INFO: renamed from: Y */
    public final i5x f210362Y;

    /* JADX INFO: renamed from: Z */
    public final cph f210363Z;

    /* JADX INFO: renamed from: a */
    public final ao0 f210364a;

    /* JADX INFO: renamed from: b */
    public final gu3 f210365b;

    /* JADX INFO: renamed from: c */
    public final pb80 f210366c;

    /* JADX INFO: renamed from: d */
    public final flb1 f210367d;

    /* JADX INFO: renamed from: e */
    public final lt0 f210368e;

    /* JADX INFO: renamed from: f */
    public final e940 f210369f;

    /* JADX INFO: renamed from: g */
    public final boolean f210370g;

    /* JADX INFO: renamed from: h */
    public final lt0 f210371h;

    /* JADX INFO: renamed from: i */
    public final ogq f210372i;

    /* JADX INFO: renamed from: t */
    public final mmh0 f210373t;

    public slb1(ymb1 ymb1Var, ajn ajnVar, dkn dknVar, ao0 ao0Var, bjn bjnVar, gt0 gt0Var, gu3 gu3Var, pb80 pb80Var, flb1 flb1Var, lt0 lt0Var, e940 e940Var) {
        dkb1 dkb1Var;
        this.f210364a = ao0Var;
        this.f210365b = gu3Var;
        this.f210366c = pb80Var;
        this.f210367d = flb1Var;
        this.f210368e = lt0Var;
        this.f210369f = e940Var;
        elb1 elb1Var = flb1Var.f70747c;
        this.f210370g = elb1Var != elb1.f60682d;
        lt0 lt0Var2 = flb1Var.f70751g;
        this.f210371h = lt0Var2 == null ? lt0Var : lt0Var2;
        ogq ogqVar = new ogq();
        this.f210372i = ogqVar;
        lpc lpcVar = new lpc(ymb1Var, 29);
        switch (ajnVar.f16291a) {
            case 0:
                phn phnVar = (phn) ajnVar.f16292b;
                son sonVar = phnVar.f177688b;
                luk lukVar = (luk) sonVar.f212491v3.get();
                xkn xknVar = (xkn) phnVar.f177690d;
                dkb1Var = new dkb1(flb1Var, ogqVar, lukVar, xknVar.m91314b(), (k9b) xknVar.f262571S4.get(), (om0) sonVar.f212079fl.get());
                break;
            case 1:
                vfn vfnVar = (vfn) ajnVar.f16292b;
                son sonVar2 = vfnVar.f241004b;
                luk lukVar2 = (luk) sonVar2.f212491v3.get();
                nmn nmnVar = (nmn) vfnVar.f241006d;
                dkb1Var = new dkb1(flb1Var, ogqVar, lukVar2, nmnVar.m65007d(), (k9b) nmnVar.f155948fd.get(), (om0) sonVar2.f212079fl.get());
                break;
            default:
                vfn vfnVar2 = (vfn) ajnVar.f16292b;
                son sonVar3 = vfnVar2.f241004b;
                luk lukVar3 = (luk) sonVar3.f212491v3.get();
                otn otnVar = (otn) vfnVar2.f241006d;
                dkb1Var = new dkb1(flb1Var, ogqVar, lukVar3, otnVar.m67946c(), (k9b) otnVar.f169967v7.get(), (om0) sonVar3.f212079fl.get());
                break;
        }
        this.f210373t = alf1.m26339v(vnb1.f243036a, lpcVar, dkb1Var, new sq11(2, ymb1Var, ymb1.class, "onProps", "onProps(Lcom/spotify/adsdisplay/element/video/VideoAdElement$Props;Lcom/spotify/adsdisplay/elementimpl/video/mobius/domain/VideoAdState;)Lcom/spotify/mobius/Next;", 0, 0, 12), new ij81(bjnVar, this, ymb1Var, 13));
        fu3 fu3VarM45720f = gu3Var.m45720f();
        this.f210361X = fu3VarM45720f;
        C2617yl c2617yl = umb1.f231793a;
        this.f210362Y = umb1.m83429a(elb1Var, fu3VarM45720f != fu3.EXPAND_FULL_VIDEO);
        fyf fyfVar = new fyf(new rlb1(this, dknVar, gt0Var), true, 1665995106);
        wpi0 wpi0Var = xwt.f266743a;
        this.f210363Z = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: j */
    public static final qap0 m78448j(slb1 slb1Var, wnb1 wnb1Var, xq00 xq00Var) {
        Object obj = t6x0.f217647t;
        xq00Var.m91771i0(1069826715);
        flb1 flb1Var = slb1Var.f210367d;
        pa9 pa9Var = flb1Var.f70750f;
        if (pa9Var != null) {
            xq00Var.m91771i0(-1744503997);
            boolean zM91770i = xq00Var.m91770i(pa9Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == obj) {
                objM91750T = new ls0(pa9Var, 4);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49233e(pa9Var, (gh00) objM91750T, xq00Var);
            boolean zM91770i2 = xq00Var.m91770i(pa9Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == obj) {
                objM91750T2 = new nlb1(pa9Var, 1);
                xq00Var.m91793t0(objM91750T2);
            }
            qap0 qap0Var = (qap0) objM91750T2;
            xq00Var.m91788r(false);
            xq00Var.m91788r(false);
            return qap0Var;
        }
        xq00Var.m91771i0(-1744254137);
        xq00Var.m91788r(false);
        ra9 ra9VarMo48178a = slb1Var.f210366c.mo48178a(flb1Var.f70749e);
        Object objM91750T3 = xq00Var.m91750T();
        if (objM91750T3 == obj) {
            objM91750T3 = new gb31();
            xq00Var.m91793t0(objM91750T3);
        }
        gb31 gb31Var = (gb31) objM91750T3;
        if (wnb1Var instanceof vnb1) {
            gb31Var.getClass();
            AbstractC2563x8<pa9> abstractC2563x8 = ((lw41) ua31.m82684t(gb31Var.f78181a, gb31Var)).f137446c;
            gb31Var.clear();
            for (pa9 pa9Var2 : abstractC2563x8) {
                pa9Var2.m69441f();
                ra9VarMo48178a.mo72486b(pa9Var2);
            }
        }
        boolean zM91770i3 = xq00Var.m91770i(ra9VarMo48178a) | xq00Var.m91770i(slb1Var) | xq00Var.m91770i(gb31Var);
        Object objM91750T4 = xq00Var.m91750T();
        if (zM91770i3 || objM91750T4 == obj) {
            objM91750T4 = new qlb1(ra9VarMo48178a, slb1Var, gb31Var);
            xq00Var.m91793t0(objM91750T4);
        }
        qap0 qap0Var2 = (qap0) objM91750T4;
        xq00Var.m91788r(false);
        return qap0Var2;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f210362Y;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f210363Z;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f210373t;
    }
}
