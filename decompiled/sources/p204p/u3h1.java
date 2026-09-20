package p204p;

import android.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.highlightsstats.EntityImage;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u3h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f226384a = null;

    /* JADX INFO: renamed from: b */
    public static final int f226385b = 9;

    /* JADX INFO: renamed from: c */
    public static final int f226386c = 6;

    /* JADX INFO: renamed from: d */
    public static final int f226387d = 10;

    /* JADX INFO: renamed from: e */
    public static final int f226388e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f226389f = 15;

    /* JADX INFO: renamed from: a */
    public static final void m82278a(String str, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1318130355);
        int i2 = 4;
        int i3 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            ht4 ht4Var = (ht4) xq00Var.m91774k(wsh.f254628s);
            String strM54977L = k0e1.m54977L(R.string.artifact_page_ai_disclaimer_learn_word, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.artifact_page_ai_disclaimer_usage_limits_apply, xq00Var);
            String strM54978M = k0e1.m54978M(R.string.artifact_page_ai_disclaimer_full, new Object[]{"__LEARN__", "__USAGE_LIMITS__"}, xq00Var);
            g15 g15Var = new g15();
            int length = 0;
            while (length < strM54978M.length()) {
                int iM88458H0 = wl51.m88458H0(strM54978M, "__LEARN__", length, false, i2);
                Integer numValueOf = Integer.valueOf(iM88458H0);
                if (iM88458H0 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
                int iM88458H1 = wl51.m88458H0(strM54978M, "__USAGE_LIMITS__", length, false, i2);
                Integer numValueOf2 = iM88458H1 >= 0 ? Integer.valueOf(iM88458H1) : null;
                int iMin = Math.min(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : Integer.MAX_VALUE);
                if (iMin == Integer.MAX_VALUE) {
                    g15Var.m43331g(strM54978M.substring(length));
                    length = strM54978M.length();
                } else {
                    if (iMin > length) {
                        g15Var.m43331g(strM54978M.substring(length, iMin));
                    }
                    if (iMin == iIntValue) {
                        m82279b(g15Var, ht4Var, gh00Var, strM54977L, new dm80("https://www.spotify.com/legal/privacy-policy"));
                        length = iMin + 9;
                    } else {
                        m82279b(g15Var, ht4Var, gh00Var, strM54977L2, bm51.m29803n0(str, "spotify:", false) ? new em80(str) : new dm80(str));
                        length = iMin + 16;
                    }
                }
                i2 = 4;
            }
            j15 j15VarM43339o = g15Var.m43339o();
            if71 if71Var = leu.m58818d(xq00Var).f64977m;
            long j = leu.m58815a(xq00Var).f112824b.f138758b;
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25933e(j15VarM43339o, zsf1.m96830A(cxh0Var, f, 0.0f, 2), if71Var, j, null, null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4080);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sr2(str, gh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m82279b(g15 g15Var, ht4 ht4Var, gh00 gh00Var, String str, fm80 fm80Var) {
        String str2;
        StringBuilder sb = g15Var.f75524a;
        int length = sb.length();
        g15Var.m43331g(str);
        int length2 = sb.length();
        if (length2 > length) {
            g15Var.m43328d(new ew31(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.f539c, (Shadow) null, (PlatformSpanStyle) null, 61439), length, length2);
            if (fm80Var instanceof dm80) {
                str2 = ((dm80) fm80Var).f50474a;
            } else {
                if (!(fm80Var instanceof em80)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = ((em80) fm80Var).f60851a;
            }
            g15Var.m43326b(new xl80(str2, null, new tr2(fm80Var, ht4Var, gh00Var), 2), length, length2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m82280c(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, fxh0 fxh0Var2) {
        int i2;
        fxh0 fxh0Var3;
        xq00Var.m91775k0(-1057073096);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            fxh0 fxh0VarM39673I = epv0.m39673I("explore_premium_button", fxh0Var);
            tgu tguVar = new tgu(4);
            rgu rguVarM86516q = vvx.m86516q(xq00Var);
            String strM54977L = k0e1.m54977L(R.string.premium_play_modes_upsell_premium_row_accessibility_label, xq00Var);
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), tguVar, fxh0VarM39673I, null, rguVarM86516q, null, null, null, null, null, rkk.m75772x(-827317095, new jhw(str, 2, (byte) 0), xq00Var), xq00Var, 0, 48, 2008);
            fxh0Var3 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new chr(str, fxh0Var, fxh0Var3, eh00Var, i, 23);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m82281d(ta80 ta80Var, hc80 hc80Var, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-709389590);
        int i2 = i | 16 | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            } else {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            if (ta80Var == ta80.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var);
            boolean zM91766g = xq00Var.m91766g(kqi0VarM77651H) | xq00Var.m91770i(hc80Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new C2611yf(hc80Var, ta80Var, kqi0VarM77651H, 11);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49233e(hc80Var, (gh00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2493vf(ta80Var, hc80Var, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m82282e(Object obj, hc80 hc80Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1220373486);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            } else {
                xq00Var.m91757b0();
            }
            int i3 = i2 & (-113);
            xq00Var.m91790s();
            boolean zM91766g = xq00Var.m91766g(obj) | xq00Var.m91766g(hc80Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new pc80(hc80Var.getLifecycle());
                xq00Var.m91793t0(objM91750T);
            }
            m82283f(hc80Var, (pc80) objM91750T, gh00Var, xq00Var, i3 & 896);
        } else {
            xq00Var.m91757b0();
        }
        hc80 hc80Var2 = hc80Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oo4(obj, hc80Var2, gh00Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m82283f(hc80 hc80Var, pc80 pc80Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(912823238);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(hc80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(pc80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zM91770i = xq00Var.m91770i(pc80Var) | ((i2 & 896) == 256) | xq00Var.m91770i(hc80Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new C2611yf(hc80Var, pc80Var, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49232d(hc80Var, pc80Var, (gh00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oo4(hc80Var, pc80Var, gh00Var, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[PHI: r4 r6 r16
      0x0099: PHI (r4v8 p.fxh0) = (r4v5 p.fxh0), (r4v10 p.fxh0) binds: [B:60:0x00ae, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r6v20 int) = (r6v6 int), (r6v21 int) binds: [B:60:0x00ae, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r16v3 p.wju) = (r16v0 p.wju), (r16v4 p.wju) binds: [B:60:0x00ae, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m82284g(o3w0 o3w0Var, fxh0 fxh0Var, wju wjuVar, int i, gh00 gh00Var, xq00 xq00Var, int i2, int i3) {
        fxh0 fxh0Var2;
        int i4;
        wju wjuVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        fxh0 fxh0Var3;
        wju wjuVar3;
        pgv0 pgv0VarM91796v;
        wju wjuVar4;
        wju wjuVar5;
        int i11;
        int i12;
        fxh0 fxh0VarM39673I;
        kyu kyuVarM57723a;
        wju wjuVar6;
        boolean z2;
        Object objM91750T;
        eh00 eh00Var;
        xq00Var.m91775k0(1511951437);
        int i13 = (xq00Var.m91766g(o3w0Var) ? 4 : 2) | i2;
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 = i13 | 48;
            fxh0Var2 = fxh0Var;
        } else {
            fxh0Var2 = fxh0Var;
            i4 = i13 | (xq00Var.m91770i(fxh0Var2) ? 32 : 16);
        }
        if ((i3 & 4) == 0) {
            wjuVar2 = wjuVar;
            int i15 = xq00Var.m91770i(wjuVar2) ? 256 : 128;
            i5 = i4 | i15;
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    i7 = i;
                    if (xq00Var.m91762e(i7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i5 |= i8;
                }
                if (xq00Var.m91770i(gh00Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i10 = i5 | i9;
                if ((i10 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i10 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i2 & 1) != 0 || xq00Var.m91735E()) {
                        if (i14 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        if ((i3 & 4) != 0) {
                            wjuVar4 = tju.f221017e;
                            i10 &= -897;
                        } else {
                            wjuVar4 = wjuVar2;
                        }
                        wjuVar5 = wjuVar4;
                        i11 = i10;
                        if (i6 != 0) {
                            i12 = 1;
                        }
                        xq00Var.m91790s();
                        fxh0VarM39673I = epv0.m39673I("release_row", mi21.m61822f(1.0f, fxh0Var3));
                        kyu kyuVar = (kyu) xq00Var.m91774k(lyu.f138115a);
                        j4m0 j4m0VarM42520e = frz0.m42520e(3, 5, xq00Var);
                        ybs ybsVar = new ybs(leu.m58816b(xq00Var).f117230b.f224763f);
                        kyuVarM57723a = kyu.m57723a(kyuVar, wjuVar5, 5, new w1m0(ybsVar, null, ybsVar, null, j4m0VarM42520e), null, null, 497);
                        wjuVar6 = wjuVar5;
                        z2 = (i11 & 57344) == 16384;
                        objM91750T = xq00Var.m91750T();
                        if (z2 || objM91750T == t6x0.f217647t) {
                            objM91750T = new pbv0(11, gh00Var);
                            xq00Var.m91793t0(objM91750T);
                        }
                        eh00Var = (eh00) objM91750T;
                        if (wl51.m88460J0("Open release")) {
                            throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        }
                        p711.m69222a(fxh0VarM39673I, kyuVarM57723a, null, false, null, null, new peu(new t40("Open release"), eh00Var), null, null, rkk.m75772x(-965842122, new e6w0(o3w0Var, 0), xq00Var), rkk.m75772x(2085536438, new e6w0(o3w0Var, 1), xq00Var), rkk.m75772x(428530197, new e6w0(o3w0Var, 2), xq00Var), rkk.m75772x(-1228476044, new e6w0(o3w0Var, 3), xq00Var), null, null, rkk.m75772x(-1904527471, new vrj(o3w0Var, i12, 6), xq00Var), xq00Var, 805306432, 197046, 25020);
                        i7 = i12;
                        wjuVar3 = wjuVar6;
                    } else {
                        xq00Var.m91757b0();
                        if ((i3 & 4) != 0) {
                            i10 &= -897;
                        }
                        fxh0Var3 = fxh0Var2;
                        wjuVar5 = wjuVar2;
                        i11 = i10;
                    }
                    i12 = i7;
                    xq00Var.m91790s();
                    fxh0VarM39673I = epv0.m39673I("release_row", mi21.m61822f(1.0f, fxh0Var3));
                    kyu kyuVar2 = (kyu) xq00Var.m91774k(lyu.f138115a);
                    j4m0 j4m0VarM42520e2 = frz0.m42520e(3, 5, xq00Var);
                    ybs ybsVar2 = new ybs(leu.m58816b(xq00Var).f117230b.f224763f);
                    kyuVarM57723a = kyu.m57723a(kyuVar2, wjuVar5, 5, new w1m0(ybsVar2, null, ybsVar2, null, j4m0VarM42520e2), null, null, 497);
                    wjuVar6 = wjuVar5;
                    if ((i11 & 57344) == 16384) {
                    }
                    objM91750T = xq00Var.m91750T();
                    if (z2) {
                        objM91750T = new pbv0(11, gh00Var);
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = new pbv0(11, gh00Var);
                        xq00Var.m91793t0(objM91750T);
                    }
                    eh00Var = (eh00) objM91750T;
                    if (wl51.m88460J0("Open release")) {
                        throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    }
                    p711.m69222a(fxh0VarM39673I, kyuVarM57723a, null, false, null, null, new peu(new t40("Open release"), eh00Var), null, null, rkk.m75772x(-965842122, new e6w0(o3w0Var, 0), xq00Var), rkk.m75772x(2085536438, new e6w0(o3w0Var, 1), xq00Var), rkk.m75772x(428530197, new e6w0(o3w0Var, 2), xq00Var), rkk.m75772x(-1228476044, new e6w0(o3w0Var, 3), xq00Var), null, null, rkk.m75772x(-1904527471, new vrj(o3w0Var, i12, 6), xq00Var), xq00Var, 805306432, 197046, 25020);
                    i7 = i12;
                    wjuVar3 = wjuVar6;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    wjuVar3 = wjuVar2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new yff(o3w0Var, fxh0Var3, wjuVar3, i7, gh00Var, i2, i3);
                }
            }
            i5 |= 3072;
            i7 = i;
            if (xq00Var.m91770i(gh00Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i10 = i5 | i9;
            if ((i10 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i10 & 1, z)) {
                xq00Var.m91761d0();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        wjuVar4 = tju.f221017e;
                        i10 &= -897;
                    } else {
                        wjuVar4 = wjuVar2;
                    }
                    wjuVar5 = wjuVar4;
                    i11 = i10;
                    if (i6 != 0) {
                        i12 = 1;
                    } else {
                        i12 = i7;
                    }
                } else {
                    if (i14 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        wjuVar4 = tju.f221017e;
                        i10 &= -897;
                    } else {
                        wjuVar4 = wjuVar2;
                    }
                    wjuVar5 = wjuVar4;
                    i11 = i10;
                    if (i6 != 0) {
                        i12 = 1;
                    } else {
                        i12 = i7;
                    }
                }
                xq00Var.m91790s();
                fxh0VarM39673I = epv0.m39673I("release_row", mi21.m61822f(1.0f, fxh0Var3));
                kyu kyuVar3 = (kyu) xq00Var.m91774k(lyu.f138115a);
                j4m0 j4m0VarM42520e3 = frz0.m42520e(3, 5, xq00Var);
                ybs ybsVar3 = new ybs(leu.m58816b(xq00Var).f117230b.f224763f);
                kyuVarM57723a = kyu.m57723a(kyuVar3, wjuVar5, 5, new w1m0(ybsVar3, null, ybsVar3, null, j4m0VarM42520e3), null, null, 497);
                wjuVar6 = wjuVar5;
                if ((i11 & 57344) == 16384) {
                }
                objM91750T = xq00Var.m91750T();
                if (z2) {
                    objM91750T = new pbv0(11, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new pbv0(11, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00Var = (eh00) objM91750T;
                if (wl51.m88460J0("Open release")) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                p711.m69222a(fxh0VarM39673I, kyuVarM57723a, null, false, null, null, new peu(new t40("Open release"), eh00Var), null, null, rkk.m75772x(-965842122, new e6w0(o3w0Var, 0), xq00Var), rkk.m75772x(2085536438, new e6w0(o3w0Var, 1), xq00Var), rkk.m75772x(428530197, new e6w0(o3w0Var, 2), xq00Var), rkk.m75772x(-1228476044, new e6w0(o3w0Var, 3), xq00Var), null, null, rkk.m75772x(-1904527471, new vrj(o3w0Var, i12, 6), xq00Var), xq00Var, 805306432, 197046, 25020);
                i7 = i12;
                wjuVar3 = wjuVar6;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                wjuVar3 = wjuVar2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new yff(o3w0Var, fxh0Var3, wjuVar3, i7, gh00Var, i2, i3);
            }
        }
        wjuVar2 = wjuVar;
        i5 = i4 | i15;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                i7 = i;
                if (xq00Var.m91762e(i7)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i5 |= i8;
            }
            if (xq00Var.m91770i(gh00Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i10 = i5 | i9;
            if ((i10 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i10 & 1, z)) {
                xq00Var.m91761d0();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        wjuVar4 = tju.f221017e;
                        i10 &= -897;
                    } else {
                        wjuVar4 = wjuVar2;
                    }
                    wjuVar5 = wjuVar4;
                    i11 = i10;
                    if (i6 != 0) {
                        i12 = 1;
                    } else {
                        i12 = i7;
                    }
                } else {
                    if (i14 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        wjuVar4 = tju.f221017e;
                        i10 &= -897;
                    } else {
                        wjuVar4 = wjuVar2;
                    }
                    wjuVar5 = wjuVar4;
                    i11 = i10;
                    if (i6 != 0) {
                        i12 = 1;
                    } else {
                        i12 = i7;
                    }
                }
                xq00Var.m91790s();
                fxh0VarM39673I = epv0.m39673I("release_row", mi21.m61822f(1.0f, fxh0Var3));
                kyu kyuVar4 = (kyu) xq00Var.m91774k(lyu.f138115a);
                j4m0 j4m0VarM42520e4 = frz0.m42520e(3, 5, xq00Var);
                ybs ybsVar4 = new ybs(leu.m58816b(xq00Var).f117230b.f224763f);
                kyuVarM57723a = kyu.m57723a(kyuVar4, wjuVar5, 5, new w1m0(ybsVar4, null, ybsVar4, null, j4m0VarM42520e4), null, null, 497);
                wjuVar6 = wjuVar5;
                if ((i11 & 57344) == 16384) {
                }
                objM91750T = xq00Var.m91750T();
                if (z2) {
                    objM91750T = new pbv0(11, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new pbv0(11, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00Var = (eh00) objM91750T;
                if (wl51.m88460J0("Open release")) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                p711.m69222a(fxh0VarM39673I, kyuVarM57723a, null, false, null, null, new peu(new t40("Open release"), eh00Var), null, null, rkk.m75772x(-965842122, new e6w0(o3w0Var, 0), xq00Var), rkk.m75772x(2085536438, new e6w0(o3w0Var, 1), xq00Var), rkk.m75772x(428530197, new e6w0(o3w0Var, 2), xq00Var), rkk.m75772x(-1228476044, new e6w0(o3w0Var, 3), xq00Var), null, null, rkk.m75772x(-1904527471, new vrj(o3w0Var, i12, 6), xq00Var), xq00Var, 805306432, 197046, 25020);
                i7 = i12;
                wjuVar3 = wjuVar6;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                wjuVar3 = wjuVar2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new yff(o3w0Var, fxh0Var3, wjuVar3, i7, gh00Var, i2, i3);
            }
        }
        i5 |= 3072;
        i7 = i;
        if (xq00Var.m91770i(gh00Var)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        i10 = i5 | i9;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i10 & 1, z)) {
            xq00Var.m91761d0();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if ((i3 & 4) != 0) {
                    wjuVar4 = tju.f221017e;
                    i10 &= -897;
                } else {
                    wjuVar4 = wjuVar2;
                }
                wjuVar5 = wjuVar4;
                i11 = i10;
                if (i6 != 0) {
                    i12 = 1;
                } else {
                    i12 = i7;
                }
            } else {
                if (i14 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if ((i3 & 4) != 0) {
                    wjuVar4 = tju.f221017e;
                    i10 &= -897;
                } else {
                    wjuVar4 = wjuVar2;
                }
                wjuVar5 = wjuVar4;
                i11 = i10;
                if (i6 != 0) {
                    i12 = 1;
                } else {
                    i12 = i7;
                }
            }
            xq00Var.m91790s();
            fxh0VarM39673I = epv0.m39673I("release_row", mi21.m61822f(1.0f, fxh0Var3));
            kyu kyuVar5 = (kyu) xq00Var.m91774k(lyu.f138115a);
            j4m0 j4m0VarM42520e5 = frz0.m42520e(3, 5, xq00Var);
            ybs ybsVar5 = new ybs(leu.m58816b(xq00Var).f117230b.f224763f);
            kyuVarM57723a = kyu.m57723a(kyuVar5, wjuVar5, 5, new w1m0(ybsVar5, null, ybsVar5, null, j4m0VarM42520e5), null, null, 497);
            wjuVar6 = wjuVar5;
            if ((i11 & 57344) == 16384) {
            }
            objM91750T = xq00Var.m91750T();
            if (z2) {
                objM91750T = new pbv0(11, gh00Var);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = new pbv0(11, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0("Open release")) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            p711.m69222a(fxh0VarM39673I, kyuVarM57723a, null, false, null, null, new peu(new t40("Open release"), eh00Var), null, null, rkk.m75772x(-965842122, new e6w0(o3w0Var, 0), xq00Var), rkk.m75772x(2085536438, new e6w0(o3w0Var, 1), xq00Var), rkk.m75772x(428530197, new e6w0(o3w0Var, 2), xq00Var), rkk.m75772x(-1228476044, new e6w0(o3w0Var, 3), xq00Var), null, null, rkk.m75772x(-1904527471, new vrj(o3w0Var, i12, 6), xq00Var), xq00Var, 805306432, 197046, 25020);
            i7 = i12;
            wjuVar3 = wjuVar6;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            wjuVar3 = wjuVar2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yff(o3w0Var, fxh0Var3, wjuVar3, i7, gh00Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m82285h(String str, qe10 qe10Var, int i, xq00 xq00Var, int i2) {
        xq00Var.m91775k0(463645734);
        int i3 = (xq00Var.m91766g(str) ? 4 : 2) | i2 | (xq00Var.m91770i(qe10Var) ? 32 : 16) | (xq00Var.m91762e(i) ? 256 : 128);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            kgg1.m56338a(qe10Var, 0, 1, rkk.m75772x(183939696, new urf(str, i, 5), xq00Var), xq00Var, ((i3 >> 3) & 14) | 3072, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(str, qe10Var, i, i2, 18);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final pqm0 m82286i(ago agoVar) {
        LinkedHashMap linkedHashMapM25879p = agoVar.m25879p();
        return new pqm0(lb5.m58608g(new lb5(7), linkedHashMapM25879p), new gf40(linkedHashMapM25879p));
    }

    /* JADX INFO: renamed from: j */
    public static final LinkedHashMap m82287j(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            linkedHashMap.putIfAbsent((sec1) obj, Integer.valueOf(i));
            i = i2;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m82288k(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: l */
    public static final k7k m82289l(dcm0 dcm0Var) {
        return new k7k(dcm0Var);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m82290m(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public static int m82291n(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: o */
    public static final t050 m82292o(z8k z8kVar, mjk0 mjk0Var, hik0 hik0Var) {
        return ((b9k) z8kVar).m28489g("NpvWidgetLogoutMonitorDaemon", new rik0(18, mjk0Var, hik0Var));
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m82293p(Map map, Map map2, LinkedHashMap linkedHashMap, sec1 sec1Var, ebf0 ebf0Var, pgo pgoVar, boolean z) {
        boolean zIsEmpty;
        boolean z2;
        Object obj = sec1Var.f208274a;
        wjo wjoVar = (wjo) linkedHashMap.get(obj.getClass());
        if (wjoVar != null) {
            return wjoVar.mo34672a(pgoVar, obj, z);
        }
        Object obj2 = map2.get(obj.getClass());
        wj50.m88279p(obj2);
        Map map3 = (Map) ((gh00) obj2).invoke(obj);
        Object obj3 = map.get(obj.getClass());
        wj50.m88279p(obj3);
        Map map4 = (Map) obj3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(map3.keySet());
        linkedHashSet.removeAll(map4.keySet());
        if (!linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("Missing metadata requests for parts: " + linkedHashSet + ". Did you update your element's registration entry requiredMetadata declaration?");
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map4.entrySet()) {
            if (g6f.m43725i0(map3.keySet(), entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c95.m31820L(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Set set = (Set) entry2.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : set) {
                if (obj4 instanceof fww0) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((fww0) it.next()).f74188a);
            }
            linkedHashMap3.put(key, g6f.m43736n1(arrayList2));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            if (!((Set) entry3.getValue()).isEmpty()) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
            }
        }
        if (linkedHashMap4.isEmpty()) {
            return true;
        }
        ern0 ern0Var = ebf0Var.f57921a;
        while (true) {
            boolean z3 = true;
            for (pqm0 pqm0Var : kkc0.m56704q0(map3)) {
                Object obj5 = pqm0Var.f180350a;
                Set set2 = (Set) pqm0Var.f180351b;
                Set set3 = (Set) linkedHashMap4.get(obj5);
                if (set3 == null) {
                    set3 = gbu.f78413a;
                }
                Set set4 = set2;
                if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                    Iterator it2 = set4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = true;
                            break;
                        }
                        Map map5 = (Map) ern0Var.get((String) it2.next());
                        if (map5 == null) {
                            zIsEmpty = set3.isEmpty();
                        } else if (map5.keySet().containsAll(set3)) {
                            Set set5 = set3;
                            ArrayList arrayList3 = new ArrayList(i6f.m49804T(set5, 10));
                            Iterator it3 = set5.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add((dbf0) map5.get(it3.next()));
                            }
                            if (!arrayList3.isEmpty()) {
                                Iterator it4 = arrayList3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        dbf0 dbf0Var = (dbf0) it4.next();
                                        if (!(dbf0Var instanceof cbf0) && (!z || !(dbf0Var instanceof bbf0))) {
                                            zIsEmpty = false;
                                        }
                                    }
                                }
                            }
                            zIsEmpty = true;
                        } else {
                            zIsEmpty = false;
                        }
                        if (!zIsEmpty) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                if (!z3 || !z2) {
                    z3 = false;
                }
            }
            return z3;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Integer m82294q(String str) {
        Object c6x0Var;
        try {
            c6x0Var = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        return (Integer) c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX INFO: renamed from: r */
    public static final int m82295r(List list, Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null && wj50.m88271j(g6f.m43747t0(num.intValue(), list), obj)) {
            return num.intValue();
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (wj50.m88271j((sec1) it.next(), obj)) {
                if (i >= 0) {
                    return i;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: s */
    public static final void m82296s(RecyclerView recyclerView, gh00 gh00Var, boolean z, ag70 ag70Var, u4l0 u4l0Var) {
        if (u4l0Var != null) {
            ((ArrayList) u4l0Var.f226772b).clear();
        }
        gp1 gp1Var = new gp1(7, ag70Var, gh00Var, u4l0Var, new yyq(recyclerView, 26), z);
        tmq tmqVar = new tmq();
        recyclerView.setAdapter(new jo6(0, tmqVar, (hjv0) gp1Var.invoke(tmqVar)));
    }

    /* JADX INFO: renamed from: t */
    public static final void m82297t(ViewPager2 viewPager2, gh00 gh00Var, ag70 ag70Var) {
        gp1 gp1Var = new gp1(7, (Object) ag70Var, (Object) gh00Var, (Object) null, (ai00) uvt.f234502h, false);
        tmq tmqVar = new tmq();
        viewPager2.setAdapter(new jo6(0, tmqVar, (hjv0) gp1Var.invoke(tmqVar)));
    }

    /* JADX INFO: renamed from: u */
    public static c96 m82298u(EntityImage entityImage) {
        return new c96(entityImage.getImageUrl(), entityImage.m11282o() == wgv.ARTIST);
    }

    /* JADX INFO: renamed from: v */
    public static final l7k m82299v(z9j0 z9j0Var) {
        return new l7k(z9j0Var);
    }

    /* JADX INFO: renamed from: w */
    public static String m82300w(int i) {
        StringBuilder sb = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb2 = new StringBuilder();
        int i2 = f226385b;
        if ((i & i2) == i2) {
            m82302y(sb2, "Start");
        }
        int i3 = f226387d;
        if ((i & i3) == i3) {
            m82302y(sb2, "Left");
        }
        if ((i & 16) == 16) {
            m82302y(sb2, "Top");
        }
        int i4 = f226386c;
        if ((i & i4) == i4) {
            m82302y(sb2, "End");
        }
        int i5 = f226388e;
        if ((i & i5) == i5) {
            m82302y(sb2, "Right");
        }
        if ((i & 32) == 32) {
            m82302y(sb2, "Bottom");
        }
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static final void m82301x(h9b h9bVar, gh00 gh00Var) {
        ArrayList arrayList = h9bVar.f88910a;
        gh00Var.invoke(arrayList.get(h6f.m46713J(arrayList).f278779b));
    }

    /* JADX INFO: renamed from: y */
    public static final void m82302y(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
