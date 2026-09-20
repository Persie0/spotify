package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmn {
    public static /* synthetic */ boolean zza(int i, zzlk zzlkVar, StringBuilder sb) {
        if (i - 1 != 0 || zzlkVar == zzlk.zza) {
            return false;
        }
        sb.append(zzlkVar.zzb());
        sb.append('.');
        sb.append(zzlkVar.zzd());
        sb.append(':');
        sb.append(zzlkVar.zza());
        return true;
    }
}
