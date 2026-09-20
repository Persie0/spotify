package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzaoh extends zzaod {
    private zzaoh() {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaod
    public final void zza(zzaoi zzaoiVar, int i) {
        synchronized (zzaoiVar) {
            zzaoiVar.zze = 0;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaod
    public final boolean zzb(zzaoi zzaoiVar, int i, int i2) {
        synchronized (zzaoiVar) {
            try {
                if (zzaoiVar.zze != 0) {
                    return false;
                }
                zzaoiVar.zze = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzaoh(zzaog zzaogVar) {
        super(null);
    }
}
