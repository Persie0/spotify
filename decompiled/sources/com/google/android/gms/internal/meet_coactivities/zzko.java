package com.google.android.gms.internal.meet_coactivities;

import com.google.android.gms.internal.meet_coactivities.zzlq;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p204p.klh;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzko<API extends zzlq<API>> {
    private final zzmo zza;

    public zzko(zzmo zzmoVar) {
        this.zza = zzmoVar;
    }

    private static void zzi(String str, zzmm zzmmVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(zzmmVar.zze()))));
        sb.append(": logging error [");
        zzmn.zza(1, zzmmVar.zzf(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract zzlq zza(Level level);

    public final zzlq zzb() {
        return zza(Level.FINER);
    }

    public final zzlq zzc() {
        return zza(Level.INFO);
    }

    public final zzlq zzd() {
        return zza(Level.SEVERE);
    }

    public final zzlq zze() {
        return zza(Level.WARNING);
    }

    public final String zzf() {
        return this.zza.zza();
    }

    public final void zzg(zzmm zzmmVar) {
        try {
            zzpl zzplVarZzc = zzpl.zzc();
            try {
                if (zzplVarZzc.zzb() <= 100) {
                    this.zza.zzc(zzmmVar);
                } else {
                    zzi("unbounded recursion in log statement", zzmmVar);
                }
                zzplVarZzc.close();
            } catch (Throwable th) {
                if (zzplVarZzc != null) {
                    try {
                        zzplVarZzc.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            try {
                this.zza.zzb(e, zzmmVar);
            } catch (zzmp e2) {
                throw e2;
            } catch (RuntimeException e3) {
                zzi(klh.m56834f(e3.getClass().getName(), ": ", e3.getMessage()), zzmmVar);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final boolean zzh(Level level) {
        return this.zza.zzd(level);
    }
}
