package p204p;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class bha0 implements LocationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cha0 f27127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f27128b;

    public bha0(hqb hqbVar, cha0 cha0Var) {
        this.f27127a = cha0Var;
        this.f27128b = hqbVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.f27127a.m32755e().removeUpdates(this);
        hqb hqbVar = this.f27128b;
        if (hqbVar.isActive()) {
            hqbVar.resumeWith(new g7r(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime()));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.f27127a.m32755e().removeUpdates(this);
        hqb hqbVar = this.f27128b;
        if (hqbVar.isActive()) {
            hqbVar.resumeWith(null);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
