package com.google.android.gms.internal.meet_coactivities;

import p204p.s571;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabs {
    public static final zzabs zza;
    private final int zzb;

    static {
        zzabq zzabqVar = new zzabq(0, null);
        zzabqVar.zzb(true);
        zza = zzabqVar.zzc();
    }

    public /* synthetic */ zzabs(int i, zzabr zzabrVar) {
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzabs.class == obj.getClass() && this.zzb == ((zzabs) obj).zzb;
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final String toString() {
        return s571.m77251j("BindServiceFlags{", Integer.toHexString(this.zzb), "}");
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzabq zzb() {
        return new zzabq(this.zzb, null);
    }
}
