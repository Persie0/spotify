package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class zzaof extends zzaod {
    private final AtomicIntegerFieldUpdater zza;

    public /* synthetic */ zzaof(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, zzaoe zzaoeVar) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaod
    public final void zza(zzaoi zzaoiVar, int i) {
        this.zza.set(zzaoiVar, 0);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaod
    public final boolean zzb(zzaoi zzaoiVar, int i, int i2) {
        return this.zza.compareAndSet(zzaoiVar, 0, -1);
    }
}
