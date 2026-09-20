package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzajt implements Runnable {
    final /* synthetic */ zzzc zza;
    final /* synthetic */ zzxa zzb;
    final /* synthetic */ zzajv zzc;

    public zzajt(zzajv zzajvVar, zzzc zzzcVar, zzxa zzxaVar) {
        this.zza = zzzcVar;
        this.zzb = zzxaVar;
        this.zzc = zzajvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzajv zzajvVar = this.zzc;
        zzakp zzakpVar = zzajvVar.zzb;
        if (zzajvVar != zzakpVar.zzE) {
            return;
        }
        zzakpVar.zzag(this.zza);
        zzxa zzxaVar = this.zzb;
        if (zzxaVar != zzxa.SHUTDOWN) {
            this.zzc.zzb.zzU.zzb(2, "Entering {0} state with picker: {1}", zzxaVar, this.zza);
            zzajv zzajvVar2 = this.zzc;
            zzajvVar2.zzb.zzz.zza(this.zzb);
        }
    }
}
