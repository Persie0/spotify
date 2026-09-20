package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;
import p204p.uv1;

/* JADX INFO: loaded from: classes4.dex */
final class zzfl implements fk00 {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzfm zza;

    public zzfl(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        ((zzkv) zzfm.zza.zze().zzh("com/google/android/meet/addons/internal/AddonSessionBuilderImpl$3", "onFailure", 267, "AddonSessionBuilderImpl.java")).zzo("Session future failed; not registering disconnect listener.");
    }

    @Override // p204p.fk00
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        final uv1 uv1Var = (uv1) obj;
        this.zza.zzc.zzQ(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzfk
            @Override // java.lang.Runnable
            public final void run() {
                ((zzfs) uv1Var).zzc();
            }
        });
    }
}
