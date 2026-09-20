package com.google.android.gms.internal.meet_coactivities;

import java.util.function.Supplier;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
class zzhu implements zzhe {
    private static final zzkz zze = zzkz.zzj("com/google/android/meet/addons/internal/CoXClientImpl");
    protected final zzcf zza;
    protected final zzid zzb;
    protected final zzjr zzc;
    protected final zzjv zzd;
    private volatile boolean zzf = true;

    public zzhu(zzhw zzhwVar) {
        this.zza = zzhwVar.zza();
        this.zzb = zzhwVar.zzd();
        this.zzc = zzhwVar.zze();
        this.zzd = zzhwVar.zzf();
        zzhwVar.zzb();
        zzhwVar.zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhe
    public final void zzc() {
        this.zzf = false;
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhe
    public final void zzd(zzpy zzpyVar) {
        if (!this.zzf) {
            ((zzkv) zze.zzd().zzh("com/google/android/meet/addons/internal/CoXClientImpl", "handleStateUpdate", 53, "CoXClientImpl.java")).zzo("Received incoming update after session ended.");
            return;
        }
        try {
            this.zzd.zzb(zzpyVar);
        } catch (RuntimeException e) {
            zzia.zze(e);
        }
    }

    public final void zze(final Supplier supplier) {
        zzf();
        zzia.zzd(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzht
            @Override // java.lang.Runnable
            public final void run() {
                zzju zzjuVar = (zzju) supplier.get();
                if (zzjuVar.zzb() == 2) {
                    zzhu zzhuVar = this.zza;
                    zzhuVar.zza.zzg(zzjuVar.zza());
                }
            }
        }, "Unexpected error when trying to broadcast an update to peers.");
    }

    public final void zzf() {
        c95.m31856v(this.zzf, "Illegal call after meeting ended.");
    }
}
