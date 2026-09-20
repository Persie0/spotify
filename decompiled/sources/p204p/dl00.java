package p204p;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dl00 {

    /* JADX INFO: renamed from: a */
    public final int f50076a;

    /* JADX INFO: renamed from: b */
    public int f50077b = -1;

    /* JADX INFO: renamed from: c */
    public int f50078c = -1;

    /* JADX INFO: renamed from: d */
    public int f50079d = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public dl00(String str, String str2) throws Throwable {
        int iM41977j;
        int iM41977j2;
        int iGlCreateProgram;
        try {
            iM41977j = fl00.m41977j(35633, str);
            try {
                iM41977j2 = fl00.m41977j(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        fl00.m41969b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iM41977j);
                        fl00.m41969b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iM41977j2);
                        fl00.m41969b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f50076a = iGlCreateProgram;
                            m36336a();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (iM41977j != -1) {
                            GLES20.glDeleteShader(iM41977j);
                        }
                        if (iM41977j2 != -1) {
                            GLES20.glDeleteShader(iM41977j2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (iM41977j != -1) {
                            GLES20.glDeleteShader(iM41977j);
                        }
                        if (iM41977j2 != -1) {
                            GLES20.glDeleteShader(iM41977j2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                iM41977j2 = -1;
                iGlCreateProgram = iM41977j2;
                if (iM41977j != -1) {
                    GLES20.glDeleteShader(iM41977j);
                }
                if (iM41977j2 != -1) {
                    GLES20.glDeleteShader(iM41977j2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            iM41977j = -1;
            iM41977j2 = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36336a() {
        int i = this.f50076a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.f50079d = iGlGetAttribLocation;
        fl00.m41972e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.f50077b = iGlGetUniformLocation;
        fl00.m41972e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.f50078c = iGlGetUniformLocation2;
        fl00.m41972e(iGlGetUniformLocation2, "uAlphaScale");
    }

    /* JADX INFO: renamed from: b */
    public void mo36337b() {
        GLES20.glUseProgram(this.f50076a);
        fl00.m41969b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f50079d);
        fl00.m41969b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f50079d, 2, 5126, false, 0, (Buffer) fl00.f70660h);
        fl00.m41969b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f50077b, 1, false, fArr, 0);
        fl00.m41969b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f50078c, 1.0f);
        fl00.m41969b("glUniform1f");
    }
}
