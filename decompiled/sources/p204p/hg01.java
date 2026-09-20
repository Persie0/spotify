package p204p;

import android.content.Context;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class hg01 {

    /* JADX INFO: renamed from: p */
    public static final long f90974p;

    /* JADX INFO: renamed from: q */
    public static final long f90975q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f90976r = 0;

    /* JADX INFO: renamed from: a */
    public final vmz f90977a;

    /* JADX INFO: renamed from: b */
    public final be01 f90978b;

    /* JADX INFO: renamed from: c */
    public final h4t0 f90979c;

    /* JADX INFO: renamed from: d */
    public final h4t0 f90980d;

    /* JADX INFO: renamed from: e */
    public final h4t0 f90981e;

    /* JADX INFO: renamed from: f */
    public final h4t0 f90982f;

    /* JADX INFO: renamed from: g */
    public final i4t0 f90983g;

    /* JADX INFO: renamed from: h */
    public final i4t0 f90984h;

    /* JADX INFO: renamed from: i */
    public final vyr0 f90985i;

    /* JADX INFO: renamed from: j */
    public final wg61 f90986j = new wg61(new yf01(this, 4));

    /* JADX INFO: renamed from: k */
    public final wg61 f90987k = new wg61(new yf01(this, 1));

    /* JADX INFO: renamed from: l */
    public final wg61 f90988l = new wg61(new yf01(this, 3));

    /* JADX INFO: renamed from: m */
    public final wg61 f90989m = new wg61(new yf01(this, 0));

    /* JADX INFO: renamed from: n */
    public final wg61 f90990n = new wg61(new yf01(this, 5));

    /* JADX INFO: renamed from: o */
    public final wg61 f90991o = new wg61(new yf01(this, 2));

    static {
        hvi0 hvi0Var = cks.f39079b;
        f90974p = jwg1.m54449D(5, ils.SECONDS);
        f90975q = jwg1.m54449D(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, ils.MILLISECONDS);
    }

    public hg01(vmz vmzVar, be01 be01Var, h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3, h4t0 h4t0Var4, h4t0 h4t0Var5, h4t0 h4t0Var6, vyr0 vyr0Var) {
        this.f90977a = vmzVar;
        this.f90978b = be01Var;
        this.f90979c = h4t0Var;
        this.f90980d = h4t0Var2;
        this.f90981e = h4t0Var3;
        this.f90982f = h4t0Var4;
        this.f90983g = h4t0Var5;
        this.f90984h = h4t0Var6;
        this.f90985i = vyr0Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m47392c(hg01 hg01Var, qf40 qf40Var, fxh0 fxh0Var, String str, f4m0 f4m0Var, xq00 xq00Var, int i) {
        int i2;
        yw70 yw70Var;
        boolean z;
        gh00 gh00Var;
        boolean z2;
        f4m0 f4m0VarM83011m;
        hg01Var.getClass();
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(584273065);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(qf40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(f4m0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            Iterator<E> it = qf40Var.iterator();
            int iMo33075a = 0;
            while (it.hasNext()) {
                iMo33075a += ((AbstractC2282q6) ((xf01) it.next()).f260803c).mo33075a();
            }
            if (iMo33075a > 0) {
                xq00Var.m91771i0(-1423042721);
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == obj) {
                    objM91750T = sam.m77674m(new e6c0(yw70VarM30763a, 24));
                    xq00Var.m91793t0(objM91750T);
                }
                rv41 rv41Var = (rv41) objM91750T;
                Object[] objArr = new Object[0];
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    objM91750T2 = new jn2(rv41Var, 13);
                    xq00Var.m91793t0(objM91750T2);
                }
                kqi0 kqi0Var = (kqi0) dul.m37018u(objArr, (eh00) objM91750T2, xq00Var, 48);
                Object[] objArr2 = new Object[0];
                Object objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == obj) {
                    objM91750T3 = n701.f151017Z;
                    xq00Var.m91793t0(objM91750T3);
                }
                vum0 vum0Var = (vum0) dul.m37018u(objArr2, (eh00) objM91750T3, xq00Var, 48);
                Integer numValueOf = Integer.valueOf(iMo33075a);
                Boolean bool = (Boolean) rv41Var.getValue();
                bool.getClass();
                boolean zM91766g = xq00Var.m91766g(kqi0Var) | xq00Var.m91762e(iMo33075a) | xq00Var.m91766g(vum0Var) | xq00Var.m91766g(yw70VarM30763a);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91766g || objM91750T4 == obj) {
                    yw70Var = yw70VarM30763a;
                    objM91750T4 = new es1(iMo33075a, yw70Var, kqi0Var, vum0Var, rv41Var, (fbk) null);
                    xq00Var.m91793t0(objM91750T4);
                } else {
                    yw70Var = yw70VarM30763a;
                }
                hz40.m49236h(numValueOf, bool, (th00) objM91750T4, xq00Var);
                z = false;
                xq00Var.m91788r(false);
            } else {
                yw70Var = yw70VarM30763a;
                z = false;
                xq00Var.m91771i0(-1422617959);
                xq00Var.m91788r(false);
            }
            if (str == null) {
                xq00Var.m91771i0(-1422547311);
                xq00Var.m91788r(z);
                gh00Var = null;
            } else {
                xq00Var.m91771i0(-1422547310);
                boolean z3 = (i2 & 896) == 256;
                Object objM91750T5 = xq00Var.m91750T();
                if (z3 || objM91750T5 == obj) {
                    objM91750T5 = new zpz0(str, 5);
                    xq00Var.m91793t0(objM91750T5);
                }
                gh00Var = (gh00) objM91750T5;
                xq00Var.m91788r(false);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("SettingsUI", mi21.m61822f(1.0f, fxh0Var));
            xf01 xf01Var = (xf01) g6f.m43745s0(qf40Var);
            if ((xf01Var != null ? xf01Var.f260801a : null) != null) {
                z2 = false;
                f4m0VarM83011m = ufg1.m83011m(f4m0Var, null, new ybs(0), null, null, 13);
            } else {
                z2 = false;
                f4m0VarM83011m = f4m0Var;
            }
            boolean z4 = (i2 & 14) != 4 ? z2 : true;
            Object objM91750T6 = xq00Var.m91750T();
            if (z4 || objM91750T6 == obj) {
                objM91750T6 = new ono0(qf40Var, 24);
                xq00Var.m91793t0(objM91750T6);
            }
            rfg1.m75437g(gh00Var, fxh0VarM39673I, yw70Var, f4m0VarM83011m, (gh00) objM91750T6, xq00Var, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r0r0(hg01Var, qf40Var, fxh0Var, str, f4m0Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final ds51 m47393d(hg01 hg01Var) {
        return (ds51) hg01Var.f90986j.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r0v5, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r7v8, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: e */
    public static final Object m47394e(hg01 hg01Var, yam yamVar, String str, ibk ibkVar) {
        ag01 ag01Var;
        String str2;
        dut dutVar;
        String str3;
        wam wamVar;
        Object objInvoke;
        hg01Var.getClass();
        if (ibkVar instanceof ag01) {
            ag01Var = (ag01) ibkVar;
            int i = ag01Var.f15264h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag01Var.f15264h = i - Integer.MIN_VALUE;
            } else {
                ag01Var = new ag01(hg01Var, ibkVar);
            }
        } else {
            ag01Var = new ag01(hg01Var, ibkVar);
        }
        Object obj = ag01Var.f15262f;
        int i2 = ag01Var.f15264h;
        if (i2 == 0) {
            bga.m29073P(obj);
            str2 = yamVar.f270947b;
            dutVar = (dut) yamVar.f270951f.get();
            wam wamVar2 = yamVar.f270952g;
            if (wamVar2 instanceof vam) {
                objInvoke = ((vam) wamVar2).f239299b.invoke(yamVar.f270948c);
            } else {
                if (!(wamVar2 instanceof tam)) {
                    throw new NoWhenBranchMatchedException();
                }
                xay0 xay0Var = new xay0(wamVar2, yamVar, null, 22);
                ag01Var.f15257a = yamVar;
                ag01Var.f15258b = (tam) wamVar2;
                ag01Var.f15259c = str;
                ag01Var.f15260d = str2;
                ag01Var.f15261e = dutVar;
                ag01Var.f15264h = 1;
                Object objM76981v = s1h1.m76981v(f90974p, xay0Var, ag01Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
                str3 = str2;
                obj = objM76981v;
                wamVar = wamVar2;
            }
            return new tf01(str, str2, dutVar, objInvoke);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dut dutVar2 = ag01Var.f15261e;
        String str4 = ag01Var.f15260d;
        String str5 = ag01Var.f15259c;
        wamVar = ag01Var.f15258b;
        yam yamVar2 = ag01Var.f15257a;
        bga.m29073P(obj);
        dutVar = dutVar2;
        yamVar = yamVar2;
        str3 = str4;
        str = str5;
        objInvoke = obj == null ? ((tam) wamVar).f218631b.invoke(yamVar.f270948c) : obj;
        str2 = str3;
        return new tf01(str, str2, dutVar, objInvoke);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9 A[LOOP:0: B:23:0x00cb->B:27:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0139  */
    /* JADX WARN: Code duplicated, block: B:41:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0139 -> B:35:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m47395f(p204p.hg01 r18, java.util.List r19, p204p.wf01 r20, boolean r21, p204p.ibk r22) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.hg01.m47395f(p.hg01, java.util.List, p.wf01, boolean, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static final tf01 m47396g(String str, gn41 gn41Var, hg01 hg01Var, dut dutVar, fn41 fn41Var) {
        return new tf01(str, gn41Var.f81562b, dutVar, new f901(hg01Var.f90978b, gn41Var, fn41Var, w2a1.f247311a, hg01Var.f90985i));
    }

    /* JADX INFO: renamed from: a */
    public final void m47397a(boolean z, boolean z2, f4m0 f4m0Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        fyf fyfVar2;
        C2087le c2087le;
        yhh yhhVar;
        C2087le c2087le2;
        cxh0 cxh0Var;
        yhh yhhVar2;
        vlh vlhVar;
        boolean z3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1185646949);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91768h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91766g(f4m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(fyfVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            im91 im91VarM53259E = jg31.m53259E(cks.m33198q(leu.m58817c(xq00Var2).f235363b.f225040b, ils.MILLISECONDS), 0, ((pku) leu.m58817c(xq00Var2).f235362a.f197471b).f178552c, 2);
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var2.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z4 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T2 = xq00Var2.m91750T();
            fbk fbkVar = null;
            if (z4 || objM91750T2 == ia7Var) {
                objM91750T2 = new lpf(z2, kqi0Var, fbkVar, 5);
                xq00Var2.m91793t0(objM91750T2);
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T2, xq00Var2);
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var2);
            soh.f211194A.getClass();
            C2087le c2087le3 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le3);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar3 = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar3, xq00Var2);
            yhh yhhVar4 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar4, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar5 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar5, xq00Var2);
            vlh vlhVar2 = roh.f201266k;
            zsf1.m96833D(vlhVar2, xq00Var2);
            yhh yhhVar6 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar6, xq00Var2);
            rv41 rv41VarM79506b = sw4.m79506b(((Boolean) kqi0Var.getValue()).booleanValue() ? 1.0f : 0.0f, im91VarM53259E, "settingsSpinnerAlpha", null, xq00Var2, 3072, 20);
            if (z2 && ((Number) rv41VarM79506b.getValue()).floatValue() == 0.0f) {
                xq00Var2.m91771i0(175986701);
                xq00Var2.m91788r(false);
                c2087le2 = c2087le3;
                yhhVar2 = yhhVar5;
                vlhVar = vlhVar2;
                yhhVar = yhhVar6;
                z3 = true;
                cxh0Var = cxh0Var2;
            } else {
                xq00Var2.m91771i0(175532148);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, zxc.m97185e(((Number) rv41VarM79506b.getValue()).floatValue(), cxh0Var2));
                if (!z) {
                    fxh0VarM61822f = fxh0VarM61822f.mo34315F(mi21.m61819c(1.0f, cxh0Var2));
                }
                fxh0 fxh0VarM96864x = zsf1.m96864x(fxh0VarM61822f, f4m0Var);
                m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46174i, false);
                int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96864x);
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    c2087le = c2087le3;
                    xq00Var2.m91776l(c2087le);
                } else {
                    c2087le = c2087le3;
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, yhhVar3, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar4, xq00Var2);
                AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar5, xq00Var2, vlhVar2);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar6, xq00Var2);
                yhhVar = yhhVar6;
                c2087le2 = c2087le;
                cxh0Var = cxh0Var2;
                yhhVar2 = yhhVar5;
                vlhVar = vlhVar2;
                z3 = true;
                p271.m68899b(epv0.m39673I(((Boolean) kqi0Var.getValue()).booleanValue() ? "SettingsSpinner" : "SettingsSpinnerInvisible", cxh0Var2), 5, 0L, 0L, xq00Var, 48, 12);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(false);
            }
            fxh0 fxh0VarM97185e = zxc.m97185e(((Number) sw4.m79506b(z2 ? 1.0f : 0.0f, im91VarM53259E, "settingsContentAlpha", null, xq00Var2, 3072, 20).getValue()).floatValue(), cxh0Var);
            m6d0 m6d0VarM36007d3 = dha.m36007d(wb9Var, false);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM97185e);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le2);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d3, yhhVar3, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar4, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar2, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar, xq00Var2);
            fyfVar2 = fyfVar;
            p3n0.m69076g((i3 >> 9) & 14, fyfVar2, xq00Var2, z3, z3);
        } else {
            fyfVar2 = fyfVar;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1794dy(this, z, z2, f4m0Var, fyfVar2, i, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x016c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m47398b(qf40 qf40Var, fxh0 fxh0Var, boolean z, String str, f4m0 f4m0Var, xq00 xq00Var, int i, int i2) {
        boolean z2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        String str3;
        pgv0 pgv0VarM91796v;
        boolean z5;
        String str4;
        Context context;
        Object objM91750T;
        Object obj;
        xuk xukVar;
        Object objM91750T2;
        wf01 wf01Var;
        boolean z6;
        Object objM91750T3;
        kqi0 kqi0VarM77670i;
        boolean zM91766g;
        Object objM91750T4;
        hg01 hg01Var = this;
        xq00Var.m91775k0(-76218759);
        int i9 = (xq00Var.m91770i(qf40Var) ? 4 : 2) | i | (xq00Var.m91766g(fxh0Var) ? 32 : 16);
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i9 |= xq00Var.m91768h(z2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i9 | 3072;
                str2 = str;
            } else {
                str2 = str;
                if (xq00Var.m91766g(str2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 = i9 | i4;
            }
            if (xq00Var.m91766g(f4m0Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            int i11 = i5 | i6;
            if (xq00Var.m91766g(hg01Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i8 = i11 | i7;
            if ((74899 & i8) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i8 & 1, z3)) {
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i3 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
                objM91750T = xq00Var.m91750T();
                obj = t6x0.f217647t;
                if (objM91750T == obj) {
                    objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                xukVar = (xuk) objM91750T;
                objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    objM91750T2 = new wf01(context);
                    xq00Var.m91793t0(objM91750T2);
                }
                wf01Var = (wf01) objM91750T2;
                if ((i8 & 14) != 4 || xq00Var.m91766g(qf40Var)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM91750T3 = xq00Var.m91750T();
                if (z6 || objM91750T3 == obj) {
                    objM91750T3 = bzf1.m31027s(xtm0.m92074U(hg01Var.f90977a.m86024a("restrict-settings-for-child", false), new g1i(null, hg01Var, qf40Var, wf01Var)), xukVar, hf11.m47320a(3, 0L), 1);
                    xq00Var.m91793t0(objM91750T3);
                }
                kqi0VarM77670i = sam.m77670i((eb11) objM91750T3, lv21.f137205b, null, xq00Var, 48, 2);
                String str5 = str4;
                int i12 = i8 >> 6;
                boolean z7 = z5;
                m47397a(z7, !((qf40) kqi0VarM77670i.getValue()).isEmpty(), f4m0Var, rkk.m75772x(-1541350411, new ics0(this, fxh0Var, str4, f4m0Var, kqi0VarM77670i), xq00Var), xq00Var, (i12 & 896) | (i12 & 14) | 3072 | (57344 & (i8 >> 3)));
                hg01Var = this;
                zM91766g = xq00Var.m91766g(kqi0VarM77670i);
                objM91750T4 = xq00Var.m91750T();
                if (zM91766g || objM91750T4 == obj) {
                    objM91750T4 = new y3o0(kqi0VarM77670i, 24);
                    xq00Var.m91793t0(objM91750T4);
                }
                hg01Var.f90985i.m86844a(hg01Var.f90978b, (gh00) objM91750T4, xq00Var, 512);
                str3 = str5;
                z4 = z7;
            } else {
                xq00Var.m91757b0();
                z4 = z2;
                str3 = str2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new rf01(hg01Var, qf40Var, fxh0Var, z4, str3, f4m0Var, i, i2);
            }
        }
        i9 |= 384;
        z2 = z;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i9 | 3072;
            str2 = str;
        } else {
            str2 = str;
            if (xq00Var.m91766g(str2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i9 | i4;
        }
        if (xq00Var.m91766g(f4m0Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i5 | i6;
        if (xq00Var.m91766g(hg01Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        i8 = i13 | i7;
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq00Var.m91752Y(i8 & 1, z3)) {
            if (i10 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i3 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            objM91750T = xq00Var.m91750T();
            obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            xukVar = (xuk) objM91750T;
            objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = new wf01(context);
                xq00Var.m91793t0(objM91750T2);
            }
            wf01Var = (wf01) objM91750T2;
            if ((i8 & 14) != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            objM91750T3 = xq00Var.m91750T();
            if (z6) {
                objM91750T3 = bzf1.m31027s(xtm0.m92074U(hg01Var.f90977a.m86024a("restrict-settings-for-child", false), new g1i(null, hg01Var, qf40Var, wf01Var)), xukVar, hf11.m47320a(3, 0L), 1);
                xq00Var.m91793t0(objM91750T3);
            } else {
                objM91750T3 = bzf1.m31027s(xtm0.m92074U(hg01Var.f90977a.m86024a("restrict-settings-for-child", false), new g1i(null, hg01Var, qf40Var, wf01Var)), xukVar, hf11.m47320a(3, 0L), 1);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0VarM77670i = sam.m77670i((eb11) objM91750T3, lv21.f137205b, null, xq00Var, 48, 2);
            String str6 = str4;
            int i14 = i8 >> 6;
            boolean z8 = z5;
            m47397a(z8, !((qf40) kqi0VarM77670i.getValue()).isEmpty(), f4m0Var, rkk.m75772x(-1541350411, new ics0(this, fxh0Var, str4, f4m0Var, kqi0VarM77670i), xq00Var), xq00Var, (i14 & 896) | (i14 & 14) | 3072 | (57344 & (i8 >> 3)));
            hg01Var = this;
            zM91766g = xq00Var.m91766g(kqi0VarM77670i);
            objM91750T4 = xq00Var.m91750T();
            if (zM91766g) {
                objM91750T4 = new y3o0(kqi0VarM77670i, 24);
                xq00Var.m91793t0(objM91750T4);
            } else {
                objM91750T4 = new y3o0(kqi0VarM77670i, 24);
                xq00Var.m91793t0(objM91750T4);
            }
            hg01Var.f90985i.m86844a(hg01Var.f90978b, (gh00) objM91750T4, xq00Var, 512);
            str3 = str6;
            z4 = z8;
        } else {
            xq00Var.m91757b0();
            z4 = z2;
            str3 = str2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf01(hg01Var, qf40Var, fxh0Var, z4, str3, f4m0Var, i, i2);
        }
    }
}
