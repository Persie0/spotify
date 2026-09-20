package p204p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.WindowManager;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.text.font.FontWeight;
import com.comscore.streaming.ContentType;
import com.microsoft.device.display.DisplayMask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cyf1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f43265a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final int[] f43266b = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: c */
    public static final int[] f43267c = {R.attr.state_selected};

    /* JADX INFO: renamed from: d */
    public static final int[] f43268d = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static sd40 f43269e;

    /* JADX INFO: renamed from: f */
    public static sd40 f43270f;

    /* JADX INFO: renamed from: a */
    public static final void m34365a(hwr0 hwr0Var, gh00 gh00Var, n2s0 n2s0Var, dxr0 dxr0Var, jtr0 jtr0Var, q831 q831Var, xq00 xq00Var, int i) {
        int i2;
        hwr0 hwr0Var2;
        Context context;
        boolean z;
        gh00 gh00Var2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        lic1 lic1Var = hwr0Var.f96025Y;
        xq00Var2.m91775k0(-2115462105);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91770i(hwr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(n2s0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? xq00Var2.m91766g(dxr0Var) : xq00Var2.m91770i(dxr0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? xq00Var2.m91766g(jtr0Var) : xq00Var2.m91770i(jtr0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var2.m91770i(q831Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 74899) != 74898)) {
            boolean zM91766g = xq00Var2.m91766g(hwr0Var);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91766g || objM91750T == ia7Var) {
                objM91750T = bzf1.m31030v(hwr0Var);
                xq00Var2.m91793t0(objM91750T);
            }
            zwr0 zwr0Var = (zwr0) objM91750T;
            kqi0 kqi0VarM77670i = sam.m77670i(n2s0Var.f149828i, lau.f131415a, null, xq00Var2, 48, 2);
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = k0e1.m54985d(n2s0Var.f149829j.distinctUntilChanged());
                xq00Var2.m91793t0(objM91750T2);
            }
            kqi0 kqi0VarM77670i2 = sam.m77670i((fiz) objM91750T2, Boolean.TRUE, null, xq00Var2, 48, 2);
            List list = (List) kqi0VarM77670i.getValue();
            boolean zM91766g2 = xq00Var2.m91766g(list);
            Object objM91750T3 = xq00Var2.m91750T();
            if (zM91766g2 || objM91750T3 == ia7Var) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k2s0) it.next()).mo32194b());
                }
                objM91750T3 = g6f.m43727j0(arrayList);
                xq00Var2.m91793t0(objM91750T3);
            }
            List list2 = (List) objM91750T3;
            boolean zM91766g3 = xq00Var2.m91766g(list2);
            Object objM91750T4 = xq00Var2.m91750T();
            if (zM91766g3 || objM91750T4 == ia7Var) {
                Iterator it2 = list2.iterator();
                int iMo1617e = 0;
                while (it2.hasNext()) {
                    iMo1617e += ((hjv0) it2.next()).mo1617e();
                }
                objM91750T4 = j4x.m52407e(iMo1617e, xq00Var2);
            }
            vum0 vum0Var = (vum0) objM91750T4;
            boolean zM91770i = xq00Var2.m91770i(vum0Var) | xq00Var2.m91770i(list2);
            Object objM91750T5 = xq00Var2.m91750T();
            if (zM91770i || objM91750T5 == ia7Var) {
                objM91750T5 = new guq0(13, list2, vum0Var);
                xq00Var2.m91793t0(objM91750T5);
            }
            hz40.m49233e(list2, (gh00) objM91750T5, xq00Var2);
            int iM86437v = vum0Var.m86437v();
            Object objM91750T6 = xq00Var2.m91750T();
            if (objM91750T6 == ia7Var) {
                objM91750T6 = new nmr0();
                xq00Var2.m91793t0(objM91750T6);
            }
            nmr0 nmr0Var = (nmr0) objM91750T6;
            Context context2 = (Context) xq00Var2.m91774k(AndroidCompositionLocals_androidKt.f502b);
            yqq yqqVar = (yqq) xq00Var2.m91774k(wsh.f254617h);
            boolean zM91770i2 = xq00Var2.m91770i(hwr0Var) | xq00Var2.m91770i(q831Var) | xq00Var2.m91770i(context2);
            int i4 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z2 = zM91770i2 | (i4 == 32);
            Object objM91750T7 = xq00Var2.m91750T();
            if (z2 || objM91750T7 == ia7Var) {
                context = context2;
                o3e0 o3e0Var = new o3e0(hwr0Var, q831Var, context, gh00Var, 26);
                xq00Var2.m91793t0(o3e0Var);
                objM91750T7 = o3e0Var;
            } else {
                context = context2;
            }
            hz40.m49233e(lic1Var, (gh00) objM91750T7, xq00Var2);
            fxh0 fxh0VarM31822N = c95.m31822N(nec.m64246i(mi21.m61820d(1.0f, cxh0.f43038a), leu.m58815a(xq00Var2).f112823a.f229876c, kxf1.f127485a), nmr0Var.f156255d, null);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM31822N);
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
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            j4m0 j4m0VarM96850j = zsf1.m96850j(0.0f, yqqVar.mo35988P0(nmr0Var.f156254c.m84031v() + nmr0Var.f156252a.m86437v()), 0.0f, 0.0f, 13);
            boolean zM91770i3 = xq00Var2.m91770i(kqi0VarM77670i) | xq00Var2.m91762e(iM86437v) | xq00Var2.m91770i(kqi0VarM77670i2) | xq00Var2.m91770i(hwr0Var) | xq00Var2.m91770i(context) | (i4 == 32) | ((i3 & 57344) == 16384 || ((i3 & 32768) != 0 && xq00Var2.m91770i(jtr0Var)));
            Object objM91750T8 = xq00Var2.m91750T();
            if (zM91770i3 || objM91750T8 == ia7Var) {
                z = false;
                ykh ykhVar = new ykh(iM86437v, kqi0VarM77670i, kqi0VarM77670i2, hwr0Var, context, gh00Var, jtr0Var);
                hwr0Var2 = hwr0Var;
                gh00Var2 = gh00Var;
                xq00Var2.m91793t0(ykhVar);
                objM91750T8 = ykhVar;
            } else {
                hwr0Var2 = hwr0Var;
                z = false;
                gh00Var2 = gh00Var;
            }
            boolean z3 = z;
            fyg1.m43085i(null, null, j4m0VarM96850j, false, null, null, null, false, null, (gh00) objM91750T8, xq00Var, 0, 507);
            xq00Var2 = xq00Var;
            if (zwr0Var != null) {
                xq00Var2.m91771i0(634539687);
                boolean z4 = lic1Var == lic1.f133768c ? true : z3;
                boolean zM88271j = wj50.m88271j(hwr0Var2.f96032f, Boolean.TRUE);
                String str = hwr0Var2.f96033g;
                boolean z5 = i4 == 32 ? true : z3;
                Object objM91750T9 = xq00Var2.m91750T();
                if (z5 || objM91750T9 == ia7Var) {
                    objM91750T9 = new b8o0(25, gh00Var2);
                    xq00Var2.m91793t0(objM91750T9);
                }
                gh00 gh00Var3 = (gh00) objM91750T9;
                boolean z6 = i4 == 32 ? true : z3;
                Object objM91750T10 = xq00Var2.m91750T();
                if (z6 || objM91750T10 == ia7Var) {
                    objM91750T10 = new xzp0(20, gh00Var2);
                    xq00Var2.m91793t0(objM91750T10);
                }
                eh00 eh00Var = (eh00) objM91750T10;
                boolean z7 = i4 == 32 ? true : z3;
                Object objM91750T11 = xq00Var2.m91750T();
                if (z7 || objM91750T11 == ia7Var) {
                    objM91750T11 = new b8o0(26, gh00Var2);
                    xq00Var2.m91793t0(objM91750T11);
                }
                gh00 gh00Var4 = (gh00) objM91750T11;
                boolean z8 = i4 == 32 ? true : z3;
                Object objM91750T12 = xq00Var2.m91750T();
                if (z8 || objM91750T12 == ia7Var) {
                    objM91750T12 = new xzp0(21, gh00Var2);
                    xq00Var2.m91793t0(objM91750T12);
                }
                mif1.m61869b(dxr0Var, new bxr0(zwr0Var, nmr0Var, z4, zM88271j, str, gh00Var3, eh00Var, gh00Var4, (eh00) objM91750T12), null, null, xq00Var2, ((i3 >> 9) & 14) | 72, 12);
                xq00Var2.m91788r(z3);
            } else {
                xq00Var2.m91771i0(635137429);
                xq00Var2.m91788r(z3);
            }
            xq00Var2.m91788r(true);
        } else {
            hwr0Var2 = hwr0Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fxa0((Object) hwr0Var2, gh00Var, (Object) n2s0Var, (Object) dxr0Var, (Object) jtr0Var, (Object) q831Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m34366b(String str, String str2, String str3, String str4, tfu tfuVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-736358161);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | (xq00Var2.m91766g(str3) ? 256 : 128) | (xq00Var2.m91766g(str4) ? 2048 : 1024) | (xq00Var2.m91762e(tfuVar.ordinal()) ? 16384 : 8192) | 196608;
        if (xq00Var2.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29371h(leu.m58816b(xq00Var2).f117230b.f224761d, d7f0.f46145P0), d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            kgg1.m56339b(Uri.parse(str3 == null ? "" : str3), null, tfuVar, str, str2 == null ? str : str2, 0L, 0L, false, xq00Var2, ((i2 >> 6) & 896) | ((i2 << 9) & 7168), 226);
            if71 if71Var = leu.m58818d(xq00Var).f64971g;
            mqr mqrVar = gmu.f81477a;
            FontWeight fontWeight = (FontWeight) ((sdo) mqrVar.f146344c).f208048b;
            Object obj = mqrVar.f146343b;
            phf1.m69982a(str4, null, if71Var, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), 2, false, new ol80(1), new qx7(epv0.m39702v(8), epv0.m39702v(16), 0L, new nx7(1), 4), 96.0f, fontWeight, null, xq00Var, ((i2 >> 9) & 14) | 134217728, 2114);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new la11(str, str2, str3, str4, tfuVar, fxh0Var2, i, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m34367c(ArrayList arrayList, List list, eh00 eh00Var, eju ejuVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(166357833);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(ejuVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((x4i0) it.next()).f258135b);
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((x4i0) it2.next()).f258136c);
            }
            w4i0 w4i0Var = new w4i0(arrayList2, arrayList3, list);
            boolean zM91770i = xq00Var.m91770i(ejuVar) | ((i3 & 896) == 256) | xq00Var.m91770i(w4i0Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new gpc0(ejuVar, w4i0Var, eh00Var, 17);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var = (gh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(w4i0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new kbf0(w4i0Var, 25);
                xq00Var.m91793t0(objM91750T2);
            }
            int i4 = (i3 >> 9) & ContentType.LONG_FORM_ON_DEMAND;
            cxh0 cxh0Var = cxh0.f43038a;
            g0b1.m43261b(gh00Var, cxh0Var, (gh00) objM91750T2, xq00Var, i4, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vy40(arrayList, list, eh00Var, ejuVar, fxh0Var2, i, 20);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final fiz m34368d(fiz fizVar, int i, int i2) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(s571.m77246e(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1 && i2 != 1) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            i = 0;
            i2 = 2;
        }
        int i3 = i;
        int i4 = i2;
        return fizVar instanceof dk00 ? dk00.m36242d((dk00) fizVar, null, i3, i4, 1) : new lnc(fizVar, null, i3, i4, 2);
    }

    /* JADX INFO: renamed from: e */
    public static fiz m34369e(fiz fizVar, int i) {
        return m34368d(fizVar, i, 1);
    }

    /* JADX INFO: renamed from: f */
    public static final iqb m34370f(fiz fizVar) {
        return fizVar instanceof iqb ? (iqb) fizVar : new kqb(fizVar);
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    public static String m34371g(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final fiz m34372h(fiz fizVar) {
        return m34368d(fizVar, -1, 1);
    }

    /* JADX INFO: renamed from: i */
    public static umn m34373i(h4u0 h4u0Var, ttm0 ttm0Var, dcm0 dcm0Var, w2a1 w2a1Var) {
        h4u0Var.getClass();
        dcm0Var.getClass();
        w2a1Var.getClass();
        return new umn(h4u0Var);
    }

    /* JADX INFO: renamed from: j */
    public static final fiz m34374j(fiz fizVar, juk jukVar) {
        if (jukVar.mo26595B(gk40.f80712X0) == null) {
            if (jukVar.equals(dau.f47107a)) {
                return fizVar;
            }
            return fizVar instanceof dk00 ? dk00.m36242d((dk00) fizVar, jukVar, 0, 0, 6) : new lnc(fizVar, jukVar, 0, 0, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + jukVar).toString());
    }

    /* JADX INFO: renamed from: k */
    public static final sd40 m34375k() {
        sd40 sd40Var = f43270f;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 24;
        rd40 rd40Var = new rd40("Encore.Vector.Search24", f, f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        pk31 pk31Var = new pk31(n6f.f150862b);
        sep sepVarM62656j = mrx0.m62656j(10.533f, 1.279f);
        sepVarM62656j.m77938l(5.352f, 1.279f, 1.126f, 5.419f, 1.126f, 10.558f);
        sepVarM62656j.m77938l(1.126f, 15.697f, 5.352f, 19.837f, 10.533f, 19.837f);
        sepVarM62656j.m77938l(12.767f, 19.837f, 14.823f, 19.067f, 16.44f, 17.779f);
        sepVarM62656j.m77943q(20.793f, 22.132f);
        sepVarM62656j.m77938l(21.183f, 22.523f, 21.817f, 22.523f, 22.207f, 22.132f);
        sepVarM62656j.m77938l(22.598f, 21.742f, 22.598f, 21.108f, 22.207f, 20.718f);
        sepVarM62656j.m77943q(17.863f, 16.374f);
        sepVarM62656j.m77938l(19.162f, 14.785f, 19.94f, 12.763f, 19.94f, 10.558f);
        sepVarM62656j.m77938l(19.94f, 5.419f, 15.714f, 1.279f, 10.533f, 1.279f);
        sepVarM62656j.m77937k();
        sepVarM62656j.m77945s(3.126f, 10.558f);
        sepVarM62656j.m77938l(3.126f, 6.552f, 6.428f, 3.279f, 10.533f, 3.279f);
        sepVarM62656j.m77938l(14.638f, 3.279f, 17.94f, 6.552f, 17.94f, 10.558f);
        sepVarM62656j.m77938l(17.94f, 14.564f, 14.638f, 17.837f, 10.533f, 17.837f);
        sepVarM62656j.m77938l(6.428f, 17.837f, 3.126f, 14.564f, 3.126f, 10.558f);
        sepVarM62656j.m77937k();
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f43270f = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m34376l(Activity activity) {
        DisplayMask displayMaskFromResourcesRectApproximation;
        int rotation;
        Rect rect = null;
        if (activity.getPackageManager().hasSystemFeature("com.microsoft.device.display.displaymask") && (displayMaskFromResourcesRectApproximation = DisplayMask.fromResourcesRectApproximation(activity)) != null) {
            try {
                rotation = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation();
            } catch (IllegalStateException unused) {
                rotation = 0;
            }
            List<Rect> boundingRectsForRotation = displayMaskFromResourcesRectApproximation.getBoundingRectsForRotation(rotation);
            rect = boundingRectsForRotation.size() == 0 ? new Rect(0, 0, 0, 0) : boundingRectsForRotation.get(0);
        }
        Rect rect2 = new Rect();
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
        if (rect == null || rect2.width() <= 0 || rect2.height() <= 0) {
            return false;
        }
        return rect.intersect(rect2);
    }

    /* JADX INFO: renamed from: m */
    public static final String m34377m(u150 u150Var) {
        s150 s150VarMo31674d = u150Var.mo31674d();
        if (s150VarMo31674d != null) {
            return s150VarMo31674d.f204601b;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final pqm0 m34378n(i520 i520Var, i520 i520Var2) {
        e520 e520VarM30611L;
        e520 e520VarM30611L2;
        Long lM30635w = null;
        f520 f520Var = i520Var instanceof f520 ? (f520) i520Var : null;
        Long lM30635w2 = (f520Var == null || (e520VarM30611L2 = bvg1.m30611L(f520Var)) == null) ? null : bvg1.m30635w(e520VarM30611L2);
        boolean z = i520Var2 instanceof f520;
        f520 f520Var2 = z ? (f520) i520Var2 : null;
        if (f520Var2 != null && (e520VarM30611L = bvg1.m30611L(f520Var2)) != null) {
            lM30635w = bvg1.m30635w(e520VarM30611L);
        }
        if (wj50.m88271j(lM30635w2, lM30635w)) {
            return new pqm0(i520Var2, gbu.f78413a);
        }
        if (z) {
            i520Var2 = f520.m40743c((f520) i520Var2, null, null, null, null, 7);
        }
        return new pqm0(i520Var2, Collections.singleton(new okt(lM30635w)));
    }

    /* JADX INFO: renamed from: o */
    public static ColorStateList m34379o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f43268d, 0));
        }
        return colorStateList;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: p */
    public static String m34380p(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final hzd0 m34381q(ck90 ck90Var, Object obj) {
        hzd0 hzd0Var = new hzd0();
        hzd0Var.mo33104m(obj);
        hzd0Var.mo49264n(ck90Var, new k7u0(hzd0Var, 2));
        return hzd0Var;
    }

    /* JADX INFO: renamed from: r */
    public static String m34382r(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM38572u = edb.m38572u("<", str2, " threw ");
                    sbM38572u.append(e.getClass().getName());
                    sbM38572u.append(">");
                    string = sbM38572u.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
