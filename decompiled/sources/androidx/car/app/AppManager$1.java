package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.LocationManager;
import androidx.car.app.utils.AbstractC0042f;
import java.util.Objects;
import p204p.nc5;
import p204p.oc80;
import p204p.xiy0;

/* JADX INFO: loaded from: classes3.dex */
class AppManager$1 extends IAppManager.Stub {
    final /* synthetic */ C0014b this$0;
    final /* synthetic */ C0023j val$carContext;

    public AppManager$1(C0014b c0014b, C0023j c0023j) {
        this.this$0 = c0014b;
        this.val$carContext = c0023j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$onBackPressed$0(C0023j c0023j) {
        c0023j.f432a.m28388d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$startLocationUpdates$1(C0023j c0023j) {
        C0014b c0014b = (C0014b) c0023j.m214d(C0014b.class);
        ((LocationManager) c0014b.f404a.getSystemService("location")).removeUpdates(c0014b.f408e);
        ((LocationManager) c0014b.f404a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, c0014b.f408e, c0014b.f409f.getLooper());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$stopLocationUpdates$2(C0023j c0023j) {
        C0014b c0014b = (C0014b) c0023j.m214d(C0014b.class);
        ((LocationManager) c0014b.f404a.getSystemService("location")).removeUpdates(c0014b.f408e);
        return null;
    }

    @Override // androidx.car.app.IAppManager
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IAppManager
    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        oc80 oc80Var = this.this$0.f407d;
        xiy0 xiy0Var = (xiy0) this.val$carContext.m214d(xiy0.class);
        Objects.requireNonNull(xiy0Var);
        AbstractC0042f.m246c(oc80Var, iOnDoneCallback, "getTemplate", new nc5(xiy0Var, 0));
    }

    @Override // androidx.car.app.IAppManager
    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.this$0.f407d, iOnDoneCallback, "onBackPressed", new C0013a(this.val$carContext, 0));
    }

    @Override // androidx.car.app.IAppManager
    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        PackageManager packageManager = this.val$carContext.getPackageManager();
        boolean z = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", this.val$carContext.getPackageName()) == -1;
        boolean z2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName()) == -1;
        if (z && z2) {
            AbstractC0042f.m248e(iOnDoneCallback, new SecurityException("Location permission(s) not granted."), "startLocationUpdates");
        }
        AbstractC0042f.m246c(this.this$0.f407d, iOnDoneCallback, "startLocationUpdates", new C0013a(this.val$carContext, 2));
    }

    @Override // androidx.car.app.IAppManager
    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.this$0.f407d, iOnDoneCallback, "stopLocationUpdates", new C0013a(this.val$carContext, 1));
    }
}
