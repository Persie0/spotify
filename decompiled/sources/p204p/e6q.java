package p204p;

import android.content.Context;
import android.graphics.Gainmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.spotify.music.R;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e6q extends bz8 implements e1y {

    /* JADX INFO: renamed from: w */
    public static final wsv0 f56686w;

    /* JADX INFO: renamed from: x */
    public static final float[] f56687x;

    /* JADX INFO: renamed from: y */
    public static final float[] f56688y;

    /* JADX INFO: renamed from: h */
    public final xd10 f56689h;

    /* JADX INFO: renamed from: i */
    public final pf40 f56690i;

    /* JADX INFO: renamed from: j */
    public final pf40 f56691j;

    /* JADX INFO: renamed from: k */
    public final boolean f56692k;

    /* JADX INFO: renamed from: l */
    public final float[][] f56693l;

    /* JADX INFO: renamed from: m */
    public final float[][] f56694m;

    /* JADX INFO: renamed from: n */
    public final float[] f56695n;

    /* JADX INFO: renamed from: o */
    public final float[] f56696o;

    /* JADX INFO: renamed from: p */
    public final float[] f56697p;

    /* JADX INFO: renamed from: q */
    public final int f56698q;

    /* JADX INFO: renamed from: r */
    public wsv0 f56699r;

    /* JADX INFO: renamed from: s */
    public Gainmap f56700s;

    /* JADX INFO: renamed from: t */
    public int f56701t;

    /* JADX INFO: renamed from: u */
    public boolean f56702u;

    /* JADX INFO: renamed from: v */
    public boolean f56703v;

    static {
        kf40 kf40Var = pf40.f176960b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        jhl0.m53416j(objArr);
        f56686w = pf40.m69787l(4, objArr);
        f56687x = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        f56688y = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public e6q(xd10 xd10Var, pf40 pf40Var, pf40 pf40Var2, boolean z) {
        super(z, 1);
        this.f56689h = xd10Var;
        this.f56690i = pf40Var;
        this.f56691j = pf40Var2;
        this.f56692k = z;
        int[] iArr = {pf40Var.size(), 16};
        Class cls = Float.TYPE;
        this.f56693l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.f56694m = (float[][]) Array.newInstance((Class<?>) cls, pf40Var2.size(), 16);
        this.f56695n = mjx0.m62037o();
        this.f56696o = mjx0.m62037o();
        this.f56697p = new float[16];
        this.f56699r = f56686w;
        this.f56701t = -1;
        int iMax = 9729;
        for (int i = 0; i < pf40Var.size(); i++) {
            iMax = Math.max(iMax, ((t3d0) pf40Var.get(i)).mo79758c());
        }
        this.f56698q = iMax;
    }

    /* JADX INFO: renamed from: j */
    public static e6q m37948j(Context context, wsv0 wsv0Var, wsv0 wsv0Var2, boolean z) {
        return new e6q(m37950l(context, R.raw.vertex_shader_transformation_es2, wsv0Var2.isEmpty() ? R.raw.fragment_shader_copy_es2 : R.raw.fragment_shader_transformation_es2), pf40.m69791p(wsv0Var), pf40.m69791p(wsv0Var2), z);
    }

    /* JADX INFO: renamed from: k */
    public static e6q m37949k(Context context, wsv0 wsv0Var, List list, p7f p7fVar, int i) throws VideoFrameProcessingException {
        int i2;
        boolean zM69260h = p7f.m69260h(p7fVar);
        boolean z = i == 2;
        int i3 = zM69260h ? R.raw.vertex_shader_transformation_es3 : R.raw.vertex_shader_transformation_es2;
        if (zM69260h) {
            i2 = R.raw.fragment_shader_oetf_es3;
        } else if (z) {
            i2 = R.raw.fragment_shader_transformation_sdr_oetf_es2;
        } else {
            i2 = list.isEmpty() ? R.raw.fragment_shader_copy_es2 : R.raw.fragment_shader_transformation_es2;
        }
        xd10 xd10VarM37950l = m37950l(context, i3, i2);
        int i4 = p7fVar.f174677c;
        if (zM69260h) {
            c95.m31843i(i4 == 7 || i4 == 6);
            xd10VarM37950l.m90404g(i4, "uOutputColorTransfer");
        } else if (z) {
            c95.m31843i(i4 == 3 || i4 == 10);
            xd10VarM37950l.m90404g(i4, "uOutputColorTransfer");
        }
        return new e6q(xd10VarM37950l, pf40.m69791p(wsv0Var), pf40.m69791p(list), zM69260h);
    }

    /* JADX INFO: renamed from: l */
    public static xd10 m37950l(Context context, int i, int i2) throws VideoFrameProcessingException {
        try {
            xd10 xd10Var = new xd10(context, i, i2);
            xd10Var.m90403f("uTexTransformationMatrix", mjx0.m62037o());
            return xd10Var;
        } catch (GlUtil$GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public static e6q m37951m(Context context, p7f p7fVar, p7f p7fVar2, boolean z) throws VideoFrameProcessingException {
        String strGlGetString;
        boolean zM69260h = p7f.m69260h(p7fVar);
        xd10 xd10VarM37950l = m37950l(context, zM69260h ? R.raw.vertex_shader_transformation_es3 : R.raw.vertex_shader_transformation_es2, zM69260h ? R.raw.fragment_shader_transformation_external_yuv_es3 : R.raw.fragment_shader_transformation_sdr_external_es2);
        if (zM69260h) {
            if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                try {
                    EGLDisplay eGLDisplayM61998B = mjx0.m61998B();
                    EGLContext eGLContextM62039q = mjx0.m62039q(EGL14.EGL_NO_CONTEXT, eGLDisplayM61998B, 2, mjx0.f144414a);
                    mjx0.m62040r(eGLContextM62039q, eGLDisplayM61998B);
                    strGlGetString = GLES20.glGetString(7939);
                    mjx0.m62043u(eGLContextM62039q, eGLDisplayM61998B);
                } catch (GlUtil$GlException unused) {
                }
            } else {
                strGlGetString = GLES20.glGetString(7939);
            }
            if (strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target")) {
                xd10VarM37950l.m90403f("uYuvToRgbColorTransform", p7fVar.f174676b == 1 ? f56687x : f56688y);
                xd10VarM37950l.m90404g(p7fVar.f174677c, "uInputColorTransfer");
                xd10VarM37950l.m90404g(p7fVar2.f174675a == 6 ? 0 : 1, "uApplyHdrToSdrToneMapping");
            }
            throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
        }
        xd10VarM37950l.f260350f = z;
        return m37953o(xd10VarM37950l, p7fVar, p7fVar2, wsv0.f254763e);
    }

    /* JADX INFO: renamed from: n */
    public static e6q m37952n(Context context, p7f p7fVar, p7f p7fVar2, int i) throws VideoFrameProcessingException {
        int i2;
        int i3 = p7fVar2.f174675a;
        int i4 = p7fVar.f174677c;
        c95.m31855u(i4 != 2 || i == 2);
        boolean zM69260h = p7f.m69260h(p7fVar);
        boolean z = i == 2 && i3 == 6;
        int i5 = (zM69260h || z) ? R.raw.vertex_shader_transformation_es3 : R.raw.vertex_shader_transformation_es2;
        if (z) {
            i2 = R.raw.fragment_shader_transformation_ultra_hdr_es3;
        } else {
            i2 = zM69260h ? R.raw.fragment_shader_transformation_hdr_internal_es3 : R.raw.fragment_shader_transformation_sdr_internal_es2;
        }
        xd10 xd10VarM37950l = m37950l(context, i5, i2);
        if (!z) {
            c95.m31843i(zM69260h || i4 == 2 || i4 == 3);
            xd10VarM37950l.m90404g(i4, "uInputColorTransfer");
        }
        if (zM69260h) {
            xd10VarM37950l.m90404g(i3 == 6 ? 0 : 1, "uApplyHdrToSdrToneMapping");
        }
        wsv0 wsv0VarM69794t = wsv0.f254763e;
        if (i == 2) {
            wsv0VarM69794t = pf40.m69794t(new d6q());
        }
        return m37953o(xd10VarM37950l, p7fVar, p7fVar2, wsv0VarM69794t);
    }

    /* JADX INFO: renamed from: o */
    public static e6q m37953o(xd10 xd10Var, p7f p7fVar, p7f p7fVar2, pf40 pf40Var) {
        boolean zM69260h = p7f.m69260h(p7fVar);
        int i = p7fVar.f174675a;
        boolean z = (i == 1 || i == 2) && p7fVar2.f174675a == 6;
        int i2 = p7fVar2.f174677c;
        if (zM69260h) {
            if (i2 == 3) {
                i2 = 10;
            }
            c95.m31843i(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            xd10Var.m90404g(i2, "uOutputColorTransfer");
        } else if (z) {
            c95.m31843i(i2 == 1 || i2 == 6 || i2 == 7);
            xd10Var.m90404g(i2, "uOutputColorTransfer");
        } else {
            xd10Var.m90404g(0, "uSdrWorkingColorSpace");
            c95.m31843i(i2 == 3 || i2 == 1);
            xd10Var.m90404g(i2, "uOutputColorTransfer");
        }
        return new e6q(xd10Var, pf40Var, wsv0.f254763e, zM69260h || z);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m37954p(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                c95.m31856v(fArr4.length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    @Override // p204p.bz8
    /* JADX INFO: renamed from: d */
    public final di21 mo30976d(int i, int i2) {
        return jjf1.m53561m(i, i2, this.f56690i);
    }

    @Override // p204p.bz8
    /* JADX INFO: renamed from: h */
    public final void mo30977h(int i, long j) throws VideoFrameProcessingException {
        boolean z;
        xd10 xd10Var = this.f56689h;
        pf40 pf40Var = this.f56691j;
        int[] iArr = {pf40Var.size(), 16};
        int i2 = 0;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (pf40Var.size() > 0) {
            pf40Var.get(0).getClass();
            throw new ClassCastException();
        }
        boolean zM37954p = m37954p(this.f56694m, fArr);
        float[] fArr2 = this.f56696o;
        if (zM37954p) {
            Matrix.setIdentityM(fArr2, 0);
            if (pf40Var.size() > 0) {
                pf40Var.get(0).getClass();
                throw new ClassCastException();
            }
            z = true;
        } else {
            z = false;
        }
        pf40 pf40Var2 = this.f56690i;
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, pf40Var2.size(), 16);
        for (int i3 = 0; i3 < pf40Var2.size(); i3++) {
            float[] fArr4 = new float[9];
            ((t3d0) pf40Var2.get(i3)).mo27903b().getValues(fArr4);
            float[] fArr5 = new float[16];
            fArr5[10] = 1.0f;
            int i4 = 0;
            while (i4 < 3) {
                int i5 = 0;
                while (i5 < 3) {
                    fArr5[((i4 == 2 ? 3 : i4) * 4) + (i5 == 2 ? 3 : i5)] = fArr4[(i4 * 3) + i5];
                    i5++;
                }
                i4++;
            }
            float[] fArr6 = new float[16];
            Matrix.transposeM(fArr6, 0, fArr5, 0);
            fArr3[i3] = fArr6;
        }
        int i6 = 4;
        float[][] fArr7 = this.f56693l;
        boolean zM37954p2 = m37954p(fArr7, fArr3);
        float[] fArr8 = this.f56695n;
        if (zM37954p2) {
            Matrix.setIdentityM(fArr8, 0);
            this.f56699r = f56686w;
            int length = fArr7.length;
            int i7 = 0;
            while (true) {
                float[] fArr9 = this.f56697p;
                if (i7 >= length) {
                    int i8 = i2;
                    Matrix.invertM(fArr9, i8, fArr8, i8);
                    this.f56699r = jjf1.m53567s(fArr9, this.f56699r);
                    break;
                }
                float[] fArr10 = fArr7[i7];
                Matrix.multiplyMM(this.f56697p, 0, fArr10, 0, this.f56695n, 0);
                System.arraycopy(fArr9, i2, fArr8, i2, fArr9.length);
                wsv0 wsv0VarM53567s = jjf1.m53567s(fArr10, this.f56699r);
                c95.m31844j(wsv0VarM53567s.f254765d >= 3, "A polygon must have at least 3 vertices.");
                int i9 = 4;
                jf40 jf40Var = new jf40(4);
                jf40Var.m28987e(wsv0VarM53567s);
                int i10 = 0;
                while (i10 < 6) {
                    float[] fArr11 = jjf1.f113036a[i10];
                    wsv0 wsv0VarM53150g = jf40Var.m53150g();
                    jf40 jf40Var2 = new jf40(i9);
                    for (int i11 = 0; i11 < wsv0VarM53150g.f254765d; i11++) {
                        float[] fArr12 = (float[]) wsv0VarM53150g.get(i11);
                        int i12 = wsv0VarM53150g.f254765d;
                        float[] fArr13 = (float[]) wsv0VarM53150g.get(((i12 + i11) - 1) % i12);
                        if (jjf1.m53565q(fArr12, fArr11)) {
                            if (!jjf1.m53565q(fArr13, fArr11)) {
                                float[] fArrM53560l = jjf1.m53560l(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr12, fArrM53560l)) {
                                    jf40Var2.m28985c(fArrM53560l);
                                }
                            }
                            jf40Var2.m28985c(fArr12);
                        } else if (jjf1.m53565q(fArr13, fArr11)) {
                            float[] fArrM53560l2 = jjf1.m53560l(fArr11, fArr11, fArr13, fArr12);
                            if (!Arrays.equals(fArr13, fArrM53560l2)) {
                                jf40Var2.m28985c(fArrM53560l2);
                            }
                        }
                    }
                    i10++;
                    jf40Var = jf40Var2;
                    i9 = 4;
                }
                wsv0 wsv0VarM53150g2 = jf40Var.m53150g();
                this.f56699r = wsv0VarM53150g2;
                if (wsv0VarM53150g2.f254765d < 3) {
                    break;
                }
                i7++;
                i2 = 0;
            }
            i2 = 1;
        }
        boolean z2 = z || i2 != 0;
        if (this.f56699r.f254765d < 3) {
            return;
        }
        if (this.f56702u && !z2 && this.f56703v) {
            return;
        }
        try {
            int i13 = xd10Var.f260345a;
            HashMap map = xd10Var.f260349e;
            GLES20.glUseProgram(i13);
            mjx0.m62033k();
            if (this.f56700s != null) {
                if (Build.VERSION.SDK_INT < 34) {
                    throw new IllegalStateException("Gainmaps not supported under API 34.");
                }
                xd10Var.m90405h(this.f56701t, 1, "uGainmapTexSampler");
                AbstractC1665af.m25763M(xd10Var, this.f56700s, -1);
            }
            int i14 = this.f56698q;
            wd10 wd10Var = (wd10) map.get("uTexSampler");
            wd10Var.getClass();
            wd10Var.f250187f = i;
            wd10Var.f250188g = 0;
            wd10Var.f250189h = i14;
            xd10Var.m90403f("uTransformationMatrix", fArr8);
            wd10 wd10Var2 = (wd10) map.get("uRgbMatrix");
            if (wd10Var2 != null) {
                wd10Var2.m87817d(fArr2);
            }
            wsv0 wsv0Var = this.f56699r;
            float[] fArr14 = new float[wsv0Var.f254765d * 4];
            int i15 = 0;
            while (i15 < wsv0Var.f254765d) {
                int i16 = i6;
                System.arraycopy(wsv0Var.get(i15), 0, fArr14, i15 * 4, i16);
                i15++;
                i6 = i16;
            }
            xd10Var.m90401d(fArr14);
            xd10Var.m90399b();
            GLES20.glDrawArrays(6, 0, this.f56699r.f254765d);
            mjx0.m62033k();
            this.f56703v = true;
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(j, e);
        }
    }

    @Override // p204p.bz8
    /* JADX INFO: renamed from: i */
    public final boolean mo30978i() {
        return (this.f56703v && this.f56702u) ? false : true;
    }

    @Override // p204p.be10
    public final void release() throws VideoFrameProcessingException {
        try {
            this.f32431a.m46884j();
            try {
                this.f56689h.m90400c();
                int i = this.f56701t;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    mjx0.m62033k();
                }
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
