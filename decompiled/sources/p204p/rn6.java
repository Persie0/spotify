package p204p;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rn6 implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f200734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cbd0 f200735b;

    public /* synthetic */ rn6(qad0 qad0Var, cbd0 cbd0Var, int i) {
        this.f200734a = i;
        this.f200735b = cbd0Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f200734a) {
            case 0:
                cbd0 cbd0Var = this.f200735b;
                Handler handler = cbd0Var.f36095a;
                if (Build.VERSION.SDK_INT >= 30) {
                    cbd0Var.m32156a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                cbd0 cbd0Var2 = this.f200735b;
                Handler handler2 = cbd0Var2.f36095a;
                if (Build.VERSION.SDK_INT >= 30) {
                    cbd0Var2.m32156a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
