package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class zzadv implements zzaiy {
    private final AtomicLong zza = new AtomicLong();

    @Override // com.google.android.gms.internal.meet_coactivities.zzaiy
    public final void zza(long j) {
        this.zza.getAndAdd(1L);
    }
}
