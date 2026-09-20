package com.google.android.gms.internal.meet_coactivities;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class zzip {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final Set zzb = new HashSet();

    public final void zza() {
        if (this.zza.getAndSet(false)) {
            synchronized (this) {
                this.zzb.forEach(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzio
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((Runnable) obj).run();
                    }
                });
            }
        }
    }

    public final synchronized void zzb(Runnable runnable) {
        this.zzb.add(runnable);
    }

    public final void zzc() {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
