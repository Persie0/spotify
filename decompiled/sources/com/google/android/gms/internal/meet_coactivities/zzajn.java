package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzajn implements Executor {
    private final zzalf zza;
    private Executor zzb;

    public zzajn(zzalf zzalfVar) {
        c95.m31848n(zzalfVar, "executorPool");
        this.zza = zzalfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zza().execute(runnable);
    }

    public final synchronized Executor zza() {
        try {
            if (this.zzb == null) {
                Executor executor = (Executor) this.zza.zza();
                c95.m31849o("%s.getObject()", executor, this.zzb);
                this.zzb = executor;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }

    public final synchronized void zzb() {
        Executor executor = this.zzb;
        if (executor != null) {
            this.zza.zzb(executor);
            this.zzb = null;
        }
    }
}
