package p204p;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class el00 extends dl00 {

    /* JADX INFO: renamed from: e */
    public final int f60561e;

    /* JADX INFO: renamed from: f */
    public final int f60562f;

    /* JADX INFO: renamed from: g */
    public final int f60563g;

    /* JADX WARN: Illegal instructions before constructor call */
    public el00(cns cnsVar, al00 al00Var) {
        String str;
        String str2 = cnsVar.m33466a() ? fl00.f70656d : fl00.f70655c;
        try {
            switch (al00Var.f16698a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.f60561e = -1;
            this.f60562f = -1;
            this.f60563g = -1;
            m36336a();
            int i = this.f50076a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
            this.f60561e = iGlGetUniformLocation;
            fl00.m41972e(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
            this.f60563g = iGlGetAttribLocation;
            fl00.m41972e(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.f60562f = iGlGetUniformLocation2;
            fl00.m41972e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // p204p.dl00
    /* JADX INFO: renamed from: b */
    public final void mo36337b() {
        super.mo36337b();
        GLES20.glUniform1i(this.f60561e, 0);
        GLES20.glEnableVertexAttribArray(this.f60563g);
        fl00.m41969b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f60563g, 2, 5126, false, 0, (Buffer) fl00.f70661i);
        fl00.m41969b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public el00(cns cnsVar, cl00 cl00Var) {
        al00 al00Var;
        if (cnsVar.m33466a()) {
            wj50.m88275l("No default sampler shader available for" + cl00Var, cl00Var != cl00.f39139a);
            if (cl00Var == cl00.f39141c) {
                al00Var = fl00.f70659g;
            } else {
                al00Var = fl00.f70658f;
            }
        } else {
            al00Var = fl00.f70657e;
        }
        this(cnsVar, al00Var);
    }
}
