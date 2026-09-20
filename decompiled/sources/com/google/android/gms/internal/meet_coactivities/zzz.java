package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzz implements zzte {
    @Override // com.google.android.gms.internal.meet_coactivities.zzte
    public final /* bridge */ /* synthetic */ Object zza(int i) {
        zzab zzabVar;
        if (i != 0) {
            zzabVar = i != 1 ? null : zzab.DISALLOWED_BY_HOST;
        } else {
            zzabVar = zzab.DISABLED_REASON_UNSPECIFIED;
        }
        return zzabVar == null ? zzab.UNRECOGNIZED : zzabVar;
    }
}
