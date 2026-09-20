package com.google.android.gms.internal.meet_coactivities;

import java.text.MessageFormat;
import java.util.logging.Level;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzael extends zzwh {
    private final zzaem zza;

    public zzael(zzaem zzaemVar, zzaox zzaoxVar) {
        c95.m31848n(zzaemVar, "tracer");
        this.zza = zzaemVar;
        c95.m31848n(zzaoxVar, "time");
    }

    public static void zzc(zzyj zzyjVar, int i, String str) {
        Level levelZze = zze(i);
        if (zzaem.zza.isLoggable(levelZze)) {
            zzaem.zzb(zzyjVar, levelZze, str);
        }
    }

    public static void zzd(zzyj zzyjVar, int i, String str, Object... objArr) {
        Level levelZze = zze(2);
        if (zzaem.zza.isLoggable(levelZze)) {
            zzaem.zzb(zzyjVar, levelZze, MessageFormat.format(str, objArr));
        }
    }

    private static Level zze(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    private final boolean zzf(int i) {
        if (i == 1) {
            return false;
        }
        this.zza.zzd();
        return false;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwh
    public final void zza(int i, String str) {
        zzc(this.zza.zza(), i, str);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwh
    public final void zzb(int i, String str, Object... objArr) {
        Level levelZze = zze(i);
        zzf(i);
        zza(i, zzaem.zza.isLoggable(levelZze) ? MessageFormat.format(str, objArr) : null);
    }
}
