package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacd {
    Context zza;
    zzalf zzb;
    zzabu zzc = zzabu.zza();
    final zzalf zzd = zzaor.zzc(zzahx.zzj);
    zzaby zze = zzabx.zzb();
    zzabs zzf = zzabs.zza;
    final zzabv zzg = zzabv.zza;
    final zzada zzh = zzade.zzb;

    public final zzacd zza(zzabs zzabsVar) {
        c95.m31848n(zzabsVar, "bindServiceFlags");
        this.zzf = zzabsVar;
        return this;
    }

    public final zzacd zzb(zzabu zzabuVar) {
        c95.m31848n(zzabuVar, "channelCredentials");
        this.zzc = zzabuVar;
        return this;
    }

    public final zzacd zzc(zzalf zzalfVar) {
        c95.m31848n(zzalfVar, "offloadExecutorPool");
        this.zzb = zzalfVar;
        return this;
    }

    public final zzacd zzd(zzaby zzabyVar) {
        c95.m31848n(zzabyVar, "securityPolicy");
        this.zze = zzabyVar;
        return this;
    }

    public final zzacd zze(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final /* synthetic */ zzaez zzf() {
        return new zzacf(this, null);
    }
}
