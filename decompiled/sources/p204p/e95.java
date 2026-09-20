package p204p;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
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
import com.spotify.browsita.p033v1.resolved.EmbeddedAdMetadata;
import com.spotify.browsita.p033v1.resolved.EmbeddedAdTrackingUrls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e95 {

    /* JADX INFO: renamed from: a */
    public static final int[] f57362a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f57363b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f57364c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f57365d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static sd40 f57366e;

    /* JADX INFO: renamed from: a */
    public static final void m38196a(ol80 ol80Var, j15 j15Var, j15 j15Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(962303191);
        int i2 = i | (xq00Var.m91770i(ol80Var) ? 4 : 2) | (xq00Var.m91770i(j15Var) ? 32 : 16) | (xq00Var.m91770i(j15Var2) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(j15Var);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            Object obj2 = (kqi0) objM91750T2;
            j15 j15Var3 = (j15) kqi0Var.getValue();
            if71 if71VarM50418a = if71.m50418a(leu.m58818d(xq00Var).f64971g, 0L, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 0, epv0.m39702v(32), null, null, null, 0, 16646143);
            boolean zM91770i = xq00Var.m91770i(obj2) | xq00Var.m91770i(ol80Var) | xq00Var.m91770i(j15Var) | xq00Var.m91770i(j15Var2) | xq00Var.m91770i(kqi0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj) {
                Object o7w0Var = new o7w0(ol80Var, j15Var, j15Var2, obj2, kqi0Var, 14);
                xq00Var.m91793t0(o7w0Var);
                objM91750T3 = o7w0Var;
            }
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25933e(j15Var3, cxh0Var, if71VarM50418a, 0L, null, (gh00) objM91750T3, 1, false, ol80Var, 0, null, null, xq00Var, 48 | ((i2 << 24) & 234881024), 0, 3736);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rd71(ol80Var, j15Var, j15Var2, fxh0Var2, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0160  */
    /* JADX WARN: Code duplicated, block: B:105:0x0167  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:109:0x018d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0197  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:123:0x0217  */
    /* JADX WARN: Code duplicated, block: B:125:0x021c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0229  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    /* JADX INFO: renamed from: b */
    public static final void m38197b(eh00 eh00Var, fxh0 fxh0Var, th00 th00Var, th00 th00Var2, no21 no21Var, zj71 zj71Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        int i3;
        th00 th00Var3;
        int i4;
        th00 th00Var4;
        int i5;
        boolean z;
        no21 no21Var2;
        zj71 zj71Var2;
        th00 th00Var5;
        th00 th00Var6;
        pgv0 pgv0VarM91796v;
        th00 th00Var7;
        th00 th00VarM75772x;
        int i6;
        zj71 zj71Var3;
        no21 no21Var3;
        th00 th00Var8;
        aaf aafVarM87496a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        boolean z2;
        int i7;
        int i8;
        boolean zM91770i;
        int i9;
        boolean zM91770i2;
        no21 lo21Var = no21Var;
        zj71 zj71Var4 = zj71Var;
        xq00Var.m91775k0(-1391989260);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                th00Var3 = th00Var;
                i3 |= xq00Var.m91770i(th00Var3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    th00Var4 = th00Var2;
                    if (xq00Var.m91770i(th00Var4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) != 0) {
                        i9 = 8192;
                    } else {
                        if ((32768 & i) == 0) {
                            zM91770i2 = xq00Var.m91766g(lo21Var);
                        } else {
                            zM91770i2 = xq00Var.m91770i(lo21Var);
                        }
                        if (zM91770i2) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) != 0) {
                        i8 = 65536;
                    } else {
                        if ((262144 & i) == 0) {
                            zM91770i = xq00Var.m91766g(zj71Var4);
                        } else {
                            zM91770i = xq00Var.m91770i(zj71Var4);
                        }
                        if (zM91770i) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                    }
                    i3 |= i8;
                }
                if ((1572864 & i) == 0) {
                    if (xq00Var.m91770i(fyfVar)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i & 1) != 0 || xq00Var.m91735E()) {
                        if (i10 != 0) {
                            th00Var7 = r9h.f197061a;
                        } else {
                            th00Var7 = th00Var3;
                        }
                        if (i4 != 0) {
                            th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                        } else {
                            th00VarM75772x = th00Var4;
                        }
                        if ((i2 & 16) != 0) {
                            lo21Var = new lo21();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            zj71Var4 = new zj71(eh00Var);
                            i3 &= -458753;
                        }
                        i6 = i3;
                        zj71Var3 = zj71Var4;
                        no21Var3 = lo21Var;
                        th00Var8 = th00VarM75772x;
                    } else {
                        xq00Var.m91757b0();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        i6 = i3;
                        th00Var7 = th00Var3;
                        zj71Var3 = zj71Var4;
                        no21Var3 = lo21Var;
                        th00Var8 = th00Var4;
                    }
                    xq00Var.m91790s();
                    fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117233e.f137888d, zfg1.m96028q(fxh0Var, zfg1.f282315c));
                    aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
                    iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0VarM91778m = xq00Var.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y);
                    soh.f211194A.getClass();
                    c2087le = roh.f201257b;
                    if (xq00Var.f264811a != null) {
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
                    if (th00Var7 == null) {
                        xq00Var.m91771i0(281930555);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(9094534);
                        z0k0.m95074k((i6 >> 6) & 14, th00Var7, xq00Var, false);
                    }
                    fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224765h, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5));
                    if (1.0f > 0.0d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        kt40.m57301a("invalid weight; must be greater than zero");
                    }
                    iyg1.m51914a(f710.m40940h(1.0f, fxh0VarM61822f, false), null, rkk.m75772x(-224543320, new jo21(no21Var3, zj71Var3, fyfVar, 0), xq00Var), xq00Var, 3072, 6);
                    if (th00Var8 == null) {
                        xq00Var.m91771i0(284092123);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(9164262);
                        z0k0.m95074k((i6 >> 9) & 14, th00Var8, xq00Var, false);
                    }
                    xq00Var.m91788r(true);
                    zj71 zj71Var5 = zj71Var3;
                    no21Var2 = no21Var3;
                    th00Var5 = th00Var7;
                    zj71Var2 = zj71Var5;
                    th00Var6 = th00Var8;
                } else {
                    xq00Var.m91757b0();
                    no21Var2 = lo21Var;
                    zj71Var2 = zj71Var4;
                    th00Var5 = th00Var3;
                    th00Var6 = th00Var4;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ko21(eh00Var, fxh0Var, th00Var5, th00Var6, no21Var2, zj71Var2, fyfVar, i, i2);
                }
            }
            i3 |= 3072;
            th00Var4 = th00Var2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i9 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zM91770i2 = xq00Var.m91766g(lo21Var);
                    } else {
                        zM91770i2 = xq00Var.m91770i(lo21Var);
                    }
                    if (zM91770i2) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) != 0) {
                    i8 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zM91770i = xq00Var.m91766g(zj71Var4);
                    } else {
                        zM91770i = xq00Var.m91770i(zj71Var4);
                    }
                    if (zM91770i) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (xq00Var.m91770i(fyfVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        th00Var7 = r9h.f197061a;
                    } else {
                        th00Var7 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                    } else {
                        th00VarM75772x = th00Var4;
                    }
                    if ((i2 & 16) != 0) {
                        lo21Var = new lo21();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        zj71Var4 = new zj71(eh00Var);
                        i3 &= -458753;
                    }
                    i6 = i3;
                    zj71Var3 = zj71Var4;
                    no21Var3 = lo21Var;
                    th00Var8 = th00VarM75772x;
                } else {
                    if (i10 != 0) {
                        th00Var7 = r9h.f197061a;
                    } else {
                        th00Var7 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                    } else {
                        th00VarM75772x = th00Var4;
                    }
                    if ((i2 & 16) != 0) {
                        lo21Var = new lo21();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        zj71Var4 = new zj71(eh00Var);
                        i3 &= -458753;
                    }
                    i6 = i3;
                    zj71Var3 = zj71Var4;
                    no21Var3 = lo21Var;
                    th00Var8 = th00VarM75772x;
                }
                xq00Var.m91790s();
                fxh0 fxh0VarM96865y2 = zsf1.m96865y(leu.m58816b(xq00Var).f117233e.f137888d, zfg1.m96028q(fxh0Var, zfg1.f282315c));
                aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y2);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (xq00Var.f264811a != null) {
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
                if (th00Var7 == null) {
                    xq00Var.m91771i0(281930555);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(9094534);
                    z0k0.m95074k((i6 >> 6) & 14, th00Var7, xq00Var, false);
                }
                fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224765h, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5));
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                iyg1.m51914a(f710.m40940h(1.0f, fxh0VarM61822f2, false), null, rkk.m75772x(-224543320, new jo21(no21Var3, zj71Var3, fyfVar, 0), xq00Var), xq00Var, 3072, 6);
                if (th00Var8 == null) {
                    xq00Var.m91771i0(284092123);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(9164262);
                    z0k0.m95074k((i6 >> 9) & 14, th00Var8, xq00Var, false);
                }
                xq00Var.m91788r(true);
                zj71 zj71Var6 = zj71Var3;
                no21Var2 = no21Var3;
                th00Var5 = th00Var7;
                zj71Var2 = zj71Var6;
                th00Var6 = th00Var8;
            } else {
                xq00Var.m91757b0();
                no21Var2 = lo21Var;
                zj71Var2 = zj71Var4;
                th00Var5 = th00Var3;
                th00Var6 = th00Var4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ko21(eh00Var, fxh0Var, th00Var5, th00Var6, no21Var2, zj71Var2, fyfVar, i, i2);
            }
        }
        i3 |= 384;
        th00Var3 = th00Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                th00Var4 = th00Var2;
                if (xq00Var.m91770i(th00Var4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i9 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zM91770i2 = xq00Var.m91766g(lo21Var);
                    } else {
                        zM91770i2 = xq00Var.m91770i(lo21Var);
                    }
                    if (zM91770i2) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) != 0) {
                    i8 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zM91770i = xq00Var.m91766g(zj71Var4);
                    } else {
                        zM91770i = xq00Var.m91770i(zj71Var4);
                    }
                    if (zM91770i) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                }
                i3 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (xq00Var.m91770i(fyfVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        th00Var7 = r9h.f197061a;
                    } else {
                        th00Var7 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                    } else {
                        th00VarM75772x = th00Var4;
                    }
                    if ((i2 & 16) != 0) {
                        lo21Var = new lo21();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        zj71Var4 = new zj71(eh00Var);
                        i3 &= -458753;
                    }
                    i6 = i3;
                    zj71Var3 = zj71Var4;
                    no21Var3 = lo21Var;
                    th00Var8 = th00VarM75772x;
                } else {
                    if (i10 != 0) {
                        th00Var7 = r9h.f197061a;
                    } else {
                        th00Var7 = th00Var3;
                    }
                    if (i4 != 0) {
                        th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                    } else {
                        th00VarM75772x = th00Var4;
                    }
                    if ((i2 & 16) != 0) {
                        lo21Var = new lo21();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        zj71Var4 = new zj71(eh00Var);
                        i3 &= -458753;
                    }
                    i6 = i3;
                    zj71Var3 = zj71Var4;
                    no21Var3 = lo21Var;
                    th00Var8 = th00VarM75772x;
                }
                xq00Var.m91790s();
                fxh0 fxh0VarM96865y3 = zsf1.m96865y(leu.m58816b(xq00Var).f117233e.f137888d, zfg1.m96028q(fxh0Var, zfg1.f282315c));
                aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y3);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (xq00Var.f264811a != null) {
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
                if (th00Var7 == null) {
                    xq00Var.m91771i0(281930555);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(9094534);
                    z0k0.m95074k((i6 >> 6) & 14, th00Var7, xq00Var, false);
                }
                fxh0 fxh0VarM61822f3 = mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224765h, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5));
                if (1.0f > 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                iyg1.m51914a(f710.m40940h(1.0f, fxh0VarM61822f3, false), null, rkk.m75772x(-224543320, new jo21(no21Var3, zj71Var3, fyfVar, 0), xq00Var), xq00Var, 3072, 6);
                if (th00Var8 == null) {
                    xq00Var.m91771i0(284092123);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(9164262);
                    z0k0.m95074k((i6 >> 9) & 14, th00Var8, xq00Var, false);
                }
                xq00Var.m91788r(true);
                zj71 zj71Var7 = zj71Var3;
                no21Var2 = no21Var3;
                th00Var5 = th00Var7;
                zj71Var2 = zj71Var7;
                th00Var6 = th00Var8;
            } else {
                xq00Var.m91757b0();
                no21Var2 = lo21Var;
                zj71Var2 = zj71Var4;
                th00Var5 = th00Var3;
                th00Var6 = th00Var4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ko21(eh00Var, fxh0Var, th00Var5, th00Var6, no21Var2, zj71Var2, fyfVar, i, i2);
            }
        }
        i3 |= 3072;
        th00Var4 = th00Var2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i9 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zM91770i2 = xq00Var.m91766g(lo21Var);
                } else {
                    zM91770i2 = xq00Var.m91770i(lo21Var);
                }
                if (zM91770i2) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i8 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zM91770i = xq00Var.m91766g(zj71Var4);
                } else {
                    zM91770i = xq00Var.m91770i(zj71Var4);
                }
                if (zM91770i) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (xq00Var.m91770i(fyfVar)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    th00Var7 = r9h.f197061a;
                } else {
                    th00Var7 = th00Var3;
                }
                if (i4 != 0) {
                    th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                } else {
                    th00VarM75772x = th00Var4;
                }
                if ((i2 & 16) != 0) {
                    lo21Var = new lo21();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    zj71Var4 = new zj71(eh00Var);
                    i3 &= -458753;
                }
                i6 = i3;
                zj71Var3 = zj71Var4;
                no21Var3 = lo21Var;
                th00Var8 = th00VarM75772x;
            } else {
                if (i10 != 0) {
                    th00Var7 = r9h.f197061a;
                } else {
                    th00Var7 = th00Var3;
                }
                if (i4 != 0) {
                    th00VarM75772x = rkk.m75772x(1629007403, new zt10(eh00Var, false, 28), xq00Var);
                } else {
                    th00VarM75772x = th00Var4;
                }
                if ((i2 & 16) != 0) {
                    lo21Var = new lo21();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    zj71Var4 = new zj71(eh00Var);
                    i3 &= -458753;
                }
                i6 = i3;
                zj71Var3 = zj71Var4;
                no21Var3 = lo21Var;
                th00Var8 = th00VarM75772x;
            }
            xq00Var.m91790s();
            fxh0 fxh0VarM96865y4 = zsf1.m96865y(leu.m58816b(xq00Var).f117233e.f137888d, zfg1.m96028q(fxh0Var, zfg1.f282315c));
            aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y4);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (xq00Var.f264811a != null) {
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
            if (th00Var7 == null) {
                xq00Var.m91771i0(281930555);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(9094534);
                z0k0.m95074k((i6 >> 6) & 14, th00Var7, xq00Var, false);
            }
            fxh0 fxh0VarM61822f4 = mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224765h, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5));
            if (1.0f > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            iyg1.m51914a(f710.m40940h(1.0f, fxh0VarM61822f4, false), null, rkk.m75772x(-224543320, new jo21(no21Var3, zj71Var3, fyfVar, 0), xq00Var), xq00Var, 3072, 6);
            if (th00Var8 == null) {
                xq00Var.m91771i0(284092123);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(9164262);
                z0k0.m95074k((i6 >> 9) & 14, th00Var8, xq00Var, false);
            }
            xq00Var.m91788r(true);
            zj71 zj71Var8 = zj71Var3;
            no21Var2 = no21Var3;
            th00Var5 = th00Var7;
            zj71Var2 = zj71Var8;
            th00Var6 = th00Var8;
        } else {
            xq00Var.m91757b0();
            no21Var2 = lo21Var;
            zj71Var2 = zj71Var4;
            th00Var5 = th00Var3;
            th00Var6 = th00Var4;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ko21(eh00Var, fxh0Var, th00Var5, th00Var6, no21Var2, zj71Var2, fyfVar, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m38198c(eh00 eh00Var, th00 th00Var, th00 th00Var2, no21 no21Var, zj71 zj71Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        th00 th00Var3;
        zj71 zj71Var2;
        th00 th00VarM75772x;
        int i3;
        zj71 zj71Var3;
        xq00Var.m91775k0(446088652);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(cxh0.f43038a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(th00Var) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? xq00Var.m91766g(no21Var) : xq00Var.m91770i(no21Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= xq00Var.m91770i(fyfVar) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i4 & 1, (599187 & i4) != 599186)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                th00VarM75772x = rkk.m75772x(-1936834365, new zt10(eh00Var, false, 29), xq00Var);
                i3 = i4 & (-458753);
                zj71Var3 = new zj71(eh00Var);
            } else {
                xq00Var.m91757b0();
                i3 = i4 & (-458753);
                th00VarM75772x = th00Var2;
                zj71Var3 = zj71Var;
            }
            int i5 = i3;
            xq00Var.m91790s();
            epv0.m39681a(eh00Var, new lhr(3, false, false, false), rkk.m75772x(2130922453, new la11(eh00Var, th00Var, th00VarM75772x, no21Var, zj71Var3, fyfVar), xq00Var), xq00Var, (i5 & 14) | 384, 0);
            th00Var3 = th00VarM75772x;
            zj71Var2 = zj71Var3;
        } else {
            xq00Var.m91757b0();
            th00Var3 = th00Var2;
            zj71Var2 = zj71Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eh11(eh00Var, th00Var, th00Var3, no21Var, zj71Var2, fyfVar, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m38199d(bd81 bd81Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        j15 j15VarM43339o;
        xq00Var.m91775k0(-755142104);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = (i & 6) == 0 ? i | (xq00Var.m91770i(bd81Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61814B = mi21.m61814B(mi21.m61822f(1.0f, cxh0Var), null, 3);
            bd81Var.getClass();
            xq00Var.m91771i0(157920464);
            xq00Var.m91788r(false);
            fxh0 fxh0VarM39673I = epv0.m39673I("trackCloud", zsf1.m96866z(fxh0VarM61814B.mo34315F(cxh0Var), 16, 8));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
            xq00Var.m91771i0(-306644863);
            g15 g15Var = new g15();
            xq00Var.m91771i0(-306643567);
            int i4 = 0;
            for (Object obj : bd81Var.f26047a) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                cd81 cd81Var = (cd81) obj;
                xq00Var.m91771i0(1862974665);
                xq00Var.m91788r(false);
                if (bd81Var.f26049c) {
                    xq00Var.m91771i0(1863012361);
                    int iM43338n = g15Var.m43338n(new ew31(leu.m58815a(xq00Var).f112824b.f138757a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        g15Var.m43331g(cd81Var.f36833b);
                        g15Var.m43331g(" ");
                        g15Var.m43335k(iM43338n);
                        xq00Var.m91788r(false);
                    } catch (Throwable th) {
                        g15Var.m43335k(iM43338n);
                        throw th;
                    }
                } else {
                    xq00Var.m91771i0(1863166121);
                    xq00Var.m91788r(false);
                }
                int iM43338n2 = g15Var.m43338n(new ew31(leu.m58815a(xq00Var).f112824b.f138758b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    g15Var.m43331g(cd81Var.f36832a);
                    g15Var.m43331g(" • ");
                    g15Var.m43335k(iM43338n2);
                    i4 = i5;
                } catch (Throwable th2) {
                    g15Var.m43335k(iM43338n2);
                    throw th2;
                }
            }
            xq00Var.m91788r(false);
            j15 j15VarM43339o2 = g15Var.m43339o();
            xq00Var.m91788r(false);
            xq00Var.m91771i0(-915462324);
            xq00Var.m91788r(false);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
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
            ol80 ol80Var = new ol80(4);
            String str = bd81Var.f26048b;
            if (str == null) {
                xq00Var.m91771i0(1182113965);
                xq00Var.m91788r(false);
                j15VarM43339o = null;
            } else {
                xq00Var.m91771i0(1182113966);
                xq00Var.m91771i0(-516056074);
                g15 g15Var2 = new g15();
                xq00Var.m91771i0(1165640876);
                long j = leu.m58815a(xq00Var).f112824b.f138758b;
                xq00Var.m91788r(false);
                int iM43338n3 = g15Var2.m43338n(new ew31(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    g15Var2.m43331g(" • " + str);
                    g15Var2.m43335k(iM43338n3);
                    j15VarM43339o = g15Var2.m43339o();
                    xq00Var.m91788r(false);
                    xq00Var.m91788r(false);
                } catch (Throwable th3) {
                    g15Var2.m43335k(iM43338n3);
                    throw th3;
                }
            }
            if (j15VarM43339o == null) {
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM79995j = t3d1.m79995j();
                new ArrayList();
                sb.append("");
                String string = sb.toString();
                ArrayList arrayList = new ArrayList(arrayListM79995j.size());
                for (int iM62683h = 0; iM62683h < arrayListM79995j.size(); iM62683h = ms2.m62683h(sb, (f15) arrayListM79995j.get(iM62683h), arrayList, iM62683h, 1)) {
                }
                j15VarM43339o = new j15(string, arrayList);
            }
            m38196a(ol80Var, j15VarM43339o2, j15VarM43339o, null, xq00Var, 0);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lz11(bd81Var, eh00Var, fxh0Var2, i, 27);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m38200e(String str, String str2, qf40 qf40Var, e5m0 e5m0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        Object obj;
        xq00Var.m91775k0(-939104536);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(qf40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(e5m0Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            qly0 qly0VarM68467i0 = oyf1.m68467i0(0, 0, 1, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, oyf1.m68493v0(cxh0Var, qly0VarM68467i0, false, 14));
            WeakHashMap weakHashMap = cxd1.f42984x;
            fxh0 fxh0VarM19r = AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0VarM61820d);
            ub9 ub9Var = d7f0.f46145P0;
            zhi0 zhi0Var = bj5.f27612c;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM19r);
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
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = lpo0.f135821b1;
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(cxh0Var, true, (gh00) objM91750T);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96644b);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            ahf1.m25932d(str, zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), leu.m58818d(xq00Var).f64969e, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, i3 & 14, 0, 2016);
            ahf1.m25932d(str2, zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 2), fr0.m42477u(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, xq00Var, xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, (i3 >> 3) & 14, 0, 2016);
            xq00Var.m91788r(true);
            riw0.m75615i(xq00Var, mi21.m61824h(leu.m58816b(xq00Var).f117230b.f224761d, cxh0Var));
            xq00Var.m91771i0(-642547884);
            Iterator<E> it = qf40Var.iterator();
            while (it.hasNext()) {
                mif1.m61869b((ry8) e5m0Var.invoke(), (y4p0) it.next(), null, null, xq00Var, 0, 12);
            }
            xq00Var.m91788r(false);
            AbstractC0000a.m22u(cxh0Var, leu.m58816b(xq00Var).f117230b.f224766i, xq00Var, true);
            obj = cxh0Var;
        } else {
            xq00Var.m91757b0();
            obj = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vy40(str, str2, qf40Var, e5m0Var, obj, i, 27);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m38201f(View view, eh00 eh00Var) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            view.startAnimation(alphaAnimation);
            eh00Var.invoke();
        }
    }

    /* JADX INFO: renamed from: g */
    public static ekr m38202g() {
        if (ekr.f60524b != null) {
            return ekr.f60524b;
        }
        synchronized (ekr.class) {
            try {
                if (ekr.f60524b == null) {
                    ekr.f60524b = new ekr(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ekr.f60524b;
    }

    /* JADX INFO: renamed from: h */
    public static final brl0 m38203h(l0e1 l0e1Var, String str, lmn0 lmn0Var) {
        return jq60.m54078x(l0e1Var.f128404A0.f49375m, "enqueueUniquePeriodic_".concat(str), l0e1Var.f128406C0.f160371a, new c2e1(l0e1Var, str, lmn0Var));
    }

    /* JADX INFO: renamed from: i */
    public static final sd40 m38204i() {
        sd40 sd40Var = f57366e;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 16;
        rd40 rd40Var = new rd40("Encore.Vector.MoreAndroid16", f, f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        pk31 pk31Var = new pk31(n6f.f150862b);
        sep sepVarM62656j = mrx0.m62656j(8.0f, 3.0f);
        sepVarM62656j.m77933g(1.5f, 1.5f, true, true, 0.0f, -3.0f);
        sepVarM62656j.m77933g(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        sepVarM62656j.m77946t(0.0f, 6.5f);
        sepVarM62656j.m77933g(1.5f, 1.5f, true, true, 0.0f, -3.0f);
        sepVarM62656j.m77933g(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        sepVarM62656j.m77945s(8.0f, 16.0f);
        sepVarM62656j.m77933g(1.5f, 1.5f, true, true, 0.0f, -3.0f);
        sepVarM62656j.m77933g(1.5f, 1.5f, false, true, 0.0f, 3.0f);
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f57366e = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: j */
    public static final View m38205j(Activity activity) {
        if (p2l.f173365a.contains(e95.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            p2l.m68953a(e95.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static zr20 m38206k() {
        if (zr20.f285525c != null) {
            return zr20.f285525c;
        }
        synchronized (zr20.class) {
            try {
                if (zr20.f285525c == null) {
                    zr20.f285525c = new zr20();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zr20.f285525c;
    }

    /* JADX INFO: renamed from: l */
    public static final byte[] m38207l(byte[] bArr, byte[] bArr2) {
        Object c6x0Var;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            c6x0Var = mac.doFinal(bArr2);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        return (byte[]) c6x0Var;
    }

    /* JADX INFO: renamed from: m */
    public static final t050 m38208m(z8k z8kVar, njk0 njk0Var, njk0 njk0Var2, njk0 njk0Var3, njk0 njk0Var4) {
        return ((b9k) z8kVar).m28489g("PlaybackErrorNotifierDaemon", new bjk0(njk0Var, njk0Var2, njk0Var3, njk0Var4, 13));
    }

    /* JADX INFO: renamed from: n */
    public static co50 m38209n() {
        if (co50.f40185c != null) {
            return co50.f40185c;
        }
        synchronized (co50.class) {
            try {
                if (co50.f40185c == null) {
                    co50.f40185c = new co50(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return co50.f40185c;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m38210o() {
        String str = Build.FINGERPRINT;
        if (bm51.m29803n0(str, "generic", false) || bm51.m29803n0(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        if (wl51.m88496t0(str2, "google_sdk", false) || wl51.m88496t0(str2, "Emulator", false) || wl51.m88496t0(str2, "Android SDK built for x86", false) || wl51.m88496t0(Build.MANUFACTURER, "Genymotion", false)) {
            return true;
        }
        return (bm51.m29803n0(Build.BRAND, "generic", false) && bm51.m29803n0(Build.DEVICE, "generic", false)) || "google_sdk".equals(Build.PRODUCT);
    }

    /* JADX INFO: renamed from: p */
    public static zb20 m38211p() {
        if (qzb0.f194163a != null) {
            return qzb0.f194163a;
        }
        synchronized (qzb0.class) {
            try {
                if (qzb0.f194163a == null) {
                    qzb0.f194163a = new zb20(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qzb0.f194163a;
    }

    /* JADX INFO: renamed from: q */
    public static final String m38212q(String str, ebf0 ebf0Var) {
        cbf0 cbf0VarM35556a;
        erc1 erc1Var;
        m340 m340Var;
        z240 z240VarM60640a;
        dbf0 dbf0VarM38368c = ebf0Var.m38368c(erc1.class, str);
        String str2 = (dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null || (erc1Var = (erc1) cbf0VarM35556a.f36107a) == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) ? null : z240VarM60640a.f278475a.f198763a;
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: r */
    public static final f5u m38213r(EmbeddedAdMetadata embeddedAdMetadata) {
        String id = embeddedAdMetadata.getId();
        String strM4072n = embeddedAdMetadata.m4072n();
        String strM4074q = embeddedAdMetadata.m4074q();
        String strM4075r = embeddedAdMetadata.m4075r();
        String strM4073p = embeddedAdMetadata.m4073p();
        String strM4076s = embeddedAdMetadata.m4076s();
        Map mapM4077t = embeddedAdMetadata.m4077t();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapM4077t.size()));
        for (Map.Entry entry : mapM4077t.entrySet()) {
            linkedHashMap.put(entry.getKey(), new a6u(((EmbeddedAdTrackingUrls) entry.getValue()).m4079o()));
        }
        return new f5u(id, strM4072n, strM4074q, strM4075r, strM4073p, strM4076s, linkedHashMap);
    }

    /* JADX INFO: renamed from: s */
    public static String m38214s(int i) {
        if (i == 1) {
            return "Strategy.Simple";
        }
        if (i == 2) {
            return "Strategy.HighQuality";
        }
        if (i == 3) {
            return "Strategy.Balanced";
        }
        return i == 0 ? "Strategy.Unspecified" : "Invalid";
    }

    /* JADX INFO: renamed from: t */
    public static final float m38215t(int i, int i2) {
        float f = i;
        float f2 = i2;
        float fM63436m = (1.5f - n0e1.m63436m(f / f2, 0.5f, 1.0f)) * 0.97f * f;
        float f3 = (f2 - 72.0f) - 176.0f;
        float f4 = f * 0.4f;
        if (f3 < f4) {
            f3 = f4;
        }
        return fM63436m > f3 ? f3 : fM63436m;
    }
}
