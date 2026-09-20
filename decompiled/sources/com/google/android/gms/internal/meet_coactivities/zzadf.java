package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzadf extends zzadh {
    private final zzaac zza;
    private final zzzw zzb;
    private final zzaos zzc;

    public zzadf(zzacn zzacnVar, int i, zzaac zzaacVar, zzzw zzzwVar, zzaos zzaosVar) {
        super(zzacnVar, i, zzaosVar, null);
        this.zza = zzaacVar;
        this.zzb = zzzwVar;
        this.zzc = zzaosVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzadh
    public final int zza(Parcel parcel) {
        int length;
        int i;
        parcel.writeString(this.zza.zzf());
        zzzw zzzwVar = this.zzb;
        int iZza = zzzwVar != null ? zzyl.zza(zzzwVar) : 0;
        if (iZza == 0) {
            parcel.writeInt(0);
        } else {
            Object[] objArrZzd = zzyl.zzd(zzzwVar);
            parcel.writeInt(iZza);
            for (int i2 = 0; i2 < iZza; i2++) {
                int i3 = i2 + i2;
                byte[] bArr = (byte[]) objArrZzd[i3];
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                Object obj = objArrZzd[i3 + 1];
                if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                } else {
                    if (obj instanceof zzadj) {
                        parcel.writeInt(-1);
                        throw null;
                    }
                    byte[] bArrZzb = zzacp.zzb();
                    try {
                        InputStream inputStream = (InputStream) obj;
                        int i4 = 0;
                        while (true) {
                            length = bArrZzb.length;
                            if (i4 >= length || (i = inputStream.read(bArrZzb, i4, length - i4)) == -1) {
                                break;
                                break;
                            }
                            i4 += i;
                        }
                        if (i4 == length) {
                            throw new zzabf(zzabe.zzg.zze("Metadata value too large"), null);
                        }
                        parcel.writeInt(i4);
                        if (i4 > 0) {
                            parcel.writeByteArray(bArrZzb, 0, i4);
                        }
                        zzacp.zza(bArrZzb);
                    } catch (Throwable th) {
                        zzacp.zza(bArrZzb);
                        throw th;
                    }
                }
            }
        }
        this.zzc.zzd();
        zzaaa zzaaaVarZzb = this.zza.zzb();
        return (zzaaaVarZzb == zzaaa.UNARY || zzaaaVarZzb == zzaaa.CLIENT_STREAMING) ? 16 : 0;
    }

    public final void zzb(zzxj zzxjVar) {
        zzzw zzzwVar = this.zzb;
        zzzr zzzrVar = zzahx.zza;
        zzzwVar.zzd(zzzrVar);
        this.zzb.zzf(zzzrVar, Long.valueOf(Math.max(0L, zzxjVar.zzb(TimeUnit.NANOSECONDS))));
    }
}
