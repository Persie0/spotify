package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzajk extends zzxq {
    private final zzyf zza;
    private final zzwf zzb;
    private final Executor zzc;
    private final zzaac zzd;
    private final zzxf zze;
    private zzwe zzf;
    private zzwj zzg;

    public zzajk(zzyf zzyfVar, zzwf zzwfVar, Executor executor, zzaac zzaacVar, zzwe zzweVar) {
        this.zza = zzyfVar;
        this.zzb = zzwfVar;
        this.zzd = zzaacVar;
        executor = zzweVar.zzn() != null ? zzweVar.zzn() : executor;
        this.zzc = executor;
        this.zzf = zzweVar.zzb(executor);
        this.zze = zzxf.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaas, com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zza(String str, Throwable th) {
        zzwj zzwjVar = this.zzg;
        if (zzwjVar != null) {
            zzwjVar.zza(str, th);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzxq, com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zze(zzwi zzwiVar, zzzw zzzwVar) {
        zzye zzyeVarZza = this.zza.zza(new zzalz(this.zzd, zzzwVar, this.zzf, zzakp.zzh));
        zzabe zzabeVarZzb = zzyeVarZza.zzb();
        if (!zzabeVarZzb.zzj()) {
            this.zzc.execute(new zzajj(this, zzwiVar, zzahx.zza(zzabeVarZzb)));
            this.zzg = zzakp.zzi;
        } else {
            zzaky zzakyVarZzb = ((zzalb) zzyeVarZza.zzc()).zzb(this.zzd);
            if (zzakyVarZzb != null) {
                this.zzf = this.zzf.zze(zzaky.zza, zzakyVarZzb);
            }
            zzwj zzwjVarZza = this.zzb.zza(this.zzd, this.zzf);
            this.zzg = zzwjVarZza;
            zzwjVarZza.zze(zzwiVar, zzzwVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzxq, com.google.android.gms.internal.meet_coactivities.zzaas
    public final zzwj zzf() {
        return this.zzg;
    }
}
