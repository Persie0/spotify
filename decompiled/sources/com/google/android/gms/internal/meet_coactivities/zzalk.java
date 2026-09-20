package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class zzalk implements zzzd {
    final /* synthetic */ zzalr zza;
    private zzxb zzb = zzxb.zzb(zzxa.IDLE);
    private zzalq zzc;

    public /* synthetic */ zzalk(zzalr zzalrVar, zzalj zzaljVar) {
        this.zza = zzalrVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzd
    public final void zza(zzxb zzxbVar) {
        zzalr.zze.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{zzxbVar, this.zzc.zza});
        this.zzb = zzxbVar;
        try {
            zzalr zzalrVar = this.zza;
            zzalq zzalqVar = (zzalq) zzalrVar.zzg.get(zzalrVar.zzh.zzc());
            if (zzalqVar == null || zzalqVar.zzc != this) {
                return;
            }
            this.zza.zzp(this.zzc);
        } catch (IllegalStateException unused) {
            zzalr.zze.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Health listener received state change after subchannel was removed");
        }
    }
}
