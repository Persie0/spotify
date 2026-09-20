package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zzly {
    private static final zzln zza = new zzlw();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicInteger zzc = new AtomicInteger();

    private zzly() {
    }

    public static int zza(zzlz zzlzVar, zzll zzllVar, zzms zzmsVar) {
        zzly zzlyVar = (zzly) zza.zzb(zzllVar, zzmsVar);
        int iIncrementAndGet = zzlyVar.zzc.incrementAndGet();
        if (zzlzVar == zzlz.zzc || !zzlyVar.zzb.compareAndSet(false, true)) {
            return -1;
        }
        try {
            zzlzVar.zzb();
            zzlyVar.zzb.set(false);
            zzlyVar.zzc.addAndGet(-iIncrementAndGet);
            return iIncrementAndGet - 1;
        } catch (Throwable th) {
            zzlyVar.zzb.set(false);
            throw th;
        }
    }

    public /* synthetic */ zzly(zzlx zzlxVar) {
    }
}
