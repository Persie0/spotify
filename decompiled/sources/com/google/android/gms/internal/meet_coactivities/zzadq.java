package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
final class zzadq {
    public static zzabe zza(int i, Parcel parcel) {
        int i2 = i >> 16;
        int i3 = i & 32;
        zzabe zzabeVarZzb = zzabe.zzb(i2 & 255);
        return i3 != 0 ? zzabeVarZzb.zze(parcel.readString()) : zzabeVarZzb;
    }

    public static void zzb(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(iDataPosition);
    }

    public static boolean zzc(int i, int i2) {
        return (i & i2) != 0;
    }
}
