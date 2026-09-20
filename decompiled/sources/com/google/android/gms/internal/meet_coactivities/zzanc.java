package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class zzanc {
    final Object zza;
    Future zzb;
    boolean zzc;

    public zzanc(Object obj) {
        this.zza = obj;
    }

    public final Future zza() {
        this.zzc = true;
        return this.zzb;
    }

    public final void zzb(Future future) {
        boolean z;
        synchronized (this.zza) {
            try {
                z = this.zzc;
                if (!z) {
                    this.zzb = future;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
