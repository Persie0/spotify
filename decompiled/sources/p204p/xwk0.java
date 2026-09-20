package p204p;

import android.content.DialogInterface;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xwk0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f266700b;

    public /* synthetic */ xwk0(Object obj, int i) {
        this.f266699a = i;
        this.f266700b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f266699a;
        Object obj = this.f266700b;
        switch (i) {
            case 0:
                int i2 = OfflineDeviceLimitReachedActivity.f6081i1;
                ((OfflineDeviceLimitReachedActivity) obj).finish();
                break;
            default:
                ((jld1) obj).cancel();
                break;
        }
    }
}
