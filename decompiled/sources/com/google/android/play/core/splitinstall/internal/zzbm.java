package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbm extends zzk implements zzbo {
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzc(String str, int i, Bundle bundle, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        zzm.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(4, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzd(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzm.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(8, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zze(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzm.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(13, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzf(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzm.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(14, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzg(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzm.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(7, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzh(String str, int i, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        int i2 = zzm.zza;
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(5, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzi(String str, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        int i = zzm.zza;
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(6, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzj(String str, List list, Bundle bundle, zzbq zzbqVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzm.zzc(parcelZza, bundle);
        parcelZza.writeStrongBinder(zzbqVar);
        zzb(2, parcelZza);
    }
}
