package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;
import p204p.m12;
import p204p.vie1;

/* JADX INFO: loaded from: classes4.dex */
class zzaho extends zzaan {
    private final zzaan zza;

    public zzaho(zzaan zzaanVar) {
        c95.m31848n(zzaanVar, "delegate can not be null");
        this.zza = zzaanVar;
    }

    public final String toString() {
        m12 m12VarM85614C = vie1.m85614C(this);
        m12VarM85614C.m60523w(this.zza, "delegate");
        return m12VarM85614C.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final String zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzb() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public void zzd(zzaaj zzaajVar) {
        this.zza.zzd(zzaajVar);
    }
}
