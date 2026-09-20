package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Range;
import android.view.Surface;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class dul {

    /* JADX INFO: renamed from: b */
    public static Context f53082b;

    /* JADX INFO: renamed from: c */
    public static Bundle f53083c;

    /* JADX INFO: renamed from: e */
    public static sd40 f53085e;

    /* JADX INFO: renamed from: a */
    public static final Object f53081a = new Object();

    /* JADX INFO: renamed from: d */
    public static final lpa f53084d = new lpa();

    /* JADX INFO: renamed from: A */
    public static final lpa m36991A(lpa lpaVar) {
        return lpaVar == f53084d ? new lpa() : lpaVar;
    }

    /* JADX INFO: renamed from: B */
    public static final int m36992B(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: C */
    public static final long m36993C(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* JADX INFO: renamed from: D */
    public static final short m36994D(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: E */
    public static final fyj m36995E(ContextTrack contextTrack) {
        if (contextTrack != null) {
            if (e72.m37996b0(contextTrack)) {
                return byj.f32249a;
            }
            if (e72.m37986T(contextTrack) && e72.m37977K(contextTrack)) {
                return txj.f224714a;
            }
            if (e72.m37978L(contextTrack)) {
                return uxj.f234945a;
            }
            Set set = dd41.f47702f;
            if (r46.m74726U(contextTrack.uri()).f47709c == gn80.TRACK) {
                return zxj.f287335a;
            }
            if (e72.m37985S(contextTrack)) {
                return yxj.f277260a;
            }
        }
        return ayj.f21255a;
    }

    /* JADX INFO: renamed from: F */
    public static final String m36996F(byte b) {
        char[] cArr = exb.f63733c;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* JADX INFO: renamed from: G */
    public static final String m36997G(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = exb.f63733c;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        bga.m29091m(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m36998a(Uri uri, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        mqm0 a8fVar;
        Bitmap bitmapM92067N;
        i450 i450Var = r101.f194650R0;
        xq00Var.m91775k0(-752837631);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(uri) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Drawable drawable = ((Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b)).getDrawable(R.drawable.uiusecases_cover_art_placeholder);
            if (drawable == null || (bitmapM92067N = xtm0.m92067N(drawable, 0, 0, 7)) == null) {
                na6.m63971s("Failed to get placeholder painter");
                a8fVar = new a8f(n6f.f150870j);
            } else {
                a8fVar = new wh9(new q94(bitmapM92067N));
            }
            qgj qgjVar = qgj.f188480a;
            if (uri != null) {
                xq00Var.m91771i0(533810479);
                l0y0.m57821c(uri, qgjVar, cv9.m33990h(1.0f, fxh0Var, false), null, null, null, i450Var, null, null, new cxu(a8fVar, a8fVar), false, false, xq00Var, (i2 & 14) | 1073741872, 0, 3512);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
                fxh0Var2 = fxh0Var;
            } else {
                xq00Var2 = xq00Var;
                xq00Var2.m91771i0(534095927);
                fxh0Var2 = fxh0Var;
                l0y0.m57824f(a8fVar, qgjVar, cv9.m33990h(1.0f, fxh0Var2, false), null, null, null, i450Var, null, null, xq00Var2, 56, 440);
                xq00Var2.m91788r(false);
            }
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kw2(uri, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m36999b(Object obj, fxh0 fxh0Var, muj mujVar, xq00 xq00Var, int i, int i2) {
        f940 f940Var;
        if ((i2 & 64) != 0) {
            mujVar = r101.f194645M0;
        }
        muj mujVar2 = mujVar;
        Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
        AtomicReference atomicReference = wh21.f251236a;
        Object obj2 = atomicReference.get();
        f940 f940VarM90949a = null;
        f940 f940Var2 = obj2 instanceof f940 ? (f940) obj2 : null;
        if (f940Var2 == null) {
            loop0: while (true) {
                Object obj3 = atomicReference.get();
                if (obj3 instanceof f940) {
                    f940Var = f940VarM90949a;
                    f940VarM90949a = (f940) obj3;
                } else {
                    if (f940VarM90949a == null) {
                        context.getApplicationContext();
                        skp skpVar = yh21.f272718a;
                        f940VarM90949a = xh21.m90949a(context);
                    }
                    f940Var = f940VarM90949a;
                }
                do {
                    if (atomicReference.compareAndSet(obj3, f940VarM90949a)) {
                        break loop0;
                    }
                } while (atomicReference.get() == obj3);
                f940VarM90949a = f940Var;
            }
        } else {
            f940VarM90949a = f940Var2;
        }
        int i3 = i << 3;
        q0f1.m71830d(obj, null, f940VarM90949a, fxh0Var, mujVar2, xq00Var, (i & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), (i >> 27) & 14, 0);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x019b  */
    /* JADX WARN: Code duplicated, block: B:52:0x019d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x020b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0240  */
    /* JADX WARN: Code duplicated, block: B:72:0x0245  */
    /* JADX WARN: Code duplicated, block: B:75:0x024f  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: c */
    public static final void m37000c(ssa ssaVar, ssa ssaVar2, int i, int i2, fxh0 fxh0Var, th00 th00Var, xq00 xq00Var, int i3, int i4) {
        th00 th00Var2;
        int i5;
        boolean z;
        xq00 xq00Var2;
        pgv0 pgv0VarM91796v;
        th00 th00Var3;
        aaf aafVarM87496a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        eh00 eh00Var;
        boolean z2;
        Object objM91750T;
        int i6;
        boolean z3;
        Object objM91750T2;
        ?? r0;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1903026222);
        int i7 = i3 | (xq00Var.m91766g(ssaVar) ? 4 : 2) | (xq00Var.m91766g(ssaVar2) ? 32 : 16) | (xq00Var.m91762e(i) ? 256 : 128) | (xq00Var.m91762e(i2) ? 2048 : 1024) | (xq00Var.m91770i(fxh0Var) ? 16384 : 8192);
        int i8 = i4 & 32;
        if (i8 == 0) {
            if ((i3 & 196608) == 0) {
                th00Var2 = th00Var;
                i7 |= xq00Var.m91770i(th00Var2) ? 131072 : 65536;
            }
            i5 = i7;
            if ((i5 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i5 & 1, z)) {
                if (i8 != 0) {
                    th00Var3 = ahg.f15690a;
                } else {
                    th00Var3 = th00Var2;
                }
                WeakHashMap weakHashMap = cxd1.f42984x;
                fxh0 fxh0VarM96830A = zsf1.m96830A(AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0Var), 24, 0.0f, 2);
                aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 0);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A);
                soh.f211194A.getClass();
                eh00Var = roh.f201257b;
                if (xq00Var.f264811a != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                th00Var3.invoke(xq00Var, Integer.valueOf((i5 >> 15) & 14));
                String strM54977L = k0e1.m54977L(i2, xq00Var);
                if71 if71Var = leu.m58818d(xq00Var).f64968d;
                float f = 32;
                float f2 = 16;
                cxh0 cxh0Var = cxh0.f43038a;
                th00 th00Var4 = th00Var3;
                ahf1.m25932d(strM54977L, zsf1.m96832C(cxh0Var, f, f2, f, 0.0f, 8), if71Var, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
                float f3 = 8;
                ahf1.m25932d(k0e1.m54977L(i, xq00Var), zsf1.m96832C(cxh0Var, 0.0f, f3, 0.0f, 0.0f, 13), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
                tgu tguVar = new tgu(4);
                fxh0 fxh0VarM39673I = epv0.m39673I("primary_button", zsf1.m96832C(cxh0Var, 0.0f, f2, 0.0f, 0.0f, 13));
                if ((i5 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objM91750T = xq00Var.m91750T();
                if (!z2 || objM91750T == obj) {
                    i6 = 0;
                    objM91750T = new gox(ssaVar, i6);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    i6 = 0;
                }
                u40 u40Var = u40.f226523c;
                dyu.m37371c(new peu(u40Var, (eh00) objM91750T), tguVar, fxh0VarM39673I, null, null, null, null, null, null, null, rkk.m75772x(1725120519, new hox(ssaVar, i6), xq00Var), xq00Var, 0, 48, 2040);
                wgu wguVar = wgu.f251150c;
                fxh0 fxh0VarM39673I2 = epv0.m39673I("secondary_button", zsf1.m96832C(cxh0Var, 0.0f, f3, 0.0f, 0.0f, 13));
                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM91750T2 = xq00Var.m91750T();
                if (!z3 || objM91750T2 == obj) {
                    r0 = 1;
                    objM91750T2 = new gox(ssaVar2, true ? 1 : 0);
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    r0 = 1;
                }
                dyu.m37371c(new peu(u40Var, (eh00) objM91750T2), wguVar, fxh0VarM39673I2, null, null, null, null, null, null, null, rkk.m75772x(-932093058, new hox(ssaVar2, r0), xq00Var), xq00Var, 0, 48, 2040);
                xq00 xq00Var3 = xq00Var;
                xq00Var3.m91788r(r0);
                th00Var2 = th00Var4;
                xq00Var2 = xq00Var3;
            } else {
                xq00 xq00Var4 = xq00Var;
                xq00Var4.m91757b0();
                xq00Var2 = xq00Var4;
            }
            pgv0VarM91796v = xq00Var2.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new iox(ssaVar, ssaVar2, i, i2, fxh0Var, th00Var2, i3, i4);
            }
        }
        i7 |= 196608;
        th00Var2 = th00Var;
        i5 = i7;
        if ((i5 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i5 & 1, z)) {
            if (i8 != 0) {
                th00Var3 = ahg.f15690a;
            } else {
                th00Var3 = th00Var2;
            }
            WeakHashMap weakHashMap2 = cxd1.f42984x;
            fxh0 fxh0VarM96830A2 = zsf1.m96830A(AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0Var), 24, 0.0f, 2);
            aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 0);
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A2);
            soh.f211194A.getClass();
            eh00Var = roh.f201257b;
            if (xq00Var.f264811a != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            th00Var3.invoke(xq00Var, Integer.valueOf((i5 >> 15) & 14));
            String strM54977L2 = k0e1.m54977L(i2, xq00Var);
            if71 if71Var2 = leu.m58818d(xq00Var).f64968d;
            float f4 = 32;
            float f5 = 16;
            cxh0 cxh0Var2 = cxh0.f43038a;
            th00 th00Var5 = th00Var3;
            ahf1.m25932d(strM54977L2, zsf1.m96832C(cxh0Var2, f4, f5, f4, 0.0f, 8), if71Var2, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            float f6 = 8;
            ahf1.m25932d(k0e1.m54977L(i, xq00Var), zsf1.m96832C(cxh0Var2, 0.0f, f6, 0.0f, 0.0f, 13), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            tgu tguVar2 = new tgu(4);
            fxh0 fxh0VarM39673I3 = epv0.m39673I("primary_button", zsf1.m96832C(cxh0Var2, 0.0f, f5, 0.0f, 0.0f, 13));
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objM91750T = xq00Var.m91750T();
            if (z2) {
                i6 = 0;
                objM91750T = new gox(ssaVar, i6);
                xq00Var.m91793t0(objM91750T);
            } else {
                i6 = 0;
                objM91750T = new gox(ssaVar, i6);
                xq00Var.m91793t0(objM91750T);
            }
            u40 u40Var2 = u40.f226523c;
            dyu.m37371c(new peu(u40Var2, (eh00) objM91750T), tguVar2, fxh0VarM39673I3, null, null, null, null, null, null, null, rkk.m75772x(1725120519, new hox(ssaVar, i6), xq00Var), xq00Var, 0, 48, 2040);
            wgu wguVar2 = wgu.f251150c;
            fxh0 fxh0VarM39673I4 = epv0.m39673I("secondary_button", zsf1.m96832C(cxh0Var2, 0.0f, f6, 0.0f, 0.0f, 13));
            if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objM91750T2 = xq00Var.m91750T();
            if (z3) {
                r0 = 1;
                objM91750T2 = new gox(ssaVar2, true ? 1 : 0);
                xq00Var.m91793t0(objM91750T2);
            } else {
                r0 = 1;
                objM91750T2 = new gox(ssaVar2, true ? 1 : 0);
                xq00Var.m91793t0(objM91750T2);
            }
            dyu.m37371c(new peu(u40Var2, (eh00) objM91750T2), wguVar2, fxh0VarM39673I4, null, null, null, null, null, null, null, rkk.m75772x(-932093058, new hox(ssaVar2, r0), xq00Var), xq00Var, 0, 48, 2040);
            xq00 xq00Var5 = xq00Var;
            xq00Var5.m91788r(r0);
            th00Var2 = th00Var5;
            xq00Var2 = xq00Var5;
        } else {
            xq00 xq00Var6 = xq00Var;
            xq00Var6.m91757b0();
            xq00Var2 = xq00Var6;
        }
        pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iox(ssaVar, ssaVar2, i, i2, fxh0Var, th00Var2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m37001d(int i, String str, String str2, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-1742943289);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91766g(str2) ? 32 : 16) | 384 | (xq00Var.m91770i(gh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            y0v.m92603a(2, rkk.m75772x(-1078527045, new jhu(str, ((Number) xq00Var.m91774k(k681.f119692a)).floatValue(), str2, gh00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e8z0(str, str2, fxh0Var2, gh00Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m37002e(e8y0 e8y0Var, Object obj) {
        String strM37009l;
        if (obj == null || e8y0Var.mo38133b(obj)) {
            return;
        }
        if (obj instanceof ab31) {
            ab31 ab31Var = (ab31) obj;
            if (ab31Var.mo25318k() == zhi0.f282936c || ab31Var.mo25318k() == tjr0.f220989Q0 || ab31Var.mo25318k() == kxq0.f127575g) {
                strM37009l = "MutableState containing " + ab31Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strM37009l = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strM37009l = m37009l(obj);
        }
        throw new IllegalArgumentException(strM37009l);
    }

    /* JADX INFO: renamed from: f */
    public static void m37003f(CaptureRequest.Builder builder, jvl0 jvl0Var) {
        gd8 gd8VarM25087c = a99.m25084j(jvl0Var).m25087c();
        for (sy7 sy7Var : gd8VarM25087c.mo39827b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) sy7Var.f215173c;
            try {
                builder.set(key, gd8VarM25087c.mo39828c(sy7Var));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                vie1.m85626h("Camera2CaptureRequestBuilder");
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m37004g(CaptureRequest.Builder builder, int i, ku7 ku7Var) {
        Map mapUnmodifiableMap;
        if (i == 3 && ku7Var.f126475a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                ku7Var.getClass();
            } else if (ku7Var.f126476b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m37005h(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static CaptureRequest m37006i(yvb yvbVar, CameraDevice cameraDevice, HashMap map, boolean z, ku7 ku7Var) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        ArrayList arrayList = yvbVar.f276632a;
        jvl0 jvl0Var = yvbVar.f276633b;
        int i = yvbVar.f276634c;
        TreeMap treeMap = jvl0Var.f116367a;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((mjq) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList2.add(surface);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ceb cebVar = yvbVar.f276638g;
        if (i == 5 && cebVar != null && (cebVar.mo31882d() instanceof TotalCaptureResult)) {
            vie1.m85624f("Camera2CaptureRequestBuilder");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) cebVar.mo31882d());
        } else {
            vie1.m85624f("Camera2CaptureRequestBuilder");
            if (i == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
            }
        }
        m37004g(builderCreateCaptureRequest, i, ku7Var);
        sy7 sy7Var = yvb.f276631j;
        Object objMo39828c = j28.f107949f;
        try {
            objMo39828c = jvl0Var.mo39828c(sy7Var);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo39828c;
        Objects.requireNonNull(range);
        Object objMo39828c2 = j28.f107949f;
        if (!range.equals(objMo39828c2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objMo39828c2 = jvl0Var.mo39828c(yvb.f276631j);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objMo39828c2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (yvbVar.m94682a() == 1 || yvbVar.m94683b() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (yvbVar.m94682a() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (yvbVar.m94683b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        sy7 sy7Var2 = yvb.f276629h;
        if (treeMap.containsKey(sy7Var2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) jvl0Var.mo39828c(sy7Var2));
        }
        sy7 sy7Var3 = yvb.f276630i;
        if (treeMap.containsKey(sy7Var3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) jvl0Var.mo39828c(sy7Var3)).byteValue()));
        }
        m37003f(builderCreateCaptureRequest, jvl0Var);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(yvbVar.f276637f);
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: j */
    public static CaptureRequest m37007j(yvb yvbVar, CameraDevice cameraDevice, ku7 ku7Var) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        int i = yvbVar.f276634c;
        vie1.m85624f("Camera2CaptureRequestBuilder");
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        m37004g(builderCreateCaptureRequest, i, ku7Var);
        m37003f(builderCreateCaptureRequest, yvbVar.f276633b);
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: k */
    public static final void m37008k(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM77254m = s571.m77254m(j, "size=", " offset=");
            sbM77254m.append(j2);
            sbM77254m.append(" byteCount=");
            sbM77254m.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM77254m.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public static final String m37009l(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: m */
    public static Bundle m37010m(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (f53081a) {
            if (applicationContext != f53082b) {
                why0.m88178a("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                f53083c = bundle2;
                f53082b = applicationContext;
                Trace.endSection();
            }
            bundle = f53083c;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: n */
    public static int m37011n(int i) {
        return i >>> 3;
    }

    /* JADX INFO: renamed from: o */
    public static int m37012o(int i) {
        return i & 7;
    }

    /* JADX INFO: renamed from: p */
    public static final yv20 m37013p(xq00 xq00Var) {
        txu txuVar = leu.m58816b(xq00Var).f117230b;
        f1v f1vVarM58818d = leu.m58818d(xq00Var);
        Object obj = gmu.f81477a.f146343b;
        Object objM91750T = xq00Var.m91750T();
        ia7 ia7Var = t6x0.f217647t;
        if (objM91750T == ia7Var) {
            objM91750T = ks20.f125806Y;
            xq00Var.m91793t0(objM91750T);
        }
        ml80 ml80Var = new ml80((gh00) objM91750T);
        float f = txuVar.f224767j;
        float f2 = txuVar.f224762e;
        float f3 = txuVar.f224763f;
        j4m0 j4m0VarM96848h = zsf1.m96848h(f3, 0.0f, 2);
        j4m0 j4m0Var = new j4m0(f3, f2, f3, f3);
        j4m0 j4m0Var2 = new j4m0(f3, f2, f3, txuVar.f224765h);
        Object objM91750T2 = xq00Var.m91750T();
        if (objM91750T2 == ia7Var) {
            objM91750T2 = ks20.f125808Z;
            xq00Var.m91793t0(objM91750T2);
        }
        return new yv20(ml80Var, f, j4m0VarM96848h, j4m0Var, j4m0Var2, new ml80((gh00) objM91750T2), new wt20(50.0f, f1vVarM58818d.f64970f.f101704a.f63411b, f1vVarM58818d.f64967c.f101704a.f63411b));
    }

    /* JADX INFO: renamed from: q */
    public static final hxt m37014q(cut cutVar, ConstraintLayout constraintLayout) {
        up60 up60Var = hxt.f96286w;
        return ia7.m50020m(constraintLayout.getContext(), constraintLayout, cutVar, w2a1.f247311a, null, ContentType.LONG_FORM_ON_DEMAND);
    }

    /* JADX INFO: renamed from: r */
    public static final t050 m37015r(z8k z8kVar, ikk0 ikk0Var, ikk0 ikk0Var2) {
        return ((b9k) z8kVar).m28489g("OopsRemoteConfigDaemon", new rik0(21, ikk0Var, ikk0Var2));
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m37016s() {
        return ki5.m56473e().f122818a.mo42762c();
    }

    /* JADX INFO: renamed from: t */
    public static int m37017t(int i, int i2) {
        return (i << 3) | i2;
    }

    /* JADX INFO: renamed from: u */
    public static final Object m37018u(Object[] objArr, eh00 eh00Var, xq00 xq00Var, int i) {
        return m37019v(Arrays.copyOf(objArr, objArr.length), grl0.f83791b, null, eh00Var, xq00Var, ((i << 6) & 7168) | 384, 0);
    }

    /* JADX INFO: renamed from: v */
    public static final Object m37019v(Object[] objArr, s9y0 s9y0Var, String str, eh00 eh00Var, xq00 xq00Var, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object objMo38135d;
        if ((i2 & 2) != 0) {
            s9y0Var = grl0.f83791b;
        }
        final s9y0 s9y0Var2 = s9y0Var;
        if ((i2 & 4) != 0) {
            str = null;
        }
        long j = xq00Var.f264809T;
        if (str == null || str.length() == 0) {
            zn91.m96584x(36);
            str = Long.toString(j, 36);
        }
        final String str2 = str;
        final e8y0 e8y0Var = (e8y0) xq00Var.m91774k(g8y0.f77630a);
        Object objM91750T = xq00Var.m91750T();
        Object obj2 = t6x0.f217647t;
        if (objM91750T == obj2) {
            Object objMo55773a = (e8y0Var == null || (objMo38135d = e8y0Var.mo38135d(str2)) == null) ? null : s9y0Var2.mo55773a(objMo38135d);
            if (objMo55773a == null) {
                objMo55773a = eh00Var.invoke();
            }
            objArr2 = objArr;
            Object x7y0Var = new x7y0(s9y0Var2, e8y0Var, str2, objMo55773a, objArr2);
            xq00Var.m91793t0(x7y0Var);
            objM91750T = x7y0Var;
        } else {
            objArr2 = objArr;
        }
        final x7y0 x7y0Var2 = (x7y0) objM91750T;
        Object objInvoke = Arrays.equals(objArr2, x7y0Var2.f259018e) ? x7y0Var2.f259017d : null;
        if (objInvoke == null) {
            objInvoke = eh00Var.invoke();
        }
        boolean zM91770i = xq00Var.m91770i(x7y0Var2) | ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var.m91770i(s9y0Var2)) || (i & 48) == 32) | xq00Var.m91770i(e8y0Var) | xq00Var.m91766g(str2) | xq00Var.m91770i(objInvoke) | xq00Var.m91770i(objArr2);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91770i || objM91750T2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object obj3 = new eh00() { // from class: p.g9w0
                @Override // p204p.eh00
                public final Object invoke() {
                    boolean z;
                    x7y0 x7y0Var3 = x7y0Var2;
                    e8y0 e8y0Var2 = x7y0Var3.f259015b;
                    e8y0 e8y0Var3 = e8y0Var;
                    boolean z2 = true;
                    if (e8y0Var2 != e8y0Var3) {
                        x7y0Var3.f259015b = e8y0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str3 = x7y0Var3.f259016c;
                    String str4 = str2;
                    if (wj50.m88271j(str3, str4)) {
                        z2 = z;
                    } else {
                        x7y0Var3.f259016c = str4;
                    }
                    x7y0Var3.f259014a = s9y0Var2;
                    x7y0Var3.f259017d = obj;
                    x7y0Var3.f259018e = objArr3;
                    d8y0 d8y0Var = x7y0Var3.f259019f;
                    if (d8y0Var != null && z2) {
                        ((ezw0) d8y0Var).m40407D();
                        x7y0Var3.f259019f = null;
                        x7y0Var3.m90176a();
                    }
                    return w2a1.f247311a;
                }
            };
            xq00Var.m91793t0(obj3);
            objM91750T2 = obj3;
        } else {
            obj = objInvoke;
        }
        hz40.m49245q((eh00) objM91750T2, xq00Var);
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public static final Object m37020w(Object[] objArr, s9y0 s9y0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        return m37019v(Arrays.copyOf(objArr, objArr.length), s9y0Var, null, eh00Var, xq00Var, (i & ContentType.LONG_FORM_ON_DEMAND) | 384 | ((i << 3) & 7168), 0);
    }

    /* JADX INFO: renamed from: x */
    public static final kqi0 m37021x(Object[] objArr, t9y0 t9y0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        return (kqi0) m37019v(Arrays.copyOf(objArr, objArr.length), new t9y0(new rv70(t9y0Var, 17), new nk4(t9y0Var, 13)), null, eh00Var, xq00Var, ((i << 3) & 7168) | 384, 0);
    }

    /* JADX INFO: renamed from: y */
    public static final int m37022y(int i, iva ivaVar) {
        return i == -1234567890 ? ivaVar.mo51747d() : i;
    }

    /* JADX INFO: renamed from: z */
    public static final int m37023z(byte[] bArr) {
        return bArr.length;
    }
}
