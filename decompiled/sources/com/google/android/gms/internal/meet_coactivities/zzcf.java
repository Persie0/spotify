package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import java.util.Optional;
import java.util.function.Supplier;
import p204p.fhv0;
import p204p.hg40;
import p204p.u790;
import p204p.vxe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcf {
    private static Optional zza = Optional.empty();

    public static synchronized zzcf zze(Context context, Supplier supplier, zzby zzbyVar) {
        try {
            if (!zza.isPresent()) {
                zza = Optional.of(new zzda(context, (zzce) supplier.get(), zzbyVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzcf) zza.get();
    }

    public abstract zzg zzd();

    public abstract u790 zzf(zzp zzpVar, hg40 hg40Var);

    public abstract void zzg(zzpy zzpyVar);

    public abstract void zzh(fhv0 fhv0Var);

    public abstract void zzi();

    public abstract void zzj(vxe vxeVar);

    public abstract void zzk(zzrr zzrrVar);

    public abstract u790 zzl(int i);

    public abstract void zzm(Context context, int i, zzj zzjVar);
}
