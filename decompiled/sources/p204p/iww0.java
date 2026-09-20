package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public final class iww0 implements Parcelable {
    public static final Parcelable.Creator<iww0> CREATOR = new b8w0(28);

    /* JADX INFO: renamed from: a */
    public final int f106524a;

    public iww0(int i) {
        this.f106524a = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX INFO: renamed from: c */
    public final int m51849c(Context context) {
        Intent intentRegisterReceiver;
        int intExtra;
        Network activeNetwork;
        int i = this.f106524a;
        int i2 = 0;
        if ((i & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
                i2 = i & 3;
            } else {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                        i2 = i & 3;
                    } else if ((i & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                        i2 = 2;
                    }
                } catch (SecurityException unused) {
                }
            }
        }
        if ((i & 8) != 0 && ((intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            if (!((PowerManager) systemService2).isDeviceIdleMode()) {
                i2 |= 4;
            }
        }
        return ((i & 16) == 0 || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i2 : i2 | 16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iww0.class == obj.getClass()) {
            if (this.f106524a == ((iww0) obj).f106524a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f106524a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106524a);
    }
}
