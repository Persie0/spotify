package p204p;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Parcel;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.style.TextDecoration;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vvx {

    /* JADX INFO: renamed from: a */
    public static final C2617yl f245349a;

    /* JADX INFO: renamed from: b */
    public static final C2617yl f245350b;

    /* JADX INFO: renamed from: c */
    public static sd40 f245351c;

    static {
        int i = 8;
        f245349a = new C2617yl("UNDEFINED", i);
        f245350b = new C2617yl("REUSABLE_CLAIMED", i);
    }

    /* JADX INFO: renamed from: A */
    public static final void m86496A(Object obj, fbk fbkVar) {
        if (!(fbkVar instanceof lsr)) {
            fbkVar.resumeWith(obj);
            return;
        }
        lsr lsrVar = (lsr) fbkVar;
        luk lukVar = lsrVar.f136586d;
        ibk ibkVar = lsrVar.f136587e;
        Object objM75859z = rlg1.m75859z(obj);
        if (m86498C(lukVar, ibkVar.getContext())) {
            lsrVar.f136588f = objM75859z;
            lsrVar.f157872c = 1;
            m86497B(lukVar, ibkVar.getContext(), lsrVar);
            return;
        }
        g6x g6xVarM78022a = sg71.m78022a();
        if (g6xVarM78022a.f77136c >= 4294967296L) {
            lsrVar.f136588f = objM75859z;
            lsrVar.f157872c = 1;
            g6xVarM78022a.m43768V(lsrVar);
            return;
        }
        g6xVarM78022a.m43770c0(true);
        try {
            tf60 tf60Var = (tf60) ibkVar.getContext().mo26595B(gk40.f80712X0);
            if (tf60Var == null || tf60Var.isActive()) {
                Object obj2 = lsrVar.f136589g;
                juk context = ibkVar.getContext();
                Object objM41327u = fcg1.m41327u(context, obj2);
                k1a1 k1a1VarM37367L = objM41327u != fcg1.f68117a ? dyu.m37367L(ibkVar, context, objM41327u) : null;
                try {
                    ibkVar.resumeWith(obj);
                    if (k1a1VarM37367L == null || k1a1VarM37367L.m55084A0()) {
                        fcg1.m41319m(context, objM41327u);
                    }
                } catch (Throwable th) {
                    if (k1a1VarM37367L == null || k1a1VarM37367L.m55084A0()) {
                        fcg1.m41319m(context, objM41327u);
                    }
                    throw th;
                }
            } else {
                lsrVar.resumeWith(new c6x0(tf60Var.mo26603h()));
            }
            while (g6xVarM78022a.m43771g0()) {
            }
        } catch (Throwable th2) {
            try {
                lsrVar.m65586f(th2);
            } finally {
                g6xVarM78022a.m43767U(true);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m86497B(luk lukVar, juk jukVar, Runnable runnable) {
        try {
            lukVar.mo30646r(jukVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, lukVar, jukVar);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m86498C(luk lukVar, juk jukVar) throws DispatchException {
        try {
            return lukVar.mo30645P(jukVar);
        } catch (Throwable th) {
            throw new DispatchException(th, lukVar, jukVar);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final int m86499D(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 2;
        }
        if (iM38547C == 1) {
            return 3;
        }
        if (iM38547C == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final void m86500a(int i, fyf fyfVar, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(-1667421116);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            rgu rguVarM86516q = m86516q(xq00Var);
            j4m0 j4m0Var = new j4m0(leu.m58816b(xq00Var).f117230b.f224764g, 0, leu.m58816b(xq00Var).f117230b.f224764g, leu.m58816b(xq00Var).f117230b.f224762e);
            wgu wguVar = wgu.f251150c;
            String strM54977L = k0e1.m54977L(R.string.activity_button_custom_accessibility_action, xq00Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new vh60(12, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dyu.m37371c(new peu(new t40(strM54977L), (eh00) objM91750T), wguVar, fxh0Var, null, rguVarM86516q, j4m0Var, null, null, null, epg.f61645a, rkk.m75772x(-1723566235, new lh70(fyfVar, 3), xq00Var), xq00Var, (i2 << 3) & 896, 54, 920);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kf20(eh00Var, fxh0Var, fyfVar, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m86501b(Object obj, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(714845434);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                q9d1 q9d1Var = eh00Var != null ? (q9d1) eh00Var.invoke() : null;
                objM91750T = q9d1Var != null ? q9d1Var : null;
                xq00Var.m91793t0(objM91750T);
            }
            q9d1 q9d1Var2 = (q9d1) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = rpb.f201498Y;
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            boolean zM91770i = xq00Var.m91770i(q9d1Var2) | xq00Var.m91770i(obj);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                objM91750T3 = new uvb(4, q9d1Var2, obj);
                xq00Var.m91793t0(objM91750T3);
            }
            xq00Var2 = xq00Var;
            g0b1.m43261b(gh00Var, null, (gh00) objM91750T3, xq00Var2, 6, 2);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2314qu(obj, eh00Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m86502c(String str, eh00 eh00Var, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1174007362);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("group-listening-activity-button-test-tag", cxh0Var);
            boolean z = (i3 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new zz70(str, 7);
                xq00Var.m91793t0(objM91750T);
            }
            m86500a((i3 >> 3) & 910, fyfVar, eh00Var, xq00Var, zoz0.m96643a(fxh0VarM39673I, (gh00) objM91750T));
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60(str, (ai00) eh00Var, (Object) fxh0Var2, (Object) fyfVar, i, 12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m86503d(boolean z, String str, String str2, String str3, String str4, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(456402335);
        int i2 = i | (xq00Var.m91768h(z) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91766g(str2) ? 256 : 128) | (xq00Var.m91766g(str3) ? 2048 : 1024) | (xq00Var.m91766g(str4) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var) ? 131072 : 65536) | 1572864;
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            cxh0 cxh0Var = cxh0.f43038a;
            m86500a(((i2 >> 15) & 14) | 384, rkk.m75772x(497498490, new k80(str3, str4, str2, str, z), xq00Var), eh00Var, xq00Var, epv0.m39673I("listening-activity-button-test-tag", cxh0Var));
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2190nu(z, str, str2, str3, str4, eh00Var, fxh0Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x012c  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m86504e(int i, boolean z, fxh0 fxh0Var, float f, eh00 eh00Var, String str, boolean z2, ui5 ui5Var, xq00 xq00Var, int i2, int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        boolean z5;
        pgv0 pgv0VarM91796v;
        String str3;
        boolean z6;
        boolean zM91770i;
        int i8;
        xq00Var.m91775k0(1315353087);
        if ((i2 & 6) == 0) {
            i4 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91768h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= xq00Var.m91760d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= xq00Var.m91770i(eh00Var) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 == 0) {
            if ((196608 & i2) == 0) {
                str2 = str;
                i4 |= xq00Var.m91766g(str2) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (xq00Var.m91768h(false)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i4 |= i5;
            }
            i6 = i3 & 128;
            if (i6 != 0) {
                if ((12582912 & i2) == 0) {
                    z3 = z2;
                    if (xq00Var.m91768h(z3)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                }
                if ((100663296 & i2) == 0) {
                    if ((134217728 & i2) == 0) {
                        zM91770i = xq00Var.m91766g(ui5Var);
                    } else {
                        zM91770i = xq00Var.m91770i(ui5Var);
                    }
                    if (zM91770i) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                if ((38347923 & i4) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (xq00Var.m91752Y(i4 & 1, z4)) {
                    if (i9 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i6 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    xq00Var.m91771i0(1057332993);
                    y0v.m92603a(2, rkk.m75772x(1654573965, new gwf0(fxh0Var, eh00Var, i, z, f, false, z6, str3), xq00Var), xq00Var, 390, 2);
                    xq00Var.m91788r(false);
                    z5 = z6;
                    str2 = str3;
                } else {
                    xq00Var.m91757b0();
                    z5 = z3;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new fwf0(i, z, fxh0Var, f, eh00Var, str2, z5, ui5Var, i2, i3);
                }
            }
            i4 |= 12582912;
            z3 = z2;
            if ((100663296 & i2) == 0) {
                if ((134217728 & i2) == 0) {
                    zM91770i = xq00Var.m91766g(ui5Var);
                } else {
                    zM91770i = xq00Var.m91770i(ui5Var);
                }
                if (zM91770i) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((38347923 & i4) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z4)) {
                if (i9 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i6 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                xq00Var.m91771i0(1057332993);
                y0v.m92603a(2, rkk.m75772x(1654573965, new gwf0(fxh0Var, eh00Var, i, z, f, false, z6, str3), xq00Var), xq00Var, 390, 2);
                xq00Var.m91788r(false);
                z5 = z6;
                str2 = str3;
            } else {
                xq00Var.m91757b0();
                z5 = z3;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new fwf0(i, z, fxh0Var, f, eh00Var, str2, z5, ui5Var, i2, i3);
            }
        }
        i4 |= 196608;
        str2 = str;
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (xq00Var.m91768h(false)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        i6 = i3 & 128;
        if (i6 != 0) {
            if ((12582912 & i2) == 0) {
                z3 = z2;
                if (xq00Var.m91768h(z3)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            if ((100663296 & i2) == 0) {
                if ((134217728 & i2) == 0) {
                    zM91770i = xq00Var.m91766g(ui5Var);
                } else {
                    zM91770i = xq00Var.m91770i(ui5Var);
                }
                if (zM91770i) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i4 |= i8;
            }
            if ((38347923 & i4) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z4)) {
                if (i9 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i6 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                xq00Var.m91771i0(1057332993);
                y0v.m92603a(2, rkk.m75772x(1654573965, new gwf0(fxh0Var, eh00Var, i, z, f, false, z6, str3), xq00Var), xq00Var, 390, 2);
                xq00Var.m91788r(false);
                z5 = z6;
                str2 = str3;
            } else {
                xq00Var.m91757b0();
                z5 = z3;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new fwf0(i, z, fxh0Var, f, eh00Var, str2, z5, ui5Var, i2, i3);
            }
        }
        i4 |= 12582912;
        z3 = z2;
        if ((100663296 & i2) == 0) {
            if ((134217728 & i2) == 0) {
                zM91770i = xq00Var.m91766g(ui5Var);
            } else {
                zM91770i = xq00Var.m91770i(ui5Var);
            }
            if (zM91770i) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        }
        if ((38347923 & i4) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z4)) {
            if (i9 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i6 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            xq00Var.m91771i0(1057332993);
            y0v.m92603a(2, rkk.m75772x(1654573965, new gwf0(fxh0Var, eh00Var, i, z, f, false, z6, str3), xq00Var), xq00Var, 390, 2);
            xq00Var.m91788r(false);
            z5 = z6;
            str2 = str3;
        } else {
            xq00Var.m91757b0();
            z5 = z3;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fwf0(i, z, fxh0Var, f, eh00Var, str2, z5, ui5Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m86505f(wzp0 wzp0Var, gh00 gh00Var, fxh0 fxh0Var, xre xreVar, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        fyf fyfVarM75772x;
        String str = wzp0Var.f256655p;
        int i2 = wzp0Var.f256645f;
        xq00Var.m91775k0(898199700);
        int i3 = i | (xq00Var.m91770i(wzp0Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384 | (xq00Var.m91766g(xreVar) ? 2048 : 1024);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM29067J = bga.m29067J(i2, wzp0Var.f256649j, wzp0Var.f256650k);
            r1z0 r1z0Var = new r1z0(wzp0Var.f256641b, opo.m67574x(lau.f131415a), v64.DEFAULT, (174 & 8) != 0 ? 3 : 0, (174 & 16) != 0 ? 1 : 2, false, (174 & 64) != 0 ? false : zM29067J, false);
            q1z0 q1z0Var = new q1z0(wzp0Var.f256642c, i2 == 3 ? lv21.f137205b : opo.m67566p(new o1z0(i2)));
            boolean z = (!wzp0Var.f256654o || str == null || str.length() == 0) ? false : true;
            if (!z) {
                str = wzp0Var.f256644e;
            }
            String str2 = str;
            int i4 = z ? 2 : 1;
            String str3 = wzp0Var.f256658s;
            boolean z2 = (4 & 2) != 0 ? false : zM29067J;
            int i5 = (4 & 8) != 0 ? 1 : i4;
            if ((4 & 32) != 0) {
                str3 = "";
            }
            n1z0 n1z0Var = new n1z0(1, i5, 5, str2, str3, z2);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            kyu kyuVar = new kyu(1, null, 3, new j4m0(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d, 0, leu.m58816b(xq00Var).f117230b.f224761d), null, jyu.m54818a(frz0.m42535t(1, 3, xq00Var), leu.m58816b(xq00Var).f117230b.f224758a, 0.0f, 6), null, z ? 2 : 1, new ybs(leu.m58816b(xq00Var).f117235g.f159608f), 82);
            udu qduVar = zM29067J ? new qdu("Content restricted") : sdu.f208086a;
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == t6x0.f217647t) {
                objM91750T = new ho7(gh00Var, xreVar, 3);
                xq00Var.m91793t0(objM91750T);
            }
            peu peuVar = new peu(u40.f226523c, (eh00) objM91750T);
            if (wzp0Var.f256648i != 1 || wzp0Var.f256656q.length() <= 0) {
                xq00Var.m91771i0(624940600);
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            } else {
                xq00Var.m91771i0(623729833);
                fyfVarM75772x = rkk.m75772x(907984379, new yuo0(wzp0Var, 6), xq00Var);
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0Var;
            p711.m69222a(fxh0VarM61822f, kyuVar, qduVar, false, null, null, peuVar, null, null, rkk.m75772x(397073291, new ws60(n1z0Var, 1), xq00Var), null, rkk.m75772x(902701516, new yuo0(q1z0Var, 7), xq00Var), rkk.m75772x(494677901, new yzp0(wzp0Var, zM29067J, gh00Var, 0), xq00Var), fyfVarM75772x, null, rkk.m75772x(-729392944, new xs60(r1z0Var, 1), xq00Var), xq00Var, 805306432, 197040, 17848);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jsl0((Object) wzp0Var, (Object) gh00Var, fxh0Var2, (Object) xreVar, i, 13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Set m86506g(fye1 fye1Var) {
        Set setSingleton = Collections.singleton(new b4e1(fye1Var, 15));
        ArrayList arrayList = new ArrayList(i6f.m49804T(setSingleton, 10));
        Iterator it = setSingleton.iterator();
        while (it.hasNext()) {
            arrayList.add(((eh00) it.next()).invoke());
        }
        return Collections.singleton(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public static final Iterable m86507h(List list) {
        if (list instanceof pf40) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(((fk30) it.next()) instanceof wr30)) {
                    }
                }
            }
            return list;
        }
        ArrayList<fk30> arrayListM43737o0 = g6f.m43737o0(list);
        ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListM43737o0, 10));
        for (fk30 fk30Var : arrayListM43737o0) {
            wr30.Companion.getClass();
            arrayList.add(tr30.m81340c(fk30Var));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final pf40 m86508i(List list) {
        if (list != null && !list.isEmpty()) {
            pf40 pf40VarM69790o = pf40.m69790o(m86507h(list));
            wj50.m88279p(pf40VarM69790o);
            return pf40VarM69790o;
        }
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        wj50.m88279p(wsv0Var);
        return wsv0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final void m86509j(z6i0 z6i0Var, wqb wqbVar, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        wqbVar.mo25287p();
        ArrayList arrayList = z6i0Var.f279924h;
        if (arrayList.size() <= 1 || (brush instanceof pk31)) {
            m86510k(z6i0Var, wqbVar, brush, f, shadow, textDecoration, drawStyle);
        } else {
            if (!(brush instanceof ug01)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM67131b = 0.0f;
            for (int i = 0; i < size; i++) {
                nsm0 nsm0Var = (nsm0) arrayList.get(i);
                fM67131b += nsm0Var.f157840a.m67131b();
                fMax = Math.max(fMax, nsm0Var.f157840a.m67134e());
            }
            Shader shaderMo43315c = ((ug01) brush).mo43315c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM67131b)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo43315c.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ok4 ok4Var = ((nsm0) arrayList.get(i2)).f157840a;
                ok4Var.m67137h(wqbVar, new voa(shaderMo43315c), f, shadow, textDecoration, drawStyle);
                wqbVar.mo25278g(0.0f, ok4Var.m67131b());
                matrix.setTranslate(0.0f, -ok4Var.m67131b());
                shaderMo43315c.setLocalMatrix(matrix);
            }
        }
        wqbVar.mo25279h();
    }

    /* JADX INFO: renamed from: k */
    public static final void m86510k(z6i0 z6i0Var, wqb wqbVar, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        ArrayList arrayList = z6i0Var.f279924h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nsm0 nsm0Var = (nsm0) arrayList.get(i);
            nsm0Var.f157840a.m67137h(wqbVar, brush, f, shadow, textDecoration, drawStyle);
            wqbVar.mo25278g(0.0f, nsm0Var.f157840a.m67131b());
        }
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m86511l(fk30 fk30Var, fk30 fk30Var2) {
        if (fk30Var == fk30Var2) {
            return true;
        }
        if (fk30Var == null) {
            wr30.Companion.getClass();
            fk30Var = wr30.EMPTY;
        }
        if (fk30Var2 == null) {
            wr30.Companion.getClass();
            fk30Var2 = wr30.EMPTY;
        }
        return wj50.m88271j(fk30Var, fk30Var2);
    }

    /* JADX INFO: renamed from: m */
    public static Object m86512m(tn70 tn70Var, Object obj, th00 th00Var) {
        return th00Var.invoke(obj, tn70Var);
    }

    /* JADX INFO: renamed from: n */
    public static huk m86513n(tn70 tn70Var, iuk iukVar) {
        return cct.m32323v(tn70Var, iukVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Collection m86514o(oyw0 oyw0Var, exq exqVar, int i) {
        if ((i & 1) != 0) {
            exqVar = exq.f63827m;
        }
        bfe0.f26703a.getClass();
        return oyw0Var.mo27570d(exqVar, mxq.f148156c1);
    }

    /* JADX INFO: renamed from: p */
    public static rgu m86515p(xq00 xq00Var) {
        float f = leu.m58816b(xq00Var).f117230b.f224766i;
        float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
        return new rgu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117230b.f224762e, leu.m58816b(xq00Var).f117232d.f137888d, leu.m58816b(xq00Var).f117235g.f159606d, leu.m58816b(xq00Var).f117230b.f224762e, if71.m50418a(leu.m58818d(xq00Var).f64969e, 0L, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, null, 0, 16744447));
    }

    /* JADX INFO: renamed from: q */
    public static rgu m86516q(xq00 xq00Var) {
        float f = leu.m58816b(xq00Var).f117230b.f224765h;
        float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
        return new rgu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117230b.f224762e, leu.m58816b(xq00Var).f117232d.f137887c, leu.m58816b(xq00Var).f117235g.f159605c, leu.m58816b(xq00Var).f117230b.f224761d, if71.m50418a(leu.m58818d(xq00Var).f64972h, 0L, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, null, 0, 16744447));
    }

    /* JADX INFO: renamed from: r */
    public static rgu m86517r(xq00 xq00Var) {
        float f = leu.m58816b(xq00Var).f117230b.f224763f;
        float f2 = leu.m58816b(xq00Var).f117230b.f224759b;
        return new rgu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224761d, if71.m50418a(leu.m58818d(xq00Var).f64975k, 0L, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, null, 0, 16744447));
    }

    /* JADX INFO: renamed from: s */
    public static final t050 m86518s(z8k z8kVar, qjk0 qjk0Var, qjk0 qjk0Var2, qjk0 qjk0Var3, nik0 nik0Var) {
        return ((b9k) z8kVar).m28489g("UserTrackerDaemon", new bjk0(qjk0Var, qjk0Var2, qjk0Var3, nik0Var, 18));
    }

    /* JADX INFO: renamed from: t */
    public static final cjc0 m86519t(dut dutVar, gh00 gh00Var) {
        return new cjc0(dutVar, gh00Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    /* JADX INFO: renamed from: u */
    public static final ArrayList m86520u(by50 by50Var) {
        j6y j6yVar;
        rx50 rx50Var = by50Var.f32079e;
        if (rx50Var != null) {
            String str = rx50Var.f203498b;
            String str2 = rx50Var.f203497a;
            if (str != null) {
                j6yVar = new j6y(str, str2, str2, null);
            } else {
                j6yVar = null;
            }
        } else {
            j6yVar = null;
        }
        ArrayList<tx50> arrayList = by50Var.f32077c;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (tx50 tx50Var : arrayList) {
            arrayList2.add(new j6y(tx50Var.f224568d, tx50Var.f224567c, tx50Var.f224566b, null));
        }
        return g6f.m43700N0(g6f.m43728j1(arrayList2), h6f.m46716M(j6yVar));
    }

    /* JADX INFO: renamed from: v */
    public static juk m86521v(tn70 tn70Var, iuk iukVar) {
        return cct.m32326y(tn70Var, iukVar);
    }

    /* JADX INFO: renamed from: w */
    public static juk m86522w(tn70 tn70Var, juk jukVar) {
        return opo.m67570t(tn70Var, jukVar);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m86523x(Collection collection, List list) {
        if (collection == list) {
            return true;
        }
        if (collection == null || collection.isEmpty()) {
            return list == null || list.isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m86524y(wj30 wj30Var, wj30 wj30Var2) {
        if (wj30Var == wj30Var2) {
            return true;
        }
        if (wj30Var == null || wj30Var.keySet().isEmpty()) {
            return wj30Var2 == null || wj30Var2.keySet().isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static final pf40 m86525z(Parcel parcel) {
        ArrayList arrayList = new ArrayList(parcel.readInt());
        parcel.readTypedList(arrayList, wr30.CREATOR);
        return pf40.m69791p(arrayList);
    }
}
