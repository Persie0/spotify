package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class yrg1 extends li10 {
    @Override // p204p.dz8, p204p.o35
    /* JADX INFO: renamed from: d */
    public final int mo24793d() {
        return 12451000;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: e */
    public final IInterface mo24794e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof wdf1 ? (wdf1) iInterfaceQueryLocalInterface : new wdf1(iBinder, "com.google.android.gms.cast.internal.ICastService", 1);
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: h */
    public final gey[] mo24795h() {
        return q0f1.f183996Y;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: r */
    public final String mo24797r() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: s */
    public final String mo24798s() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
