package p204p;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
public final class p7r implements o7r {

    /* JADX INFO: renamed from: a */
    public final Context f174750a;

    public p7r(Context context) {
        this.f174750a = context;
    }

    @Override // p204p.o7r
    /* JADX INFO: renamed from: a */
    public final boolean mo66382a() {
        LocationManager locationManager = (LocationManager) this.f174750a.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    @Override // p204p.o7r
    /* JADX INFO: renamed from: c */
    public final int mo66384c() {
        Context context = this.f174750a;
        boolean z = lzj.m60353c(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = lzj.m60353c(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (z) {
            return 1;
        }
        return z2 ? 2 : 3;
    }
}
