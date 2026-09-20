package com.google.android.gms.internal.meet_coactivities;

import android.content.ComponentName;
import android.content.Intent;
import java.net.SocketAddress;
import p204p.c95;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabo extends SocketAddress {
    private final Intent zza;

    public zzabo(Intent intent) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        c95.m31844j(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.zza = intent;
    }

    public static zzabo zzb(ComponentName componentName) {
        return new zzabo(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzabo) {
            return this.zza.filterEquals(((zzabo) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.zza;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return s571.m77251j("AndroidComponentAddress[", String.valueOf(this.zza), "]");
    }

    public final Intent zza() {
        return this.zza.cloneFilter();
    }

    public final String zzc() {
        return this.zza.getPackage() != null ? this.zza.getPackage() : this.zza.getComponent().getPackageName();
    }
}
