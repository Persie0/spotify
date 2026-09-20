package p204p;

import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yj4 {
    /* JADX INFO: renamed from: a */
    public static final zpr m93843a() {
        int i = Build.VERSION.SDK_INT;
        return (i >= 37 || (i >= 33 && SdkExtensions.getExtensionVersion(33) >= 22)) ? ypr.f275012a : xpr.f264709a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m93844b(NsdManager nsdManager, uj4 uj4Var) {
        nsdManager.discoverServices(sj4.m78271a().setFlags(1L).build(), ekr.f60525c, uj4Var);
    }
}
