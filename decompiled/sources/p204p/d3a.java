package p204p;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class d3a extends AdvertiseCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cn8 f44827a;

    public d3a(cn8 cn8Var) {
        this.f44827a = cn8Var;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int i) {
        Object e1aVar;
        super.onStartFailure(i);
        if (i == 1) {
            e1aVar = new e1a("dataTooLarge");
        } else if (i == 2) {
            e1aVar = new e1a("tooManyAdvertisers");
        } else if (i == 3) {
            e1aVar = b1a.f22270a;
        } else if (i != 4) {
            e1aVar = i != 5 ? new e1a(s571.m77246e(i, "oemAdvertiseError: ")) : new e1a("featureUnsupported");
        } else {
            e1aVar = new e1a("internalError");
        }
        this.f44827a.invoke(e1aVar);
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        super.onStartSuccess(advertiseSettings);
        this.f44827a.invoke(h1a.f86543a);
    }
}
