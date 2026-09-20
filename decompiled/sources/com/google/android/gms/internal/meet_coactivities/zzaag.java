package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p204p.c95;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaag {
    private final int zza;
    private final zzaau zzb;
    private final zzabm zzc;
    private final zzaam zzd;
    private final ScheduledExecutorService zze;
    private final zzwh zzf;
    private final Executor zzg;

    public /* synthetic */ zzaag(Integer num, zzaau zzaauVar, zzabm zzabmVar, zzaam zzaamVar, ScheduledExecutorService scheduledExecutorService, zzwh zzwhVar, Executor executor, String str, zzaaf zzaafVar) {
        c95.m31848n(num, "defaultPort not set");
        this.zza = num.intValue();
        c95.m31848n(zzaauVar, "proxyDetector not set");
        this.zzb = zzaauVar;
        c95.m31848n(zzabmVar, "syncContext not set");
        this.zzc = zzabmVar;
        c95.m31848n(zzaamVar, "serviceConfigParser not set");
        this.zzd = zzaamVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzwhVar;
        this.zzg = executor;
    }

    public static zzaae zzb() {
        return new zzaae();
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60521u(this.zza, "defaultPort");
        m12VarM85614C.m60523w(this.zzb, "proxyDetector");
        m12VarM85614C.m60523w(this.zzc, "syncContext");
        m12VarM85614C.m60523w(this.zzd, "serviceConfigParser");
        m12VarM85614C.m60523w(this.zze, "scheduledExecutorService");
        m12VarM85614C.m60523w(this.zzf, "channelLogger");
        m12VarM85614C.m60523w(this.zzg, "executor");
        m12VarM85614C.m60523w(null, "overrideAuthority");
        return m12VarM85614C.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzaam zzc() {
        return this.zzd;
    }

    public final zzaau zzd() {
        return this.zzb;
    }

    public final zzabm zze() {
        return this.zzc;
    }

    public final Executor zzf() {
        return this.zzg;
    }

    public final ScheduledExecutorService zzg() {
        ScheduledExecutorService scheduledExecutorService = this.zze;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }
}
