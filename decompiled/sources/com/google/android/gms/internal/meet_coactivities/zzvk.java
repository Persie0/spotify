package com.google.android.gms.internal.meet_coactivities;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzvk extends zzvl {
    public zzvk(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.meet_coactivities.zzvm.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.meet_coactivities.zzvm.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.meet_coactivities.zzvm.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.meet_coactivities.zzvm.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final void zzc(Object obj, long j, boolean z) {
        if (zzvm.zzb) {
            zzvm.zzi(obj, j, z);
        } else {
            zzvm.zzj(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final void zzd(Object obj, long j, byte b) {
        if (zzvm.zzb) {
            zzvm.zzD(obj, j, b);
        } else {
            zzvm.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzvl
    public final boolean zzg(Object obj, long j) {
        return zzvm.zzb ? zzvm.zzt(obj, j) : zzvm.zzu(obj, j);
    }
}
