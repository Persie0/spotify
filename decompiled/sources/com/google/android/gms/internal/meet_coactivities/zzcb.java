package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzcb {
    static final zzcb zza;

    static {
        zzbs zzbsVar = new zzbs();
        zzbsVar.zzc(zzca.DISCONNECTED);
        zzbsVar.zza(null);
        zzbsVar.zzb(null);
        zza = zzbsVar.zzd();
    }

    public static zzcb zzd(zzc zzcVar) {
        zzbs zzbsVar = new zzbs();
        zzbsVar.zzc(zzca.CONNECTING);
        zzbsVar.zzb(null);
        zzbsVar.zza(zzcVar);
        return zzbsVar.zzd();
    }

    public abstract zzc zza();

    public abstract zzl zzb();

    public abstract zzca zzc();
}
