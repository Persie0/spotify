package com.google.android.play.core.splitinstall.testing;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zza extends zzu {
    private Integer zza;
    private Map zzb;

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzu zzb(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.zzb = map;
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final zzv zzc() {
        if (this.zzb != null) {
            return new zzc(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    public final Map zzd() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
