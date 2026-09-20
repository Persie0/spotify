package p204p;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tn6 implements qad0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f221888a;

    /* JADX INFO: renamed from: b */
    public final xn6 f221889b;

    /* JADX INFO: renamed from: c */
    public final sad0 f221890c;

    /* JADX INFO: renamed from: d */
    public final kab0 f221891d;

    /* JADX INFO: renamed from: e */
    public boolean f221892e;

    /* JADX INFO: renamed from: f */
    public int f221893f = 0;

    public tn6(MediaCodec mediaCodec, HandlerThread handlerThread, sad0 sad0Var, kab0 kab0Var) {
        this.f221888a = mediaCodec;
        this.f221889b = new xn6(handlerThread);
        this.f221890c = sad0Var;
        this.f221891d = kab0Var;
    }

    /* JADX INFO: renamed from: t */
    public static void m81155t(tn6 tn6Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        kab0 kab0Var;
        xn6 xn6Var = tn6Var.f221889b;
        MediaCodec mediaCodec = tn6Var.f221888a;
        HandlerThread handlerThread = xn6Var.f263524b;
        c95.m31855u(xn6Var.f263525c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(xn6Var, handler);
        xn6Var.f263525c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        tn6Var.f221890c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (kab0Var = tn6Var.f221891d) != null) {
            kab0Var.m55899a(mediaCodec);
        }
        tn6Var.f221893f = 1;
    }

    /* JADX INFO: renamed from: u */
    public static String m81156u(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: a */
    public final void mo28880a(Bundle bundle) {
        this.f221890c.mo75461a(bundle);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: b */
    public final void mo28881b(long j, int i, int i2, int i3) {
        this.f221890c.mo75462b(j, i, i2, i3);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: c */
    public final void mo28882c(int i, myl mylVar, long j, int i2) {
        this.f221890c.mo75463c(i, mylVar, j, i2);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: d */
    public final void mo28883d(cbd0 cbd0Var, Handler handler) {
        this.f221888a.setOnFrameRenderedListener(new rn6(this, cbd0Var, 0), handler);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: e */
    public final MediaFormat mo28884e() {
        MediaFormat mediaFormat;
        xn6 xn6Var = this.f221889b;
        synchronized (xn6Var.f263523a) {
            try {
                mediaFormat = xn6Var.f263530h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: f */
    public final void mo28885f() {
        this.f221888a.detachOutputSurface();
    }

    @Override // p204p.qad0
    public final void flush() {
        this.f221890c.flush();
        this.f221888a.flush();
        xn6 xn6Var = this.f221889b;
        synchronized (xn6Var.f263523a) {
            xn6Var.f263534l++;
            Handler handler = xn6Var.f263525c;
            String str = h0b1.f86200a;
            handler.post(new RunnableC2210od(xn6Var, 6));
        }
        this.f221888a.start();
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: g */
    public final ByteBuffer mo28886g(int i) {
        return this.f221888a.getInputBuffer(i);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: h */
    public final void mo28887h(int i) {
        this.f221888a.setVideoScalingMode(i);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: i */
    public final boolean mo28888i(cz90 cz90Var) {
        xn6 xn6Var = this.f221889b;
        synchronized (xn6Var.f263523a) {
            xn6Var.f263537o = cz90Var;
        }
        return true;
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: j */
    public final void mo28889j(Surface surface) {
        this.f221888a.setOutputSurface(surface);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: k */
    public final void mo28890k(int i) {
        this.f221888a.releaseOutputBuffer(i, false);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: l */
    public final boolean mo28891l() {
        return false;
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: m */
    public final void mo28892m(Runnable runnable) {
        xn6 xn6Var = this.f221889b;
        fr2 fr2Var = new fr2(10, this, runnable);
        synchronized (xn6Var.f263523a) {
            xn6Var.m91494b();
            fr2Var.run();
        }
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: n */
    public final void mo28893n(int i, long j) {
        this.f221888a.releaseOutputBuffer(i, j);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: o */
    public final int mo28894o() {
        this.f221890c.mo75464h();
        xn6 xn6Var = this.f221889b;
        synchronized (xn6Var.f263523a) {
            try {
                xn6Var.m91494b();
                int i = -1;
                if (xn6Var.f263534l > 0 || xn6Var.f263535m) {
                    return -1;
                }
                ar9 ar9Var = xn6Var.f263526d;
                int i2 = ar9Var.f18979a;
                int i3 = ar9Var.f18980b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) ar9Var.f18982d)[i2];
                    ar9Var.f18979a = (i2 + 1) & ar9Var.f18981c;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: p */
    public final int mo28895p(MediaCodec.BufferInfo bufferInfo) {
        this.f221890c.mo75464h();
        xn6 xn6Var = this.f221889b;
        synchronized (xn6Var.f263523a) {
            try {
                xn6Var.m91494b();
                if (xn6Var.f263534l > 0 || xn6Var.f263535m) {
                    return -1;
                }
                ar9 ar9Var = xn6Var.f263527e;
                int i = ar9Var.f18979a;
                int i2 = ar9Var.f18980b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) ar9Var.f18982d)[i];
                ar9Var.f18979a = ar9Var.f18981c & (i + 1);
                if (i3 >= 0) {
                    xn6Var.f263530h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) xn6Var.f263528f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    xn6Var.f263530h = (MediaFormat) xn6Var.f263529g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: q */
    public final ByteBuffer mo28896q(int i) {
        return this.f221888a.getOutputBuffer(i);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: r */
    public final void mo28897r(ArrayList arrayList) {
        this.f221888a.subscribeToVendorParameters(arrayList);
    }

    @Override // p204p.qad0
    public final void release() {
        kab0 kab0Var;
        kab0 kab0Var2;
        try {
            if (this.f221893f == 1) {
                this.f221890c.shutdown();
                xn6 xn6Var = this.f221889b;
                synchronized (xn6Var.f263523a) {
                    xn6Var.f263535m = true;
                    xn6Var.f263524b.quit();
                    xn6Var.m91493a();
                }
            }
            this.f221893f = 2;
            if (this.f221892e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f221888a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (kab0Var2 = this.f221891d) != null) {
                    kab0Var2.m55901c(this.f221888a);
                }
                this.f221888a.release();
                this.f221892e = true;
            }
        } catch (Throwable th) {
            if (!this.f221892e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.f221888a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (kab0Var = this.f221891d) != null) {
                        kab0Var.m55901c(this.f221888a);
                    }
                    this.f221888a.release();
                    this.f221892e = true;
                }
            }
            throw th;
        }
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: s */
    public final void mo28898s(ArrayList arrayList) {
        this.f221888a.unsubscribeFromVendorParameters(arrayList);
    }
}
