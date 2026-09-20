package com.google.android.gms.internal.meet_coactivities;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyl {
    static {
        Charset.forName("US-ASCII");
        zzzp zzzpVar = zzzw.zza;
    }

    public static int zza(zzzw zzzwVar) {
        return zzzwVar.zza();
    }

    public static zzzr zzb(String str, zzyk zzykVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return new zzzu(str, z, zzykVar, null);
    }

    public static zzzw zzc(int i, Object[] objArr) {
        return new zzzw(i, objArr);
    }

    public static Object[] zzd(zzzw zzzwVar) {
        return zzzwVar.zzg();
    }
}
