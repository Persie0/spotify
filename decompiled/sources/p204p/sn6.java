package p204p;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sn6 implements j561 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f210826b;

    public /* synthetic */ sn6(int i, int i2) {
        this.f210825a = i2;
        this.f210826b = i;
    }

    @Override // p204p.j561
    public final Object get() {
        switch (this.f210825a) {
            case 0:
                return new HandlerThread(tn6.m81156u(this.f210826b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(tn6.m81156u(this.f210826b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
