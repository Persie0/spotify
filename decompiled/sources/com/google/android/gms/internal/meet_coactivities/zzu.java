package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu extends zzsz implements zzug {
    private static final zzu zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzao zzg;
    private zzi zzh;
    private String zzi = "";
    private String zzj = "";
    private zztd zzk = zzsz.zzF();
    private long zzl;
    private boolean zzm;

    static {
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzsz.zzN(zzu.class, zzuVar);
    }

    private zzu() {
    }

    public static zzs zza() {
        return (zzs) zzb.zzA();
    }

    public static zzu zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzu zzuVar, String str) {
        str.getClass();
        zzuVar.zzi = str;
    }

    public static /* synthetic */ void zze(zzu zzuVar, String str) {
        str.getClass();
        zzuVar.zzj = str;
    }

    public static /* synthetic */ void zzf(zzu zzuVar, Iterable iterable) {
        zztd zztdVar = zzuVar.zzk;
        if (!zztdVar.zzc()) {
            int size = zztdVar.size();
            zzuVar.zzk = zztdVar.zzd(size == 0 ? 10 : size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzuVar.zzk.zzh(((zzt) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzj(zzu zzuVar, zzi zziVar) {
        zziVar.getClass();
        zzuVar.zzh = zziVar;
        zzuVar.zzf |= 2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005,\u0006\u0003\u0007\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzu();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzs(zzeVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzum zzumVar = zze;
        if (zzumVar != null) {
            return zzumVar;
        }
        synchronized (zzu.class) {
            try {
                zzsuVar = zze;
                if (zzsuVar == null) {
                    zzsuVar = new zzsu(zzb);
                    zze = zzsuVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsuVar;
    }
}
