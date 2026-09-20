package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p204p.c95;
import p204p.edb;

/* JADX INFO: loaded from: classes4.dex */
final class zzaem {
    static final Logger zza = Logger.getLogger(zzwh.class.getName());
    private final Object zzb = new Object();
    private final zzyj zzc;

    public zzaem(zzyj zzyjVar, int i, long j, String str) {
        c95.m31848n(str, "description");
        c95.m31848n(zzyjVar, "logId");
        this.zzc = zzyjVar;
        zzxw zzxwVar = new zzxw();
        zzxwVar.zza(str.concat(" created"));
        zzxwVar.zzb(zzxx.CT_INFO);
        zzxwVar.zzd(j);
        zzc(zzxwVar.zze());
    }

    public static void zzb(zzyj zzyjVar, Level level, String str) {
        Logger logger = zza;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, edb.m38566o("[", String.valueOf(zzyjVar), "] ", str));
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final zzyj zza() {
        return this.zzc;
    }

    public final void zzc(zzxz zzxzVar) {
        Level level;
        int iOrdinal = zzxzVar.zzb.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.zzb) {
        }
        zzb(this.zzc, level, zzxzVar.zza);
    }

    public final boolean zzd() {
        synchronized (this.zzb) {
        }
        return false;
    }
}
