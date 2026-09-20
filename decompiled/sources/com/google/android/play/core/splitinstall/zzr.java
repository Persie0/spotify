package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzr {
    private static final AtomicReference zza = new AtomicReference(null);

    public static zzq zza() {
        return (zzq) zza.get();
    }

    public static void zzb(zzq zzqVar) {
        AtomicReference atomicReference = zza;
        while (!atomicReference.compareAndSet(null, zzqVar)) {
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }
}
