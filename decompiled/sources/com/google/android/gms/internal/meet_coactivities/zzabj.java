package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzabj implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    public zzabj(Runnable runnable) {
        c95.m31848n(runnable, "task");
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
