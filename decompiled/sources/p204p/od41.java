package p204p;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class od41 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f164095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od41(boolean z) {
        super(1);
        this.f164095a = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!this.f164095a || ((MediaCodecInfo) obj).isHardwareAccelerated());
    }
}
