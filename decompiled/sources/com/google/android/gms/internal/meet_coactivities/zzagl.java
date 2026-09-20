package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzagl implements Runnable {
    final /* synthetic */ InputStream zza;
    final /* synthetic */ zzagu zzb;

    public zzagl(zzagu zzaguVar, InputStream inputStream) {
        this.zza = inputStream;
        this.zzb = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzm(this.zza);
    }
}
