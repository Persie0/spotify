package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzfw extends zzhv {
    private zzcf zza;
    private zzid zzb;
    private zzjr zzc;
    private zzjv zzd;
    private zzgg zze;
    private zzib zzf;

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhv zza(zzgg zzggVar) {
        if (zzggVar == null) {
            throw new NullPointerException("Null config");
        }
        this.zze = zzggVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhv zzb(zzib zzibVar) {
        this.zzf = zzibVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhv zzc(zzid zzidVar) {
        this.zzb = zzidVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhv zzd(zzcf zzcfVar) {
        this.zza = zzcfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhv zze(zzjr zzjrVar) {
        this.zzc = zzjrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhv zzf(zzjv zzjvVar) {
        this.zzd = zzjvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzhv
    public final zzhw zzg() {
        zzid zzidVar;
        zzjr zzjrVar;
        zzjv zzjvVar;
        zzgg zzggVar;
        zzib zzibVar;
        zzcf zzcfVar = this.zza;
        if (zzcfVar != null && (zzidVar = this.zzb) != null && (zzjrVar = this.zzc) != null && (zzjvVar = this.zzd) != null && (zzggVar = this.zze) != null && (zzibVar = this.zzf) != null) {
            return new zzfy(zzcfVar, zzidVar, zzjrVar, zzjvVar, zzggVar, zzibVar, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" ipcManager");
        }
        if (this.zzb == null) {
            sb.append(" heartbeatSchedule");
        }
        if (this.zzc == null) {
            sb.append(" thinLocalState");
        }
        if (this.zzd == null) {
            sb.append(" updateProcessor");
        }
        if (this.zze == null) {
            sb.append(" config");
        }
        if (this.zzf == null) {
            sb.append(" handler");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
