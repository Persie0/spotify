package p204p;

import com.spotify.devicepredictability.devicesuggestionprovider.events.proto.DeviceSuggestionSourceResult;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class nsp {

    /* JADX INFO: renamed from: a */
    public final voi f157855a;

    /* JADX INFO: renamed from: b */
    public final fn10 f157856b;

    /* JADX INFO: renamed from: c */
    public final ver f157857c;

    /* JADX INFO: renamed from: d */
    public final e24 f157858d;

    /* JADX INFO: renamed from: e */
    public final rh4 f157859e;

    /* JADX INFO: renamed from: f */
    public final vrd1 f157860f;

    /* JADX INFO: renamed from: g */
    public final c9k f157861g;

    /* JADX INFO: renamed from: h */
    public di41 f157862h;

    public nsp(voi voiVar, fn10 fn10Var, ver verVar, e24 e24Var, rh4 rh4Var, vrd1 vrd1Var, luk lukVar) {
        this.f157855a = voiVar;
        this.f157856b = fn10Var;
        this.f157857c = verVar;
        this.f157858d = e24Var;
        this.f157859e = rh4Var;
        this.f157860f = vrd1Var;
        this.f157861g = AbstractC0000a.m16o(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m65580a(nsp nspVar, ibk ibkVar) {
        esp espVar;
        nspVar.getClass();
        if (ibkVar instanceof esp) {
            espVar = (esp) ibkVar;
            int i = espVar.f62439c;
            if ((i & Integer.MIN_VALUE) != 0) {
                espVar.f62439c = i - Integer.MIN_VALUE;
            } else {
                espVar = new esp(nspVar, ibkVar);
            }
        } else {
            espVar = new esp(nspVar, ibkVar);
        }
        Object objM76980u = espVar.f62437a;
        int i2 = espVar.f62439c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            long jM75495a = nspVar.f157859e.m75495a();
            fsp fspVar = new fsp(nspVar, null, 1);
            espVar.f62439c = 1;
            objM76980u = s1h1.m76980u(jM75495a, fspVar, espVar);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        lu31 lu31Var = (lu31) objM76980u;
        return lu31Var != null ? lu31Var : mu31.f147247a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m65581b(nsp nspVar, boolean z, String str, ibk ibkVar) {
        gsp gspVar;
        nspVar.getClass();
        if (ibkVar instanceof gsp) {
            gspVar = (gsp) ibkVar;
            int i = gspVar.f84002c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gspVar.f84002c = i - Integer.MIN_VALUE;
            } else {
                gspVar = new gsp(nspVar, ibkVar);
            }
        } else {
            gspVar = new gsp(nspVar, ibkVar);
        }
        Object objM76980u = gspVar.f84000a;
        int i2 = gspVar.f84002c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            long jM75496b = nspVar.f157859e.m75496b();
            hsp hspVar = new hsp(nspVar, z, str, null, 0);
            gspVar.f84002c = 1;
            objM76980u = s1h1.m76980u(jM75496b, hspVar, gspVar);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        lu31 lu31Var = (lu31) objM76980u;
        return lu31Var != null ? lu31Var : mu31.f147247a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m65582c(nsp nspVar, String str, e261 e261Var, nu31 nu31Var, int i, boolean z) {
        pqm0 pqm0Var;
        String str2;
        nspVar.getClass();
        if (nu31Var instanceof lu31) {
            qcr qcrVar = ((lu31) nu31Var).f136965a;
            pqm0Var = new pqm0(qcrVar != null ? "COMPLETED" : "NO_SUGGESTION", qcrVar);
        } else {
            if (!wj50.m88271j(nu31Var, mu31.f147247a)) {
                throw new NoWhenBranchMatchedException();
            }
            pqm0Var = new pqm0("TIMED_OUT", null);
        }
        String str3 = (String) pqm0Var.f180350a;
        qcr qcrVar2 = (qcr) pqm0Var.f180351b;
        ver verVar = nspVar.f157857c;
        verVar.getClass();
        sfr sfrVarM9276w = DeviceSuggestionSourceResult.m9276w();
        sfrVarM9276w.m78009r(str);
        int iOrdinal = e261Var.ordinal();
        if (iOrdinal == 0) {
            str2 = "WHERE_TO_PLAY";
        } else if (iOrdinal == 1) {
            str2 = "GOOGLE_INTENT_ENGINE";
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "BLE_PROXIMITY";
        }
        sfrVarM9276w.m78013v(str2);
        sfrVarM9276w.m78014w(str3);
        sfrVarM9276w.m78007m(i);
        sfrVarM9276w.m78012u(z);
        if (qcrVar2 != null) {
            sfrVarM9276w.m78010s(qcrVar2.mo66726e());
            sfrVarM9276w.m78011t(ver.m85326c(qcrVar2.getType()));
            sfrVarM9276w.m78008q(ver.m85325b(qcrVar2.mo66722a()));
            sfrVarM9276w.m78015x(qcrVar2.mo66725d());
        }
        verVar.f240790a.m73616a(sfrVarM9276w.build());
    }

    /* JADX INFO: renamed from: d */
    public static final ocr m65583d(nsp nspVar, rm10 rm10Var) {
        int i;
        nspVar.getClass();
        if (!(rm10Var instanceof qm10)) {
            if (rm10Var instanceof pm10) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        qm10 qm10Var = (qm10) rm10Var;
        api apiVarM65585f = nspVar.m65585f(qm10Var.f190006a);
        if (apiVarM65585f == null) {
            return null;
        }
        String str = qm10Var.f190008c;
        String strMo26689e = apiVarM65585f.mo26689e();
        String str2 = apiVarM65585f.mo26686H().f191320a;
        String name = apiVarM65585f.getName();
        xfr type = apiVarM65585f.getType();
        boolean zMo26679A = apiVarM65585f.mo26679A();
        int iM38547C = edb.m38547C(qm10Var.f190007b);
        int i2 = 1;
        if (iM38547C == 0) {
            i = i2;
        } else if (iM38547C != 1) {
            i2 = 3;
            if (iM38547C != 2) {
                if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 4;
            }
            i = i2;
        } else {
            i = 2;
        }
        return new ocr(str, strMo26689e, str2, name, type, zMo26679A, i);
    }

    /* JADX INFO: renamed from: e */
    public static final pcr m65584e(nsp nspVar, srd1 srd1Var) {
        char c;
        int i;
        nspVar.getClass();
        if (!(srd1Var instanceof rrd1)) {
            if (srd1Var instanceof qrd1) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        rrd1 rrd1Var = (rrd1) srd1Var;
        api apiVarM65585f = nspVar.m65585f(rrd1Var.f202027a);
        if (apiVarM65585f == null) {
            return null;
        }
        String str = rrd1Var.f202029c;
        String strMo26689e = apiVarM65585f.mo26689e();
        String str2 = apiVarM65585f.mo26686H().f191320a;
        String name = apiVarM65585f.getName();
        xfr type = apiVarM65585f.getType();
        boolean zMo26679A = apiVarM65585f.mo26679A();
        int iM38547C = edb.m38547C(rrd1Var.f202028b);
        if (iM38547C == 0) {
            c = 1;
        } else if (iM38547C == 1) {
            c = 2;
        } else if (iM38547C == 2) {
            c = 3;
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c = 4;
        }
        int iM38547C2 = edb.m38547C(rrd1Var.f202030d);
        if (iM38547C2 == 0) {
            i = 1;
        } else if (iM38547C2 == 1) {
            i = 2;
        } else {
            if (iM38547C2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        return new pcr(str, strMo26689e, str2, name, type, zMo26679A, c, i);
    }

    /* JADX INFO: renamed from: f */
    public final api m65585f(String str) {
        Object next;
        Iterator it = ((s5p) this.f157855a).m77298g().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(((api) next).mo26689e(), str)) {
                return (api) next;
            }
        }
        next = null;
        return (api) next;
    }
}
