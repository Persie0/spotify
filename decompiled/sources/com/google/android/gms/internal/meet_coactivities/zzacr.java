package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
final class zzacr extends zzacv {
    private final boolean zzg;
    private zzabe zzh;
    private zzzw zzi;

    public zzacr(zzacn zzacnVar, zzvz zzvzVar, int i, boolean z) {
        super(zzacnVar, zzvzVar, i, null);
        this.zzg = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.meet_coactivities.zzaew, com.google.android.gms.internal.meet_coactivities.zzaov] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzacv
    public final void zza(zzabe zzabeVar) {
        this.zzf.zzd(zzabeVar, zzaev.PROCESSED, new zzzw());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.meet_coactivities.zzaew, com.google.android.gms.internal.meet_coactivities.zzaov] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzacv
    public final void zzb() {
        this.zze.zzc(this.zzi);
        this.zze.zzm(this.zzh);
        zzl(zzacs.CLOSED);
        this.zzf.zzd(this.zzh, zzaev.PROCESSED, this.zzi);
        this.zza.zzn(this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.meet_coactivities.zzaew, com.google.android.gms.internal.meet_coactivities.zzaov] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzacv
    public final void zzc(int i, Parcel parcel) {
        zzzw zzzwVarZza = zzacy.zza(parcel, this.zzb);
        this.zze.zzb(zzzwVarZza);
        this.zzf.zze(zzzwVarZza);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacv
    public final void zzd(int i, Parcel parcel) {
        this.zzh = zzadq.zza(i, parcel);
        this.zzi = zzacy.zza(parcel, this.zzb);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzacv
    public final boolean zze() {
        return this.zzg;
    }
}
