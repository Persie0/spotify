package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class sn8 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bzo f210844a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f210845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f210846c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m011 f210847d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m680 f210848e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ qnd f210849f;

    public sn8(bzo bzoVar, boolean z, Context context, m011 m011Var, m680 m680Var, qnd qndVar) {
        this.f210844a = bzoVar;
        this.f210845b = z;
        this.f210846c = context;
        this.f210847d = m011Var;
        this.f210848e = m680Var;
        this.f210849f = qndVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x0161  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d1 A[PHI: r1 r2 r8
      0x01d1: PHI (r1v22 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:74:0x01ce, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r2v14 int) = (r2v13 int), (r2v17 int) binds: [B:74:0x01ce, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r8v13 p.rn8) = (r8v12 p.rn8), (r8v0 p.rn8) binds: [B:74:0x01ce, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f3, code lost:
    
        if (r26.f210847d.m60397a(r3, r8) == r15) goto L78;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rn8 rn8Var;
        fq01 fq01VarMo89604c;
        rn8 rn8Var2;
        List list;
        mo8 mo8Var;
        int i;
        on8 on8Var;
        pm80 pm80Var;
        fq01 fq01Var;
        List list2;
        on8 on8Var2;
        Uri uri;
        icr0 icr0Var;
        C2652zj c2652zj;
        on8 on8Var3;
        mo8 mo8Var2;
        Object objMo34037c;
        pm80 pm80Var2;
        on8 on8Var4;
        mo8 mo8Var3;
        String str;
        ho01 ho01VarM85209i;
        ho01 ho01Var;
        sd51 sd51Var;
        Boolean bool;
        boolean zBooleanValue;
        if (ibkVar instanceof rn8) {
            rn8Var = (rn8) ibkVar;
            int i2 = rn8Var.f200750b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rn8Var.f200750b = i2 - Integer.MIN_VALUE;
            } else {
                rn8Var = new rn8(this, ibkVar);
            }
        } else {
            rn8Var = new rn8(this, ibkVar);
        }
        rn8 rn8Var3 = rn8Var;
        Object objM26512u = rn8Var3.f200749a;
        int i3 = rn8Var3.f200750b;
        yuk yukVar = yuk.f276404a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = rn8Var3.f200757i;
                mo8Var = rn8Var3.f200755g;
                list2 = rn8Var3.f200754f;
                fq01Var = rn8Var3.f200753e;
                on8Var2 = rn8Var3.f200752d;
                bga.m29073P(objM26512u);
                rn8Var2 = rn8Var3;
            } else {
                if (i3 == 2) {
                    i = rn8Var3.f200757i;
                    pm80Var2 = rn8Var3.f200756h;
                    mo8Var3 = rn8Var3.f200755g;
                    on8Var4 = rn8Var3.f200752d;
                    bga.m29073P(objM26512u);
                    ho01VarM85209i = (ho01) objM26512u;
                    if (ho01VarM85209i != null) {
                        String str2 = mo8Var3.f145606M0;
                        bool = mo8Var3.f145607N0;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        sd51Var = new sd51(str2, 2, false, zBooleanValue);
                        if (ho01VarM85209i instanceof td51) {
                            ho01VarM85209i = td51.m80490i((td51) ho01VarM85209i, null, sd51Var, 63);
                        } else if (ho01VarM85209i instanceof ud51) {
                            ho01VarM85209i = ud51.m82825i((ud51) ho01VarM85209i, null, null, sd51Var, 63);
                        } else if (ho01VarM85209i instanceof vd51) {
                            ho01VarM85209i = vd51.m85209i((vd51) ho01VarM85209i, null, null, sd51Var, 63);
                        } else if (!(ho01VarM85209i instanceof lc40) && !(ho01VarM85209i instanceof an80) && !(ho01VarM85209i instanceof bve0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ho01Var = ho01VarM85209i;
                    } else {
                        ho01Var = null;
                    }
                    z0r z0rVar = on8Var4.f167190d;
                    qi2 qi2Var = new qi2(mo8Var3, this.f210849f, null);
                    jn8 jn8Var = new jn8(pm80Var2, null, 0);
                    s0c s0cVar = new s0c(yqg1.m94361X((icr0) mo8Var3.f145616c.get(mo8Var3.f145615b), mo8Var3.f145617d, mo8Var3.f145621h));
                    rn8Var3.f200752d = null;
                    rn8Var3.f200753e = null;
                    rn8Var3.f200754f = null;
                    rn8Var3.f200755g = null;
                    rn8Var3.f200756h = null;
                    rn8Var3.f200757i = i;
                    rn8Var3.f200750b = 3;
                    objM26512u = ang1.m26512u(z0rVar, ho01Var, qi2Var, jn8Var, s0cVar, rn8Var3, 24);
                    if (objM26512u != yukVar) {
                        acr0 acr0Var = new acr0(new b3r((v2r) objM26512u));
                        rn8Var3.f200752d = null;
                        rn8Var3.f200753e = null;
                        rn8Var3.f200754f = null;
                        rn8Var3.f200755g = null;
                        rn8Var3.f200756h = null;
                        rn8Var3.f200757i = i;
                        rn8Var3.f200750b = 4;
                    }
                    return yukVar;
                }
                if (i3 == 3) {
                    i = rn8Var3.f200757i;
                    bga.m29073P(objM26512u);
                    acr0 acr0Var2 = new acr0(new b3r((v2r) objM26512u));
                    rn8Var3.f200752d = null;
                    rn8Var3.f200753e = null;
                    rn8Var3.f200754f = null;
                    rn8Var3.f200755g = null;
                    rn8Var3.f200756h = null;
                    rn8Var3.f200757i = i;
                    rn8Var3.f200750b = 4;
                } else {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM26512u);
                }
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM26512u);
        on8 on8Var5 = (on8) obj;
        fq01VarMo89604c = on8Var5.f167190d.mo89604c();
        List listM43728j1 = g6f.m43728j1(on8Var5.f167190d.mo89606h());
        mo8 mo8Var4 = on8Var5.f167189c;
        Uri uri2 = on8Var5.f167192f;
        if (uri2 != null) {
            Uri uri3 = on8Var5.f167191e;
            rn8Var3.f200752d = on8Var5;
            rn8Var3.f200753e = fq01VarMo89604c;
            rn8Var3.f200754f = listM43728j1;
            rn8Var3.f200755g = mo8Var4;
            rn8Var3.f200757i = 0;
            rn8Var3.f200750b = 1;
            rn8Var2 = rn8Var3;
            Object objM60967n = this.f210848e.m60967n(fq01VarMo89604c, listM43728j1, uri2, uri3, mo8Var4, rn8Var2);
            if (objM60967n != yukVar) {
                fq01Var = fq01VarMo89604c;
                list2 = listM43728j1;
                on8Var2 = on8Var5;
                objM26512u = objM60967n;
                mo8Var = mo8Var4;
                i = 0;
            }
        } else {
            rn8Var2 = rn8Var3;
            list = listM43728j1;
            mo8Var = mo8Var4;
            i = 0;
            on8Var = on8Var5;
            pm80Var = null;
            if (pm80Var != null || (str = pm80Var.f178974a) == null) {
                uri = null;
            } else {
                uri = Uri.parse(str);
            }
            x2r x2rVarM31048c = this.f210844a.m31048c(fq01VarMo89604c, list, mo8Var.f145609P0);
            lu01 lu01Var = new lu01(mo8Var.f145614a, mo8Var.f145612Y, mo8Var.f145605L0, mo8Var.f145613Z, mo8Var.f145623t, mo8Var.f145611X, null, 64);
            icr0Var = (icr0) mo8Var.f145616c.get(mo8Var.f145615b);
            c2652zj = new C2652zj(this.f210846c, 3);
            if (fq01VarMo89604c == zp01.f284897d && !this.f210845b && (icr0Var instanceof hcr0)) {
                icr0Var = (icr0) c2652zj.invoke();
            }
            gcr0 gcr0Var = mo8Var.f145617d;
            rn8Var2.f200752d = on8Var;
            rn8Var2.f200753e = null;
            rn8Var2.f200754f = null;
            rn8Var2.f200755g = mo8Var;
            rn8Var2.f200756h = pm80Var;
            rn8Var2.f200757i = i;
            rn8Var2.f200750b = 2;
            rn8 rn8Var4 = rn8Var2;
            on8Var3 = on8Var;
            icr0 icr0Var2 = icr0Var;
            rn8Var3 = rn8Var4;
            mo8Var2 = mo8Var;
            objMo34037c = x2rVarM31048c.mo34037c(lu01Var, icr0Var2, gcr0Var, uri, rn8Var3);
            if (objMo34037c != yukVar) {
                pm80Var2 = pm80Var;
                objM26512u = objMo34037c;
                on8Var4 = on8Var3;
                mo8Var3 = mo8Var2;
                ho01VarM85209i = (ho01) objM26512u;
                if (ho01VarM85209i != null) {
                    String str3 = mo8Var3.f145606M0;
                    bool = mo8Var3.f145607N0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    sd51Var = new sd51(str3, 2, false, zBooleanValue);
                    if (ho01VarM85209i instanceof td51) {
                        ho01VarM85209i = td51.m80490i((td51) ho01VarM85209i, null, sd51Var, 63);
                    } else if (ho01VarM85209i instanceof ud51) {
                        ho01VarM85209i = ud51.m82825i((ud51) ho01VarM85209i, null, null, sd51Var, 63);
                    } else if (ho01VarM85209i instanceof vd51) {
                        ho01VarM85209i = vd51.m85209i((vd51) ho01VarM85209i, null, null, sd51Var, 63);
                    } else if (!(ho01VarM85209i instanceof lc40)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ho01Var = ho01VarM85209i;
                } else {
                    ho01Var = null;
                }
                z0r z0rVar2 = on8Var4.f167190d;
                qi2 qi2Var2 = new qi2(mo8Var3, this.f210849f, null);
                jn8 jn8Var2 = new jn8(pm80Var2, null, 0);
                s0c s0cVar2 = new s0c(yqg1.m94361X((icr0) mo8Var3.f145616c.get(mo8Var3.f145615b), mo8Var3.f145617d, mo8Var3.f145621h));
                rn8Var3.f200752d = null;
                rn8Var3.f200753e = null;
                rn8Var3.f200754f = null;
                rn8Var3.f200755g = null;
                rn8Var3.f200756h = null;
                rn8Var3.f200757i = i;
                rn8Var3.f200750b = 3;
                objM26512u = ang1.m26512u(z0rVar2, ho01Var, qi2Var2, jn8Var2, s0cVar2, rn8Var3, 24);
                if (objM26512u != yukVar) {
                    acr0 acr0Var3 = new acr0(new b3r((v2r) objM26512u));
                    rn8Var3.f200752d = null;
                    rn8Var3.f200753e = null;
                    rn8Var3.f200754f = null;
                    rn8Var3.f200755g = null;
                    rn8Var3.f200756h = null;
                    rn8Var3.f200757i = i;
                    rn8Var3.f200750b = 4;
                }
            }
        }
        return yukVar;
        pm80Var = (pm80) objM26512u;
        on8 on8Var6 = on8Var2;
        list = list2;
        fq01VarMo89604c = fq01Var;
        on8Var = on8Var6;
        if (pm80Var != null) {
            uri = null;
        } else {
            uri = null;
        }
        x2r x2rVarM31048c2 = this.f210844a.m31048c(fq01VarMo89604c, list, mo8Var.f145609P0);
        lu01 lu01Var2 = new lu01(mo8Var.f145614a, mo8Var.f145612Y, mo8Var.f145605L0, mo8Var.f145613Z, mo8Var.f145623t, mo8Var.f145611X, null, 64);
        icr0Var = (icr0) mo8Var.f145616c.get(mo8Var.f145615b);
        c2652zj = new C2652zj(this.f210846c, 3);
        if (fq01VarMo89604c == zp01.f284897d) {
            icr0Var = (icr0) c2652zj.invoke();
        }
        gcr0 gcr0Var2 = mo8Var.f145617d;
        rn8Var2.f200752d = on8Var;
        rn8Var2.f200753e = null;
        rn8Var2.f200754f = null;
        rn8Var2.f200755g = mo8Var;
        rn8Var2.f200756h = pm80Var;
        rn8Var2.f200757i = i;
        rn8Var2.f200750b = 2;
        rn8 rn8Var5 = rn8Var2;
        on8Var3 = on8Var;
        icr0 icr0Var3 = icr0Var;
        rn8Var3 = rn8Var5;
        mo8Var2 = mo8Var;
        objMo34037c = x2rVarM31048c2.mo34037c(lu01Var2, icr0Var3, gcr0Var2, uri, rn8Var3);
        if (objMo34037c != yukVar) {
            pm80Var2 = pm80Var;
            objM26512u = objMo34037c;
            on8Var4 = on8Var3;
            mo8Var3 = mo8Var2;
            ho01VarM85209i = (ho01) objM26512u;
            if (ho01VarM85209i != null) {
                String str4 = mo8Var3.f145606M0;
                bool = mo8Var3.f145607N0;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                sd51Var = new sd51(str4, 2, false, zBooleanValue);
                if (ho01VarM85209i instanceof td51) {
                    ho01VarM85209i = td51.m80490i((td51) ho01VarM85209i, null, sd51Var, 63);
                } else if (ho01VarM85209i instanceof ud51) {
                    ho01VarM85209i = ud51.m82825i((ud51) ho01VarM85209i, null, null, sd51Var, 63);
                } else if (ho01VarM85209i instanceof vd51) {
                    ho01VarM85209i = vd51.m85209i((vd51) ho01VarM85209i, null, null, sd51Var, 63);
                } else if (!(ho01VarM85209i instanceof lc40)) {
                    throw new NoWhenBranchMatchedException();
                }
                ho01Var = ho01VarM85209i;
            } else {
                ho01Var = null;
            }
            z0r z0rVar3 = on8Var4.f167190d;
            qi2 qi2Var3 = new qi2(mo8Var3, this.f210849f, null);
            jn8 jn8Var3 = new jn8(pm80Var2, null, 0);
            s0c s0cVar3 = new s0c(yqg1.m94361X((icr0) mo8Var3.f145616c.get(mo8Var3.f145615b), mo8Var3.f145617d, mo8Var3.f145621h));
            rn8Var3.f200752d = null;
            rn8Var3.f200753e = null;
            rn8Var3.f200754f = null;
            rn8Var3.f200755g = null;
            rn8Var3.f200756h = null;
            rn8Var3.f200757i = i;
            rn8Var3.f200750b = 3;
            objM26512u = ang1.m26512u(z0rVar3, ho01Var, qi2Var3, jn8Var3, s0cVar3, rn8Var3, 24);
            if (objM26512u != yukVar) {
                acr0 acr0Var4 = new acr0(new b3r((v2r) objM26512u));
                rn8Var3.f200752d = null;
                rn8Var3.f200753e = null;
                rn8Var3.f200754f = null;
                rn8Var3.f200755g = null;
                rn8Var3.f200756h = null;
                rn8Var3.f200757i = i;
                rn8Var3.f200750b = 4;
            }
        }
        return yukVar;
    }
}
