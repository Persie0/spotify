package p204p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class ijs extends sol0 {

    /* JADX INFO: renamed from: L0 */
    public int f102886L0 = -1;

    /* JADX INFO: renamed from: M0 */
    public int f102887M0 = -1;

    /* JADX INFO: renamed from: N0 */
    public final iaz f102888N0;

    /* JADX INFO: renamed from: O0 */
    public final iaz f102889O0;

    public ijs(iaz iazVar, iaz iazVar2) {
        this.f102888N0 = iazVar;
        this.f102889O0 = iazVar2;
    }

    @Override // p204p.sol0
    /* JADX INFO: renamed from: n */
    public final y08 mo50830n(cns cnsVar) {
        Map map = Collections.EMPTY_MAP;
        y08 y08VarMo50830n = super.mo50830n(cnsVar);
        this.f102886L0 = fl00.m41974g();
        this.f102887M0 = fl00.m41974g();
        return y08VarMo50830n;
    }

    /* JADX INFO: renamed from: v */
    public final void m50831v(long j, Surface surface, l861 l861Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        p18 p18Var = p18VarM78656c;
        EGLSurface eGLSurface = p18Var.f172970a;
        if (surface != ((Surface) this.f211221t)) {
            m78662p(eGLSurface);
            this.f211221t = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        m50832w(p18Var, l861Var, surfaceTexture, this.f102888N0, this.f102886L0);
        m50832w(p18Var, l861Var, surfaceTexture2, this.f102889O0, this.f102887M0);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f211217f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f211217f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        vie1.m85617F("DualOpenGlRenderer");
        m78665s(surface, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m50832w(p18 p18Var, l861 l861Var, SurfaceTexture surfaceTexture, iaz iazVar, int i) {
        m78667u(i);
        int i2 = p18Var.f172971b;
        int i3 = p18Var.f172972c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, l861Var.f130811e, 0);
        dl00 dl00Var = (dl00) this.f211210Y;
        dl00Var.getClass();
        if (dl00Var instanceof el00) {
            GLES20.glUniformMatrix4fv(((el00) dl00Var).f60562f, 1, false, fArr2, 0);
            fl00.m41969b("glUniformMatrix4fv");
        }
        iazVar.getClass();
        Size size = new Size((int) (i2 * 1.0f), (int) (i3 * 1.0f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(dl00Var.f50077b, 1, false, fArr5, 0);
        fl00.m41969b("glUniformMatrix4fv");
        GLES20.glUniform1f(dl00Var.f50078c, 1.0f);
        fl00.m41969b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        fl00.m41969b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
