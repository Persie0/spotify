package p204p;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import p000.C1635n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o2h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f161052a;

    /* JADX INFO: renamed from: b */
    public static boolean f161053b;

    /* JADX INFO: renamed from: a */
    public static final void m66107a(yq2 yq2Var, mp2 mp2Var, i8g0 i8g0Var, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        yq2 yq2Var2 = yq2Var;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(348147368);
        int i2 = i | (xq00Var2.m91766g(yq2Var2) ? 4 : 2) | (xq00Var2.m91770i(mp2Var) ? 32 : 16) | (xq00Var2.m91770i(i8g0Var) ? 256 : 128) | (xq00Var2.m91770i(fxh0Var) ? 2048 : 1024) | (xq00Var2.m91770i(eh00Var) ? 16384 : 8192);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            String str = yq2Var2.f275111a;
            if71 if71Var = leu.m58818d(xq00Var2).f64969e;
            float f = leu.m58816b(xq00Var2).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(str, zsf1.m96865y(f, cxh0Var), if71Var, 0L, null, null, 2, false, new ol80(2), 0, null, xq00Var, 0, 0, 1720);
            xq00Var2 = xq00Var;
            riw0.m75615i(xq00Var2, zsf1.m96830A(nec.m64246i(mi21.m61822f(1.0f, mi21.m61824h(1, cxh0Var)), leu.m58815a(xq00Var2).f112823a.f229875b.f123094b, kxf1.f127485a), 0.0f, leu.m58816b(xq00Var2).f117230b.f224759b, 1));
            boolean zM91770i = xq00Var2.m91770i(i8g0Var);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new lc1(i8g0Var, 20);
                xq00Var2.m91793t0(objM91750T);
            }
            oq91 oq91Var = new oq91((gh00) objM91750T);
            boolean zM91770i2 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384) | xq00Var2.m91770i(mp2Var);
            Object objM91750T2 = xq00Var2.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                yq2Var2 = yq2Var;
                objM91750T2 = new C2639z6(yq2Var2, eh00Var, mp2Var, 8);
                xq00Var2.m91793t0(objM91750T2);
            } else {
                yq2Var2 = yq2Var;
            }
            n3h1.m63613b(null, null, null, null, null, null, false, oq91Var, (gh00) objM91750T2, xq00Var2, 0, 255);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1635n(yq2Var2, mp2Var, i8g0Var, fxh0Var, eh00Var, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX INFO: renamed from: b */
    public static final void m66108b(final eh00 eh00Var, final fxh0 fxh0Var, final xfg1 xfg1Var, final ch01 ch01Var, final f1p f1pVar, final f4m0 f4m0Var, fyf fyfVar, xq00 xq00Var, final int i) {
        fyf fyfVar2;
        boolean z;
        gw4 gw4Var;
        q05 q05Var;
        int i2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1084573925);
        int i3 = (xq00Var.m91766g(f4m0Var) ? 67108864 : 33554432) | i | (xq00Var.m91770i(eh00Var) ? 4 : 2) | (xq00Var.m91766g(fxh0Var) ? 32 : 16) | (xq00Var.m91768h(true) ? 256 : 128) | (xq00Var.m91766g(null) ? 2048 : 1024) | (xq00Var.m91766g(xfg1Var) ? 16384 : 8192) | (xq00Var.m91766g(ch01Var) ? 131072 : 65536) | (xq00Var.m91766g(null) ? 1048576 : 524288) | (xq00Var.m91766g(f1pVar) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i3 & 1, (306783379 & i3) != 306783378)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            xq00Var.m91771i0(497721888);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == obj) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            voi0 voi0Var = (voi0) objM91750T;
            xq00Var.m91788r(false);
            int i4 = i3 >> 6;
            xq00Var.m91771i0(-2133647540);
            kqi0 kqi0VarM77651H = sam.m77651H(new n6f(f1pVar.f64942b), xq00Var);
            xq00Var.m91788r(false);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = new C2126mg(11);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0Var, false, (gh00) objM91750T2);
            xq00Var.m91771i0(-655254499);
            kqi0 kqi0VarM77651H2 = sam.m77651H(new n6f(f1pVar.f64941a), xq00Var);
            xq00Var.m91788r(false);
            long j = ((n6f) kqi0VarM77651H2.getValue()).f150873a;
            long jM63765b = n6f.m63765b(((n6f) kqi0VarM77651H.getValue()).f150873a, 1.0f, 0.0f, 0.0f, 0.0f, 14);
            if (xfg1Var == null) {
                xq00Var.m91771i0(498128545);
                xq00Var.m91788r(false);
                i4 = i4;
                i2 = 0;
                q05Var = null;
            } else {
                xq00Var.m91771i0(1401541984);
                xq00Var.m91771i0(-1588756907);
                Object objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == obj) {
                    objM91750T3 = new gb31();
                    xq00Var.m91793t0(objM91750T3);
                }
                gb31 gb31Var = (gb31) objM91750T3;
                boolean zM91766g = xq00Var.m91766g(voi0Var);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91766g || objM91750T4 == obj) {
                    objM91750T4 = new eta(voi0Var, gb31Var, null, 2);
                    xq00Var.m91793t0(objM91750T4);
                }
                hz40.m49237i(voi0Var, (th00) objM91750T4, xq00Var);
                b650 b650Var = (b650) g6f.m43689C0(gb31Var);
                Object objM91750T5 = xq00Var.m91750T();
                if (objM91750T5 == obj) {
                    objM91750T5 = new gw4(new ybs(0.0f), geg1.f79122c, null, 12);
                    xq00Var.m91793t0(objM91750T5);
                }
                gw4 gw4Var2 = (gw4) objM91750T5;
                ybs ybsVar = new ybs(0.0f);
                boolean zM91770i = xq00Var.m91770i(gw4Var2) | xq00Var.m91760d(0.0f);
                if (((i4 & 14) ^ 6) > 4 && xq00Var.m91768h(true)) {
                    z = true;
                } else if ((i4 & 6) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zM91770i2 = z | zM91770i | ((((i4 & 896) ^ 384) > 256 && xq00Var.m91766g(xfg1Var)) || (i4 & 384) == 256) | xq00Var.m91770i(b650Var);
                Object objM91750T6 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T6 == obj) {
                    gw4Var = gw4Var2;
                    Object ey4Var = new ey4(gw4Var, 0.0f, xfg1Var, b650Var, (fbk) null);
                    xq00Var.m91793t0(ey4Var);
                    objM91750T6 = ey4Var;
                } else {
                    gw4Var = gw4Var2;
                }
                hz40.m49237i(ybsVar, (th00) objM91750T6, xq00Var);
                q05Var = gw4Var.f84908c;
                i2 = 0;
                xq00Var.m91788r(false);
                xq00Var.m91788r(false);
            }
            fyfVar2 = fyfVar;
            yjg1.m93911c(eh00Var, fxh0VarM96644b, ch01Var, j, jM63765b, q05Var != null ? ((ybs) q05Var.f183906b.getValue()).f271238a : i2, voi0Var, rkk.m75772x(-20345758, new C2493vf(kqi0VarM77651H, f4m0Var, fyfVar2, 2), xq00Var), xq00Var, (i4 & 7168) | (i3 & 14) | 805306368 | (i3 & 896) | (3670016 & i3));
        } else {
            fyfVar2 = fyfVar;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            final fyf fyfVar3 = fyfVar2;
            pgv0VarM91796v.f177419d = new th00(fxh0Var, xfg1Var, ch01Var, f1pVar, f4m0Var, fyfVar3, i) { // from class: p.kta

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ fxh0 f126195b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ch01 f126196c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ f1p f126197d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ f4m0 f126198e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ fyf f126199f;

                {
                    this.f126196c = ch01Var;
                    this.f126197d = f1pVar;
                    this.f126198e = f4m0Var;
                    this.f126199f = fyfVar3;
                }

                @Override // p204p.th00
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM43076B = fyg1.m43076B(805306369);
                    o2h1.m66108b(this.f126194a, this.f126195b, null, this.f126196c, this.f126197d, this.f126198e, this.f126199f, (xq00) obj2, iM43076B);
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m66109c(g1k g1kVar, gh00 gh00Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        agc agcVar;
        xq00Var.m91775k0(-1405450392);
        int i2 = (xq00Var.m91770i(g1kVar) ? 4 : 2) | i | (xq00Var.m91770i(gh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            dkn dknVar = (dkn) xq00Var.m91774k(xlb1.f263092b);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                jpj jpjVar = new jpj(3, gh00Var);
                switch (dknVar.f49998a) {
                    case 0:
                        agcVar = new agc(new gl8(17, (rkn) ((xkn) ((phn) dknVar.f49999b).f177690d).f262746j2.get(), new bc5(14)), jpjVar);
                        break;
                    case 1:
                        agcVar = new agc(new gl8(17, (rkn) ((nmn) ((vfn) dknVar.f49999b).f241006d).f156026l4.get(), new bc5(14)), jpjVar);
                        break;
                    default:
                        agcVar = new agc(new gl8(17, (rkn) ((otn) ((vfn) dknVar.f49999b).f241006d).f169913s2.get(), new bc5(14)), jpjVar);
                        break;
                }
                objM91750T = agcVar;
                xq00Var.m91793t0(objM91750T);
            }
            dut dutVar = (dut) objM91750T;
            boolean zM91766g = xq00Var.m91766g(g1kVar.f75641a);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == ia7Var) {
                xq00Var.m91793t0(g1kVar);
                objM91750T2 = g1kVar;
            }
            xq00Var2 = xq00Var;
            mif1.m61869b(dutVar, (g1k) objM91750T2, null, null, xq00Var2, 0, 12);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nph(g1kVar, gh00Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m66110d(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(1999780602);
        int i2 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var;
            alo0.m26350a(dlo0.f50290a, fxh0Var2, null, 0L, false, xq00Var2, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 6, 28);
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zen0(fxh0Var2, i, 7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m66111e(fzv0 fzv0Var, tk9 tk9Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-711373789);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = (i & 6) == 0 ? i | (xq00Var.m91770i(fzv0Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(tk9Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224762e, 0.0f, leu.m58816b(xq00Var).f117230b.f224762e, 5);
            boolean zM91770i = xq00Var.m91770i(fzv0Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new gnv0(fzv0Var, 8);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM96832C, false, (gh00) objM91750T);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fxh0 fxh0VarM96831B = zsf1.m96831B(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = pxv0.f183256c1;
                xq00Var.m91793t0(objM91750T2);
            }
            boolean z = true;
            ia7 ia7Var2 = ia7Var;
            cxh0 cxh0Var2 = cxh0Var;
            ahf1.m25932d(fzv0Var.f75187a, zoz0.m96644b(fxh0VarM96831B, false, (gh00) objM91750T2), leu.m58818d(xq00Var).f64969e, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            ArrayList arrayList = fzv0Var.f75188b;
            xq00Var.m91771i0(-940968456);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                ezv0 ezv0Var = (ezv0) obj;
                boolean z2 = i4 == arrayList.size() + (-1) ? z : false;
                boolean zM91762e = xq00Var.m91762e(i4);
                Object objM91750T3 = xq00Var.m91750T();
                ia7 ia7Var3 = ia7Var2;
                if (zM91762e || objM91750T3 == ia7Var3) {
                    objM91750T3 = new r430(i4, 28);
                    xq00Var.m91793t0(objM91750T3);
                }
                cxh0 cxh0Var3 = cxh0Var2;
                fxh0 fxh0VarM96644b2 = zoz0.m96644b(cxh0Var3, false, (gh00) objM91750T3);
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96644b2);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le2);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var);
                mif1.m61869b(tk9Var, ezv0Var, null, null, xq00Var, (i3 >> 3) & 14, 12);
                xq00Var.m91788r(z);
                if (z2) {
                    xq00Var.m91771i0(1694327180);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1694085969);
                    ysj0.m94486a(0, 0, xq00Var, zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var3), leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 10));
                    xq00Var.m91788r(false);
                }
                i4 = i5;
                ia7Var2 = ia7Var3;
                cxh0Var2 = cxh0Var3;
                z = true;
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var2;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nns0(fzv0Var, tk9Var, fxh0Var2, i, 23);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m66112f(int i, b450 b450Var, int i2, int i3, int i4, long j, long j2, long j3, if71 if71Var, yb71 yb71Var, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, xq00 xq00Var, int i5, int i6) {
        int i7;
        int i8;
        xq00 xq00Var2;
        Object obj;
        Object brd1Var;
        boolean z;
        int i9;
        gw4 gw4Var;
        int i10;
        fxh0 fxh0Var;
        xq00 xq00Var3;
        b450 b450Var2 = b450Var;
        xq00 xq00Var4 = xq00Var;
        xq00Var4.m91775k0(-1337417768);
        if ((i5 & 6) == 0) {
            i7 = (xq00Var4.m91762e(i) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= xq00Var4.m91770i(b450Var2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= xq00Var4.m91762e(i2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= xq00Var4.m91762e(i3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= xq00Var4.m91762e(i4) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= xq00Var4.m91764f(j) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= xq00Var4.m91764f(j2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= xq00Var4.m91764f(j3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= xq00Var4.m91770i(if71Var) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= xq00Var4.m91770i(yb71Var) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (xq00Var4.m91770i(gh00Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= xq00Var4.m91770i(gh00Var2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= xq00Var4.m91770i(gh00Var3) ? 256 : 128;
        }
        if (xq00Var4.m91752Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            yqq yqqVar = (yqq) xq00Var4.m91774k(wsh.f254617h);
            float fMo35989Z0 = yqqVar.mo35989Z0(leu.m58816b(xq00Var4).f117230b.f224765h);
            xq00Var4.m91771i0(-1063236651);
            float fMo35989Z1 = yqqVar.mo35989Z0(leu.m58816b(xq00Var4).f117231c.f127593b);
            int i11 = i8;
            xq00Var4.m91788r(false);
            xq00Var4.m91771i0(-1063234060);
            float fMo35989Z2 = yqqVar.mo35989Z0(leu.m58816b(xq00Var4).f117230b.f224761d);
            xq00Var4.m91788r(false);
            xq00Var4.m91771i0(-1063231469);
            float fMo35989Z3 = yqqVar.mo35989Z0(leu.m58816b(xq00Var4).f117230b.f224769l);
            xq00Var4.m91788r(false);
            float f = leu.m58816b(xq00Var4).f117230b.f224769l;
            jc20 jc20Var = (jc20) xq00Var4.m91774k(wsh.f254621l);
            Object objM91750T = xq00Var4.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var4);
                xq00Var4.m91793t0(objM91750T);
            }
            xuk xukVar = (xuk) objM91750T;
            Object objM91750T2 = xq00Var4.m91750T();
            if (objM91750T2 == ia7Var) {
                gw4 gw4VarM77551a = s95.m77551a(0.0f);
                gw4VarM77551a.m45916i(Float.valueOf(0.0f), Float.valueOf(i4));
                xq00Var4.m91793t0(gw4VarM77551a);
                obj = gw4VarM77551a;
            } else {
                obj = objM91750T2;
            }
            gw4 gw4Var2 = (gw4) obj;
            Object objM91750T3 = xq00Var4.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                xq00Var4.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var = (kqi0) objM91750T3;
            Object objM91750T4 = xq00Var4.m91750T();
            if (objM91750T4 == ia7Var) {
                objM91750T4 = j4x.m52407e(-1, xq00Var4);
            }
            vum0 vum0Var = (vum0) objM91750T4;
            int i12 = i7 & 14;
            boolean zM91770i = xq00Var4.m91770i(gw4Var2) | (i12 == 4) | xq00Var4.m91770i(b450Var2);
            int i13 = i7 & 896;
            int i14 = i7;
            boolean z2 = (i13 == 256) | zM91770i;
            Object objM91750T5 = xq00Var4.m91750T();
            if (z2 || objM91750T5 == ia7Var) {
                z = false;
                i9 = i13;
                gw4Var = gw4Var2;
                brd1Var = new brd1(gw4Var, i, b450Var2, i2, null);
                xq00Var4.m91793t0(brd1Var);
            } else {
                brd1Var = objM91750T5;
                i9 = i13;
                gw4Var = gw4Var2;
                z = false;
            }
            w2a1 w2a1Var = w2a1.f247311a;
            hz40.m49237i(w2a1Var, (th00) brd1Var, xq00Var4);
            Integer numValueOf = Integer.valueOf(i);
            Object value = kqi0Var.getValue();
            kqi0 kqi0Var2 = kqi0Var;
            boolean zM91770i2 = xq00Var4.m91770i(kqi0Var2) | (r31 == 4 ? true : z) | xq00Var4.m91770i(b450Var2) | (i9 == 256 ? true : z) | xq00Var4.m91770i(gw4Var);
            Object objM91750T6 = xq00Var4.m91750T();
            if (zM91770i2 || objM91750T6 == ia7Var) {
                gw4 gw4Var3 = gw4Var;
                i10 = 16384;
                objM91750T6 = new x47(kqi0Var2, i, b450Var2, i2, gw4Var3, null);
                kqi0Var2 = kqi0Var2;
                gw4Var = gw4Var3;
                xq00Var4.m91793t0(objM91750T6);
            } else {
                i10 = 16384;
            }
            hz40.m49236h(numValueOf, value, (th00) objM91750T6, xq00Var4);
            fxh0 fxh0VarM57833o = l0y0.m57833o(mi21.m61824h(f, mi21.m61822f(1.0f, cxh0.f43038a)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, null, 458751);
            boolean zM91760d = xq00Var4.m91760d(r27);
            Object objM91750T7 = xq00Var4.m91750T();
            if (zM91760d || objM91750T7 == ia7Var) {
                objM91750T7 = new y2g0(fMo35989Z3, 21);
                xq00Var4.m91793t0(objM91750T7);
            }
            fxh0 fxh0VarM95414A = z520.m95414A(fxh0VarM57833o, (gh00) objM91750T7);
            int i15 = i14 & 57344;
            boolean zM91770i3 = xq00Var4.m91770i(kqi0Var2) | xq00Var4.m91770i(r30) | xq00Var4.m91770i(gw4Var) | (i15 == i10 ? true : z) | xq00Var4.m91770i(b450Var2) | (i9 == 256 ? true : z) | ((i11 & ContentType.LONG_FORM_ON_DEMAND) == 32 ? true : z) | ((i11 & 896) == 256 ? true : z) | xq00Var4.m91770i(vum0Var) | xq00Var4.m91770i(jc20Var);
            Object objM91750T8 = xq00Var4.m91750T();
            if (zM91770i3 || objM91750T8 == ia7Var) {
                gw4 gw4Var4 = gw4Var;
                erd1 erd1Var = new erd1(kqi0Var2, xukVar, gw4Var4, i4, b450Var2, i2, gh00Var2, gh00Var3, vum0Var, jc20Var);
                gw4Var = gw4Var4;
                b450Var2 = b450Var2;
                xq00Var4.m91793t0(erd1Var);
                objM91750T8 = erd1Var;
            }
            fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM95414A, w2a1Var, (PointerInputEventHandler) objM91750T8);
            boolean zM91770i4 = xq00Var4.m91770i(gw4Var) | xq00Var4.m91760d(fMo35989Z2) | xq00Var4.m91760d(fMo35989Z0) | (i15 == 16384) | xq00Var4.m91770i(b450Var2) | (i9 == 256) | (i12 == 4) | ((i14 & 7168) == 2048) | ((458752 & i14) == 131072) | ((3670016 & i14) == 1048576) | xq00Var4.m91760d(fMo35989Z1) | ((i11 & 14) == 4) | xq00Var4.m91770i(yb71Var) | xq00Var4.m91770i(if71Var) | ((i14 & 29360128) == 8388608);
            Object objM91750T9 = xq00Var4.m91750T();
            if (zM91770i4 || objM91750T9 == ia7Var) {
                fxh0Var = fxh0VarM69516a;
                frd1 frd1Var = new frd1(gw4Var, fMo35989Z2, fMo35989Z0, i4, b450Var2, i2, i, i3, j, j2, fMo35989Z1, gh00Var, yb71Var, if71Var, j3);
                xq00 xq00Var5 = xq00Var;
                xq00Var5.m91793t0(frd1Var);
                objM91750T9 = frd1Var;
                xq00Var3 = xq00Var5;
            } else {
                fxh0Var = fxh0VarM69516a;
                xq00Var3 = xq00Var4;
            }
            xud.m92135b(0, (gh00) objM91750T9, xq00Var3, fxh0Var);
            xq00Var2 = xq00Var3;
        } else {
            xq00Var4.m91757b0();
            xq00Var2 = xq00Var4;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new grd1(i, b450Var, i2, i3, i4, j, j2, j3, if71Var, yb71Var, gh00Var, gh00Var2, gh00Var3, i5, i6);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m66113g(int i, long j, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1628732199);
        int i2 = (xq00Var.m91764f(j) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = leu.m58816b(xq00Var).f117230b.f224762e;
            float fMo35989Z0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35989Z0(f);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61824h = mi21.m61824h(f, cxh0Var);
            boolean zM91760d = xq00Var.m91760d(fMo35989Z0) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (zM91760d || objM91750T == t6x0.f217647t) {
                objM91750T = new C2064ks(j, fMo35989Z0, 9);
                xq00Var.m91793t0(objM91750T);
            }
            xud.m92135b(0, (gh00) objM91750T, xq00Var, fxh0VarM61824h);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r22(j, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m66114h(int i, b450 b450Var, int i2, int i3, gh00 gh00Var, fxh0 fxh0Var, gh00 gh00Var2, gh00 gh00Var3, xq00 xq00Var, int i4) {
        int i5;
        gh00 gh00Var4;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        int i6 = b450Var.f278778a;
        int i7 = b450Var.f278779b;
        xq00Var2.m91775k0(1888025828);
        if ((i4 & 6) == 0) {
            i5 = (xq00Var2.m91762e(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= xq00Var2.m91770i(b450Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= xq00Var2.m91762e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= xq00Var2.m91762e(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= xq00Var2.m91770i(gh00Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= xq00Var2.m91770i(fxh0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= xq00Var2.m91770i(gh00Var2) ? 1048576 : 524288;
        }
        int i8 = i5 | 12582912;
        if (xq00Var2.m91752Y(i8 & 1, (i8 & 4793491) != 4793490)) {
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == ia7Var) {
                objM91750T = hrd1.f94418h;
                xq00Var2.m91793t0(objM91750T);
            }
            gh00 gh00Var5 = (gh00) objM91750T;
            int i9 = (i7 - i6) / i2;
            long j = leu.m58815a(xq00Var2).f112824b.f138759c;
            long j2 = leu.m58815a(xq00Var2).f112824b.f138758b;
            long j3 = leu.m58815a(xq00Var2).f112824b.f138758b;
            if71 if71Var = leu.m58818d(xq00Var2).f64974j;
            yb71 yb71VarM65706r = nug1.m65706r(0, 1, xq00Var2);
            float f = leu.m58816b(xq00Var2).f117230b.f224759b;
            boolean z = i + i2 <= i7;
            boolean z2 = i - i2 >= i6;
            String strM54978M = k0e1.m54978M(R.string.workout_settings_wheel_picker_content_description, new Object[]{gh00Var5.invoke(Integer.valueOf(i))}, xq00Var2);
            String strM54977L = k0e1.m54977L(R.string.workout_settings_wheel_picker_increase, xq00Var2);
            String strM54977L2 = k0e1.m54977L(R.string.workout_settings_wheel_picker_decrease, xq00Var2);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            boolean z3 = z;
            boolean zM91766g = xq00Var2.m91766g(strM54978M) | xq00Var2.m91768h(z) | xq00Var2.m91766g(strM54977L) | ((i8 & 57344) == 16384) | ((i8 & 14) == 4) | ((i8 & 896) == 256) | xq00Var2.m91768h(z2) | xq00Var2.m91766g(strM54977L2);
            Object objM91750T2 = xq00Var2.m91750T();
            if (zM91766g || objM91750T2 == ia7Var) {
                ird1 ird1Var = new ird1(strM54978M, z3, strM54977L, z2, strM54977L2, gh00Var, i, i2);
                xq00Var2.m91793t0(ird1Var);
                objM91750T2 = ird1Var;
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM61822f, true, (gh00) objM91750T2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96644b);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            m66113g(0, j, xq00Var2, null);
            riw0.m75615i(xq00Var2, mi21.m61824h(f, cxh0.f43038a));
            m66112f(i, b450Var, i2, i3, i9, j, j2, j3, if71Var, yb71VarM65706r, gh00Var5, gh00Var, gh00Var2, xq00Var2, i8 & 8190, ((i8 >> 21) & 14) | ((i8 >> 9) & ContentType.LONG_FORM_ON_DEMAND) | ((i8 >> 12) & 896));
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
            gh00Var4 = gh00Var5;
        } else {
            xq00Var2.m91757b0();
            gh00Var4 = gh00Var3;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jrd1(i, b450Var, i2, i3, gh00Var, fxh0Var, gh00Var2, gh00Var4, i4);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final float m66115i(float f, float f2) {
        float fM63436m = n0e1.m63436m(f, 0.0f, 1.0f);
        float fM63436m2 = n0e1.m63436m(f2, 0.0f, 1.0f);
        if (fM63436m <= fM63436m2 || fM63436m2 >= 1.0f) {
            return 0.0f;
        }
        return n0e1.m63436m((fM63436m - fM63436m2) / (1.0f - fM63436m2), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: j */
    public static final t050 m66116j(z8k z8kVar, ljk0 ljk0Var, djk0 djk0Var, ljk0 ljk0Var2) {
        return ((b9k) z8kVar).m28489g("MediaSessionMedia3PropertyCacheDaemon", new qik0(ljk0Var, djk0Var, ljk0Var2, 13));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m66117k(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!wj50.m88271j(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m66118l(gv51 gv51Var, int i, v8j v8jVar) {
        long jMo24459e = gv51Var.mo24459e(i);
        List listMo24458c = gv51Var.mo24458c(jMo24459e);
        if (listMo24458c.isEmpty()) {
            return;
        }
        if (i == gv51Var.mo24460f() - 1) {
            throw new IllegalStateException();
        }
        long jMo24459e2 = gv51Var.mo24459e(i + 1) - gv51Var.mo24459e(i);
        if (jMo24459e2 > 0) {
            v8jVar.accept(new z0m(jMo24459e, jMo24459e2, listMo24458c));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m66119m(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof u571) {
            m66119m(((u571) charSequence).f226935c, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX INFO: renamed from: n */
    public static void m66120n(gv51 gv51Var, hw51 hw51Var, v8j v8jVar) {
        int iMo24457b;
        boolean z;
        long j = hw51Var.f95864b;
        if (j == -9223372036854775807L) {
            iMo24457b = 0;
        } else {
            iMo24457b = gv51Var.mo24457b(j);
            if (iMo24457b == -1) {
                iMo24457b = gv51Var.mo24460f();
            }
            if (iMo24457b > 0 && gv51Var.mo24459e(iMo24457b - 1) == j) {
                iMo24457b--;
            }
        }
        if (j == -9223372036854775807L || iMo24457b >= gv51Var.mo24460f()) {
            z = false;
        } else {
            List listMo24458c = gv51Var.mo24458c(j);
            long jMo24459e = gv51Var.mo24459e(iMo24457b);
            if (listMo24458c.isEmpty()) {
                z = false;
            } else {
                long j2 = hw51Var.f95864b;
                if (j2 < jMo24459e) {
                    v8jVar.accept(new z0m(j2, jMo24459e - j2, listMo24458c));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iMo24457b; i < gv51Var.mo24460f(); i++) {
            m66118l(gv51Var, i, v8jVar);
        }
        if (hw51Var.f95863a) {
            if (z) {
                iMo24457b--;
            }
            for (int i2 = 0; i2 < iMo24457b; i2++) {
                m66118l(gv51Var, i2, v8jVar);
            }
            if (z) {
                v8jVar.accept(new z0m(gv51Var.mo24459e(iMo24457b), j - gv51Var.mo24459e(iMo24457b), gv51Var.mo24458c(j)));
            }
        }
    }
}
