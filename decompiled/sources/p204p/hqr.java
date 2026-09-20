package p204p;

import com.spotify.storage.localstorage.DiskAlmostFullActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class hqr extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DiskAlmostFullActivity f94244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqr(DiskAlmostFullActivity diskAlmostFullActivity, int i) {
        super(0);
        this.f94243a = i;
        this.f94244b = diskAlmostFullActivity;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f94243a) {
            case 0:
                this.f94244b.finish();
                break;
            default:
                this.f94244b.finish();
                break;
        }
        return w2a1.f247311a;
    }
}
