package p204p;

import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;

/* JADX INFO: loaded from: classes7.dex */
public final class n190 {

    /* JADX INFO: renamed from: a */
    public final r4n f149339a;

    /* JADX INFO: renamed from: b */
    public final luk f149340b;

    /* JADX INFO: renamed from: c */
    public final s4n f149341c;

    /* JADX INFO: renamed from: d */
    public final t4n f149342d;

    /* JADX INFO: renamed from: e */
    public final u4n f149343e;

    /* JADX INFO: renamed from: f */
    public final v4n f149344f;

    /* JADX INFO: renamed from: g */
    public final c331 f149345g;

    /* JADX INFO: renamed from: h */
    public final hy21 f149346h;

    public n190(d331 d331Var, r4n r4nVar, luk lukVar, s4n s4nVar, t4n t4nVar, u4n u4nVar, t431 t431Var, v4n v4nVar) {
        this.f149339a = r4nVar;
        this.f149340b = lukVar;
        this.f149341c = s4nVar;
        this.f149342d = t4nVar;
        this.f149343e = u4nVar;
        this.f149344f = v4nVar;
        this.f149345g = d331Var.f44757a.mo33463a(d331Var.f44758b, d331Var.f44759c);
        this.f149346h = t431Var.m80029a(new p431(null, null, 1, null, 47));
    }

    /* JADX INFO: renamed from: a */
    public final u190 m63475a(String str, ysk yskVar, hc80 hc80Var, p8p0 p8p0Var, fiz fizVar, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, fiz fizVar2, fiz fizVar3) {
        s2o s2oVar = (s2o) ((ik40) this.f149339a.f195810a.f33427c).f103006b;
        wt80 wt80Var = (wt80) s2oVar.f205035b;
        jg31.m53271i(wt80Var);
        vmz vmzVar = (vmz) s2oVar.f205037d;
        jg31.m53271i(vmzVar);
        skp skpVar = new skp(wt80Var, vmzVar, str);
        return m63476b(str, yskVar, new ysk(lau.f131415a, 27), hc80Var, p8p0Var, (nlz) skpVar.f210178b, fizVar, new ysk(gbu.f78413a, 27), esPlayOrigin$PlayOrigin, fizVar2, fizVar3, new ysk(pt80.f181071a, 27));
    }

    /* JADX INFO: renamed from: b */
    public final u190 m63476b(String str, fiz fizVar, ysk yskVar, hc80 hc80Var, p8p0 p8p0Var, fiz fizVar2, fiz fizVar3, ysk yskVar2, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, fiz fizVar4, fiz fizVar5, ysk yskVar3) {
        return m63477c(str, new i3p0(null, null, null, null, null, 1023), fizVar, yskVar, hc80Var, p8p0Var, fizVar2, fizVar3, yskVar2, esPlayOrigin$PlayOrigin, fizVar4, fizVar5, yskVar3);
    }

    /* JADX INFO: renamed from: c */
    public final u190 m63477c(String str, i3p0 i3p0Var, fiz fizVar, ysk yskVar, hc80 hc80Var, p8p0 p8p0Var, fiz fizVar2, fiz fizVar3, ysk yskVar2, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, fiz fizVar4, fiz fizVar5, ysk yskVar3) {
        vjz vjzVar = new vjz(new px70(k0e1.m54985d(this.f149346h.m49110d(str)), 3), new us4(2, 15, null));
        this.f149343e.getClass();
        pzs0 pzs0Var = new pzs0(str, esPlayOrigin$PlayOrigin, this.f149345g, vjzVar);
        this.f149341c.getClass();
        u4l0 u4l0Var = new u4l0(fizVar, yskVar, fizVar2, vjzVar, fizVar3, yskVar2, pzs0Var, fizVar5, yskVar3, fizVar4);
        ik40 ik40Var = (ik40) this.f149342d.f217049a.f33427c;
        xre xreVar = (xre) ((s2o) ik40Var.f103006b).f205039f;
        jg31.m53271i(xreVar);
        s2o s2oVar = (s2o) ik40Var.f103006b;
        wt80 wt80Var = (wt80) s2oVar.f205035b;
        jg31.m53271i(wt80Var);
        nbm0 nbm0Var = (nbm0) s2oVar.f205042i;
        jg31.m53271i(nbm0Var);
        ugz ugzVar = new ugz(xreVar, wt80Var, nbm0Var, esPlayOrigin$PlayOrigin, pzs0Var, 11);
        ik40 ik40Var2 = (ik40) this.f149344f.f237206a.f33427c;
        xre xreVar2 = (xre) ((s2o) ik40Var2.f103006b).f205039f;
        jg31.m53271i(xreVar2);
        s2o s2oVar2 = (s2o) ik40Var2.f103006b;
        fiz fizVar6 = (fiz) s2oVar2.f205036c;
        jg31.m53271i(fizVar6);
        nbm0 nbm0Var2 = (nbm0) s2oVar2.f205042i;
        jg31.m53271i(nbm0Var2);
        u190 u190Var = new u190(str, i3p0Var, u4l0Var, ugzVar, new l8k(xreVar2, fizVar6, nbm0Var2, str, p8p0Var), this.f149340b);
        hc80Var.getLifecycle().mo31986a(new r12(u190Var, 4));
        return u190Var;
    }
}
