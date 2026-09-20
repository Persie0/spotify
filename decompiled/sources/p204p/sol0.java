package p204p;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class sol0 implements i5b1 {

    /* JADX INFO: renamed from: X */
    public Object f211209X;

    /* JADX INFO: renamed from: Y */
    public Object f211210Y;

    /* JADX INFO: renamed from: Z */
    public Object f211211Z;

    /* JADX INFO: renamed from: a */
    public int f211212a;

    /* JADX INFO: renamed from: b */
    public int[] f211213b;

    /* JADX INFO: renamed from: c */
    public final Object f211214c;

    /* JADX INFO: renamed from: d */
    public final Object f211215d;

    /* JADX INFO: renamed from: e */
    public Object f211216e;

    /* JADX INFO: renamed from: f */
    public Object f211217f;

    /* JADX INFO: renamed from: g */
    public Object f211218g;

    /* JADX INFO: renamed from: h */
    public Object f211219h;

    /* JADX INFO: renamed from: i */
    public Object f211220i;

    /* JADX INFO: renamed from: t */
    public Object f211221t;

    public sol0() {
        this.f211214c = new AtomicBoolean(false);
        this.f211215d = new HashMap();
        this.f211217f = EGL14.EGL_NO_DISPLAY;
        this.f211218g = EGL14.EGL_NO_CONTEXT;
        this.f211213b = fl00.f70653a;
        this.f211220i = EGL14.EGL_NO_SURFACE;
        this.f211209X = Collections.EMPTY_MAP;
        this.f211210Y = null;
        this.f211211Z = cl00.f39139a;
        this.f211212a = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m78655a(cns cnsVar, nh61 nh61Var) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f211217f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f211217f, iArr, 0, iArr, 1)) {
            this.f211217f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (nh61Var != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            nh61Var.f153885c = str;
        }
        int i = cnsVar.m33466a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f211217f, new int[]{12324, i, 12323, i, 12322, i, 12321, cnsVar.m33466a() ? 2 : 8, 12325, 0, 12326, 0, 12352, cnsVar.m33466a() ? 64 : 4, 12610, cnsVar.m33466a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f211217f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, cnsVar.m33466a() ? 3 : 2, 12344}, 0);
        fl00.m41968a("eglCreateContext");
        this.f211219h = eGLConfig;
        this.f211218g = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.f211217f, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    /* JADX INFO: renamed from: c */
    public p18 m78656c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f211217f;
            EGLConfig eGLConfig = (EGLConfig) this.f211219h;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceM41975h = fl00.m41975h(eGLDisplay, eGLConfig, surface, this.f211213b);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f211217f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM41975h, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM41975h, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new p18(eGLSurfaceM41975h, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            e.getMessage();
            vie1.m85618G("OpenGlRenderer");
            return null;
        }
    }

    @Override // p204p.i5b1
    /* JADX INFO: renamed from: e */
    public int mo49774e() {
        return this.f211212a;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        int[] iArr = h5b1.f87799a;
        int i = 0;
        long j2 = (j / 1000000) - ((long) 0);
        long jMo49774e = mo49774e();
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 > jMo49774e ? jMo49774e : j2;
        if (j3 < 0) {
            return w05Var3;
        }
        m78661o(w05Var, w05Var2, w05Var3);
        w05 w05Var4 = (w05) this.f211219h;
        wj50.m88279p(w05Var4);
        if (((egb1) this.f211211Z) != h5b1.f87801c) {
            int i2 = (int) j3;
            float fM78659i = m78659i(m78658h(i2), i2, false);
            float[] fArr = (float[]) this.f211210Y;
            ji5[][] ji5VarArr = (ji5[][]) ((egb1) this.f211211Z).f59299b;
            float f = ji5VarArr[0][0].f112643a;
            float f2 = ji5VarArr[ji5VarArr.length - 1][0].f112644b;
            if (fM78659i < f) {
                fM78659i = f;
            }
            if (fM78659i <= f2) {
                f2 = fM78659i;
            }
            int length = fArr.length;
            boolean z = false;
            for (ji5[] ji5VarArr2 : ji5VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    ji5 ji5Var = ji5VarArr2[i4];
                    if (f2 <= ji5Var.f112644b) {
                        if (ji5Var.f112658p) {
                            fArr[i3] = ji5Var.f112659q;
                            fArr[i3 + 1] = ji5Var.f112660r;
                        } else {
                            ji5Var.m53445c(f2);
                            fArr[i3] = ji5Var.m53443a();
                            fArr[i3 + 1] = ji5Var.m53444b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                w05Var4.mo76851e(fArr[i], i);
                i++;
            }
        } else {
            w05 w05VarMo35624m = mo35624m((j3 - 1) * 1000000, w05Var, w05Var2, w05Var3);
            w05 w05VarMo35624m2 = mo35624m(j3 * 1000000, w05Var, w05Var2, w05Var3);
            int iMo76848b = w05VarMo35624m.mo76848b();
            while (i < iMo76848b) {
                w05Var4.mo76851e((w05VarMo35624m.mo76847a(i) - w05VarMo35624m2.mo76847a(i)) * 1000.0f, i);
                i++;
            }
        }
        return w05Var4;
    }

    /* JADX INFO: renamed from: g */
    public void m78657g() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f211217f;
        EGLConfig eGLConfig = (EGLConfig) this.f211219h;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = fl00.f70653a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        fl00.m41968a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f211220i = eGLSurfaceEglCreatePbufferSurface;
    }

    /* JADX INFO: renamed from: h */
    public int m78658h(int i) {
        int i2;
        soi0 soi0Var = (soi0) this.f211214c;
        int i3 = soi0Var.f211200b;
        soi0Var.getClass();
        if (i3 <= 0 || i3 > soi0Var.f211200b) {
            epv0.m39675K("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = soi0Var.f211199a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX INFO: renamed from: i */
    public float m78659i(int i, int i2, boolean z) {
        bqs bqsVar;
        float f;
        soi0 soi0Var = (soi0) this.f211214c;
        if (i >= soi0Var.f211200b - 1) {
            f = i2;
        } else {
            int iM78650c = soi0Var.m78650c(i);
            int iM78650c2 = soi0Var.m78650c(i + 1);
            if (i2 == iM78650c) {
                f = iM78650c;
            } else {
                int i3 = iM78650c2 - iM78650c;
                l5b1 l5b1Var = (l5b1) ((toi0) this.f211215d).m87103b(iM78650c);
                if (l5b1Var == null || (bqsVar = l5b1Var.f129871b) == null) {
                    bqsVar = (bqs) this.f211216e;
                }
                float f2 = i3;
                float fMo30276a = bqsVar.mo30276a((i2 - iM78650c) / f2);
                if (z) {
                    return fMo30276a;
                }
                f = (f2 * fMo30276a) + iM78650c;
            }
        }
        return f / 1000;
    }

    /* JADX INFO: renamed from: j */
    public qqm0 m78660j(cns cnsVar) {
        fl00.m41971d((AtomicBoolean) this.f211214c, false);
        try {
            m78655a(cnsVar, null);
            m78657g();
            m78662p((EGLSurface) this.f211220i);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f211217f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new qqm0(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            vie1.m85618G("OpenGlRenderer");
            return new qqm0("", "");
        } finally {
            m78664r();
        }
    }

    @Override // p204p.i5b1
    /* JADX INFO: renamed from: k */
    public int mo49775k() {
        return 0;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        w05 w05Var4;
        w05 w05Var5;
        float f;
        w05 w05Var6 = w05Var;
        w05 w05Var7 = w05Var2;
        soi0 soi0Var = (soi0) this.f211214c;
        int[] iArr = h5b1.f87799a;
        int i = 0;
        long j2 = (j / 1000000) - ((long) 0);
        long jMo49774e = mo49774e();
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= jMo49774e) {
            jMo49774e = j2;
        }
        int i2 = (int) jMo49774e;
        toi0 toi0Var = (toi0) this.f211215d;
        l5b1 l5b1Var = (l5b1) toi0Var.m87103b(i2);
        if (l5b1Var != null) {
            return l5b1Var.f129870a;
        }
        if (i2 >= this.f211212a) {
            return w05Var7;
        }
        if (i2 <= 0) {
            return w05Var6;
        }
        m78661o(w05Var6, w05Var7, w05Var3);
        w05 w05Var8 = (w05) this.f211218g;
        wj50.m88279p(w05Var8);
        boolean z = true;
        if (((egb1) this.f211211Z) != h5b1.f87801c) {
            float fM78659i = m78659i(m78658h(i2), i2, false);
            float[] fArr = (float[]) this.f211209X;
            ji5[][] ji5VarArr = (ji5[][]) ((egb1) this.f211211Z).f59299b;
            int length = ji5VarArr.length - 1;
            float f2 = ji5VarArr[0][0].f112643a;
            float f3 = ji5VarArr[length][0].f112644b;
            int length2 = fArr.length;
            if (fM78659i < f2 || fM78659i > f3) {
                if (fM78659i > f3) {
                    f2 = f3;
                } else {
                    length = 0;
                }
                float f4 = fM78659i - f2;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    ji5 ji5Var = ji5VarArr[length][i4];
                    boolean z2 = ji5Var.f112658p;
                    float f5 = ji5Var.f112660r;
                    float f6 = ji5Var.f112659q;
                    if (z2) {
                        float f7 = ji5Var.f112643a;
                        float f8 = ji5Var.f112653k;
                        f = f4;
                        float f9 = ji5Var.f112645c;
                        fArr[i3] = (f * f6) + edb.m38555d(ji5Var.f112647e, f9, (f2 - f7) * f8, f9);
                        float f10 = (f2 - f7) * f8;
                        float f11 = ji5Var.f112646d;
                        fArr[i3 + 1] = (f * f5) + edb.m38555d(ji5Var.f112648f, f11, f10, f11);
                    } else {
                        f = f4;
                        ji5Var.m53445c(f2);
                        fArr[i3] = (ji5Var.m53443a() * f) + (ji5Var.f112656n * ji5Var.f112650h) + f6;
                        fArr[i3 + 1] = (ji5Var.m53444b() * f) + (ji5Var.f112657o * ji5Var.f112651i) + f5;
                    }
                    i3 += 2;
                    i4++;
                    f4 = f;
                    ji5VarArr = ji5VarArr;
                }
            } else {
                int length3 = ji5VarArr.length;
                int i5 = 0;
                boolean z3 = false;
                while (i5 < length3) {
                    int i6 = i;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        ji5 ji5Var2 = ji5VarArr[i5][i7];
                        if (fM78659i <= ji5Var2.f112644b) {
                            if (ji5Var2.f112658p) {
                                float f12 = ji5Var2.f112643a;
                                float f13 = ji5Var2.f112653k;
                                float f14 = ji5Var2.f112645c;
                                fArr[i6] = edb.m38555d(ji5Var2.f112647e, f14, (fM78659i - f12) * f13, f14);
                                float f15 = ji5Var2.f112646d;
                                fArr[i6 + 1] = edb.m38555d(ji5Var2.f112648f, f15, (fM78659i - f12) * f13, f15);
                            } else {
                                ji5Var2.m53445c(fM78659i);
                                fArr[i6] = (ji5Var2.f112656n * ji5Var2.f112650h) + ji5Var2.f112659q;
                                fArr[i6 + 1] = (ji5Var2.f112657o * ji5Var2.f112651i) + ji5Var2.f112660r;
                            }
                            z3 = z;
                        } else {
                            z = z;
                        }
                        i6 += 2;
                        i7++;
                        z = z;
                    }
                    boolean z4 = z;
                    if (z3) {
                        break;
                    }
                    i5++;
                    z = z4;
                    i = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                w05Var8.mo76851e(fArr[i8], i8);
            }
        } else {
            int iM78658h = m78658h(i2);
            float fM78659i2 = m78659i(iM78658h, i2, true);
            l5b1 l5b1Var2 = (l5b1) toi0Var.m87103b(soi0Var.m78650c(iM78658h));
            if (l5b1Var2 != null && (w05Var5 = l5b1Var2.f129870a) != null) {
                w05Var6 = w05Var5;
            }
            l5b1 l5b1Var3 = (l5b1) toi0Var.m87103b(soi0Var.m78650c(iM78658h + 1));
            if (l5b1Var3 != null && (w05Var4 = l5b1Var3.f129870a) != null) {
                w05Var7 = w05Var4;
            }
            int iMo76848b = w05Var8.mo76848b();
            for (int i9 = 0; i9 < iMo76848b; i9++) {
                w05Var8.mo76851e((w05Var7.mo76847a(i9) * fM78659i2) + ((1 - fM78659i2) * w05Var6.mo76847a(i9)), i9);
            }
        }
        return w05Var8;
    }

    /* JADX INFO: renamed from: n */
    public y08 mo50830n(cns cnsVar) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f211214c;
        fl00.m41971d(atomicBoolean, false);
        nh61 nh61Var = new nh61(17);
        nh61Var.f153884b = "0.0";
        nh61Var.f153885c = "0.0";
        nh61Var.f153886d = "";
        nh61Var.f153887e = "";
        try {
            if (cnsVar.m33466a()) {
                qqm0 qqm0VarM78660j = m78660j(cnsVar);
                String str = (String) qqm0VarM78660j.f191620a;
                str.getClass();
                String str2 = (String) qqm0VarM78660j.f191621b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    vie1.m85617F("OpenGlRenderer");
                    cnsVar = cns.f40076d;
                }
                int[] iArr = fl00.f70653a;
                if (cnsVar.f40082a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = fl00.f70654b;
                    } else {
                        vie1.m85617F("GLUtils");
                    }
                }
                this.f211213b = iArr;
                nh61Var.f153886d = str;
                nh61Var.f153887e = str2;
            }
            m78655a(cnsVar, nh61Var);
            m78657g();
            m78662p((EGLSurface) this.f211220i);
            String strM41976i = fl00.m41976i();
            if (strM41976i == null) {
                throw new NullPointerException("Null glVersion");
            }
            nh61Var.f153884b = strM41976i;
            this.f211209X = fl00.m41973f(cnsVar);
            int iM41974g = fl00.m41974g();
            this.f211212a = iM41974g;
            m78667u(iM41974g);
            this.f211216e = Thread.currentThread();
            atomicBoolean.set(true);
            String strM77250i = ((String) nh61Var.f153884b) == null ? " glVersion" : "";
            if (((String) nh61Var.f153885c) == null) {
                strM77250i = strM77250i.concat(" eglVersion");
            }
            if (((String) nh61Var.f153886d) == null) {
                strM77250i = s571.m77250i(strM77250i, " glExtensions");
            }
            if (((String) nh61Var.f153887e) == null) {
                strM77250i = s571.m77250i(strM77250i, " eglExtensions");
            }
            if (strM77250i.isEmpty()) {
                return new y08((String) nh61Var.f153884b, (String) nh61Var.f153885c, (String) nh61Var.f153886d, (String) nh61Var.f153887e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM77250i));
        } catch (IllegalArgumentException e) {
            e = e;
            m78664r();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            m78664r();
            throw e;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m78661o(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        float[] fArr;
        toi0 toi0Var = (toi0) this.f211215d;
        soi0 soi0Var = (soi0) this.f211214c;
        boolean z = ((egb1) this.f211211Z) != h5b1.f87801c;
        if (((w05) this.f211218g) == null) {
            this.f211218g = w05Var.mo76849c();
            this.f211219h = w05Var3.mo76849c();
            int i = soi0Var.f211200b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = soi0Var.m78650c(i2) / 1000;
            }
            this.f211217f = fArr2;
            int i3 = soi0Var.f211200b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f211213b = iArr;
        }
        if (z) {
            if (((egb1) this.f211211Z) != h5b1.f87801c && wj50.m88271j((w05) this.f211220i, w05Var) && wj50.m88271j((w05) this.f211221t, w05Var2)) {
                return;
            }
            this.f211220i = w05Var;
            this.f211221t = w05Var2;
            int iMo76848b = w05Var.mo76848b() + (w05Var.mo76848b() % 2);
            this.f211209X = new float[iMo76848b];
            this.f211210Y = new float[iMo76848b];
            int i5 = soi0Var.f211200b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM78650c = soi0Var.m78650c(i6);
                l5b1 l5b1Var = (l5b1) toi0Var.m87103b(iM78650c);
                if (iM78650c == 0 && l5b1Var == null) {
                    fArr = new float[iMo76848b];
                    for (int i7 = 0; i7 < iMo76848b; i7++) {
                        fArr[i7] = w05Var.mo76847a(i7);
                    }
                } else if (iM78650c == this.f211212a && l5b1Var == null) {
                    fArr = new float[iMo76848b];
                    for (int i8 = 0; i8 < iMo76848b; i8++) {
                        fArr[i8] = w05Var2.mo76847a(i8);
                    }
                } else {
                    wj50.m88279p(l5b1Var);
                    w05 w05Var4 = l5b1Var.f129870a;
                    float[] fArr4 = new float[iMo76848b];
                    for (int i9 = 0; i9 < iMo76848b; i9++) {
                        fArr4[i9] = w05Var4.mo76847a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f211211Z = new egb1(this.f211213b, (float[]) this.f211217f, fArr3);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m78662p(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f211217f).getClass();
        ((EGLContext) this.f211218g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f211217f, eGLSurface, eGLSurface, (EGLContext) this.f211218g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m78663q(Surface surface) {
        fl00.m41971d((AtomicBoolean) this.f211214c, true);
        fl00.m41970c((Thread) this.f211216e);
        HashMap map = (HashMap) this.f211215d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, fl00.f70662j);
    }

    /* JADX INFO: renamed from: r */
    public void m78664r() {
        HashMap map = (HashMap) this.f211215d;
        Iterator it = ((Map) this.f211209X).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((dl00) it.next()).f50076a);
        }
        this.f211209X = Collections.EMPTY_MAP;
        this.f211210Y = null;
        if (!Objects.equals((EGLDisplay) this.f211217f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f211217f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (p18 p18Var : map.values()) {
                if (!Objects.equals(p18Var.f172970a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f211217f, p18Var.f172970a)) {
                    try {
                        fl00.m41968a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                        vie1.m85627i("GLUtils");
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f211220i, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f211217f, (EGLSurface) this.f211220i);
                this.f211220i = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f211218g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f211217f, (EGLContext) this.f211218g);
                this.f211218g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f211217f);
            this.f211217f = EGL14.EGL_NO_DISPLAY;
        }
        this.f211219h = null;
        this.f211212a = -1;
        this.f211211Z = cl00.f39139a;
        this.f211221t = null;
        this.f211216e = null;
    }

    /* JADX INFO: renamed from: s */
    public void m78665s(Surface surface, boolean z) {
        HashMap map = (HashMap) this.f211215d;
        if (((Surface) this.f211221t) == surface) {
            this.f211221t = null;
            m78662p((EGLSurface) this.f211220i);
        }
        p18 p18Var = z ? (p18) map.remove(surface) : (p18) map.put(surface, fl00.f70662j);
        if (p18Var == null || p18Var == fl00.f70662j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f211217f, p18Var.f172970a);
        } catch (RuntimeException e) {
            e.getMessage();
            vie1.m85618G("OpenGlRenderer");
        }
    }

    /* JADX INFO: renamed from: t */
    public void m78666t(long j, float[] fArr, Surface surface) {
        fl00.m41971d((AtomicBoolean) this.f211214c, true);
        fl00.m41970c((Thread) this.f211216e);
        HashMap map = (HashMap) this.f211215d;
        wj50.m88281r("The surface is not registered.", map.containsKey(surface));
        p18 p18VarM78656c = (p18) map.get(surface);
        Objects.requireNonNull(p18VarM78656c);
        if (p18VarM78656c == fl00.f70662j) {
            p18VarM78656c = m78656c(surface);
            if (p18VarM78656c == null) {
                return;
            } else {
                map.put(surface, p18VarM78656c);
            }
        }
        int i = p18VarM78656c.f172972c;
        int i2 = p18VarM78656c.f172971b;
        EGLSurface eGLSurface = p18VarM78656c.f172970a;
        if (surface != ((Surface) this.f211221t)) {
            m78662p(eGLSurface);
            this.f211221t = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        dl00 dl00Var = (dl00) this.f211210Y;
        dl00Var.getClass();
        if (dl00Var instanceof el00) {
            GLES20.glUniformMatrix4fv(((el00) dl00Var).f60562f, 1, false, fArr, 0);
            fl00.m41969b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        fl00.m41969b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f211217f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f211217f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        vie1.m85617F("OpenGlRenderer");
        m78665s(surface, false);
    }

    /* JADX INFO: renamed from: u */
    public void m78667u(int i) {
        dl00 dl00Var = (dl00) ((Map) this.f211209X).get((cl00) this.f211211Z);
        if (dl00Var == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((cl00) this.f211211Z));
        }
        if (((dl00) this.f211210Y) != dl00Var) {
            this.f211210Y = dl00Var;
            dl00Var.mo36337b();
            Objects.toString((cl00) this.f211211Z);
            Objects.toString((dl00) this.f211210Y);
        }
        GLES20.glActiveTexture(33984);
        fl00.m41969b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        fl00.m41969b("glBindTexture");
    }

    public sol0(soi0 soi0Var, toi0 toi0Var, int i, bqs bqsVar) {
        this.f211214c = soi0Var;
        this.f211215d = toi0Var;
        this.f211212a = i;
        this.f211216e = bqsVar;
        this.f211213b = h5b1.f87799a;
        float[] fArr = h5b1.f87800b;
        this.f211217f = fArr;
        this.f211209X = fArr;
        this.f211210Y = fArr;
        this.f211211Z = h5b1.f87801c;
    }
}
