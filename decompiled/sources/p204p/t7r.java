package p204p;

import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class t7r implements q7r {

    /* JADX INFO: renamed from: g */
    public static final fv31 f217874g = fv31.f73628b.m78182S("device_location_permission_requested");

    /* JADX INFO: renamed from: a */
    public final m500 f217875a;

    /* JADX INFO: renamed from: b */
    public final hv31 f217876b;

    /* JADX INFO: renamed from: c */
    public final n7r f217877c;

    /* JADX INFO: renamed from: d */
    public qe70 f217878d;

    /* JADX INFO: renamed from: e */
    public int f217879e;

    /* JADX INFO: renamed from: f */
    public final og0 f217880f;

    public t7r(m500 m500Var, hv31 hv31Var, n7r n7rVar) {
        this.f217875a = m500Var;
        this.f217876b = hv31Var;
        this.f217877c = n7rVar;
        this.f217880f = m500Var.f42745i.m69854h("location_permission_request", new o5m0(false, 3), new uj7(this, 2));
    }

    @Override // p204p.o7r
    /* JADX INFO: renamed from: a */
    public final boolean mo66382a() {
        LocationManager locationManager = (LocationManager) this.f217875a.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    @Override // p204p.o7r
    /* JADX INFO: renamed from: c */
    public final int mo66384c() {
        m500 m500Var = this.f217875a;
        if (lzj.m60353c(m500Var, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return 1;
        }
        if (lzj.m60353c(m500Var, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return 2;
        }
        if (ze0.m95955u0(m500Var, "android.permission.ACCESS_FINE_LOCATION") || ze0.m95955u0(m500Var, "android.permission.ACCESS_COARSE_LOCATION")) {
            return 4;
        }
        return this.f217876b.mo48713h(f217874g, false) ? 5 : 3;
    }

    /* JADX INFO: renamed from: d */
    public final void m80247d(v7r v7rVar) throws Exception {
        this.f217875a.f42745i.m69854h("location_services_settings_request", new o5m0(false, 5), new r7r(0, v7rVar, this)).mo24737a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: renamed from: e */
    public final void m80248e(v7r v7rVar) throws Exception {
        int iMo66384c = mo66384c();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        m500 m500Var = this.f217875a;
        intent.setData(Uri.fromParts("package", m500Var.getPackageName(), null));
        m500Var.f42745i.m69854h("location_settings_request", new o5m0(false, 5), new s7r(this, iMo66384c, v7rVar)).mo24737a(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m80249f(gh00 gh00Var) {
        this.f217879e = mo66384c();
        this.f217878d = (qe70) gh00Var;
        lv31 lv31VarEdit = this.f217876b.edit();
        lv31VarEdit.m60048a(f217874g, true);
        lv31VarEdit.m60054g();
        this.f217880f.mo24737a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
