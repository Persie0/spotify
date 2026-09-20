package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p204p.a890;
import p204p.kj90;
import p204p.qyh0;
import p204p.ryh0;
import p204p.syh0;

/* JADX INFO: loaded from: classes4.dex */
final class zzid {
    private final ScheduledFuture zza;

    private zzid(a890 a890Var) {
        this.zza = a890Var;
    }

    public static zzid zza(zzgg zzggVar, final Runnable runnable, kj90 kj90Var) {
        if (zzggVar.zzd()) {
            return new zzid(null);
        }
        Runnable runnable2 = new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzic
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    zzia.zze(e);
                }
            }
        };
        long millis = zzggVar.zza().toMillis();
        long millis2 = zzggVar.zza().toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        syh0 syh0Var = (syh0) kj90Var;
        syh0Var.getClass();
        ryh0 ryh0Var = new ryh0(runnable2);
        return new zzid(new qyh0(ryh0Var, syh0Var.f215252b.scheduleAtFixedRate(ryh0Var, millis, millis2, timeUnit)));
    }

    public final void zzb() {
        ScheduledFuture scheduledFuture = this.zza;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
