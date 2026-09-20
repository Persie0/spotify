package p204p;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l861 implements Closeable {

    /* JADX INFO: renamed from: X */
    public gbb f130806X;

    /* JADX INFO: renamed from: b */
    public final Surface f130808b;

    /* JADX INFO: renamed from: c */
    public final int f130809c;

    /* JADX INFO: renamed from: d */
    public final Size f130810d;

    /* JADX INFO: renamed from: e */
    public final float[] f130811e;

    /* JADX INFO: renamed from: f */
    public y8j f130812f;

    /* JADX INFO: renamed from: g */
    public Executor f130813g;

    /* JADX INFO: renamed from: t */
    public final jbb f130816t;

    /* JADX INFO: renamed from: a */
    public final Object f130807a = new Object();

    /* JADX INFO: renamed from: h */
    public boolean f130814h = false;

    /* JADX INFO: renamed from: i */
    public boolean f130815i = false;

    public l861(Surface surface, int i, Size size, m28 m28Var, m28 m28Var2) {
        float[] fArr = new float[16];
        this.f130811e = fArr;
        this.f130808b = surface;
        this.f130809c = i;
        this.f130810d = size;
        m58459a(fArr, new float[16], m28Var);
        m58459a(new float[16], new float[16], m28Var2);
        this.f130816t = n5h1.m63736l(new f151(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public static void m58459a(float[] fArr, float[] fArr2, m28 m28Var) {
        Matrix.setIdentityM(fArr, 0);
        if (m28Var == null) {
            return;
        }
        Size size = m28Var.f139273a;
        boolean z = m28Var.f139277e;
        int i = m28Var.f139276d;
        eug1.m40072n(fArr);
        eug1.m40071m(i, fArr);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeM52450e = j591.m52450e(size, i);
        float f = 0;
        android.graphics.Matrix matrixM52446a = j591.m52446a(new RectF(f, f, size.getWidth(), size.getHeight()), new RectF(f, f, sizeM52450e.getWidth(), sizeM52450e.getHeight()), i, z);
        RectF rectF = new RectF(m28Var.f139274b);
        matrixM52446a.mapRect(rectF);
        float width = rectF.left / sizeM52450e.getWidth();
        float height = ((sizeM52450e.getHeight() - rectF.height()) - rectF.top) / sizeM52450e.getHeight();
        float fWidth = rectF.width() / sizeM52450e.getWidth();
        float fHeight = rectF.height() / sizeM52450e.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        ifb ifbVar = m28Var.f139275c;
        Matrix.setIdentityM(fArr2, 0);
        eug1.m40072n(fArr2);
        if (ifbVar != null) {
            wj50.m88281r("Camera has no transform.", ifbVar.mo50434n());
            eug1.m40071m(ifbVar.mo50329g().mo44589a(), fArr2);
            if (ifbVar.mo50329g().mo44592d() == 0) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Surface m58460c(zb20 zb20Var, y8j y8jVar) {
        boolean z;
        synchronized (this.f130807a) {
            this.f130813g = zb20Var;
            this.f130812f = y8jVar;
            z = this.f130814h;
        }
        if (z) {
            m58461e();
        }
        return this.f130808b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f130807a) {
            try {
                if (!this.f130815i) {
                    this.f130815i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f130806X.m44211b(null);
    }

    /* JADX INFO: renamed from: e */
    public final void m58461e() {
        Executor executor;
        y8j y8jVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f130807a) {
            try {
                if (this.f130813g == null || (y8jVar = this.f130812f) == null) {
                    this.f130814h = true;
                } else if (!this.f130815i) {
                    atomicReference.set(y8jVar);
                    executor = this.f130813g;
                    this.f130814h = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new mpd0(27, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                vie1.m85634p(3, vie1.m85616E("SurfaceOutputImpl"));
            }
        }
    }
}
