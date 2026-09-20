package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class s93 implements o5k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206830a;

    /* JADX INFO: renamed from: b */
    public final Object f206831b;

    public /* synthetic */ s93(Object obj, int i) {
        this.f206830a = i;
        this.f206831b = obj;
    }

    /* JADX INFO: renamed from: c */
    public static hd1 m77542c(pgo pgoVar, String str) {
        return new hd1(fag1.m41173v(pgoVar, pag1.m69487w(new rko(t6x0.f217619L0, 1, woq.f253553f, new pko(woq.f253555h), woq.f253554g), woq.f253556i), str), 27);
    }

    /* JADX INFO: renamed from: d */
    public static hz80 m77543d(vhe0 vhe0Var) {
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null) {
            return null;
        }
        boolean z = false;
        if (!Boolean.parseBoolean((String) hz80Var.f96822X.get("is_video_first")) && (!hz80Var.f96833i.m59499a() || hz80Var.f96832h)) {
            z = !m3l.m60715v(hz80Var.f96812M0);
        }
        if (z) {
            return hz80Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static hd1 m77544j(pgo pgoVar, String str) {
        return new hd1(fag1.m41173v(pgoVar, pag1.m69487w(new rko(dzx.f54794t, 1, g63.f76875h, new pko(g63.f76877t), g63.f76876i), g63.f76860X), str), 4);
    }

    @Override // p204p.o5k
    /* JADX INFO: renamed from: a */
    public final fiz mo28140a(vhe0 vhe0Var, ago agoVar) {
        switch (this.f206830a) {
            case 0:
                hz80 hz80VarM77543d = m77543d(vhe0Var);
                return hz80VarM77543d == null ? new ysk(null, 27) : new bq0(m77544j(agoVar, vhe0Var.f241502a), this, vhe0Var, hz80VarM77543d, 3);
            case 1:
                return new ysk(m77545e(vhe0Var), 27);
            case 2:
                return new ysk(m77546f(vhe0Var), 27);
            case 3:
                hz80 hz80Var = vhe0Var.f241505d;
                return hz80Var == null ? new ysk(null, 27) : new bq0(m77542c(agoVar, vhe0Var.f241502a), hz80Var, this, vhe0Var, 8);
            case 4:
                return new ysk(!vhe0Var.f241507f.f231931c ? null : ((u7q) this.f206831b).m82532d(), 27);
            case 5:
                mr20 mr20Var = vhe0Var.f241507f.f231932d;
                return new ysk(mr20Var == null ? null : ((u010) this.f206831b).m82094i(mr20Var), 27);
            case 6:
                return new ysk(m77547g(vhe0Var), 27);
            case 7:
                return new ysk(m77548h(vhe0Var), 27);
            case 8:
                waz0 waz0Var = vhe0Var.f241507f.f231930b;
                return new ysk(waz0Var == null ? null : ((ltx0) this.f206831b).m59913d(waz0Var), 27);
            default:
                return new ysk(m77549i(vhe0Var), 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    @Override // p204p.o5k
    /* JADX INFO: renamed from: b */
    public final Object mo28141b(vhe0 vhe0Var, ago agoVar, fbk fbkVar) {
        p93 p93Var;
        vhe0 vhe0Var2;
        hz80 hz80Var;
        ipq ipqVar;
        vhe0 vhe0Var3;
        hz80 hz80Var2;
        switch (this.f206830a) {
            case 0:
                if (fbkVar instanceof p93) {
                    p93Var = (p93) fbkVar;
                    int i = p93Var.f175136e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        p93Var.f175136e = i - Integer.MIN_VALUE;
                    } else {
                        p93Var = new p93(this, (ibk) fbkVar);
                    }
                } else {
                    p93Var = new p93(this, (ibk) fbkVar);
                }
                p93 p93Var2 = p93Var;
                Object objM76980u = p93Var2.f175134c;
                int i2 = p93Var2.f175136e;
                fbk fbkVar2 = null;
                if (i2 == 0) {
                    bga.m29073P(objM76980u);
                    hz80 hz80VarM77543d = m77543d(vhe0Var);
                    if (hz80VarM77543d == null) {
                        return null;
                    }
                    C1968i6 c1968i6 = new C1968i6(this, agoVar, vhe0Var, fbkVar2, 20);
                    p93Var2.f175132a = vhe0Var;
                    p93Var2.f175133b = hz80VarM77543d;
                    p93Var2.f175136e = 1;
                    objM76980u = s1h1.m76980u(2000L, c1968i6, p93Var2);
                    yuk yukVar = yuk.f276404a;
                    if (objM76980u == yukVar) {
                        return yukVar;
                    }
                    vhe0Var2 = vhe0Var;
                    hz80Var = hz80VarM77543d;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hz80Var = p93Var2.f175133b;
                    vhe0Var2 = p93Var2.f175132a;
                    bga.m29073P(objM76980u);
                }
                i490 i490Var = (i490) objM76980u;
                if (i490Var == null) {
                    return null;
                }
                return ((pgq0) this.f206831b).m69909h(vhe0Var2.f241502a, i490Var, hz80Var);
            case 1:
                return m77545e(vhe0Var);
            case 2:
                return m77546f(vhe0Var);
            case 3:
                if (fbkVar instanceof ipq) {
                    ipqVar = (ipq) fbkVar;
                    int i3 = ipqVar.f104544e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ipqVar.f104544e = i3 - Integer.MIN_VALUE;
                    } else {
                        ipqVar = new ipq(this, (ibk) fbkVar);
                    }
                } else {
                    ipqVar = new ipq(this, (ibk) fbkVar);
                }
                ipq ipqVar2 = ipqVar;
                Object objM76980u2 = ipqVar2.f104542c;
                int i4 = ipqVar2.f104544e;
                fbk fbkVar3 = null;
                if (i4 == 0) {
                    bga.m29073P(objM76980u2);
                    hz80 hz80Var3 = vhe0Var.f241505d;
                    if (hz80Var3 == null) {
                        return null;
                    }
                    h5q h5qVar = new h5q(this, agoVar, vhe0Var, fbkVar3, 13);
                    ipqVar2.f104540a = vhe0Var;
                    ipqVar2.f104541b = hz80Var3;
                    ipqVar2.f104544e = 1;
                    objM76980u2 = s1h1.m76980u(2000L, h5qVar, ipqVar2);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM76980u2 == yukVar2) {
                        return yukVar2;
                    }
                    vhe0Var3 = vhe0Var;
                    hz80Var2 = hz80Var3;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hz80Var2 = ipqVar2.f104541b;
                    vhe0Var3 = ipqVar2.f104540a;
                    bga.m29073P(objM76980u2);
                }
                uu41 uu41Var = (uu41) objM76980u2;
                if (uu41Var != null && hz80Var2.f96834t.f156637a && uu41Var.f234106a) {
                    return ((iin) this.f206831b).m50752n(vhe0Var3.f241502a, hz80Var2.f96825a);
                }
                return null;
            case 4:
                if (vhe0Var.f241507f.f231931c) {
                    return ((u7q) this.f206831b).m82532d();
                }
                return null;
            case 5:
                mr20 mr20Var = vhe0Var.f241507f.f231932d;
                if (mr20Var == null) {
                    return null;
                }
                return ((u010) this.f206831b).m82094i(mr20Var);
            case 6:
                return m77547g(vhe0Var);
            case 7:
                return m77548h(vhe0Var);
            case 8:
                waz0 waz0Var = vhe0Var.f241507f.f231930b;
                if (waz0Var == null) {
                    return null;
                }
                return ((ltx0) this.f206831b).m59913d(waz0Var);
            default:
                return m77549i(vhe0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public f5k m77545e(vhe0 vhe0Var) {
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null || hz80Var.f96833i != lnn0.f135187f || !hz80Var.f96834t.f156644h.f116555a.contains(lnn0.f135185d)) {
            return null;
        }
        cxe cxeVar = (cxe) this.f206831b;
        String str = vhe0Var.f241502a;
        return new f5k("list_uncollaborative", (wwu) uou.f232525c, (c5k) null, Integer.valueOf(R.string.playlist_options_menu_uncollaborative), (String) null, false, (p221) null, new e5k(new v4k(3), 1, new d5k(mre.f146496Z, new rhd(str, 13)), new wxe(cxeVar, str, 0)), 244);
    }

    /* JADX INFO: renamed from: f */
    public f5k m77546f(vhe0 vhe0Var) {
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null || !hz80Var.f96834t.f156643g.f246005c) {
            return null;
        }
        vpj vpjVar = (vpj) this.f206831b;
        String str = vhe0Var.f241502a;
        ((avs) vpjVar.f243702c).getClass();
        String strM27258a = avs.m27258a(str);
        return new f5k("list_create_cover_art", (wwu) apu.f18012c, (c5k) null, Integer.valueOf(R.string.playlist_options_menu_create_cover_art), (String) null, false, (p221) null, new e5k(new v4k(2), 1, new d5k(cmk.f39701R0, new ivg(strM27258a, 25)), new q7i(21, vpjVar, strM27258a)), 244);
    }

    /* JADX INFO: renamed from: g */
    public f5k m77547g(vhe0 vhe0Var) {
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null || !hz80Var.f96834t.f156645i) {
            return null;
        }
        yho yhoVar = (yho) this.f206831b;
        String str = vhe0Var.f241502a;
        String str2 = vhe0Var.f241504c;
        return new f5k("list_leave", (wwu) tnu.f222077c, (c5k) null, Integer.valueOf(R.string.playlist_options_menu_leave_playlist), (String) null, false, (p221) null, new e5k(new v4k(3), 1, new d5k(dm70.f50444S0, dm70.f50445T0), new ee20(yhoVar, str, str2, hz80Var, 18)), 244);
    }

    /* JADX INFO: renamed from: h */
    public f5k m77548h(vhe0 vhe0Var) {
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null) {
            return null;
        }
        lnn0 lnn0Var = hz80Var.f96833i;
        noa1 noa1Var = hz80Var.f96834t;
        lnn0 lnn0Var2 = lnn0.f135184c;
        boolean z = lnn0Var == lnn0Var2;
        boolean zContains = noa1Var.f156644h.f116555a.contains(lnn0Var2);
        boolean zContains2 = noa1Var.f156644h.f116555a.contains(lnn0.f135185d);
        if ((z || !zContains) && !(z && zContains2)) {
            return null;
        }
        return ((o290) this.f206831b).m66097b(vhe0Var.f241502a, lnn0Var);
    }

    /* JADX INFO: renamed from: i */
    public f5k m77549i(vhe0 vhe0Var) {
        hz80 hz80Var = vhe0Var.f241505d;
        if (hz80Var == null) {
            return null;
        }
        vy80 vy80Var = hz80Var.f96834t.f156643g;
        if (!vy80Var.f246003a && !vy80Var.f246005c && !vy80Var.f246004b) {
            return null;
        }
        ltx0 ltx0Var = (ltx0) this.f206831b;
        String str = vhe0Var.f241502a;
        ((mys) ltx0Var.f136904c).getClass();
        String strM63207d = mys.m63207d(str);
        return new f5k("list_settings", (wwu) wpu.f253840c, (c5k) null, Integer.valueOf(R.string.playlist_options_menu_settings), (String) null, false, (p221) null, new e5k(new v4k(2), 1, new d5k(d901.f46633t, new zpz0(strM63207d, 4)), new sgy0(16, ltx0Var, strM63207d)), 244);
    }
}
