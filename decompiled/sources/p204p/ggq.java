package p204p;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ggq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ngq f79728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterruptedException f79729c;

    public /* synthetic */ ggq(ngq ngqVar, InterruptedException interruptedException, int i) {
        this.f79727a = i;
        this.f79728b = ngqVar;
        this.f79729c = interruptedException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f79727a) {
            case 0:
                this.f79728b.f153764h.mo33237a(VideoFrameProcessingException.m757a(-9223372036854775807L, this.f79729c));
                break;
            default:
                this.f79728b.f153764h.mo33237a(new VideoFrameProcessingException(this.f79729c));
                break;
        }
    }
}
