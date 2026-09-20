package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
final class zzanb {
    private final AtomicLong zza = new AtomicLong();

    public final long zza(long j) {
        return this.zza.addAndGet(j);
    }
}
