package com.google.android.gms.internal.meet_coactivities;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzapa implements zzzz {
    private static final ThreadLocal zza = new ThreadLocal();
    private final zzum zzb;
    private final zzuf zzc;

    public zzapa(zzuf zzufVar, int i) {
        c95.m31848n(zzufVar, "defaultInstance cannot be null");
        this.zzc = zzufVar;
        this.zzb = zzufVar.zzI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.meet_coactivities.zzzz
    public final /* bridge */ /* synthetic */ InputStream zza(Object obj) {
        return new zzaoz(obj, this.zzb);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzz
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        zzrx zzrxVarZzI;
        byte[] bArr;
        try {
            int iAvailable = inputStream.available();
            if (iAvailable > 0 && iAvailable <= 4194304) {
                ThreadLocal threadLocal = zza;
                Reference reference = (Reference) threadLocal.get();
                if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                    bArr = new byte[iAvailable];
                    threadLocal.set(new WeakReference(bArr));
                }
                int i = iAvailable;
                while (i > 0) {
                    int i2 = inputStream.read(bArr, iAvailable - i, i);
                    if (i2 == -1) {
                        break;
                    }
                    i -= i2;
                }
                if (i != 0) {
                    throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                }
                zzrxVarZzI = zzrx.zzJ(bArr, 0, iAvailable);
            } else {
                if (iAvailable == 0) {
                    return this.zzc;
                }
                zzrxVarZzI = null;
            }
            if (zzrxVarZzI == null) {
                zzrxVarZzI = zzrx.zzI(inputStream, 4096);
            }
            zzrxVarZzI.zzG(Alert.DURATION_SHOW_INDEFINITELY);
            try {
                Object objZza = this.zzb.zza(zzrxVarZzI, zzapb.zza);
                try {
                    zzrxVarZzI.zzz(0);
                    return objZza;
                } catch (zztj e) {
                    throw e;
                }
            } catch (zztj e2) {
                throw new zzabg(zzabe.zzj.zze("Invalid protobuf byte sequence").zzd(e2), null);
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
