package com.google.android.gms.internal.meet_coactivities;

import com.google.android.meet.addons.AddonException;
import java.util.Optional;
import java.util.function.Supplier;
import p204p.AbstractRunnableC1730c6;
import p204p.hm6;
import p204p.pv1;
import p204p.te40;
import p204p.u790;

/* JADX INFO: loaded from: classes4.dex */
public final class zzia {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/ExceptionUtils");

    public static u790 zza(u790 u790Var, final String str, final Object... objArr) {
        return AbstractRunnableC1730c6.m31497z(u790Var, Throwable.class, new hm6() { // from class: com.google.android.gms.internal.meet_coactivities.zzhz
            @Override // p204p.hm6
            public final u790 apply(Object obj) {
                zzia.zzf((Throwable) obj, str, objArr);
                return te40.f219571b;
            }
        }, zzir.zza);
    }

    public static u790 zzb(u790 u790Var, final String str) {
        return AbstractRunnableC1730c6.m31497z(u790Var, Throwable.class, new hm6() { // from class: com.google.android.gms.internal.meet_coactivities.zzhy
            @Override // p204p.hm6
            public final u790 apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzia.zze(th);
                boolean z = th instanceof AddonException;
                String str2 = str;
                if (!z) {
                    Optional.empty();
                    throw new AddonException(str2, pv1.f181559a);
                }
                pv1 pv1Var = ((AddonException) th).f2329a;
                Optional.empty();
                throw new AddonException(str2, pv1Var);
            }
        }, zzir.zza);
    }

    public static Object zzc(Supplier supplier, String str) {
        try {
            return supplier.get();
        } catch (Throwable th) {
            zze(th);
            Optional.empty();
            throw new AddonException(str, pv1.f181559a);
        }
    }

    public static void zzd(final Runnable runnable, String str) {
    }

    public static void zze(Throwable th) {
        zzf(th, "", new Object[0]);
    }

    public static void zzf(Throwable th, String str, Object... objArr) {
        ((zzkv) ((zzkv) zza.zzd().zzg(th)).zzh("com/google/android/meet/addons/internal/ExceptionUtils", "recordInternalException", 25, "ExceptionUtils.java")).zzu(str, objArr);
    }
}
