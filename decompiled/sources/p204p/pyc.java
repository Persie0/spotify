package p204p;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p000.AbstractC0000a;
import p000.C0112c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pyc {

    /* JADX INFO: renamed from: a */
    public static final float f183385a = 32;

    /* JADX INFO: renamed from: b */
    public static final float f183386b = 40;

    /* JADX INFO: renamed from: a */
    public static final void m71606a(uyc uycVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, th00 th00Var, xq00 xq00Var, int i) {
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-860135368);
        int i2 = i | (xq00Var.m91770i(uycVar) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | (xq00Var.m91768h(z2) ? 256 : 128) | (xq00Var.m91768h(z3) ? 2048 : 1024) | (xq00Var.m91768h(z4) ? 16384 : 8192) | (xq00Var.m91768h(z5) ? 131072 : 65536) | (xq00Var.m91770i(th00Var) ? 1048576 : 524288);
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            fbk fbkVar = null;
            if (!(uycVar instanceof syc) || z4 || z3 || z || z2 || z5) {
                xq00Var.m91771i0(-517315542);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-517438550);
                boolean zM91770i = xq00Var.m91770i(th00Var);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == ia7Var) {
                    objM91750T = new ayc(th00Var, fbkVar, 0);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49237i(uycVar, (th00) objM91750T, xq00Var);
                xq00Var.m91788r(false);
            }
            if (!(uycVar instanceof tyc) || z2) {
                xq00Var.m91771i0(-517120118);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-517245048);
                boolean zM91770i2 = xq00Var.m91770i(th00Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T2 == ia7Var) {
                    objM91750T2 = new ayc(th00Var, fbkVar, 1);
                    xq00Var.m91793t0(objM91750T2);
                }
                hz40.m49237i(uycVar, (th00) objM91750T2, xq00Var);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new byc(uycVar, z, z2, z3, z4, z5, th00Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r19v7, types: [p.uyc] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r8v12, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r8v13, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r8v19, types: [p.xq00] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX INFO: renamed from: b */
    public static final void m71607b(bxc bxcVar, jxj jxjVar, kg11 kg11Var, en2 en2Var, gh00 gh00Var, String str, gh00 gh00Var2, boolean z, jan janVar, p8p0 p8p0Var, ry31 ry31Var, w47 w47Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, xq00 xq00Var, int i) {
        ?? r8;
        kqi0 kqi0Var;
        float fM96858r;
        fbk fbkVar;
        kqi0 kqi0Var2;
        fbk fbkVar2;
        boolean z7;
        gh00 gh00Var3;
        ?? r1;
        ?? r9;
        ?? r11;
        float f;
        float f2;
        ?? r10 = xq00Var;
        uyc uycVar = bxcVar.f31818a;
        boolean z8 = bxcVar.f31820c;
        r10.m91775k0(-53620601);
        int i2 = i | (r10.m91770i(bxcVar) ? 4 : 2) | (r10.m91770i(jxjVar) ? 32 : 16) | (r10.m91770i(kg11Var) ? 256 : 128) | (r10.m91770i(en2Var) ? 2048 : 1024) | (r10.m91770i(gh00Var) ? 16384 : 8192) | (r10.m91766g(str) ? 131072 : 65536) | (r10.m91770i(gh00Var2) ? 1048576 : 524288) | (r10.m91768h(z) ? 8388608 : 4194304) | (r10.m91770i(janVar) ? 67108864 : 33554432) | (r10.m91770i(p8p0Var) ? 536870912 : 268435456);
        int i3 = (r10.m91770i(ry31Var) ? 4 : 2) | (r10.m91770i(w47Var) ? 32 : 16) | (r10.m91768h(z2) ? 256 : 128) | (r10.m91768h(z3) ? 2048 : 1024) | (r10.m91768h(z4) ? 16384 : 8192) | (r10.m91768h(z5) ? 131072 : 65536) | (r10.m91768h(z6) ? 1048576 : 524288);
        if (!r10.m91752Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 599187) == 599186) ? false : true)) {
            r10.m91757b0();
            r8 = r10;
        } else if (uycVar instanceof ryc) {
            r10.m91771i0(328690491);
            r10.m91788r(false);
            r8 = r10;
        } else {
            r10.m91771i0(317617849);
            boolean z9 = str.length() > 0;
            Object objM91750T = r10.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                r10.m91793t0(objM91750T);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T;
            boolean z10 = z9;
            Object objM91750T2 = r10.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = sam.m77645B(f6i0.f66415a);
                r10.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var4 = (kqi0) objM91750T2;
            Object objM91750T3 = r10.m91750T();
            if (objM91750T3 == obj) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                r10.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var5 = (kqi0) objM91750T3;
            Object objM91750T4 = r10.m91750T();
            if (objM91750T4 == obj) {
                objM91750T4 = sam.m77645B(Boolean.FALSE);
                r10.m91793t0(objM91750T4);
            }
            kqi0 kqi0Var6 = (kqi0) objM91750T4;
            syc sycVar = uycVar instanceof syc ? (syc) uycVar : null;
            boolean z11 = (sycVar == null || bxcVar.f31821d || (!z && !sycVar.f215214d)) ? false : true;
            kqi0 kqi0VarM77651H = sam.m77651H(Boolean.valueOf(z11), r10);
            kqi0 kqi0VarM77651H2 = sam.m77651H(str, r10);
            kqi0 kqi0VarM77651H3 = sam.m77651H(gh00Var, r10);
            kqi0 kqi0VarM77651H4 = sam.m77651H(gh00Var2, r10);
            kqi0 kqi0VarM77651H5 = sam.m77651H(bxcVar, r10);
            boolean z12 = z11;
            gtc1 gtc1Var = new gtc1(leu.m58815a(r10).f112823a.f229875b.f123093a, 0.0f, leu.m58816b(r10).f117232d.f137886b, usc1.f233586a, 10);
            boolean zM91766g = r10.m91766g(ry31Var) | r10.m91766g(w47Var);
            Object objM91750T5 = r10.m91750T();
            if (zM91766g || objM91750T5 == obj) {
                objM91750T5 = ry31Var.mo43021a(w47Var);
                r10.m91793t0(objM91750T5);
            }
            sy31 sy31Var = (sy31) objM91750T5;
            boolean zM91766g2 = r10.m91766g(gtc1Var) | r10.m91766g(p8p0Var) | r10.m91766g(sy31Var);
            Object objM91750T6 = r10.m91750T();
            cxh0 cxh0Var = cxh0.f43038a;
            if (zM91766g2 || objM91750T6 == obj) {
                kqi0Var = kqi0Var5;
                objM91750T6 = janVar.m52846a(p8p0Var, sy31Var, new mc7(kqi0VarM77651H3, kqi0VarM77651H5, kqi0Var5, z2, kqi0VarM77651H2, kqi0VarM77651H4, kqi0VarM77651H), new ck3(kqi0Var6, kqi0VarM77651H3, 2), new C2406ta(kqi0Var4, kqi0Var5, kqi0Var6, kqi0VarM77651H3, 22), (4000 & 32) != 0 ? null : null, gtc1Var, (4000 & 128) != 0 ? cxh0.f43038a : mi21.m61824h(f183386b, mi21.m61822f(1.0f, cxh0Var)), false, sfe0.f208551S0, (4000 & 1024) != 0 ? sfe0.f208552T0 : new hyc(kqi0Var5, 1), (4000 & 2048) != 0 ? null : new hyc(kqi0VarM77651H3, 2));
                r10.m91793t0(objM91750T6);
            } else {
                kqi0Var = kqi0Var5;
            }
            j6i0 j6i0Var = (j6i0) objM91750T6;
            yqq yqqVar = (yqq) r10.m91774k(wsh.f254617h);
            ko70 ko70Var = (ko70) r10.m91774k(wsh.f254623n);
            int iM43172a = (int) (((fz70) ((rvd1) r10.m91774k(wsh.f254630u))).m43172a() & 4294967295L);
            WeakHashMap weakHashMap = cxd1.f42984x;
            int i4 = bxd1.m30815d(r10).f42987c.m65721e().f53851d;
            boolean z13 = i4 > 0;
            Object objM91750T7 = r10.m91750T();
            if (objM91750T7 == obj) {
                objM91750T7 = j4x.m52407e(0, r10);
            }
            vum0 vum0Var = (vum0) objM91750T7;
            int iM86437v = i4 - vum0Var.m86437v();
            if (iM86437v < 0) {
                iM86437v = 0;
            }
            float fMo35987O0 = yqqVar.mo35987O0(iM86437v);
            Object objM91750T8 = r10.m91750T();
            if (objM91750T8 == obj) {
                objM91750T8 = s95.m77551a(1.0f);
                r10.m91793t0(objM91750T8);
            }
            gw4 gw4Var = (gw4) objM91750T8;
            uyc uycVar2 = bxcVar.f31818a;
            Boolean boolValueOf = Boolean.valueOf(z10);
            Boolean bool = (Boolean) kqi0Var3.getValue();
            bool.getClass();
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            Boolean boolValueOf3 = Boolean.valueOf(z12);
            f6i0 f6i0Var = (f6i0) kqi0Var4.getValue();
            Boolean bool2 = (Boolean) kqi0Var.getValue();
            bool2.getClass();
            Object[] objArr = {uycVar2, boolValueOf, bool, boolValueOf2, boolValueOf3, f6i0Var, bool2};
            boolean zM91770i = r10.m91770i(gw4Var);
            Object objM91750T9 = r10.m91750T();
            if (zM91770i || objM91750T9 == obj) {
                objM91750T9 = new C0112c(gw4Var, null, 2);
                r10.m91793t0(objM91750T9);
            }
            hz40.m49238j(objArr, (th00) objM91750T9, r10);
            uyc uycVar3 = bxcVar.f31818a;
            boolean zBooleanValue = ((Boolean) kqi0Var3.getValue()).booleanValue();
            boolean z14 = ((Boolean) kqi0Var.getValue()).booleanValue() || ((f6i0) kqi0Var4.getValue()) == f6i0.f66416b;
            int i5 = 57344 & i2;
            boolean zM91770i2 = r10.m91770i(gw4Var) | (i5 == 16384);
            Object objM91750T10 = r10.m91750T();
            if (zM91770i2 || objM91750T10 == obj) {
                objM91750T10 = new xha(gw4Var, gh00Var, (fbk) null, 22);
                r10.m91793t0(objM91750T10);
            }
            m71606a(uycVar3, z10, zBooleanValue, z13, z12, z14, (th00) objM91750T10, r10, 0);
            uyc uycVar4 = bxcVar.f31818a;
            boolean z15 = uycVar4 instanceof tyc;
            if (z15 || (uycVar4 instanceof qyc)) {
                r10.m91771i0(322482183);
                fM96858r = leu.m58816b(r10).f117230b.f224768k;
                r10.m91788r(false);
            } else {
                r10.m91771i0(322540494);
                r10.m91788r(false);
                fM96858r = zsf1.m96858r(bxcVar.f31819b, ko70Var);
            }
            boolean z16 = z15 || (uycVar4 instanceof qyc);
            boolean z17 = uycVar4 instanceof syc;
            Object objM91750T11 = r10.m91750T();
            if (objM91750T11 == obj) {
                fbkVar = null;
                objM91750T11 = sam.m77645B(null);
                r10.m91793t0(objM91750T11);
            } else {
                fbkVar = null;
            }
            kqi0 kqi0Var7 = (kqi0) objM91750T11;
            Object objM91750T12 = r10.m91750T();
            if (objM91750T12 == obj) {
                objM91750T12 = sam.m77645B(fbkVar);
                r10.m91793t0(objM91750T12);
            }
            kqi0 kqi0Var8 = (kqi0) objM91750T12;
            boolean zM91770i3 = r10.m91770i(uycVar4) | r10.m91770i(kqi0Var7) | r10.m91770i(kqi0Var8);
            Object objM91750T13 = r10.m91750T();
            if (zM91770i3 || objM91750T13 == obj) {
                fbk fbkVar3 = fbkVar;
                objM91750T13 = new f81(uycVar4, kqi0Var7, kqi0Var8, fbkVar3, 25);
                kqi0Var2 = kqi0Var8;
                fbkVar2 = fbkVar3;
                r10.m91793t0(objM91750T13);
            } else {
                kqi0Var2 = kqi0Var8;
                fbkVar2 = fbkVar;
            }
            hz40.m49237i(uycVar4, (th00) objM91750T13, r10);
            Object obj2 = (z15 || (uycVar4 instanceof qyc)) ? uycVar4 : fbkVar2;
            boolean z18 = z6 && z8;
            if (z18) {
                r10.m91771i0(323677109);
                Object objM91750T14 = r10.m91750T();
                if (objM91750T14 == obj) {
                    objM91750T14 = rsc.f202259R0;
                    r10.m91793t0(objM91750T14);
                }
                gh00Var3 = (gh00) objM91750T14;
                z7 = false;
            } else {
                z7 = false;
                r10.m91771i0(323691028);
                Object objM91750T15 = r10.m91750T();
                if (objM91750T15 == obj) {
                    objM91750T15 = rsc.f202260S0;
                    r10.m91793t0(objM91750T15);
                }
                gh00Var3 = (gh00) objM91750T15;
            }
            r10.m91788r(z7);
            r10.m91771i0(10449321);
            boolean zM91770i4 = r10.m91770i(gw4Var);
            ?? r19 = obj2;
            Object objM91750T16 = r10.m91750T();
            if (zM91770i4 || objM91750T16 == obj) {
                objM91750T16 = new cyc(0, gw4Var);
                r10.m91793t0(objM91750T16);
            }
            fxh0 fxh0VarM57831m = l0y0.m57831m(cxh0Var, (gh00) objM91750T16);
            if (z8) {
                fxh0VarM57831m = fxh0VarM57831m.mo34315F(mi21.m61820d(1.0f, cxh0Var));
            }
            if (!z8) {
                fxh0VarM57831m = fxh0VarM57831m.mo34315F(mi21.m61822f(1.0f, cxh0Var));
            }
            if (i4 > 0) {
                boolean zM91770i5 = r10.m91770i(vum0Var) | r10.m91762e(iM43172a);
                Object objM91750T17 = r10.m91750T();
                if (zM91770i5 || objM91750T17 == obj) {
                    objM91750T17 = new C2580xm(iM43172a, vum0Var, 6);
                    r10.m91793t0(objM91750T17);
                }
                fxh0VarM57831m = fxh0VarM57831m.mo34315F(vkf1.m85877w(cxh0Var, (gh00) objM91750T17));
            }
            r10.m91788r(false);
            fxh0 fxh0VarM96832C = zsf1.m96832C(zsf1.m96830A(fxh0VarM57831m, fM96858r, 0.0f, 2), 0.0f, 0.0f, 0.0f, fMo35987O0, 7);
            m6d0 m6d0VarM36007d = dha.m36007d(z8 ? d7f0.f46166e : d7f0.f46174i, false);
            int iHashCode = Long.hashCode(r10.f264809T);
            wpn0 wpn0VarM91778m = r10.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(r10, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (r10.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            r10.m91779m0();
            if (r10.f264808S) {
                r10.m91776l(c2087le);
            } else {
                r10.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, r10);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, r10);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, r10);
            zsf1.m96833D(roh.f201266k, r10);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, r10);
            if (z8) {
                r10.m91771i0(-452981970);
                wb9 wb9Var = d7f0.f46155Y;
                pha phaVar = pha.f177517a;
                fxh0 fxh0VarM96832C2 = zsf1.m96832C(AbstractC0000a.m19r(bxd1.m30815d(r10).f42991g, u3h1.f226389f | 32, phaVar.mo66945a(cxh0Var, wb9Var)), 0.0f, 0.0f, 0.0f, leu.m58816b(r10).f117230b.f224761d, 7);
                im91 im91VarM53259E = jg31.m53259E(300, 0, null, 6);
                Object objM91750T18 = r10.m91750T();
                if (objM91750T18 == obj) {
                    objM91750T18 = rsc.f202257P0;
                    r10.m91793t0(objM91750T18);
                }
                pbv pbvVarM69539a = kbv.m55968n(im91VarM53259E, (gh00) objM91750T18).m69539a(kbv.m55958d(null, 3));
                im91 im91VarM53259E2 = jg31.m53259E(300, 0, null, 6);
                Object objM91750T19 = r10.m91750T();
                if (objM91750T19 == obj) {
                    objM91750T19 = rsc.f202258Q0;
                    r10.m91793t0(objM91750T19);
                }
                gh00 gh00Var4 = gh00Var3;
                z96.m95630j(z16, fxh0VarM96832C2, pbvVarM69539a, kbv.m55972r(im91VarM53259E2, (gh00) objM91750T19).m88177a(kbv.m55959e(null, 3)), null, rkk.m75772x(-725153637, new dyc(r19, jxjVar, kg11Var, en2Var, gh00Var, kqi0Var3, j6i0Var, z3, z4, z5, kqi0Var2), r10), r10, 196608, 16);
                fxh0 fxh0VarM90478H = xfg1.m90478H(phaVar.mo66945a(cxh0Var, z18 ? wb9Var : d7f0.f46168f), bxd1.m30815d(r10).f42991g);
                if (z18) {
                    r10.m91771i0(1786569866);
                    r11 = 0;
                    r10.m91788r(false);
                    f = 0;
                } else {
                    r11 = 0;
                    r10.m91771i0(1786570768);
                    f = leu.m58816b(r10).f117230b.f224767j + leu.m58816b(r10).f117230b.f224761d;
                    r10.m91788r(false);
                }
                float f3 = f;
                if (z18) {
                    r10.m91771i0(1786575440);
                    f2 = leu.m58816b(r10).f117230b.f224761d;
                    r10.m91788r(r11);
                } else {
                    r10.m91771i0(1786575946);
                    r10.m91788r(r11);
                    f2 = (float) r11;
                }
                fxh0 fxh0VarM96832C3 = zsf1.m96832C(fxh0VarM90478H, 0.0f, f3, 0.0f, f2, 5);
                pbv pbvVarM69539a2 = kbv.m55968n(jg31.m53259E(300, r11, null, 6), gh00Var4).m69539a(kbv.m55958d(null, 3));
                whx whxVarM88177a = kbv.m55972r(jg31.m53259E(300, r11, null, 6), gh00Var4).m88177a(kbv.m55959e(null, 3));
                ?? r2 = r11;
                fyf fyfVarM75772x = rkk.m75772x(380199378, new eyc(kqi0Var7, jxjVar, kg11Var, en2Var, gh00Var, z18, kqi0Var3, z12, j6i0Var, z3, z4, z5), r10);
                ?? r12 = r10;
                z96.m95630j(z17, fxh0VarM96832C3, pbvVarM69539a2, whxVarM88177a, null, fyfVarM75772x, r12, 196608, 16);
                r12.m91788r(r2);
                r1 = r2;
                r9 = r12;
            } else {
                r1 = 0;
                r10.m91771i0(-449557710);
                boolean zM91770i6 = r10.m91770i(kqi0Var3);
                Object objM91750T20 = r10.m91750T();
                if (zM91770i6 || objM91750T20 == obj) {
                    objM91750T20 = new b4c(kqi0Var3, 4);
                    r10.m91793t0(objM91750T20);
                }
                m71608c(uycVar4, jxjVar, kg11Var, en2Var, gh00Var, false, (gh00) objM91750T20, z12, j6i0Var, z3, z4, z5, mi21.m61840x(cxh0Var, 0.0f, ltf1.m59890l(R.dimen.readable_content_width, r10), 1), r10, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 196608 | (i2 & 896) | (i2 & 7168) | i5 | ((i3 << 18) & 1879048192), (i3 >> 12) & 126);
                ?? r13 = r10;
                r13.m91788r(false);
                r9 = r13;
            }
            r9.m91788r(true);
            r9.m91788r(r1);
            r8 = r9;
        }
        pgv0 pgv0VarM91796v = r8.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fyc(bxcVar, jxjVar, kg11Var, en2Var, gh00Var, str, gh00Var2, z, janVar, p8p0Var, ry31Var, w47Var, z2, z3, z4, z5, z6, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m71608c(uyc uycVar, jxj jxjVar, kg11 kg11Var, en2 en2Var, gh00 gh00Var, boolean z, gh00 gh00Var2, boolean z2, j6i0 j6i0Var, boolean z3, boolean z4, boolean z5, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        int i3;
        xq00Var.m91775k0(-1777851717);
        int i4 = i | (xq00Var.m91770i(uycVar) ? 4 : 2) | (xq00Var.m91770i(jxjVar) ? 32 : 16) | (xq00Var.m91770i(kg11Var) ? 256 : 128) | (xq00Var.m91770i(en2Var) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i4 |= xq00Var.m91768h(z) ? 131072 : 65536;
        }
        int i5 = i4 | (xq00Var.m91770i(gh00Var2) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i5 |= xq00Var.m91768h(z2) ? 8388608 : 4194304;
        }
        int i6 = i5 | (xq00Var.m91770i(j6i0Var) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i6 |= xq00Var.m91768h(z3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (xq00Var.m91768h(z4) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91768h(z5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        int i7 = i3;
        if (xq00Var.m91752Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            float fMo35989Z0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35989Z0(f183385a);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = a831.m25015g(0.0f, xq00Var);
            }
            uum0 uum0Var = (uum0) objM91750T;
            int i8 = i6 & 458752;
            boolean zM91770i = xq00Var.m91770i(uum0Var) | (i8 == 131072) | xq00Var.m91760d(fMo35989Z0);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new oyc(fMo35989Z0, 0, uum0Var, z);
                xq00Var.m91793t0(objM91750T2);
            }
            ues uesVarM69728b = pes.m69728b((gh00) objM91750T2, xq00Var);
            String strM71912v = q191.m71912v(uycVar);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            boolean zM91770i2 = xq00Var.m91770i(uum0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                objM91750T3 = new dia(uum0Var, 5);
                xq00Var.m91793t0(objM91750T3);
            }
            fxh0 fxh0VarM29069L = bga.m29069L(fxh0VarM61822f, (gh00) objM91750T3);
            boolean z6 = (3670016 & i6) == 1048576;
            Object objM91750T4 = xq00Var.m91750T();
            if (z6 || objM91750T4 == obj) {
                objM91750T4 = new kyc(0, gh00Var2);
                xq00Var.m91793t0(objM91750T4);
            }
            fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM29069L, w2a1.f247311a, (PointerInputEventHandler) objM91750T4);
            boolean zM91770i3 = (i8 == 131072) | xq00Var.m91770i(uum0Var);
            int i9 = 57344 & i6;
            boolean z7 = zM91770i3 | (i9 == 16384);
            Object objM91750T5 = xq00Var.m91750T();
            if (z7 || objM91750T5 == obj) {
                objM91750T5 = new lyc(z, gh00Var, uum0Var, null);
                xq00Var.m91793t0(objM91750T5);
            }
            fxh0 fxh0VarM69727a = pes.m69727a(fxh0VarM69516a, uesVarM69728b, vvl0.f245248a, false, null, false, null, (vh00) objM91750T5, false, 188);
            fyf fyfVarM75772x = rkk.m75772x(1827859451, new whb(j6i0Var, 10), xq00Var);
            boolean zM91766g = (i9 == 16384) | xq00Var.m91766g(strM71912v);
            Object objM91750T6 = xq00Var.m91750T();
            if (zM91766g || objM91750T6 == obj) {
                objM91750T6 = new myc(gh00Var, strM71912v, 0);
                xq00Var.m91793t0(objM91750T6);
            }
            eh00 eh00Var = (eh00) objM91750T6;
            boolean z8 = i9 == 16384;
            Object objM91750T7 = xq00Var.m91750T();
            if (z8 || objM91750T7 == obj) {
                objM91750T7 = new zx9(15, gh00Var);
                xq00Var.m91793t0(objM91750T7);
            }
            eh00 eh00Var2 = (eh00) objM91750T7;
            boolean zM91766g2 = (i9 == 16384) | xq00Var.m91766g(strM71912v) | xq00Var.m91770i(uycVar);
            Object objM91750T8 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T8 == obj) {
                objM91750T8 = new z9b(gh00Var, strM71912v, uycVar, 6);
                xq00Var.m91793t0(objM91750T8);
            }
            int i10 = i7 << 3;
            i091.m49329a(uycVar, jxjVar, kg11Var, en2Var, fyfVarM75772x, fxh0VarM69727a, eh00Var, eh00Var2, (eh00) objM91750T8, z2, z3, z4, z5, xq00Var, (i6 & 14) | 24576 | (i6 & ContentType.LONG_FORM_ON_DEMAND) | (i6 & 896) | (i6 & 7168) | (1879048192 & (i6 << 6)), ((i6 >> 27) & 14) | (i10 & ContentType.LONG_FORM_ON_DEMAND) | (i10 & 896));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nyc(uycVar, jxjVar, kg11Var, en2Var, gh00Var, z, gh00Var2, z2, j6i0Var, z3, z4, z5, fxh0Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m71609d(uum0 uum0Var) {
        return uum0Var.m84031v();
    }

    /* JADX INFO: renamed from: e */
    public static final void m71610e(uum0 uum0Var, float f) {
        uum0Var.m84032w(f);
    }
}
