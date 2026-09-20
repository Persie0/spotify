package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzair implements Runnable {
    final /* synthetic */ zzais zza;

    public zzair(zzais zzaisVar) {
        this.zza = zzaisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzais zzaisVar = this.zza;
        zzaisVar.zzc.zzq.remove(zzaisVar.zza);
        if (this.zza.zzc.zzu.zza() == zzxa.SHUTDOWN && this.zza.zzc.zzq.isEmpty()) {
            zzaiu.zzB(this.zza.zzc);
        }
    }
}
