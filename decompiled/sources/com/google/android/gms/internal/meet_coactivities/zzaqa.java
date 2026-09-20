package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqa {
    public static final /* synthetic */ int zza = 0;

    static {
        Object obj;
        Class<?> cls;
        zzapy zzapyVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                zzapyVar = (zzapy) cls.asSubclass(zzapy.class).getConstructor(zzaqb.class).newInstance(zzapy.zza);
            } catch (Throwable th2) {
                obj = th2;
                zzapyVar = null;
            }
        } else {
            zzapyVar = null;
        }
        if (zzapyVar == null) {
            new zzapy(zzapy.zza);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, zzaqa.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private zzaqa() {
    }

    public static zzapz zza() {
        return zzapy.zzb;
    }
}
