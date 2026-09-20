package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p204p.lzj;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacf implements zzaez {
    final Context zza;
    final zzabu zzb;
    final Executor zzc;
    final zzalf zzd;
    final zzalf zze;
    final zzaby zzf;
    final zzabs zzg;
    final zzabv zzh;
    ScheduledExecutorService zzi;
    Executor zzj;
    final zzada zzk;
    private boolean zzl;

    public zzacf(zzacd zzacdVar, zzace zzaceVar) {
        Context context = zzacdVar.zza;
        context.getClass();
        this.zza = context;
        zzabu zzabuVar = zzacdVar.zzc;
        zzabuVar.getClass();
        this.zzb = zzabuVar;
        this.zzc = lzj.m60328F(context);
        zzalf zzalfVar = zzacdVar.zzd;
        zzalfVar.getClass();
        this.zzd = zzalfVar;
        zzalf zzalfVar2 = zzacdVar.zzb;
        zzalfVar2.getClass();
        this.zze = zzalfVar2;
        zzaby zzabyVar = zzacdVar.zze;
        zzabyVar.getClass();
        this.zzf = zzabyVar;
        zzabs zzabsVar = zzacdVar.zzf;
        zzabsVar.getClass();
        this.zzg = zzabsVar;
        zzabv zzabvVar = zzacdVar.zzg;
        zzabvVar.getClass();
        this.zzh = zzabvVar;
        zzada zzadaVar = zzacdVar.zzh;
        zzadaVar.getClass();
        this.zzk = zzadaVar;
        this.zzi = (ScheduledExecutorService) zzalfVar.zza();
        this.zzj = (Executor) zzalfVar2.zza();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaez, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zzl = true;
        this.zzd.zzb(this.zzi);
        this.zzi = null;
        this.zze.zzb(this.zzj);
        this.zzj = null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaez
    public final /* bridge */ /* synthetic */ zzafa zza(SocketAddress socketAddress, zzaey zzaeyVar, zzwh zzwhVar) {
        if (this.zzl) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new zzacl(this, (zzabo) socketAddress, zzaeyVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaez
    public final ScheduledExecutorService zzb() {
        return this.zzi;
    }
}
