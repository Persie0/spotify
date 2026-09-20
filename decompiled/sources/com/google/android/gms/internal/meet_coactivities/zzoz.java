package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzoz {
    private final int zza;
    private final zzmj zzb;

    public zzoz(zzmj zzmjVar, int i) {
        if (zzmjVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "invalid index: "));
        }
        this.zza = i;
        this.zzb = zzmjVar;
    }

    public abstract void zzb(zzpa zzpaVar, Object obj);

    public final int zzc() {
        return this.zza;
    }

    public final zzmj zzd() {
        return this.zzb;
    }

    public final void zze(zzpa zzpaVar, Object[] objArr) {
        int i = this.zza;
        if (i >= objArr.length) {
            zzpaVar.zzf();
            return;
        }
        Object obj = objArr[i];
        if (obj != null) {
            zzb(zzpaVar, obj);
        } else {
            zzpaVar.zzg();
        }
    }
}
