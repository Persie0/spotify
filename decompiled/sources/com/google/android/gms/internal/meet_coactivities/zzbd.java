package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd extends zzsz implements zzug {
    private static final zzbd zzb;
    private static volatile zzum zze;
    private boolean zzf;

    static {
        zzbd zzbdVar = new zzbd();
        zzb = zzbdVar;
        zzsz.zzN(zzbd.class, zzbdVar);
    }

    private zzbd() {
    }

    public static zzbc zza() {
        return (zzbc) zzb.zzA();
    }

    public static zzbd zzc() {
        return zzb;
    }

    public final boolean zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zzf"});
        }
        if (i2 == 3) {
            return new zzbd();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzbc(zzeVar);
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
        synchronized (zzbd.class) {
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
