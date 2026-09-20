package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzca;
import com.google.android.play.core.splitinstall.internal.zzcb;

/* JADX INFO: loaded from: classes.dex */
public final class zzad implements zzcb {
    private final zzac zza;

    public zzad(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* synthetic */ Object zza() {
        Context contextZza = this.zza.zza();
        zzca.zza(contextZza);
        return contextZza;
    }

    public final Context zzb() {
        Context contextZza = this.zza.zza();
        zzca.zza(contextZza);
        return contextZza;
    }
}
