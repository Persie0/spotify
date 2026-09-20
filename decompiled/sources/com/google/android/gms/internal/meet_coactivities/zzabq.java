package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabq {
    private int zza;

    public /* synthetic */ zzabq(int i, zzabp zzabpVar) {
        this.zza = i;
    }

    public final zzabq zza(boolean z) {
        this.zza |= 512;
        return this;
    }

    public final zzabq zzb(boolean z) {
        this.zza |= 1;
        return this;
    }

    public final zzabs zzc() {
        return new zzabs(this.zza, null);
    }
}
