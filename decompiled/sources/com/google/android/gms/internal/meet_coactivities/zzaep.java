package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzaep extends zzafd {
    final /* synthetic */ zzaou zza;
    final /* synthetic */ zzaes zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaep(zzaes zzaesVar, zzapz zzapzVar, zzaou zzaouVar) {
        super(zzaesVar.zza.zzg);
        this.zza = zzaouVar;
        this.zzb = zzaesVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzafd
    public final void zza() {
        int i = zzaqa.zza;
        if (this.zzb.zzc != null) {
            zzahx.zze(this.zza);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamZzf = this.zza.zzf();
                if (inputStreamZzf == null) {
                    return;
                }
                try {
                    zzaes zzaesVar = this.zzb;
                    zzaesVar.zzb.zzc(zzaesVar.zza.zzc.zzd(inputStreamZzf));
                    inputStreamZzf.close();
                } catch (Throwable th) {
                    zzahx.zzf(inputStreamZzf);
                    throw th;
                }
            } catch (Throwable th2) {
                zzahx.zze(this.zza);
                zzaes.zzc(this.zzb, zzabe.zzb.zzd(th2).zze("Failed to read message."));
                return;
            }
        }
    }
}
