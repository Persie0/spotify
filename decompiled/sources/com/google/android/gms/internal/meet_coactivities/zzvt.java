package com.google.android.gms.internal.meet_coactivities;

import p204p.mif1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvt {
    static {
        zzsg zzsgVarZze = zzsh.zze();
        zzsgVarZze.zzb(-315576000000L);
        zzsgVarZze.zza(-999999999);
        zzsg zzsgVarZze2 = zzsh.zze();
        zzsgVarZze2.zzb(315576000000L);
        zzsgVarZze2.zza(999999999);
        zzsg zzsgVarZze3 = zzsh.zze();
        zzsgVarZze3.zzb(0L);
        zzsgVarZze3.zza(0);
    }

    public static zzsh zza(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = mif1.m61874h(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        zzsg zzsgVarZze = zzsh.zze();
        zzsgVarZze.zzb(j);
        zzsgVarZze.zza(i);
        zzsh zzshVar = (zzsh) zzsgVarZze.zzk();
        long jZzd = zzshVar.zzd();
        int iZzc = zzshVar.zzc();
        if (jZzd >= -315576000000L && jZzd <= 315576000000L && iZzc >= -999999999 && iZzc < 1000000000 && ((jZzd >= 0 && iZzc >= 0) || (jZzd <= 0 && iZzc <= 0))) {
            return zzshVar;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + jZzd + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iZzc + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
