package com.google.android.gms.internal.meet_coactivities;

import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class zzadc extends zzade {
    private final zzaoi zzc;

    public zzadc(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.zzc = new zzaoi(executor);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzade
    public final void zza(final int i, zzadi zzadiVar) {
        final Parcel parcelZza = zzadiVar.zza();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzadb
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (this.zza.zzd(i, parcelZza)) {
                        return;
                    }
                    zzade.zzc.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "lambda$transact$0", "A oneway transaction was not understood - ignoring");
                } catch (Exception e) {
                    zzade.zzc.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "lambda$transact$0", "A oneway transaction threw - ignoring", (Throwable) e);
                }
            }
        });
        zzadiVar.zzb();
    }
}
