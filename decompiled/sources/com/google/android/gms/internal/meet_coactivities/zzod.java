package com.google.android.gms.internal.meet_coactivities;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
final class zzod extends zznv {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final AtomicReference zzd;
    private static final AtomicLong zze;
    private static final ConcurrentLinkedQueue zzf;
    private volatile zzmo zzg;

    static {
        String str = Build.FINGERPRINT;
        zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        zzc = "eng".equals(str3) || "userdebug".equals(str3);
        zzd = new AtomicReference();
        zze = new AtomicLong();
        zzf = new ConcurrentLinkedQueue();
    }

    private zzod(String str) {
        super(str);
        if (zza || zzb) {
            this.zzg = new zznw().zza(zza());
        } else if (zzc) {
            this.zzg = zzoj.zzf().zzb(false).zza(zza());
        } else {
            this.zzg = null;
        }
    }

    public static zzmo zze(String str) {
        char cCharAt;
        AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((zznx) atomicReference.get()).zza(str);
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '$') {
                str = str.replace('$', '.');
                break;
            }
        } while (cCharAt != '.');
        zzod zzodVar = new zzod(str);
        zzob.zza.offer(zzodVar);
        if (zzd.get() != null) {
            while (true) {
                zzod zzodVar2 = (zzod) zzob.zza.poll();
                if (zzodVar2 == null) {
                    break;
                }
                zzodVar2.zzg = ((zznx) zzd.get()).zza(zzodVar2.zza());
            }
            zzf();
        }
        return zzodVar;
    }

    private static void zzf() {
        while (true) {
            zzoc zzocVar = (zzoc) zzf.poll();
            if (zzocVar == null) {
                return;
            }
            zze.getAndDecrement();
            zzmo zzmoVarZzb = zzocVar.zzb();
            zzmm zzmmVarZza = zzocVar.zza();
            if (zzmmVarZza.zzv() || zzmoVarZzb.zzd(zzmmVarZza.zzl())) {
                zzmoVarZzb.zzc(zzmmVarZza);
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznv, com.google.android.gms.internal.meet_coactivities.zzmo
    public final void zzb(RuntimeException runtimeException, zzmm zzmmVar) {
        if (this.zzg != null) {
            this.zzg.zzb(runtimeException, zzmmVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzmo
    @SuppressLint({"LongLogTag"})
    public final void zzc(zzmm zzmmVar) {
        if (this.zzg != null) {
            this.zzg.zzc(zzmmVar);
            return;
        }
        if (zze.incrementAndGet() > 20) {
            zzf.poll();
        }
        zzf.offer(new zzoc(this, zzmmVar));
        if (this.zzg != null) {
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzmo
    public final boolean zzd(Level level) {
        return this.zzg == null || this.zzg.zzd(level);
    }
}
