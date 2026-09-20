package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzapk extends zzapj {
    private final zzapo zza;
    private final zzaph zzb;
    private boolean zzc;

    public zzapk(zzapo zzapoVar, zzaph zzaphVar) {
        super(null);
        this.zza = zzapoVar;
        this.zzb = zzaphVar;
        if (zzapoVar instanceof zzapn) {
            ((zzapn) zzapoVar).zzd();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zza(zzabe zzabeVar, zzzw zzzwVar) {
        if (zzabeVar.zzj()) {
            this.zza.zza();
        } else {
            this.zza.zzb(new zzabg(zzabeVar, zzzwVar));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zzb(zzzw zzzwVar) {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zzc(Object obj) {
        if (this.zzc && !this.zzb.zzb) {
            throw new zzabg(zzabe.zzj.zze("More than one responses received for unary or client-streaming call"), null);
        }
        this.zzc = true;
        this.zza.zzc(obj);
        zzaph zzaphVar = this.zzb;
        if (zzaphVar.zzb) {
            zzaphVar.zzd(1);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwi
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzapj
    public final void zze() {
        this.zzb.zzd(1);
    }
}
