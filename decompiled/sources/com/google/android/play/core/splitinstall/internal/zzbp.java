package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbp extends zzl implements zzbq {
    public zzbp() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzl
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzi(i3, bundle);
                return true;
            case 3:
                int i4 = parcel.readInt();
                Bundle bundle2 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzj(i4, bundle2);
                return true;
            case 4:
                int i5 = parcel.readInt();
                Bundle bundle3 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzb(i5, bundle3);
                return true;
            case 5:
                int i6 = parcel.readInt();
                Bundle bundle4 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzg(i6, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzl(bundle5);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                zzm.zzb(parcel);
                zzh(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzf(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzc(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzm(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzk(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zzd(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) zzm.zza(parcel, Bundle.CREATOR);
                zzm.zzb(parcel);
                zze(bundle11);
                return true;
            default:
                return false;
        }
    }
}
