package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzbs extends zzbz {
    private zzca zza;
    private zzl zzb;
    private zzc zzc;

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzbz zza(zzc zzcVar) {
        this.zzc = zzcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzbz zzb(zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzbz zzc(zzca zzcaVar) {
        if (zzcaVar == null) {
            throw new NullPointerException("Null state");
        }
        this.zza = zzcaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzbz
    public final zzcb zzd() {
        if (this.zza != null) {
            return new zzbt(this.zza, this.zzb, this.zzc, null);
        }
        throw new IllegalStateException("Missing required properties: state");
    }
}
