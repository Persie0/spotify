package androidx.car.app;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.List;
import p204p.lbc0;
import p204p.lc5;
import p204p.oc80;

/* JADX INFO: renamed from: androidx.car.app.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0014b implements lbc0 {

    /* JADX INFO: renamed from: a */
    public final C0023j f404a;

    /* JADX INFO: renamed from: b */
    public final IAppManager.Stub f405b;

    /* JADX INFO: renamed from: c */
    public final C0024k f406c;

    /* JADX INFO: renamed from: d */
    public final oc80 f407d;

    /* JADX INFO: renamed from: f */
    public final HandlerThread f409f = new HandlerThread("LocationUpdateThread");

    /* JADX INFO: renamed from: e */
    public final lc5 f408e = new LocationListener() { // from class: p.lc5
        @Override // android.location.LocationListener
        public final void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            this.f131827a.f406c.m216a("app", "sendLocation", new oz0(location, 29));
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [p.lc5] */
    public C0014b(C0023j c0023j, C0024k c0024k, oc80 oc80Var) {
        this.f404a = c0023j;
        this.f406c = c0024k;
        this.f407d = oc80Var;
        this.f405b = new AppManager$1(this, c0023j);
    }
}
