package com.google.android.gms.internal.meet_coactivities;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoq {
    private static final zzaoq zza = new zzaoq(new zzaom());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private ScheduledExecutorService zzc;

    public zzaoq(zzaom zzaomVar) {
    }

    public static Object zza(zzaop zzaopVar) {
        return zza.zzb(zzaopVar);
    }

    public static Object zzc(zzaop zzaopVar, Object obj) {
        zza.zzd(zzaopVar, obj);
        return null;
    }

    public final synchronized Object zzb(zzaop zzaopVar) {
        zzaoo zzaooVar;
        try {
            zzaooVar = (zzaoo) this.zzb.get(zzaopVar);
            if (zzaooVar == null) {
                zzaooVar = new zzaoo(zzaopVar.zza());
                this.zzb.put(zzaopVar, zzaooVar);
            }
            ScheduledFuture scheduledFuture = zzaooVar.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzaooVar.zzc = null;
            }
            zzaooVar.zzb++;
        } catch (Throwable th) {
            throw th;
        }
        return zzaooVar.zza;
    }

    public final synchronized Object zzd(zzaop zzaopVar, Object obj) {
        try {
            zzaoo zzaooVar = (zzaoo) this.zzb.get(zzaopVar);
            if (zzaooVar == null) {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(zzaopVar)));
            }
            c95.m31844j(obj == zzaooVar.zza, "Releasing the wrong instance");
            c95.m31856v(zzaooVar.zzb > 0, "Refcount has already reached zero");
            int i = zzaooVar.zzb - 1;
            zzaooVar.zzb = i;
            if (i == 0) {
                c95.m31856v(zzaooVar.zzc == null, "Destroy task already scheduled");
                if (this.zzc == null) {
                    this.zzc = Executors.newSingleThreadScheduledExecutor(zzahx.zzd("grpc-shared-destroyer-%d", true));
                }
                zzaooVar.zzc = this.zzc.schedule(new zzaix(new zzaon(this, zzaooVar, zzaopVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}
