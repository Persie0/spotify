package com.google.android.gms.internal.meet_coactivities;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes.dex */
public final class zzny extends zzns {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zznr zzc;

    final class zza {
        public static boolean zza() {
            return zzny.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z = true;
        if (str != null && !"robolectric".equals(str)) {
            z = false;
        }
        zzb = z;
        zzc = new zznr() { // from class: com.google.android.gms.internal.meet_coactivities.zzny.1
            @Override // com.google.android.gms.internal.meet_coactivities.zznr
            public zzlk zza(Class<?> cls, int i) {
                return zzlk.zza;
            }

            @Override // com.google.android.gms.internal.meet_coactivities.zznr
            public String zzb(Class<? extends zzko<?>> cls) {
                StackTraceElement stackTraceElementZza;
                if (zzny.zza) {
                    try {
                        if (cls.equals(zzny.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzny.zzb || (stackTraceElementZza = zzpi.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }
        };
    }

    public static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzns
    public zzmo zze(String str) {
        return zzod.zze(str);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzns
    public zznr zzh() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzns
    public zzok zzj() {
        return zzoe.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzns
    public String zzm() {
        return "platform: Android";
    }
}
