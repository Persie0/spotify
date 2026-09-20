package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class zzkz extends zzko {
    private static final zzky zza = new zzky(null);

    public zzkz(zzmo zzmoVar) {
        super(zzmoVar);
    }

    @Deprecated
    public static zzkz zzj(String str) {
        zzpj.zzc(!str.isEmpty(), "injected class name is empty");
        return new zzkz(zzns.zzd(str.replace('/', '.')));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzko
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzkv zza(Level level) {
        boolean zZzh = zzh(level);
        zzns.zzn(zzf(), level, zZzh);
        return !zZzh ? zza : new zzkw(this, level, false);
    }
}
