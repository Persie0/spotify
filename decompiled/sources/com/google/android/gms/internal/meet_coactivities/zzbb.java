package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends zzsz implements zzug {
    private static final zzbb zzb;
    private static volatile zzum zze;
    private int zzf;
    private int zzg = 0;
    private Object zzh;
    private boolean zzi;

    static {
        zzbb zzbbVar = new zzbb();
        zzb = zzbbVar;
        zzsz.zzN(zzbb.class, zzbbVar);
    }

    private zzbb() {
    }

    public static zzba zzb() {
        return (zzba) zzb.zzA();
    }

    public static zzbb zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzbb zzbbVar, zzaz zzazVar) {
        zzazVar.getClass();
        zzbbVar.zzh = zzazVar;
        zzbbVar.zzg = 2;
    }

    public final zzax zza() {
        return this.zzg == 1 ? (zzax) this.zzh : zzax.zzc();
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return (this.zzf & 1) != 0;
    }

    public final int zzh() {
        int i = this.zzg;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဇ\u0000", new Object[]{"zzh", "zzg", "zzf", zzax.class, zzaz.class, "zzi"});
        }
        if (i2 == 3) {
            return new zzbb();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzba(zzeVar);
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
        synchronized (zzbb.class) {
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
