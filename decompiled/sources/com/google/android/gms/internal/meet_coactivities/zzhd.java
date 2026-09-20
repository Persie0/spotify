package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.Executor;
import p204p.sve;
import p204p.uve;
import p204p.vgg1;

/* JADX INFO: loaded from: classes4.dex */
final class zzhd implements zzib {
    private final sve zza;
    private final Executor zzb;

    private zzhd(sve sveVar, Executor executor) {
        this.zzb = executor;
    }

    public static zzhd zza(sve sveVar, Executor executor) {
        return new zzhd(sveVar, executor);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzib
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final uve uveVar = (uve) obj;
        zzia.zza(vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzhc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(uveVar);
            }
        }, this.zzb), "Failed to apply state.", new Object[0]);
    }

    public final /* synthetic */ void zzc(uve uveVar) {
        throw null;
    }
}
