package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class zzajw implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzajy zzb;

    public zzajw(zzajy zzajyVar, zzabe zzabeVar) {
        this.zza = zzabeVar;
        this.zzb = zzajyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger = zzakp.zza;
        Level level = Level.WARNING;
        zzajy zzajyVar = this.zzb;
        zzyj zzyjVarZzc = zzajyVar.zzc.zzc();
        zzabe zzabeVar = this.zza;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{zzyjVarZzc, zzabeVar});
        zzajyVar.zzc.zzW.zzf();
        zzakp zzakpVar = zzajyVar.zzc;
        if (zzakpVar.zzah != 3) {
            zzakpVar.zzU.zzb(3, "Failed to resolve name: {0}", zzabeVar);
            zzajyVar.zzc.zzah = 3;
        }
        zzajv zzajvVar = zzajyVar.zza;
        if (zzajvVar != zzajyVar.zzc.zzE) {
            return;
        }
        zzajvVar.zza.zza().zzb(zzabeVar);
    }
}
