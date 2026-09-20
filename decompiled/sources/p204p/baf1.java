package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class baf1 extends li10 {
    @Override // p204p.dz8
    /* JADX INFO: renamed from: G */
    public final boolean mo28583G() {
        return true;
    }

    @Override // p204p.dz8, p204p.o35
    /* JADX INFO: renamed from: d */
    public final int mo24793d() {
        return 19390000;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: e */
    public final IInterface mo24794e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService");
        return iInterfaceQueryLocalInterface instanceof acf1 ? (acf1) iInterfaceQueryLocalInterface : new acf1(iBinder, "com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService", 1);
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: h */
    public final gey[] mo24795h() {
        return q0f1.f183996Y;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: r */
    public final String mo24797r() {
        return "com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService";
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: s */
    public final String mo24798s() {
        return "com.google.android.gms.cast.devicesuggestions.api.DeviceSuggestionsApiService.START";
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: v */
    public final boolean mo24799v() {
        return true;
    }
}
