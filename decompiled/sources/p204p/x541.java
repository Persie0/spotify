package p204p;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class x541 implements GLSurfaceView.Renderer, zvl0 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ y541 f258284X;

    /* JADX INFO: renamed from: a */
    public final eey0 f258285a;

    /* JADX INFO: renamed from: d */
    public final float[] f258288d;

    /* JADX INFO: renamed from: e */
    public final float[] f258289e;

    /* JADX INFO: renamed from: f */
    public final float[] f258290f;

    /* JADX INFO: renamed from: g */
    public float f258291g;

    /* JADX INFO: renamed from: h */
    public float f258292h;

    /* JADX INFO: renamed from: b */
    public final float[] f258286b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f258287c = new float[16];

    /* JADX INFO: renamed from: i */
    public final float[] f258293i = new float[16];

    /* JADX INFO: renamed from: t */
    public final float[] f258294t = new float[16];

    public x541(y541 y541Var, eey0 eey0Var) {
        this.f258284X = y541Var;
        float[] fArr = new float[16];
        this.f258288d = fArr;
        float[] fArr2 = new float[16];
        this.f258289e = fArr2;
        float[] fArr3 = new float[16];
        this.f258290f = fArr3;
        this.f258285a = eey0Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f258292h = 3.1415927f;
    }

    @Override // p204p.zvl0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo46922a(float f, float[] fArr) {
        float[] fArr2 = this.f258288d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f258292h = f2;
        Matrix.setRotateM(this.f258289e, 0, -this.f258291g, (float) Math.cos(f2), (float) Math.sin(this.f258292h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objM87329A;
        synchronized (this) {
            Matrix.multiplyMM(this.f258294t, 0, this.f258288d, 0, this.f258290f, 0);
            Matrix.multiplyMM(this.f258293i, 0, this.f258289e, 0, this.f258294t, 0);
        }
        Matrix.multiplyMM(this.f258287c, 0, this.f258286b, 0, this.f258293i, 0);
        eey0 eey0Var = this.f258285a;
        float[] fArr2 = this.f258287c;
        GLES20.glClear(16384);
        try {
            mjx0.m62033k();
        } catch (GlUtil$GlException e) {
            yif1.m93810s("Failed to draw a frame", e);
        }
        if (eey0Var.f58882a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = eey0Var.f58891t;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                mjx0.m62033k();
            } catch (GlUtil$GlException e2) {
                yif1.m93810s("Failed to draw a frame", e2);
            }
            if (eey0Var.f58883b.compareAndSet(true, false)) {
                Matrix.setIdentityM(eey0Var.f58888g, 0);
            }
            long timestamp = eey0Var.f58891t.getTimestamp();
            w780 w780Var = eey0Var.f58886e;
            synchronized (w780Var) {
                objM87329A = w780Var.m87329A(timestamp, false);
            }
            Long l = (Long) objM87329A;
            if (l != null) {
                m12 m12Var = eey0Var.f58885d;
                float[] fArr3 = eey0Var.f58888g;
                float[] fArr4 = (float[]) ((w780) m12Var.f138799e).m87331C(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) m12Var.f138798d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!m12Var.f138796b) {
                        m12.m60485B((float[]) m12Var.f138797c, (float[]) m12Var.f138798d);
                        m12Var.f138796b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) m12Var.f138797c, 0, (float[]) m12Var.f138798d, 0);
                }
            }
            fas0 fas0Var = (fas0) eey0Var.f58887f.m87331C(timestamp);
            if (fas0Var != null) {
                ias0 ias0Var = eey0Var.f58884c;
                ias0Var.getClass();
                if (ias0.m50099b(fas0Var)) {
                    ias0Var.f100337a = fas0Var.f67634c;
                    ias0Var.f100338b = new w780(fas0Var.f67632a.f57723a[0]);
                    if (!fas0Var.f67635d) {
                        w780 w780Var2 = fas0Var.f67633b.f57723a[0];
                        float[] fArr6 = (float[]) w780Var2.f248600d;
                        int length2 = fArr6.length;
                        mjx0.m62038p(fArr6);
                        mjx0.m62038p((float[]) w780Var2.f248601e);
                    }
                }
            }
        }
        Matrix.multiplyMM(eey0Var.f58889h, 0, fArr2, 0, eey0Var.f58888g, 0);
        ias0 ias0Var2 = eey0Var.f58884c;
        int i = eey0Var.f58890i;
        float[] fArr7 = eey0Var.f58889h;
        w780 w780Var3 = ias0Var2.f100338b;
        if (w780Var3 == null) {
            return;
        }
        int i2 = ias0Var2.f100337a;
        if (i2 == 1) {
            fArr = ias0.f100335j;
        } else {
            fArr = i2 == 2 ? ias0.f100336k : ias0.f100334i;
        }
        GLES20.glUniformMatrix3fv(ias0Var2.f100341e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(ias0Var2.f100340d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(ias0Var2.f100344h, 0);
        try {
            mjx0.m62033k();
        } catch (GlUtil$GlException e3) {
            yif1.m93810s("Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(ias0Var2.f100342f, 3, 5126, false, 12, (Buffer) w780Var3.f248600d);
        try {
            mjx0.m62033k();
        } catch (GlUtil$GlException e4) {
            yif1.m93810s("Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(ias0Var2.f100343g, 2, 5126, false, 8, (Buffer) w780Var3.f248601e);
        try {
            mjx0.m62033k();
        } catch (GlUtil$GlException e5) {
            yif1.m93810s("Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(w780Var3.f248599c, 0, w780Var3.f248598b);
        try {
            mjx0.m62033k();
        } catch (GlUtil$GlException e6) {
            yif1.m93810s("Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f258286b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        y541 y541Var = this.f258284X;
        y541Var.f269343e.post(new mpd0(25, y541Var, this.f258285a.m38713c()));
    }
}
