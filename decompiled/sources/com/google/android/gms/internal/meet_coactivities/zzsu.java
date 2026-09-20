package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsu extends zzrc {
    private final zzsz zza;

    public zzsu(zzsz zzszVar) {
        this.zza = zzszVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzum
    public final /* synthetic */ Object zzb(zzrx zzrxVar, zzsk zzskVar) throws zztj {
        int i = zzsz.zzd;
        zzsz zzszVarZzD = this.zza.zzD();
        try {
            zzur zzurVarZzb = zzun.zza().zzb(zzszVarZzD.getClass());
            zzurVarZzb.zzh(zzszVarZzD, zzry.zzq(zzrxVar), zzskVar);
            zzurVarZzb.zzf(zzszVarZzD);
            return zzszVarZzD;
        } catch (zztj e) {
            if (e.zzk()) {
                throw new zztj(e);
            }
            throw e;
        } catch (zzve e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zztj) {
                throw ((zztj) e3.getCause());
            }
            throw new zztj(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zztj) {
                throw ((zztj) e4.getCause());
            }
            throw e4;
        }
    }
}
