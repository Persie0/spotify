package p204p;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yg61 implements qad0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f272502a;

    /* JADX INFO: renamed from: b */
    public final kab0 f272503b;

    public yg61(MediaCodec mediaCodec, kab0 kab0Var) {
        this.f272502a = mediaCodec;
        this.f272503b = kab0Var;
        if (Build.VERSION.SDK_INT < 35 || kab0Var == null) {
            return;
        }
        kab0Var.m55899a(mediaCodec);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: a */
    public final void mo28880a(Bundle bundle) {
        this.f272502a.setParameters(bundle);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: b */
    public final void mo28881b(long j, int i, int i2, int i3) {
        this.f272502a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: c */
    public final void mo28882c(int i, myl mylVar, long j, int i2) {
        this.f272502a.queueSecureInputBuffer(i, 0, mylVar.f148479i, j, i2);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: d */
    public final void mo28883d(cbd0 cbd0Var, Handler handler) {
        this.f272502a.setOnFrameRenderedListener(new rn6(this, cbd0Var, 1), handler);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: e */
    public final MediaFormat mo28884e() {
        return this.f272502a.getOutputFormat();
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: f */
    public final void mo28885f() {
        this.f272502a.detachOutputSurface();
    }

    @Override // p204p.qad0
    public final void flush() {
        this.f272502a.flush();
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: g */
    public final ByteBuffer mo28886g(int i) {
        return this.f272502a.getInputBuffer(i);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: h */
    public final void mo28887h(int i) {
        this.f272502a.setVideoScalingMode(i);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: j */
    public final void mo28889j(Surface surface) {
        this.f272502a.setOutputSurface(surface);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: k */
    public final void mo28890k(int i) {
        this.f272502a.releaseOutputBuffer(i, false);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: l */
    public final boolean mo28891l() {
        return false;
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: n */
    public final void mo28893n(int i, long j) {
        this.f272502a.releaseOutputBuffer(i, j);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: o */
    public final int mo28894o() {
        return this.f272502a.dequeueInputBuffer(0L);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: p */
    public final int mo28895p(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f272502a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: q */
    public final ByteBuffer mo28896q(int i) {
        return this.f272502a.getOutputBuffer(i);
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: r */
    public final void mo28897r(ArrayList arrayList) {
        this.f272502a.subscribeToVendorParameters(arrayList);
    }

    @Override // p204p.qad0
    public final void release() {
        kab0 kab0Var = this.f272503b;
        MediaCodec mediaCodec = this.f272502a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && kab0Var != null) {
                kab0Var.m55901c(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // p204p.qad0
    /* JADX INFO: renamed from: s */
    public final void mo28898s(ArrayList arrayList) {
        this.f272502a.unsubscribeFromVendorParameters(arrayList);
    }
}
