package com.google.android.gms.internal.meet_coactivities;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacx extends Binder {
    private static final Logger zza = Logger.getLogger(zzacx.class.getName());
    private zzacw zzb;

    public zzacx(zzacw zzacwVar) {
        this.zzb = zzacwVar;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzacw zzacwVar = this.zzb;
        if (zzacwVar != null) {
            try {
                if ((i2 & 1) != 0) {
                    return zzacwVar.zzu(i, parcel);
                }
                zza.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "ignoring non-oneway transaction. flags=" + i2);
                return false;
            } catch (RuntimeException e) {
                zza.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", s571.m77246e(i, "failure sending transaction "), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.zzb != null;
    }

    public final void zza() {
        this.zzb = null;
    }
}
