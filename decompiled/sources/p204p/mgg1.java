package p204p;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.ParserException;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mgg1 {

    /* JADX INFO: renamed from: a */
    public static final String[] f143499a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f143500b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f143501c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: d */
    public static sd40 f143502d;

    /* JADX INFO: renamed from: e */
    public static sd40 f143503e;

    /* JADX INFO: renamed from: a */
    public static final void m61706a(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1765031171);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ymi0(5, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM61822f, false, null, null, null, (eh00) objM91750T, 15);
            float f = 16;
            fxh0 fxh0VarM96866z = zsf1.m96866z(fxh0VarM47247x, f, f);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(f), d7f0.f46142M0, xq00Var2, 54);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            npu npuVar = npu.f157070c;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            fxh0 fxh0VarM39673I = epv0.m39673I("manage-automatic-invites-devices-icon", mi21.m61834r(24, cxh0Var));
            int i3 = npu.f157071d | 432;
            qgj qgjVar = qgj.f188480a;
            y85.m93057b(npuVar, qgjVar, fxh0VarM39673I, j, 0L, false, xq00Var2, i3, 48);
            ahf1.m25932d(k0e1.m54977L(R.string.jam_learn_more_manage_invites_title, xq00Var2), epv0.m39673I("manage-automatic-invites-title", cxh0Var), leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 48, 0, 2032);
            xq00Var2 = xq00Var;
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fr0.m42474r(1.0f, true, xq00Var2);
            y85.m93057b(pou.f179785c, qgjVar, epv0.m39673I("manage-automatic-invites-chevron", mi21.m61834r(f, cxh0Var)), leu.m58815a(xq00Var2).f112824b.f138757a, 0L, false, xq00Var2, pou.f179786d | 432, 48);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cy9(i, false, eh00Var, 24);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m61707b(int i, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i2) {
        xq00Var.m91775k0(-422671674);
        int i3 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2 | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0.f43038a);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                xq00Var.m91771i0(1842140597);
                m61706a(eh00Var, xq00Var, (i3 >> 3) & 14);
                xq00Var.m91788r(false);
            } else if (iM38547C == 1) {
                xq00Var.m91771i0(1842261528);
                m61710e(eh00Var2, xq00Var, (i3 >> 6) & 14);
                xq00Var.m91788r(false);
            } else if (iM38547C == 2) {
                xq00Var.m91771i0(1842368912);
                m61706a(eh00Var, xq00Var, (i3 >> 3) & 14);
                m61710e(eh00Var2, xq00Var, (i3 >> 6) & 14);
                xq00Var.m91788r(false);
            } else {
                if (iM38547C != 3) {
                    throw lq51.m59703i(-1187503741, xq00Var, false);
                }
                xq00Var.m91771i0(1842544062);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hh5(i, eh00Var, eh00Var2, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m61708c(float f, int i, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-429342481);
        int i2 = (xq00Var.m91760d(f) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            qqg1.m73532b(wsh.f254623n.mo30068a(ko70.f124556a), rkk.m75772x(798700975, new C1910gu(f, fxh0Var), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1910gu(f, fxh0Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m61709d(u5b1 u5b1Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        u5b1 u5b1Var2 = u5b1Var;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1962858418);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(u5b1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ifa1(25, gh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0Var, false, null, null, null, (eh00) objM91750T, 15);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(16), d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM47247x);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            cpu cpuVar = cpu.f40644c;
            cxh0 cxh0Var = cxh0.f43038a;
            y85.m93057b(cpuVar, qgj.f188480a, mi21.m61834r(24, cxh0Var), 0L, 0L, false, xq00Var2, cpu.f40645d | 48, 56);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            u5b1Var2 = u5b1Var;
            String str = u5b1Var2.f226966a;
            if71 if71Var = leu.m58818d(xq00Var2).f64975k;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            xq00Var2 = xq00Var;
            ahf1.m25932d(str, null, if71Var, j, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            ahf1.m25932d(u5b1Var2.f226967b, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2034);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(u5b1Var2, gh00Var, fxh0Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m61710e(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-401990200);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ymi0(6, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM61822f, false, null, null, null, (eh00) objM91750T, 15);
            float f = 16;
            fxh0 fxh0VarM96866z = zsf1.m96866z(fxh0VarM47247x, f, f);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(f), d7f0.f46142M0, xq00Var2, 54);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            qqu qquVar = qqu.f191652c;
            long j = leu.m58815a(xq00Var2).f112824b.f138757a;
            fxh0 fxh0VarM39673I = epv0.m39673I("view-activity-user-icon", mi21.m61834r(24, cxh0Var));
            int i3 = qqu.f191653d | 432;
            qgj qgjVar = qgj.f188480a;
            y85.m93057b(qquVar, qgjVar, fxh0VarM39673I, j, 0L, false, xq00Var2, i3, 48);
            ahf1.m25932d(k0e1.m54977L(R.string.jam_learn_more_who_can_view_activity_title, xq00Var2), epv0.m39673I("view-activity-title", cxh0Var), leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, 48, 0, 2032);
            xq00Var2 = xq00Var;
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fr0.m42474r(1.0f, true, xq00Var2);
            y85.m93057b(pou.f179785c, qgjVar, epv0.m39673I("view-activity-chevron", mi21.m61834r(f, cxh0Var)), leu.m58815a(xq00Var2).f112824b.f138757a, 0L, false, xq00Var2, pou.f179786d | 432, 48);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cy9(i, false, eh00Var, 25);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m61711f(float f, float f2, float f3, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1765686335);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91760d(f3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            float fMo35989Z0 = yqqVar.mo35989Z0(f2);
            float fMo35989Z1 = yqqVar.mo35989Z0(f3);
            float fMo35989Z2 = yqqVar.mo35989Z0(8);
            boolean zM91760d = xq00Var.m91760d(fMo35989Z0) | ((i2 & 14) == 4) | xq00Var.m91760d(fMo35989Z1) | xq00Var.m91760d(fMo35989Z2);
            Object objM91750T = xq00Var.m91750T();
            if (zM91760d || objM91750T == t6x0.f217647t) {
                objM91750T = new d9m0(f, fMo35989Z0, fMo35989Z1, fMo35989Z2);
                xq00Var.m91793t0(objM91750T);
            }
            m6d0 m6d0Var = (m6d0) objM91750T;
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0.f43038a);
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
            zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n((i2 >> 9) & 14, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e9m0(f, f2, f3, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m61712g(String str, if71 if71Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        boolean z;
        Object objM67567q;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1808181140);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(if71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(fxh0Var) ? 256 : 128;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            String strM54977L = k0e1.m54977L(R.string.ai_persona_badge_label_text, xq00Var2);
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = j4x.m52407e(0, xq00Var2);
            }
            vum0 vum0Var = (vum0) objM91750T;
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = j4x.m52407e(0, xq00Var2);
            }
            vum0 vum0Var2 = (vum0) objM91750T2;
            yqq yqqVar = (yqq) xq00Var2.m91774k(wsh.f254617h);
            boolean z2 = xq00Var2.m91774k(wsh.f254623n) == ko70.f124557b;
            boolean zM91768h = ((i3 & 14) == 4) | xq00Var2.m91768h(z2);
            Object objM91750T3 = xq00Var2.m91750T();
            if (zM91768h || objM91750T3 == ia7Var) {
                g15 g15Var = new g15();
                if (z2) {
                    g15Var.m43331g("\u2067");
                }
                g15Var.m43331g(str);
                if (z2) {
                    g15Var.m43331g("\u2069");
                }
                g15Var.m43331g(" ");
                vsf1.m86333s(g15Var, "aiPersonaBadge", "�");
                objM91750T3 = g15Var.m43339o();
                xq00Var2.m91793t0(objM91750T3);
            }
            j15 j15Var = (j15) objM91750T3;
            boolean zM91762e = xq00Var2.m91762e(vum0Var.m86437v()) | xq00Var2.m91762e(vum0Var2.m86437v()) | xq00Var2.m91766g(strM54977L) | xq00Var2.m91766g(yqqVar);
            Object objM91750T4 = xq00Var2.m91750T();
            if (zM91762e || objM91750T4 == ia7Var) {
                if (vum0Var.m86437v() <= 0 || vum0Var2.m86437v() <= 0) {
                    z = true;
                    objM67567q = grn0.f83797d;
                } else {
                    z = true;
                    objM67567q = opo.m67567q(new pqm0("aiPersonaBadge", new fu40(new g6o0(4, yqqVar.mo26963y(yqqVar.mo35987O0(vum0Var.m86437v())), yqqVar.mo26963y(yqqVar.mo35987O0(vum0Var2.m86437v()))), new fyf(new dug(strM54977L, 12), true, -1047867383))));
                }
                objM91750T4 = objM67567q;
                xq00Var2.m91793t0(objM91750T4);
            } else {
                z = true;
            }
            ern0 ern0Var = (ern0) objM91750T4;
            Object objM91750T5 = xq00Var2.m91750T();
            if (objM91750T5 == ia7Var) {
                objM91750T5 = new C2037k2(vum0Var, vum0Var2, 3);
                xq00Var2.m91793t0(objM91750T5);
            }
            m6d0 m6d0Var = (m6d0) objM91750T5;
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0.f43038a);
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
            zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            v3d1.m84544e(strM54977L, 2, null, 2, xq00Var2, 24624, 12);
            xq00Var2 = xq00Var;
            ahf1.m25933e(j15Var, fxh0Var, if71Var, 0L, null, null, 2, false, new ol80(2), 0, null, ern0Var, xq00Var2, ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 3) & 896), 0, 1720);
            xq00Var2.m91788r(z);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2075l2(str, if71Var, fxh0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m61713h(List list, pas0 pas0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-8242720);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(pas0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            mif1.m61869b(pas0Var, new xks0(list, eh00Var), null, null, xq00Var, (i2 >> 3) & 14, 12);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nns0(list, pas0Var, eh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final ijc1 m61714i(fr70 fr70Var) {
        return (ijc1) fr70Var.getValue();
    }

    /* JADX INFO: renamed from: j */
    public static int m61715j() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final qic1 m61716k(i500 i500Var, up60 up60Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3) {
        return new qic1(up60Var, eh00Var, eh00Var3, eh00Var2);
    }

    /* JADX INFO: renamed from: l */
    public static final int m61717l(int i) {
        if (m9f.m61217e(-1, i) >= 4.5d) {
            return i;
        }
        float[] fArr = new float[3];
        m9f.m61220h(i, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = 0.0f;
        while (f3 - f4 > 0.01d) {
            float f5 = (f3 + f4) * 0.5f;
            if (m9f.m61217e(-1, m9f.m61213a(new float[]{f, f2, f5})) < 4.5d) {
                f3 = f5;
            } else {
                f4 = f5;
            }
        }
        return m9f.m61213a(new float[]{f, f2, f4});
    }

    /* JADX INFO: renamed from: m */
    public static final Next m61718m(cgb0 cgb0Var, otw0 otw0Var) {
        gbu gbuVar = gbu.f78413a;
        return Next.m15607i(cgb0.m32689c(cgb0Var, null, null, null, null, false, null, null, null, lau.f131415a, false, new uth0(new znz0(gbuVar, false), otw0Var), false, null, null, 769023), cgb0Var.f37616M0 instanceof wth0 ? Collections.singleton(new oeb0(false)) : gbuVar);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m61719n() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX INFO: renamed from: o */
    public static final kqi0 m61720o(xq00 xq00Var) {
        boolean z;
        Object obj = t6x0.f217647t;
        Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
        boolean zM91766g = xq00Var.m91766g(context);
        Object objM91750T = xq00Var.m91750T();
        fbk fbkVar = null;
        if (zM91766g || objM91750T == obj) {
            Object systemService = context.getSystemService("accessibility");
            objM91750T = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            xq00Var.m91793t0(objM91750T);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) objM91750T;
        if (accessibilityManager != null) {
            z = accessibilityManager.isTouchExplorationEnabled();
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zM91770i = xq00Var.m91770i(accessibilityManager);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91770i || objM91750T2 == obj) {
            objM91750T2 = new C2337rg(accessibilityManager, fbkVar, 2);
            xq00Var.m91793t0(objM91750T2);
        }
        return sam.m77648E(boolValueOf, accessibilityManager, (th00) objM91750T2, xq00Var, 0);
    }

    /* JADX INFO: renamed from: p */
    public static final feb0 m61721p(cgb0 cgb0Var, d850 d850Var) {
        List listM90495q = xfg1.m90495q(cgb0Var);
        if (listM90495q.isEmpty()) {
            listM90495q = null;
        }
        if (listM90495q != null) {
            return new feb0(new ng70(null, 1, listM90495q), d850Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static gd5 m61722q(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!t0j.m79834o(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m752a(null, "Couldn't find xmp metadata");
        }
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0VarM61723r = wsv0.f254763e;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (t0j.m79834o(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strM79828i = t0j.m79828i(xmlPullParserNewPullParser, f143499a[i2]);
                    if (strM79828i != null) {
                        if (Integer.parseInt(strM79828i) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strM79828i2 = t0j.m79828i(xmlPullParserNewPullParser, f143500b[i3]);
                                if (strM79828i2 != null) {
                                    j = Long.parseLong(strM79828i2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                kf40 kf40Var2 = pf40.f176960b;
                                wsv0VarM61723r = wsv0.f254763e;
                                break;
                            }
                            String strM79828i3 = t0j.m79828i(xmlPullParserNewPullParser, f143501c[i]);
                            if (strM79828i3 != null) {
                                wsv0VarM61723r = pf40.m69795u(new q1i0(0L, "image/jpeg", 0L), new q1i0(Long.parseLong(strM79828i3), "video/mp4", 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (t0j.m79834o(xmlPullParserNewPullParser, "Container:Directory")) {
                wsv0VarM61723r = m61723r(xmlPullParserNewPullParser, "Container", "Item");
            } else if (t0j.m79834o(xmlPullParserNewPullParser, "GContainer:Directory")) {
                wsv0VarM61723r = m61723r(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!t0j.m79832m(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (wsv0VarM61723r.isEmpty()) {
            break loop0;
        }
        return new gd5(j, wsv0VarM61723r, 9);
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static wsv0 m61723r(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        jf40 jf40VarM69788m = pf40.m69788m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (t0j.m79834o(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM79828i = t0j.m79828i(xmlPullParser, strConcat3);
                String strM79828i2 = t0j.m79828i(xmlPullParser, strConcat4);
                String strM79828i3 = t0j.m79828i(xmlPullParser, strConcat5);
                String strM79828i4 = t0j.m79828i(xmlPullParser, strConcat6);
                if (strM79828i == null || strM79828i2 == null) {
                    return wsv0.f254763e;
                }
                jf40VarM69788m.m28985c(new q1i0(strM79828i3 != null ? Long.parseLong(strM79828i3) : 0L, strM79828i, strM79828i4 != null ? Long.parseLong(strM79828i4) : 0L));
            }
        } while (!t0j.m79832m(xmlPullParser, strConcat2));
        return jf40VarM69788m.m53150g();
    }

    /* JADX INFO: renamed from: s */
    public static Next m61724s(kr1 kr1Var, String str, Set set) {
        Object next;
        kr1 kr1VarM57135b = kr1Var.m57135b(new p9v0(str, 28), vgz0.f241344L0);
        Iterator it = kr1Var.f125495f.f117255c.f131313b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((r9y0) next).f197142a, str));
        r9y0 r9y0Var = (r9y0) next;
        boolean z = false;
        if (r9y0Var != null && r9y0Var.f197144c) {
            z = true;
        }
        if (z) {
            jxz0 jxz0Var = kr1VarM57135b.f125495f;
            la91 la91Var = jxz0Var.f117255c;
            Set set2 = la91Var.f131313b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set2) {
                if (!wj50.m88271j(((r9y0) obj).f197142a, str)) {
                    arrayList.add(obj);
                }
            }
            kr1VarM57135b = kr1.m57133a(kr1VarM57135b, null, null, false, 0, false, jxz0.m54729c(jxz0Var, null, null, la91.m58543c(la91Var, null, g6f.m43736n1(arrayList), null, null, null, 29), null, null, 27), null, null, null, false, 8159);
        }
        x401 x401Var = new x401();
        x401Var.addAll(set);
        if (z) {
            x401Var.add(new bn1(Collections.singleton(str)));
        }
        return Next.m15607i(kr1VarM57135b, n0e1.m63425d(x401Var));
    }
}
