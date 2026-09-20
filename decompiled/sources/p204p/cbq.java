package p204p;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class cbq implements m861, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: X */
    public final ArrayList f36173X;

    /* JADX INFO: renamed from: a */
    public final sol0 f36174a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f36175b;

    /* JADX INFO: renamed from: c */
    public final zb20 f36176c;

    /* JADX INFO: renamed from: d */
    public final Handler f36177d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f36178e;

    /* JADX INFO: renamed from: f */
    public final float[] f36179f;

    /* JADX INFO: renamed from: g */
    public final float[] f36180g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f36181h;

    /* JADX INFO: renamed from: i */
    public int f36182i;

    /* JADX INFO: renamed from: t */
    public boolean f36183t;

    public cbq(cns cnsVar) {
        Map map = Collections.EMPTY_MAP;
        this.f36178e = new AtomicBoolean(false);
        this.f36179f = new float[16];
        this.f36180g = new float[16];
        this.f36181h = new LinkedHashMap();
        this.f36182i = 0;
        this.f36183t = false;
        this.f36173X = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f36175b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f36177d = handler;
        this.f36176c = new zb20(handler);
        this.f36174a = new sol0();
        try {
            try {
                n5h1.m63736l(new jt4(this, cnsVar)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // p204p.m861
    /* JADX INFO: renamed from: a */
    public final void mo32184a(l861 l861Var) {
        if (this.f36178e.get()) {
            l861Var.close();
            return;
        }
        fxf fxfVar = new fxf(12, this, l861Var);
        Objects.requireNonNull(l861Var);
        m32187d(fxfVar, new kep(l861Var, 4));
    }

    @Override // p204p.m861
    /* JADX INFO: renamed from: b */
    public final void mo32185b(s861 s861Var) {
        if (this.f36178e.get()) {
            s861Var.m77464c();
        } else {
            m32187d(new fxf(13, this, s861Var), new abq(s861Var, 0));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m32186c() {
        if (this.f36183t && this.f36182i == 0) {
            LinkedHashMap linkedHashMap = this.f36181h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((l861) it.next()).close();
            }
            Iterator it2 = this.f36173X.iterator();
            if (it2.hasNext()) {
                ((p08) it2.next()).getClass();
                new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                throw null;
            }
            linkedHashMap.clear();
            sol0 sol0Var = this.f36174a;
            if (((AtomicBoolean) sol0Var.f211214c).getAndSet(false)) {
                fl00.m41970c((Thread) sol0Var.f211216e);
                sol0Var.m78664r();
            }
            this.f36175b.quit();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m32187d(Runnable runnable, Runnable runnable2) {
        try {
            this.f36176c.execute(new zq4(this, runnable2, runnable, 13));
        } catch (RejectedExecutionException unused) {
            vie1.m85618G("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m32188e(Exception exc) {
        ArrayList arrayList = this.f36173X;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((p08) it.next()).getClass();
            throw null;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: f */
    public final Bitmap m32189f(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        eug1.m40071m(i, fArr2);
        eug1.m40072n(fArr2);
        Size sizeM52450e = j591.m52450e(size, i);
        sol0 sol0Var = this.f36174a;
        sol0Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeM52450e.getHeight() * sizeM52450e.getWidth() * 4);
        wj50.m88275l("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeM52450e.getHeight() * sizeM52450e.getWidth()) * 4);
        wj50.m88275l("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = fl00.f70653a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        fl00.m41969b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        fl00.m41969b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        fl00.m41969b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeM52450e.getWidth(), sizeM52450e.getHeight(), 0, 6407, 5121, null);
        fl00.m41969b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        fl00.m41969b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        fl00.m41969b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        fl00.m41969b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        fl00.m41969b("glActiveTexture");
        GLES20.glBindTexture(36197, sol0Var.f211212a);
        fl00.m41969b("glBindTexture");
        sol0Var.f211221t = null;
        GLES20.glViewport(0, 0, sizeM52450e.getWidth(), sizeM52450e.getHeight());
        GLES20.glScissor(0, 0, sizeM52450e.getWidth(), sizeM52450e.getHeight());
        dl00 dl00Var = (dl00) sol0Var.f211210Y;
        dl00Var.getClass();
        if (dl00Var instanceof el00) {
            GLES20.glUniformMatrix4fv(((el00) dl00Var).f60562f, 1, false, fArr2, 0);
            fl00.m41969b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        fl00.m41969b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeM52450e.getWidth(), sizeM52450e.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        fl00.m41969b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        fl00.m41969b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        fl00.m41969b("glDeleteFramebuffers");
        int i4 = sol0Var.f211212a;
        GLES20.glActiveTexture(33984);
        fl00.m41969b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        fl00.m41969b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM52450e.getWidth(), sizeM52450e.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m188c(bitmapCreateBitmap, byteBufferAllocateDirect, sizeM52450e.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public final void m32190g(yk91 yk91Var) {
        ArrayList arrayList = this.f36173X;
        if (arrayList.isEmpty()) {
            return;
        }
        if (yk91Var == null) {
            m32188e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((p08) it.next()).getClass();
                Bitmap bitmapM32189f = m32189f((Size) yk91Var.f273651b, (float[]) yk91Var.f273652c, 0);
                byteArrayOutputStream.reset();
                bitmapM32189f.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = (Surface) yk91Var.f273650a;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.m191f(byteArray, surface);
                throw null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m32188e(e);
        }
        m32188e(e);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f36178e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f36179f;
        surfaceTexture.getTransformMatrix(fArr);
        yk91 yk91Var = null;
        for (Map.Entry entry : this.f36181h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            l861 l861Var = (l861) entry.getKey();
            float[] fArr2 = l861Var.f130811e;
            float[] fArr3 = this.f36180g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = l861Var.f130809c;
            if (i == 34) {
                try {
                    this.f36174a.m78666t(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException unused) {
                    vie1.m85627i("DefaultSurfaceProcessor");
                }
            } else {
                wj50.m88281r("Unsupported format: " + i, i == 256);
                wj50.m88281r("Only one JPEG output is supported.", yk91Var == null);
                yk91Var = new yk91(surface, l861Var.f130810d, (float[]) fArr3.clone());
            }
        }
        try {
            m32190g(yk91Var);
        } catch (RuntimeException e) {
            m32188e(e);
        }
    }

    @Override // p204p.m861
    public final void release() {
        if (this.f36178e.getAndSet(true)) {
            return;
        }
        m32187d(new kep(this, 5), new RunnableC2034k(8));
    }
}
