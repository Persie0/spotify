package p204p;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes3.dex */
public final class bo70 implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f29028a;

    public bo70(hqb hqbVar) {
        this.f29028a = hqbVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        this.f29028a.resumeWith(imageReader.acquireLatestImage());
    }
}
