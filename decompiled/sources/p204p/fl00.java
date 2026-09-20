package p204p;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fl00 {

    /* JADX INFO: renamed from: a */
    public static final int[] f70653a = {12344};

    /* JADX INFO: renamed from: b */
    public static final int[] f70654b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c */
    public static final String f70655c;

    /* JADX INFO: renamed from: d */
    public static final String f70656d;

    /* JADX INFO: renamed from: e */
    public static final al00 f70657e;

    /* JADX INFO: renamed from: f */
    public static final al00 f70658f;

    /* JADX INFO: renamed from: g */
    public static final al00 f70659g;

    /* JADX INFO: renamed from: h */
    public static final FloatBuffer f70660h;

    /* JADX INFO: renamed from: i */
    public static final FloatBuffer f70661i;

    /* JADX INFO: renamed from: j */
    public static final p18 f70662j;

    static {
        Locale locale = Locale.US;
        f70655c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f70656d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f70657e = new al00(0);
        f70658f = new al00(1);
        f70659g = new al00(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f70660h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f70661i = floatBufferAsFloatBuffer2;
        f70662j = new p18(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m41968a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM75191i = rbz.m75191i(str, ": EGL error: 0x");
        sbM75191i.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbM75191i.toString());
    }

    /* JADX INFO: renamed from: b */
    public static void m41969b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbM75191i = rbz.m75191i(str, ": GL error 0x");
        sbM75191i.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbM75191i.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m41970c(Thread thread) {
        wj50.m88281r("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    /* JADX INFO: renamed from: d */
    public static void m41971d(AtomicBoolean atomicBoolean, boolean z) {
        wj50.m88281r(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    /* JADX INFO: renamed from: e */
    public static void m41972e(int i, String str) {
        if (i < 0) {
            throw new IllegalStateException(s571.m77251j("Unable to locate '", str, "' in program"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static HashMap m41973f(cns cnsVar) {
        Object el00Var;
        cl00 cl00Var;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        cl00[] cl00VarArrValues = cl00.values();
        int length = cl00VarArrValues.length;
        for (int i = 0; i < length; i++) {
            cl00 cl00Var2 = cl00VarArrValues[i];
            al00 al00Var = (al00) map.get(cl00Var2);
            if (al00Var != null) {
                el00Var = new el00(cnsVar, al00Var);
            } else if (cl00Var2 == cl00.f39141c || cl00Var2 == (cl00Var = cl00.f39140b)) {
                el00Var = new el00(cnsVar, cl00Var2);
            } else {
                wj50.m88281r("Unhandled input format: " + cl00Var2, cl00Var2 == cl00.f39139a);
                if (cnsVar.m33466a()) {
                    el00Var = new bl00("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    al00 al00Var2 = (al00) map.get(cl00Var);
                    el00Var = al00Var2 != null ? new el00(cnsVar, al00Var2) : new el00(cnsVar, cl00Var);
                }
            }
            Objects.toString(cl00Var2);
            el00Var.toString();
            map2.put(cl00Var2, el00Var);
        }
        return map2;
    }

    /* JADX INFO: renamed from: g */
    public static int m41974g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m41969b("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m41969b("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m41969b("glTexParameter");
        return i;
    }

    /* JADX INFO: renamed from: h */
    public static EGLSurface m41975h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m41968a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX INFO: renamed from: i */
    public static String m41976i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return klh.m56834f(strGroup, ".", strGroup2);
    }

    /* JADX INFO: renamed from: j */
    public static int m41977j(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m41969b("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        vie1.m85617F("GLUtils");
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbM56838j = klh.m56838j(i, "Could not compile shader type ", ":");
        sbM56838j.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbM56838j.toString());
    }
}
