package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
final class zzlj extends zzlk {
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private int zzf = 0;

    public /* synthetic */ zzlj(String str, String str2, int i, String str3, zzli zzliVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i;
        this.zze = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzlj) {
            zzlj zzljVar = (zzlj) obj;
            if (this.zzc.equals(zzljVar.zzc) && this.zzd == zzljVar.zzd && zzb().equals(zzljVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iM77243b = s571.m77243b(4867, 31, this.zzc) + this.zzd;
        this.zzf = iM77243b;
        return iM77243b;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlk
    public final int zza() {
        return (char) this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlk
    public final String zzb() {
        return this.zzb.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlk
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlk
    public final String zzd() {
        return this.zzc;
    }
}
