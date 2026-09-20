package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzau extends zzsz implements zzug {
    private static final zzau zzb;
    private static volatile zzum zze;
    private String zzf = "";
    private long zzg;

    static {
        zzau zzauVar = new zzau();
        zzb = zzauVar;
        zzsz.zzN(zzau.class, zzauVar);
    }

    private zzau() {
    }

    public static zzat zza() {
        return (zzat) zzb.zzA();
    }

    public static /* synthetic */ void zzc(zzau zzauVar, String str) {
        str.getClass();
        zzauVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzau();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzat(zzeVar);
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
        synchronized (zzau.class) {
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
