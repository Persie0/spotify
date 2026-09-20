package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpi {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzpm zzb;

    static {
        zzpm zzpnVar;
        for (int i = 0; i < 2; i++) {
            zzpnVar = null;
            try {
                zzpnVar = (zzpm) Class.forName(zza[i]).asSubclass(zzpm.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzpnVar != null) {
                zzb = zzpnVar;
            }
        }
        zzpnVar = new zzpn();
        zzb = zzpnVar;
    }

    public static StackTraceElement zza(Class cls, int i) {
        zzpj.zza(cls, "target");
        return zzb.zza(cls, 2);
    }

    public static StackTraceElement[] zzb(Class cls, int i, int i2) {
        if (i > 0 || i == -1) {
            return zzb.zzb(cls, i, 2);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
