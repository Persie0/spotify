package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
final class zzss implements zzud {
    private static final zzss zza = new zzss();

    private zzss() {
    }

    public static zzss zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final zzuc zzb(Class cls) {
        if (!zzsz.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzuc) zzsz.zzC(cls.asSubclass(zzsz.class)).zzi(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final boolean zzc(Class cls) {
        return zzsz.class.isAssignableFrom(cls);
    }
}
