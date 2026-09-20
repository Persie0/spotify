package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
final class zztv implements zzud {
    private final zzud[] zza;

    public zztv(zzud... zzudVarArr) {
        this.zza = zzudVarArr;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final zzuc zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzud zzudVar = this.zza[i];
            if (zzudVar.zzc(cls)) {
                return zzudVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzud
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
