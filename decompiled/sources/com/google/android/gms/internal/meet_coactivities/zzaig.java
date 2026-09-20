package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaig implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzaiu zzb;

    public zzaig(zzaiu zzaiuVar, zzabe zzabeVar) {
        this.zza = zzabeVar;
        this.zzb = zzaiuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxa zzxaVarZza = this.zzb.zzu.zza();
        zzxa zzxaVar = zzxa.SHUTDOWN;
        if (zzxaVarZza == zzxaVar) {
            return;
        }
        this.zzb.zzv = this.zza;
        zzaiu zzaiuVar = this.zzb;
        zzald zzaldVar = zzaiuVar.zzt;
        zzafa zzafaVar = zzaiuVar.zzs;
        zzaiuVar.zzt = null;
        this.zzb.zzs = null;
        zzaiu.zzA(this.zzb, zzxaVar);
        this.zzb.zzk.zzd();
        if (this.zzb.zzq.isEmpty()) {
            zzaiu.zzB(this.zzb);
        }
        zzaiu.zzz(this.zzb);
        zzaiu zzaiuVar2 = this.zzb;
        if (zzaiuVar2.zzo != null) {
            zzaiuVar2.zzo.zza();
            zzaiu zzaiuVar3 = this.zzb;
            zzaiuVar3.zzp.zzm(this.zza);
            this.zzb.zzo = null;
            this.zzb.zzp = null;
        }
        if (zzaldVar != null) {
            zzaldVar.zzm(this.zza);
        }
        if (zzafaVar != null) {
            zzafaVar.zzm(this.zza);
        }
    }
}
