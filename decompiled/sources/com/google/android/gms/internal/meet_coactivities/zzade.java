package com.google.android.gms.internal.meet_coactivities;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzade {
    protected final IBinder zza;
    private static final Logger zzc = Logger.getLogger(zzade.class.getName());
    public static final zzada zzb = new Object() { // from class: com.google.android.gms.internal.meet_coactivities.zzada
    };

    public zzade(IBinder iBinder) {
        this.zza = iBinder;
    }

    public static zzade zzb(IBinder iBinder, Executor executor) {
        return iBinder instanceof Binder ? new zzadc(iBinder, executor) : new zzadd(iBinder);
    }

    public abstract void zza(int i, zzadi zzadiVar);

    public final boolean zzd(int i, Parcel parcel) {
        try {
            return this.zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
