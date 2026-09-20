package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes3.dex */
public final class el6 {

    /* JADX INFO: renamed from: a */
    public final epx f60600a;

    public /* synthetic */ el6(epx epxVar) {
        this.f60600a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public Object m39353a(String str, ibk ibkVar) {
        wni0 wni0Var;
        if (ibkVar instanceof wni0) {
            wni0Var = (wni0) ibkVar;
            int i = wni0Var.f253189c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wni0Var.f253189c = i - Integer.MIN_VALUE;
            } else {
                wni0Var = new wni0(this, ibkVar);
            }
        } else {
            wni0Var = new wni0(this, ibkVar);
        }
        Object objM39355c = wni0Var.f253187a;
        int i2 = wni0Var.f253189c;
        if (i2 == 0) {
            bga.m29073P(objM39355c);
            wni0Var.f253189c = 1;
            objM39355c = m39355c(str, wni0Var);
            Object obj = yuk.f276404a;
            if (objM39355c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM39355c);
        }
        vni0 vni0Var = (vni0) objM39355c;
        v140 v140Var = vni0Var.f243146a;
        daj dajVar = vni0Var.f243147b;
        drc1 drc1VarM42877t = fvg1.m42877t(vni0Var.f243148c);
        String str2 = drc1VarM42877t.f52294a;
        gcr0 gcr0Var = str2 != null ? new gcr0(str2, v140Var.f236243a) : null;
        String str3 = drc1VarM42877t.f52295b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = v140Var.f236243a;
        return new uni0(gcr0Var, new gcr0(str3, str4), drc1VarM42877t.f52297d, drc1VarM42877t.f52296c, str4, g6f.m43753y0(v140Var.f236246d, ", ", null, null, pni0.f179408c, 30), cks.m33187f(dajVar.f47050a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m39354b(String str, ibk ibkVar) {
        dl6 dl6Var;
        if (ibkVar instanceof dl6) {
            dl6Var = (dl6) ibkVar;
            int i = dl6Var.f50129c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dl6Var.f50129c = i - Integer.MIN_VALUE;
            } else {
                dl6Var = new dl6(this, ibkVar);
            }
        } else {
            dl6Var = new dl6(this, ibkVar);
        }
        Object obj = dl6Var.f50127a;
        int i2 = dl6Var.f50129c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Observable map = ((jpx) this.f60600a).m53978b(new C1668ai("album-context-menu", false, (gh00) new zz4(str, 11))).filter(nwh0.f159182h).map(new it2(str, 2));
        dl6Var.f50129c = 1;
        Object objM96571q = zn91.m96571q(map, 1, null, dl6Var);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m39355c(String str, ibk ibkVar) {
        xni0 xni0Var;
        if (ibkVar instanceof xni0) {
            xni0Var = (xni0) ibkVar;
            int i = xni0Var.f263631d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xni0Var.f263631d = i - Integer.MIN_VALUE;
            } else {
                xni0Var = new xni0(this, ibkVar);
            }
        } else {
            xni0Var = new xni0(this, ibkVar);
        }
        Object objM96571q = xni0Var.f263629b;
        int i2 = xni0Var.f263631d;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable observableFilter = ((jpx) this.f60600a).m53978b(new C1668ai("music-video-share-card", false, (gh00) new eve0(str, 13))).filter(zyx.f287697P0);
            xni0Var.f263628a = str;
            xni0Var.f263631d = 1;
            objM96571q = zn91.m96571q(observableFilter, 1, null, xni0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = xni0Var.f263628a;
            bga.m29073P(objM96571q);
        }
        gqx gqxVar = (gqx) objM96571q;
        ktx ktxVar = gqxVar.mo45449a(v140.class, str).f72301b;
        if (ktxVar == null) {
            throw new IllegalStateException("Identity trait was missing for ".concat(str).toString());
        }
        v140 v140Var = (v140) ktxVar;
        ktx ktxVar2 = gqxVar.mo45449a(daj.class, str).f72301b;
        if (ktxVar2 == null) {
            throw new IllegalStateException("Consumption experience trait was missing for ".concat(str).toString());
        }
        daj dajVar = (daj) ktxVar2;
        ktx ktxVar3 = gqxVar.mo45449a(erc1.class, str).f72301b;
        if (ktxVar3 != null) {
            return new vni0(dajVar, v140Var, (erc1) ktxVar3);
        }
        throw new IllegalStateException("Visual identity trait was missing for ".concat(str).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m39356d(String str, ibk ibkVar) {
        vw01 vw01Var;
        if (ibkVar instanceof vw01) {
            vw01Var = (vw01) ibkVar;
            int i = vw01Var.f245374c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw01Var.f245374c = i - Integer.MIN_VALUE;
            } else {
                vw01Var = new vw01(this, ibkVar);
            }
        } else {
            vw01Var = new vw01(this, ibkVar);
        }
        Object objM96571q = vw01Var.f245372a;
        int i2 = vw01Var.f245374c;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((jpx) this.f60600a).m53978b(new C1668ai("episode-share", false, (gh00) new zpz0(str, 11))).filter(xjr0.f262206Y).map(new it2(str, 8));
            vw01Var.f245374c = 1;
            objM96571q = zn91.m96571q(map, 1, null, vw01Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96571q);
        }
        v140 v140Var = (v140) ((fqx) objM96571q).f72301b;
        if (v140Var != null) {
            return v140Var;
        }
        throw new IllegalStateException("IdentityTrait was null");
    }
}
