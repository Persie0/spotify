package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzalq {
    private final zzzb zza;
    private zzxa zzb;
    private final zzalk zzc;
    private boolean zzd = false;

    public zzalq(zzzb zzzbVar, zzxa zzxaVar, zzalk zzalkVar) {
        this.zza = zzzbVar;
        this.zzb = zzxaVar;
        this.zzc = zzalkVar;
    }

    public static /* bridge */ /* synthetic */ zzxa zzb(zzalq zzalqVar) {
        return zzalqVar.zzc.zzb.zza();
    }

    public static /* bridge */ /* synthetic */ void zzg(zzalq zzalqVar, zzxa zzxaVar) {
        boolean z;
        zzalqVar.zzb = zzxaVar;
        if (zzxaVar == zzxa.READY || zzxaVar == zzxa.TRANSIENT_FAILURE) {
            z = true;
        } else if (zzxaVar != zzxa.IDLE) {
            return;
        } else {
            z = false;
        }
        zzalqVar.zzd = z;
    }

    public final zzxa zzc() {
        return this.zzb;
    }

    public final zzzb zze() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzd;
    }
}
