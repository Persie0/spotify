package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsh extends zzsz implements zzug {
    private static final zzsh zzb;
    private static volatile zzum zze;
    private long zzf;
    private int zzg;

    static {
        zzsh zzshVar = new zzsh();
        zzb = zzshVar;
        zzsz.zzN(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    public static zzsg zze() {
        return (zzsg) zzb.zzA();
    }

    public static zzsh zzg() {
        return zzb;
    }

    public final int zzc() {
        return this.zzg;
    }

    public final long zzd() {
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
            return new zzup(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzsh();
        }
        zzsf zzsfVar = null;
        if (i2 == 4) {
            return new zzsg(zzsfVar);
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
        synchronized (zzsh.class) {
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
