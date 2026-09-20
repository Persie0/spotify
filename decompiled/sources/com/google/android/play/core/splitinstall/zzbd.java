package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzcb;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd implements zzcb {
    private final zzcb zza;

    public zzbd(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextZzb = ((zzad) this.zza).zzb();
        return new zzbc(contextZzb, contextZzb.getPackageName());
    }
}
