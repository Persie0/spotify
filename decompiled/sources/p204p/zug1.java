package p204p;

import android.graphics.BlurMaskFilter;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zug1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f286444a;

    /* JADX INFO: renamed from: b */
    public static Boolean f286445b;

    /* JADX INFO: renamed from: a */
    public static final void m97024a(int i, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1575657946);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            wb9 wb9Var = d7f0.f46174i;
            float f = leu.m58816b(xq00Var).f117232d.f137886b;
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224763f, mi21.m61838v(f, fxh0Var2)), leu.m58815a(xq00Var).f112825c.f221220c, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d));
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new eml(str2, 26);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I(str, zoz0.m96644b(fxh0VarM64246i, false, (gh00) objM91750T));
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            dha.m36004a(nec.m64246i(mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224759b, mi21.m61838v(leu.m58816b(xq00Var).f117230b.f224763f, fxh0Var2)), leu.m58815a(xq00Var).f112823a.f229876c, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), xq00Var, 0);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xad(str, str2, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m97025b(int i, String str, wwu wwuVar, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1167415310);
        int i2 = i | ((i & 8) == 0 ? xq00Var.m91766g(wwuVar) : xq00Var.m91770i(wwuVar) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117232d.f137886b);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(cxh0Var, fmx0VarM47993b), n6f.m63765b(n6f.f150866f, 0.1f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a);
            zbp zbpVar = zbp.f281359f;
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            fxh0 fxh0VarM39673I = epv0.m39673I("labeled.tool.button", mi21.m61826j(zsf1.m96866z(hdi.m47245v(fxh0VarM64246i, (voi0) objM91750T, zbpVar, false, null, null, eh00Var, 28), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c), leu.m58816b(xq00Var).f117235g.f159605c, 0.0f, 2));
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = xa70.f259590O0;
                xq00Var.m91793t0(objM91750T2);
            }
            dvg1.m37110l(48, 0, rkk.m75772x(2045299545, new qba(wwuVar, str, 2, (byte) 0), xq00Var), xq00Var, zoz0.m96644b(fxh0VarM39673I, true, (gh00) objM91750T2));
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r5e(wwuVar, str, eh00Var, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m97026c(uin0 uin0Var, i1n i1nVar, xsg0 xsg0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-991271779);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(uin0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(i1nVar) : xq00Var.m91770i(i1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(xsg0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            float f = 8;
            boolean z = false;
            xi5 xi5VarM29370g = bj5.m29370g(f);
            j4m0 j4m0VarM96850j = zsf1.m96850j(0.0f, 0.0f, 0.0f, uin0Var.f230738a, 7);
            fxh0 fxh0VarM39673I = epv0.m39673I("pending-join-requests-list", zsf1.m96832C(mi21.m61822f(1.0f, cxh0.f43038a), f, f, f, 0.0f, 8));
            boolean zM91770i = xq00Var.m91770i(uin0Var);
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(i1nVar))) {
                z = true;
            }
            boolean zM91770i2 = zM91770i | z | xq00Var.m91770i(xsg0Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i2 || objM91750T == t6x0.f217647t) {
                objM91750T = new tpk0(uin0Var, i1nVar, xsg0Var, 13);
                xq00Var.m91793t0(objM91750T);
            }
            fyg1.m43085i(fxh0VarM39673I, null, j4m0VarM96850j, false, xi5VarM29370g, null, null, false, null, (gh00) objM91750T, xq00Var, 0, 490);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dzm0(uin0Var, i1nVar, xsg0Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m97027d(izu0 izu0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00 xq00Var3;
        cxh0 cxh0Var;
        long j;
        xq00Var.m91775k0(-193989154);
        int i2 = (i & 6) == 0 ? i | (xq00Var.m91770i(izu0Var) ? 4 : 2) : i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            vb9 vb9Var = d7f0.f46142M0;
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224759b), vb9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var2);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (izu0Var.f107293c) {
                xq00Var.m91771i0(-1194022715);
                qf40<pla1> qf40Var = izu0Var.f107292b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                for (pla1 pla1Var : qf40Var) {
                    String str = pla1Var.f178683c;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new uku(srz.m79125B(pla1Var.f178684d), str, pla1Var.f178681a, pla1Var.f178682b));
                }
                cxh0Var = cxh0Var2;
                upf.m83686c(opo.m67574x(arrayList), null, tfu.f220048a, null, true, 0, null, null, null, xq00Var, 24968, 490);
                xq00Var3 = xq00Var;
                xq00Var3.m91788r(false);
            } else {
                xq00Var3 = xq00Var;
                cxh0Var = cxh0Var2;
                xq00Var3.m91771i0(-1193835320);
                xq00Var3.m91788r(false);
            }
            hzu0 hzu0Var = izu0Var.f107291a;
            if (hzu0Var instanceof ezu0) {
                xq00Var3.m91771i0(-1193749140);
                y85.m93057b(((ezu0) hzu0Var).f64471a, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var3).f117235g.f159603a, cxh0Var), leu.m58815a(xq00Var3).f112824b.f138758b, 0L, false, xq00Var3, 56, 48);
                xq00Var3.m91788r(false);
            } else if (hzu0Var instanceof gzu0) {
                xq00Var3.m91771i0(-1285425838);
                o2h1.m66110d(mi21.m61834r(12, cxh0Var), xq00Var3, 0);
                xq00Var3.m91788r(false);
            } else {
                if (!(hzu0Var instanceof fzu0)) {
                    throw lq51.m59703i(-1285436181, xq00Var3, false);
                }
                xq00Var3.m91771i0(-1285423074);
                xq00Var3.m91788r(false);
            }
            String str2 = izu0Var.f107294d;
            if71 if71Var = leu.m58818d(xq00Var3).f64974j;
            if (izu0Var.f107295e) {
                xq00Var3.m91771i0(-1285417790);
                j = leu.m58815a(xq00Var3).f112824b.f138762f;
            } else {
                xq00Var3.m91771i0(-1285416671);
                j = leu.m58815a(xq00Var3).f112824b.f138758b;
            }
            xq00Var3.m91788r(false);
            ahf1.m25932d(str2, null, if71Var, j, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lvs0(izu0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m97028e(String str, eh00 eh00Var, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i) {
        fyf fyfVar2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1307449859);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            voi0 voi0Var = (voi0) objM91750T;
            zbp zbpVar = zbp.f281359f;
            tix0 tix0Var = new tix0(0);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("share_sheet_item_tag", hdi.m47245v(cxh0Var, voi0Var, zbpVar, true, null, tix0Var, eh00Var, 8));
            boolean z = (i2 & 14) == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z || objM91750T2 == ia7Var) {
                objM91750T2 = new zpz0(str, 13);
                xq00Var.m91793t0(objM91750T2);
            }
            fyfVar2 = fyfVar;
            dvg1.m37110l(48, 0, rkk.m75772x(-497537162, new lh70(fyfVar2, 28), xq00Var), xq00Var, zoz0.m96643a(fxh0VarM39673I, (gh00) objM91750T2));
            fxh0Var2 = cxh0Var;
        } else {
            fyfVar2 = fyfVar;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s1z0((Object) str, (Object) eh00Var, fxh0Var2, (Object) fyfVar2, i, 9);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m97029f(fxh0 fxh0Var, float f, eh00 eh00Var, fyf fyfVar, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        float f2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-609138673);
        int i2 = i | 54 | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Boolean bool = (Boolean) kqi0Var.getValue();
            bool.getClass();
            kqi0 kqi0VarM77651H = sam.m77651H(bool, xq00Var);
            Boolean bool2 = (Boolean) kqi0VarM77651H.getValue();
            bool2.getClass();
            boolean zM91770i = ((i2 & 896) == 256) | xq00Var.m91770i(kqi0VarM77651H);
            Object objM91750T2 = xq00Var.m91750T();
            fbk fbkVar = null;
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new mf5(eh00Var, kqi0VarM77651H, fbkVar, 3);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(bool2, (th00) objM91750T2, xq00Var);
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T3 == obj) {
                objM91750T3 = new xrb1(kqi0Var, 7);
                xq00Var.m91793t0(objM91750T3);
            }
            gj8 gj8Var = new gj8(50.0f, (gh00) objM91750T3, 10);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM85877w = vkf1.m85877w(cxh0Var, gj8Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM85877w);
            soh.f211194A.getClass();
            eh00 eh00Var2 = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n(6, fyfVar, xq00Var, true);
            fxh0Var2 = cxh0Var;
            f2 = 50.0f;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            f2 = f;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jhu(fxh0Var2, f2, eh00Var, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m97030g(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f286445b;
        if (bool == null || !bool.booleanValue()) {
            return lzj.m60351b(videoCapabilities, i, i2, d);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static final long m97031h(int i, int i2, w591 w591Var) {
        int i3;
        if (i == -1) {
            return (((long) i2) << 32) | (4294967295L & ((long) (-1)));
        }
        boolean z = i > i2;
        long jM87236h = w591Var.m87236h(i);
        long jM87238j = w591Var.m87238j(jM87236h);
        if (ic71.m50236d(jM87236h) && ic71.m50236d(jM87238j)) {
            i3 = 1;
        } else if (ic71.m50236d(jM87236h) || ic71.m50236d(jM87238j)) {
            i3 = (!ic71.m50236d(jM87236h) || ic71.m50236d(jM87238j)) ? 4 : 2;
        } else {
            i3 = 3;
        }
        int iM38547C = edb.m38547C(i3);
        if (iM38547C == 0) {
            return ckf1.m33169r(i, z ? 1 : 2);
        }
        if (iM38547C == 1) {
            if (z) {
                return i == ((int) (jM87238j >> 32)) ? ckf1.m33169r(i, 1) : ckf1.m33169r((int) (jM87238j & 4294967295L), 2);
            }
            return i == ((int) (jM87238j & 4294967295L)) ? ckf1.m33169r(i, 2) : ckf1.m33169r((int) (jM87238j >> 32), 1);
        }
        if (iM38547C == 2) {
            return z ? ckf1.m33169r((int) (jM87238j & 4294967295L), 1) : ckf1.m33169r((int) (jM87238j >> 32), 2);
        }
        if (iM38547C == 3) {
            return (((long) i) << 32) | (4294967295L & ((long) (-1)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public static final fiz m97032i(voi voiVar, Flowable flowable, cp0 cp0Var) {
        return mvl0.m62953p(xtm0.m92074U(mvl0.m62953p(new C2373se(k0e1.m54985d(((s5p) voiVar).m77297d()), 29)), new hc0((fbk) null, flowable, cp0Var, 5)));
    }

    /* JADX INFO: renamed from: j */
    public static final t050 m97033j(z8k z8kVar, djk0 djk0Var, djk0 djk0Var2, gjk0 gjk0Var, gjk0 gjk0Var2, fjk0 fjk0Var) {
        return ((b9k) z8kVar).m28489g("AuthenticatedLocksManagerDaemon", new oo5(djk0Var, djk0Var2, gjk0Var, gjk0Var2, fjk0Var, 21));
    }

    /* JADX INFO: renamed from: k */
    public static final fiz m97034k(voi voiVar, i8a i8aVar, i8a i8aVar2, Set set, eh00 eh00Var, th00 th00Var) {
        if (i8aVar.isEnabled()) {
            return new vjz(new o7k(new gzr(k0e1.m54985d(bvg1.m30629q(voiVar)), 18), i8aVar2, eh00Var, set, th00Var), new f3q(2, 17, null));
        }
        return new ysk(lau.f131415a, 27);
    }

    /* JADX INFO: renamed from: l */
    public static final void m97035l(lk4 lk4Var, BlurMaskFilter blurMaskFilter) {
        s800.m77400A(lk4Var).setMaskFilter(blurMaskFilter);
    }
}
