package com.google.android.gms.internal.meet_coactivities;

import android.os.IBinder;
import android.os.RemoteException;
import p204p.edb;

/* JADX INFO: loaded from: classes4.dex */
final class zzadd extends zzade {
    public zzadd(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzade
    public final void zza(int i, zzadi zzadiVar) throws RemoteException {
        if (!zzd(i, zzadiVar.zzb())) {
            throw new RemoteException(edb.m38563l("BinderProxy#transact(", i, ", FLAG_ONEWAY) returned false"));
        }
    }
}
