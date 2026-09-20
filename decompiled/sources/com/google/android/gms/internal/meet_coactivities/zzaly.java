package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaly extends zzzg {
    static final boolean zza = zzahx.zzg("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int zzb = 0;

    @Override // com.google.android.gms.internal.meet_coactivities.zzys
    public final zzze zza(zzyu zzyuVar) {
        return zza ? new zzalr(zzyuVar) : new zzalx(zzyuVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzg
    public final int zzb() {
        return 5;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzg
    public final zzaah zzc(Map map) {
        try {
            Boolean boolZza = zzaiw.zza(map, "shuffleAddressList");
            return zzaah.zza(zza ? new zzalm(boolZza, null) : new zzalt(boolZza, null));
        } catch (RuntimeException e) {
            return zzaah.zzb(zzabe.zzk.zzd(e).zze("Failed parsing configuration for pick_first"));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzg
    public final String zzd() {
        return "pick_first";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzg
    public final boolean zze() {
        return true;
    }
}
