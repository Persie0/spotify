package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzany extends zzaaj {
    final /* synthetic */ zzanz zza;
    private final zzaaj zzb;

    public zzany(zzanz zzanzVar, zzaaj zzaajVar) {
        this.zza = zzanzVar;
        this.zzb = zzaajVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaaj
    public final void zza(zzabe zzabeVar) {
        this.zzb.zza(zzabeVar);
        zzabm zzabmVar = this.zza.zzc;
        zzabmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzanx
            @Override // java.lang.Runnable
            public final void run() {
                zzanz zzanzVar = this.zza.zza;
                zzanzVar.zzb.zzc(new zzanv(zzanzVar));
            }
        });
        zzabmVar.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaaj
    public final void zzb(zzaal zzaalVar) {
        zzvz zzvzVarZza = zzaalVar.zza();
        zzvx zzvxVar = zzanz.zza;
        if (zzvzVarZza.zzc(zzvxVar) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        zzaaj zzaajVar = this.zzb;
        zzaak zzaakVarZzd = zzaalVar.zzd();
        zzvw zzvwVarZzb = zzaalVar.zza().zzb();
        zzvwVarZzb.zzb(zzvxVar, new zzanw(this.zza));
        zzaakVarZzd.zzb(zzvwVarZzb.zzc());
        zzaajVar.zzb(zzaakVarZzd.zzd());
    }
}
