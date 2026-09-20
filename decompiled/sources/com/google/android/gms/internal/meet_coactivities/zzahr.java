package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
final class zzahr implements zzaop {
    public final String toString() {
        return "grpc-default-executor";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaop
    public final /* bridge */ /* synthetic */ Object zza() {
        return Executors.newCachedThreadPool(zzahx.zzd("grpc-default-executor-%d", true));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
