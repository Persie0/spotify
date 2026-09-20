package p204p;

import android.opengl.GLES20;
import com.spotify.pagematch.elements.cameralayer.OpenGLException;

/* JADX INFO: loaded from: classes9.dex */
public final class gy4 {

    /* JADX INFO: renamed from: a */
    public int f85434a;

    /* JADX INFO: renamed from: b */
    public int f85435b;

    /* JADX INFO: renamed from: c */
    public int f85436c;

    /* JADX INFO: renamed from: d */
    public int f85437d;

    /* JADX INFO: renamed from: y */
    public float f85458y;

    /* JADX INFO: renamed from: e */
    public final float[] f85438e = new float[16];

    /* JADX INFO: renamed from: f */
    public int f85439f = -1;

    /* JADX INFO: renamed from: g */
    public int f85440g = -1;

    /* JADX INFO: renamed from: h */
    public int f85441h = -1;

    /* JADX INFO: renamed from: i */
    public int f85442i = -1;

    /* JADX INFO: renamed from: j */
    public int f85443j = -1;

    /* JADX INFO: renamed from: k */
    public int f85444k = -1;

    /* JADX INFO: renamed from: l */
    public int f85445l = -1;

    /* JADX INFO: renamed from: m */
    public int f85446m = -1;

    /* JADX INFO: renamed from: n */
    public int f85447n = -1;

    /* JADX INFO: renamed from: o */
    public int f85448o = -1;

    /* JADX INFO: renamed from: p */
    public int f85449p = -1;

    /* JADX INFO: renamed from: q */
    public int f85450q = -1;

    /* JADX INFO: renamed from: r */
    public int f85451r = -1;

    /* JADX INFO: renamed from: s */
    public int f85452s = -1;

    /* JADX INFO: renamed from: t */
    public int f85453t = -1;

    /* JADX INFO: renamed from: u */
    public int f85454u = -1;

    /* JADX INFO: renamed from: v */
    public int f85455v = -1;

    /* JADX INFO: renamed from: w */
    public int f85456w = -1;

    /* JADX INFO: renamed from: x */
    public int f85457x = -1;

    /* JADX INFO: renamed from: z */
    public float f85459z = 0.5f;

    /* JADX INFO: renamed from: A */
    public float f85425A = 1.0f;

    /* JADX INFO: renamed from: B */
    public float f85426B = 20.0f;

    /* JADX INFO: renamed from: C */
    public float f85427C = 0.2f;

    /* JADX INFO: renamed from: D */
    public float f85428D = 0.2f;

    /* JADX INFO: renamed from: E */
    public float f85429E = 0.2f;

    /* JADX INFO: renamed from: F */
    public float f85430F = 0.5f;

    /* JADX INFO: renamed from: G */
    public float f85431G = 1.0f;

    /* JADX INFO: renamed from: H */
    public float f85432H = 1.0f;

    /* JADX INFO: renamed from: I */
    public float f85433I = 1.0f;

    /* JADX INFO: renamed from: a */
    public static int m46120a(int i, String str) throws OpenGLException {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new OpenGLException(edb.m38564m("Shader compilation failed: ", strGlGetShaderInfoLog));
    }
}
