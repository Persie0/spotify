package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzakf extends zzaft {
    final zzxf zza;
    final zzaac zzb;
    final zzwe zzc;
    final /* synthetic */ zzakh zzd;
    private final long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzakf(zzakh zzakhVar, zzxf zzxfVar, zzaac zzaacVar, zzwe zzweVar) {
        super(zzakp.zzI(zzakhVar.zza, zzweVar), zzakhVar.zza.zzq, zzweVar.zzi());
        this.zzd = zzakhVar;
        this.zza = zzxfVar;
        this.zzb = zzaacVar;
        this.zzc = zzweVar;
        this.zze = System.nanoTime();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaft
    public final void zzk() {
        zzake zzakeVar = new zzake(this);
        zzabm zzabmVar = this.zzd.zza.zzd;
        zzabmVar.zzc(zzakeVar);
        zzabmVar.zzb();
    }

    public final void zzl() {
        zzxf zzxfVarZza = this.zza.zza();
        try {
            zzwj zzwjVarZzh = this.zzd.zzh(this.zzb, this.zzc.zze(zzwr.zza, Long.valueOf(System.nanoTime() - this.zze)));
            this.zza.zze(zzxfVarZza);
            Runnable runnableZzh = zzh(zzwjVarZzh);
            if (runnableZzh != null) {
                zzakh zzakhVar = this.zzd;
                zzakp.zzI(zzakhVar.zza, this.zzc).execute(new zzakd(this, runnableZzh));
            } else {
                zzakh zzakhVar2 = this.zzd;
                zzake zzakeVar = new zzake(this);
                zzabm zzabmVar = zzakhVar2.zza.zzd;
                zzabmVar.zzc(zzakeVar);
                zzabmVar.zzb();
            }
        } catch (Throwable th) {
            this.zza.zze(zzxfVarZza);
            throw th;
        }
    }
}
