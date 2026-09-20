package p204p;

import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.castbasic.CastBasicException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class n3p implements jac {

    /* JADX INFO: renamed from: a */
    public final oac f150091a;

    /* JADX INFO: renamed from: b */
    public final kqw f150092b;

    /* JADX INFO: renamed from: c */
    public final hk60 f150093c;

    /* JADX INFO: renamed from: d */
    public final luk f150094d;

    /* JADX INFO: renamed from: e */
    public final x3p f150095e;

    /* JADX INFO: renamed from: f */
    public final gfz f150096f;

    /* JADX INFO: renamed from: g */
    public final hb11 f150097g = j0g1.m52092t(0, 1, 0, 5);

    /* JADX INFO: renamed from: h */
    public xuk f150098h;

    /* JADX INFO: renamed from: i */
    public c201 f150099i;

    /* JADX INFO: renamed from: j */
    public vbc f150100j;

    public n3p(oac oacVar, kqw kqwVar, hk60 hk60Var, luk lukVar, x3p x3pVar, gfz gfzVar) {
        this.f150091a = oacVar;
        this.f150092b = kqwVar;
        this.f150093c = hk60Var;
        this.f150094d = lukVar;
        this.f150095e = x3pVar;
        this.f150096f = gfzVar;
        this.f150098h = dq60.m36621u(lukVar);
    }

    /* JADX INFO: renamed from: d */
    public static String m63640d(vbc vbcVar) {
        CastDevice castDeviceM85128b;
        return dq60.m36615o("[deviceName=", (vbcVar == null || (castDeviceM85128b = vbcVar.m85128b()) == null) ? null : castDeviceM85128b.f1774d, ", sessionId=", vbcVar != null ? vbcVar.m85129c() : null, "]");
    }

    @Override // p204p.jac
    /* JADX INFO: renamed from: a */
    public final void mo47358a() {
        try {
            vbc vbcVar = this.f150100j;
            this.f150100j = null;
            if (vbcVar != null) {
                vbcVar.m85132f();
            }
        } catch (CastBasicException e) {
            Logger.m3967c(e, "Digesting exception during shutdown", new Object[0]);
        }
        kk40.m56680v(this.f150098h, null);
        this.f150099i = null;
        this.f150100j = null;
    }

    @Override // p204p.jac
    /* JADX INFO: renamed from: b */
    public final void mo47359b() {
        xuk xukVarM37073v = dv9.m37073v(this.f150098h, new sho(this, 17));
        this.f150098h = xukVarM37073v;
        x0h1.m89578u(xukVarM37073v, null, 0, new xuo(this, null, 5), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (m63643f(r1, r0) == r5) goto L47;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m63641c(vbc vbcVar, ibk ibkVar) {
        k3p k3pVar;
        vbc vbcVar2;
        n3p n3pVar;
        if (ibkVar instanceof k3p) {
            k3pVar = (k3p) ibkVar;
            int i = k3pVar.f118948e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k3pVar.f118948e = i - Integer.MIN_VALUE;
            } else {
                k3pVar = new k3p(this, ibkVar);
            }
        } else {
            k3pVar = new k3p(this, ibkVar);
        }
        Object objMo66545a = k3pVar.f118946c;
        int i2 = k3pVar.f118948e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                n3pVar = k3pVar.f118945b;
                vbcVar2 = k3pVar.f118944a;
                bga.m29073P(objMo66545a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objMo66545a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objMo66545a);
        vbc vbcVar3 = this.f150100j;
        if (vbcVar3 != null && !vbcVar3.equals(vbcVar)) {
            vbc vbcVar4 = this.f150100j;
            this.f150100j = null;
            if (vbcVar4 != null) {
                vbcVar4.m85132f();
            }
        }
        k3pVar.f118944a = vbcVar;
        k3pVar.f118945b = this;
        k3pVar.f118948e = 1;
        objMo66545a = this.f150091a.mo66545a(k3pVar);
        if (objMo66545a != yukVar) {
            vbcVar2 = vbcVar;
            n3pVar = this;
        }
        return yukVar;
        n3pVar.f150099i = (c201) objMo66545a;
        this.f150100j = vbcVar2;
        m63640d(vbcVar2);
        c201 c201Var = this.f150099i;
        vbc vbcVarM31285a = c201Var != null ? c201Var.m31285a() : null;
        if (vbcVarM31285a != null) {
            m63640d(vbcVarM31285a);
        }
        if (!wj50.m88271j(vbcVar2.m85129c(), vbcVarM31285a != null ? vbcVarM31285a.m85129c() : null)) {
            if (vbcVarM31285a == null) {
                m6b.m60995j("No current session during auth. Requested=", m63640d(vbcVar2));
            } else {
                m63640d(vbcVar2);
                m63640d(vbcVarM31285a);
            }
        }
        if (!vbcVar2.m85131e()) {
            throw new CastBasicException(1, null, "Session not found or not connected");
        }
        m63640d(vbcVar2);
        vbcVar2.m85133g(new h3n(22, this, vbcVar2));
        this.f150095e.m89810b(ybc.MESSAGE_CALLBACK_CREATED);
        k3pVar.f118944a = null;
        k3pVar.f118945b = null;
        k3pVar.f118948e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r6.m57123a(1, r10, r1) == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r6.m57123a(1, r10, r1) == r8) goto L37;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m63642e(String str, String str2, ibk ibkVar) {
        l3p l3pVar;
        if (ibkVar instanceof l3p) {
            l3pVar = (l3p) ibkVar;
            int i = l3pVar.f129411e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3pVar.f129411e = i - Integer.MIN_VALUE;
            } else {
                l3pVar = new l3p(this, ibkVar);
            }
        } else {
            l3pVar = new l3p(this, ibkVar);
        }
        Object objM57125c = l3pVar.f129409c;
        int i2 = l3pVar.f129411e;
        kqw kqwVar = this.f150092b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM57125c);
                l3pVar.f129407a = str;
                l3pVar.f129408b = str2;
                l3pVar.f129411e = 1;
                objM57125c = kqwVar.m57125c(str, l3pVar);
                if (objM57125c == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                str2 = l3pVar.f129408b;
                str = l3pVar.f129407a;
                bga.m29073P(objM57125c);
            } else if (i2 == 2) {
                String str3 = l3pVar.f129408b;
                String str4 = l3pVar.f129407a;
                bga.m29073P(objM57125c);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM57125c);
            }
            return w2a1.f247311a;
            cbc cbcVar = (cbc) objM57125c;
            if (cbcVar != cbc.OK) {
                Logger.m3973i("CastBasic->%s", "putConnect returned " + cbcVar + " for device: " + str2);
                l3pVar.f129407a = str;
                l3pVar.f129408b = str2;
                l3pVar.f129411e = 2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "CastBasic->%s", edb.m38564m("putConnect failed for device: ", str2));
            l3pVar.f129407a = null;
            l3pVar.f129408b = null;
            l3pVar.f129411e = 3;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m63643f(vbc vbcVar, ibk ibkVar) {
        m3p m3pVar;
        if (ibkVar instanceof m3p) {
            m3pVar = (m3p) ibkVar;
            int i = m3pVar.f139693c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m3pVar.f139693c = i - Integer.MIN_VALUE;
            } else {
                m3pVar = new m3p(this, ibkVar);
            }
        } else {
            m3pVar = new m3p(this, ibkVar);
        }
        Object obj = m3pVar.f139691a;
        int i2 = m3pVar.f139693c;
        if (i2 == 0) {
            bga.m29073P(obj);
            CastDevice castDeviceM85128b = vbcVar.m85128b();
            fbk fbkVar = null;
            String strM1482k = castDeviceM85128b != null ? castDeviceM85128b.m1482k() : null;
            CastDevice castDeviceM85128b2 = vbcVar.m85128b();
            String str = castDeviceM85128b2 != null ? castDeviceM85128b2.f1774d : null;
            if (strM1482k == null) {
                throw new CastBasicException(2, null, "No Cast device present in the Session");
            }
            if (this.f150096f.isEnabled()) {
                m3pVar.f139693c = 1;
                Object objM63642e = m63642e(strM1482k, str, m3pVar);
                Object obj2 = yuk.f276404a;
                if (objM63642e == obj2) {
                    return obj2;
                }
            } else {
                x0h1.m89578u(this.f150098h, null, 0, new r2m(this, strM1482k, fbkVar, 13), 3);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f150097g.mo46962a(dac.f47015a);
        return w2a1.f247311a;
    }
}
