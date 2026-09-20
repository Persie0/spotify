package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.spotify.music.R;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e1m0 extends bz8 {

    /* JADX INFO: renamed from: h */
    public final xd10 f55216h;

    /* JADX INFO: renamed from: i */
    public final q1y0 f55217i;

    /* JADX INFO: renamed from: j */
    public final pf40 f55218j;

    /* JADX INFO: renamed from: k */
    public final int[] f55219k;

    /* JADX INFO: renamed from: l */
    public final SparseArray f55220l;

    /* JADX INFO: renamed from: m */
    public final SparseIntArray f55221m;

    public e1m0(Context context, boolean z, pf40 pf40Var) throws VideoFrameProcessingException {
        super(z, 1);
        int i = 15;
        if (z) {
            int[] iArr = new int[pf40Var.size()];
            for (int i2 = 0; i2 < pf40Var.size(); i2++) {
                vh9 vh9Var = (vh9) pf40Var.get(i2);
                if (vh9Var == null) {
                    throw new IllegalArgumentException(vh9Var + " is not supported on HDR content.");
                }
                c95.m31855u(Build.VERSION.SDK_INT >= 34);
                iArr[i2] = 1;
                i -= 2;
                if (i < 0) {
                    throw new IllegalArgumentException("Too many HDR overlays in the same OverlayShaderProgram instance.");
                }
            }
            this.f55219k = iArr;
        } else {
            this.f55219k = null;
            c95.m31844j(pf40Var.size() <= 15, "OverlayShaderProgram does not support more than 15 SDR overlays in the same instance.");
        }
        this.f55218j = pf40Var;
        this.f55217i = new q1y0();
        this.f55220l = new SparseArray();
        this.f55221m = new SparseIntArray();
        try {
            xd10 xd10Var = new xd10(m37561k(pf40Var.size()), m37560j(context, pf40Var.size(), this.f55219k));
            this.f55216h = xd10Var;
            xd10Var.m90401d(mjx0.m62000D());
        } catch (GlUtil$GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01af  */
    /* JADX INFO: renamed from: j */
    public static String m37560j(Context context, int i, int[] iArr) {
        String str;
        StringBuilder sb = new StringBuilder("#version 100\nprecision mediump float;\nuniform sampler2D uVideoTexSampler0;\nvarying vec2 vVideoTexSamplingCoord0;\n\n");
        sb.append(h0b1.m46293U(context, R.raw.insert_overlay_fragment_shader_methods));
        if (iArr != null) {
            sb.append(h0b1.m46293U(context, R.raw.insert_ultra_hdr));
        }
        for (int i2 = 1; i2 <= i; i2++) {
            Locale locale = Locale.US;
            sb.append("uniform sampler2D uOverlayTexSampler" + i2 + ";\n");
            sb.append("uniform float uOverlayAlphaScale" + i2 + ";\n");
            sb.append("varying vec2 vOverlayTexSamplingCoord" + i2 + ";\n");
            sb.append("\n");
            if (iArr != null) {
                int i3 = iArr[i2 - 1];
                if (i3 == 1) {
                    sb.append("// Uniforms for applying the gainmap to the base.\n");
                    sb.append("uniform sampler2D uGainmapTexSampler" + i2 + ";\n");
                    sb.append("uniform int uGainmapIsAlpha" + i2 + ";\n");
                    sb.append("uniform int uNoGamma" + i2 + ";\n");
                    sb.append("uniform int uSingleChannel" + i2 + ";\n");
                    sb.append("uniform vec4 uLogRatioMin" + i2 + ";\n");
                    sb.append("uniform vec4 uLogRatioMax" + i2 + ";\n");
                    sb.append("uniform vec4 uEpsilonSdr" + i2 + ";\n");
                    sb.append("uniform vec4 uEpsilonHdr" + i2 + ";\n");
                    sb.append("uniform vec4 uGainmapGamma" + i2 + ";\n");
                    sb.append("uniform float uDisplayRatioHdr" + i2 + ";\n");
                    sb.append("uniform float uDisplayRatioSdr" + i2 + ";\n");
                    sb.append("\n");
                } else if (i3 == 2) {
                    sb.append("uniform mat4 uLuminanceMatrix" + i2 + ";\n");
                }
            }
        }
        sb.append("void main() {\n vec4 videoColor = vec4(texture2D(uVideoTexSampler0, vVideoTexSamplingCoord0));\n vec4 fragColor = videoColor;\n");
        for (int i4 = 1; i4 <= i; i4++) {
            sb.append("        vec4 electricalOverlayColor% = getClampToBorderOverlayColor(\n      uOverlayTexSampler%, vOverlayTexSamplingCoord%, uOverlayAlphaScale%);\n".replace("%", Integer.toString(i4)));
            if (iArr == null) {
                str = "electricalOverlayColor";
            } else {
                int i5 = iArr[i4 - 1];
                if (i5 == 1) {
                    sb.append("        vec4 gainmap% = texture2D(uGainmapTexSampler%, vOverlayTexSamplingCoord%);\n  vec3 opticalBt709Color% = applyGainmap(\n      srgbEotf(electricalOverlayColor%), gainmap%, uGainmapIsAlpha%, uNoGamma%,\n      uSingleChannel%, uLogRatioMin%, uLogRatioMax%, uEpsilonSdr%, uEpsilonHdr%,\n      uGainmapGamma%, uDisplayRatioHdr%, uDisplayRatioSdr%);\n  vec4 opticalBt2020OverlayColor% =\n      vec4(scaleHdrLuminance(bt709ToBt2020(opticalBt709Color%)),           electricalOverlayColor%.a);".replace("%", Integer.toString(i4)));
                    str = "opticalBt2020OverlayColor";
                } else if (i5 == 2) {
                    sb.append("vec4 opticalOverlayColor% = uLuminanceMatrix% * srgbEotf(electricalOverlayColor%);\n".replace("%", Integer.toString(i4)));
                    str = "opticalOverlayColor";
                } else {
                    str = "electricalOverlayColor";
                }
            }
            Locale locale2 = Locale.US;
            sb.append("  fragColor = getMixColor(fragColor, " + str + i4 + ");\n");
        }
        sb.append("  gl_FragColor = fragColor;\n}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m37561k(int i) {
        StringBuilder sb = new StringBuilder("#version 100\nattribute vec4 aFramePosition;\nvarying vec2 vVideoTexSamplingCoord0;\n");
        for (int i2 = 1; i2 <= i; i2++) {
            String str = h0b1.f86200a;
            Locale locale = Locale.US;
            sb.append("uniform mat4 uTransformationMatrix" + i2 + ";\n");
            sb.append("uniform mat4 uVertexTransformationMatrix" + i2 + ";\n");
            sb.append("varying vec2 vOverlayTexSamplingCoord" + i2 + ";\n");
        }
        sb.append("vec2 getTexSamplingCoord(vec2 ndcPosition){\n  return vec2(ndcPosition.x * 0.5 + 0.5, ndcPosition.y * 0.5 + 0.5);\n}\nvoid main() {\n  gl_Position = aFramePosition;\n  vVideoTexSamplingCoord0 = getTexSamplingCoord(aFramePosition.xy);\n");
        for (int i3 = 1; i3 <= i; i3++) {
            sb.append("      vec4 aOverlayPosition% =\n  uVertexTransformationMatrix% * uTransformationMatrix% * aFramePosition;\nvOverlayTexSamplingCoord% = getTexSamplingCoord(aOverlayPosition%.xy);".replace("%", Integer.toString(i3)));
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override // p204p.bz8
    /* JADX INFO: renamed from: d */
    public final di21 mo30976d(int i, int i2) {
        di21 di21Var = new di21(i, i2);
        this.f55217i.f273754X = di21Var;
        kf40 kf40VarListIterator = this.f55218j.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            ((vh9) kf40VarListIterator.next()).getClass();
        }
        return di21Var;
    }

    @Override // p204p.bz8
    /* JADX INFO: renamed from: h */
    public final void mo30977h(int i, long j) throws VideoFrameProcessingException {
        SparseArray sparseArray = this.f55220l;
        pf40 pf40Var = this.f55218j;
        SparseIntArray sparseIntArray = this.f55221m;
        xd10 xd10Var = this.f55216h;
        try {
            GLES20.glUseProgram(xd10Var.f260345a);
            mjx0.m62033k();
            for (int i2 = 1; i2 <= pf40Var.size(); i2++) {
                int i3 = i2 - 1;
                vh9 vh9Var = (vh9) pf40Var.get(i3);
                int[] iArr = this.f55219k;
                if (iArr != null) {
                    int i4 = iArr[i3];
                    if (i4 == 1) {
                        c95.m31843i(Objects.nonNull(vh9Var));
                        Bitmap bitmapMo48720a = vh9Var.mo48720a(j);
                        c95.m31843i(bitmapMo48720a.hasGainmap());
                        Gainmap gainmap = bitmapMo48720a.getGainmap();
                        gainmap.getClass();
                        Gainmap gainmapM89061f = wuk0.m89061f(sparseArray.get(i2));
                        if (gainmapM89061f == null || !AbstractC1665af.m25776g(gainmapM89061f, gainmap)) {
                            sparseArray.put(i2, gainmap);
                            if (sparseIntArray.get(i2, -1) == -1) {
                                Bitmap gainmapContents = gainmap.getGainmapContents();
                                int iM62048z = mjx0.m62048z();
                                mjx0.m62017U(iM62048z, gainmapContents);
                                sparseIntArray.put(i2, iM62048z);
                            } else {
                                mjx0.m62017U(sparseIntArray.get(i2), gainmap.getGainmapContents());
                            }
                            xd10Var.m90405h(sparseIntArray.get(i2), pf40Var.size() + i2, "uGainmapTexSampler" + i2);
                            AbstractC1665af.m25763M(xd10Var, wuk0.m89061f(sparseArray.get(i2)), i2);
                        }
                    } else if (i4 == 2) {
                        float[] fArrM62037o = mjx0.m62037o();
                        float f = vh9Var.mo48721b().f245939g;
                        Matrix.scaleM(fArrM62037o, 0, f, f, f);
                        String str = h0b1.f86200a;
                        Locale locale = Locale.US;
                        xd10Var.m90403f("uLuminanceMatrix" + i2, fArrM62037o);
                    }
                }
                String str2 = h0b1.f86200a;
                Locale locale2 = Locale.US;
                xd10Var.m90405h(vh9Var.m85514c(j), i2, "uOverlayTexSampler" + i2);
                xd10Var.m90403f("uVertexTransformationMatrix" + i2, vh9Var.f241442a);
                vy41 vy41VarMo48721b = vh9Var.mo48721b();
                Bitmap bitmap = vh9Var.f241445d;
                bitmap.getClass();
                int width = bitmap.getWidth();
                Bitmap bitmap2 = vh9Var.f241445d;
                bitmap2.getClass();
                xd10Var.m90403f("uTransformationMatrix" + i2, this.f55217i.mo71964b0(new di21(width, bitmap2.getHeight()), vy41VarMo48721b));
                vy41VarMo48721b.getClass();
                xd10Var.m90402e("uOverlayAlphaScale" + i2, 1.0f);
            }
            xd10Var.m90405h(i, 0, "uVideoTexSampler0");
            xd10Var.m90399b();
            GLES20.glDrawArrays(5, 0, 4);
            mjx0.m62033k();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(j, e);
        }
    }

    @Override // p204p.be10
    public final void release() throws VideoFrameProcessingException {
        int i;
        pf40 pf40Var = this.f55218j;
        try {
            this.f32431a.m46884j();
            try {
                this.f55216h.m90400c();
                for (int i2 = 0; i2 < pf40Var.size(); i2++) {
                    vh9 vh9Var = (vh9) pf40Var.get(i2);
                    vh9Var.f241445d = null;
                    int i3 = vh9Var.f241443b;
                    if (i3 != -1) {
                        try {
                            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                            mjx0.m62033k();
                        } catch (GlUtil$GlException e) {
                            throw new VideoFrameProcessingException(e);
                        }
                    }
                    vh9Var.f241443b = -1;
                    int[] iArr = this.f55219k;
                    if (iArr != null && iArr[i2] == 1 && (i = this.f55221m.get(i2, -1)) != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i}, 0);
                        mjx0.m62033k();
                    }
                }
            } catch (GlUtil$GlException e2) {
                throw new VideoFrameProcessingException(e2);
            }
        } catch (GlUtil$GlException e3) {
            throw new VideoFrameProcessingException(e3);
        }
    }
}
