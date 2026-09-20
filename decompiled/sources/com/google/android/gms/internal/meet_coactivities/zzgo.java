package com.google.android.gms.internal.meet_coactivities;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.Executor;
import p204p.io10;
import p204p.iue;
import p204p.jue;
import p204p.kp90;
import p204p.kvg1;
import p204p.vgg1;
import p204p.vuc;

/* JADX INFO: loaded from: classes4.dex */
final class zzgo implements zzib {
    private final iue zza;
    private final Executor zzb;

    private zzgo(iue iueVar, Executor executor) {
        this.zza = iueVar;
        this.zzb = executor;
    }

    public static zzgo zza(iue iueVar, Executor executor) {
        return new zzgo(iueVar, executor);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzib
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final jue jueVar = (jue) obj;
        zzia.zza(vgg1.m85449E(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzgn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(jueVar);
            }
        }, this.zzb), "Failed to apply state.", new Object[0]);
    }

    public final void zzc(jue jueVar) {
        io10 io10Var = (io10) this.zza;
        io10Var.getClass();
        Logger.m3965a("[LiveSharing] Received coDoingState within live-sharing session:" + jueVar + ".", new Object[0]);
        io10Var.f104099a.m59520f(new kp90(new String(((kvg1) jueVar).f126865a, vuc.f244913a)));
    }
}
