package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class our implements nur {

    /* JADX INFO: renamed from: a */
    public final ao0 f170343a;

    /* JADX INFO: renamed from: b */
    public final jur f170344b;

    /* JADX INFO: renamed from: c */
    public final e940 f170345c;

    /* JADX INFO: renamed from: d */
    public final nx0 f170346d;

    /* JADX INFO: renamed from: e */
    public final uur f170347e;

    /* JADX INFO: renamed from: f */
    public final mmh0 f170348f;

    /* JADX INFO: renamed from: g */
    public final i5x f170349g;

    /* JADX INFO: renamed from: h */
    public final cph f170350h;

    public our(akn aknVar, bkn bknVar, dkn dknVar, ao0 ao0Var, jur jurVar, e940 e940Var, om0 om0Var, nx0 nx0Var) {
        uur uurVar;
        hur hurVar;
        this.f170343a = ao0Var;
        this.f170344b = jurVar;
        this.f170345c = e940Var;
        this.f170346d = nx0Var;
        int i = jurVar.f116145c;
        boolean z = jurVar.f116146d;
        switch (aknVar.f16606a) {
            case 0:
                uurVar = new uur(i, z, (gu3) ((xkn) ((phn) aknVar.f16607b).f177690d).f262591U4.get());
                break;
            default:
                uurVar = new uur(i, z, (gu3) ((otn) ((vfn) aknVar.f16607b).f241006d).f169999x7.get());
                break;
        }
        uur uurVar2 = uurVar;
        this.f170347e = uurVar2;
        r2r r2rVar = r2r.f195189R0;
        lpc lpcVar = new lpc(uurVar2, 4);
        iur iurVar = jurVar.f116143a;
        int i2 = 3;
        switch (bknVar.f27980a) {
            case 0:
                phn phnVar = (phn) bknVar.f27981b;
                son sonVar = phnVar.f177688b;
                luk lukVar = (luk) sonVar.f212491v3.get();
                xkn xknVar = (xkn) phnVar.f177690d;
                hurVar = new hur(iurVar, nx0Var, lukVar, (k9b) xknVar.f262571S4.get(), (om0) sonVar.f212079fl.get(), sonVar.f211919a.m26857a(), (qre0) sonVar.f212305o2.get(), (gu3) xknVar.f262591U4.get(), new j2r((am71) xknVar.f262661b.f212172j4.get(), i2));
                break;
            default:
                vfn vfnVar = (vfn) bknVar.f27981b;
                son sonVar2 = vfnVar.f241004b;
                luk lukVar2 = (luk) sonVar2.f212491v3.get();
                otn otnVar = (otn) vfnVar.f241006d;
                hurVar = new hur(iurVar, nx0Var, lukVar2, (k9b) otnVar.f169967v7.get(), (om0) sonVar2.f212079fl.get(), sonVar2.f211919a.m26857a(), (qre0) sonVar2.f212305o2.get(), (gu3) otnVar.f169999x7.get(), new j2r((am71) otnVar.f169667d.f212172j4.get(), i2));
                break;
        }
        this.f170348f = alf1.m26338u(r2rVar, lpcVar, hurVar, new C2148n1(2, uurVar2, uur.class, "onProps", "onProps(Lcom/spotify/adsdisplay/element/display/DisplayAdElement$Props;Lcom/spotify/adsdisplay/elementimpl/display/mobius/domain/DisplayAdState;)Lcom/spotify/mobius/Next;", 0, 0, 24), new szp(20, this, om0Var));
        C2617yl c2617yl = tur.f223911a;
        int iM38547C = edb.m38547C(i);
        this.f170349g = iM38547C != 2 ? iM38547C != 3 ? c2617yl.m94133b(hmr.f93052g, hmr.f93053h) : c2617yl.m94133b(hmr.f93038X, hmr.f93040Y) : c2617yl.m94133b(hmr.f93054i, hmr.f93055t);
        fyf fyfVar = new fyf(new k20(7, this, dknVar), true, -1677904670);
        wpi0 wpi0Var = xwt.f266743a;
        this.f170350h = new cph(fyfVar, i2);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f170349g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f170350h;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f170348f;
    }
}
