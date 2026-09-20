package com.google.android.gms.internal.meet_coactivities;

import p204p.fk00;

/* JADX INFO: loaded from: classes4.dex */
final class zzhq implements fk00 {
    final /* synthetic */ zzhs zza;

    public zzhq(zzhs zzhsVar) {
        this.zza = zzhsVar;
    }

    @Override // p204p.fk00
    public final void onFailure(Throwable th) {
        zzia.zze(th);
    }

    @Override // p204p.fk00
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zza.zzc.zzg((zzpy) obj);
        } catch (RuntimeException e) {
            zzia.zze(e);
        }
    }
}
