package com.google.android.gms.internal.meet_coactivities;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes4.dex */
final class zzaoz extends InputStream implements InputStreamRetargetInterface {
    private zzuf zza;
    private ByteArrayInputStream zzb;

    public zzaoz(zzuf zzufVar, zzum zzumVar) {
        this.zza = zzufVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        zzuf zzufVar = this.zza;
        if (zzufVar != null) {
            return zzufVar.zzz();
        }
        ByteArrayInputStream byteArrayInputStream = this.zzb;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzuf zzufVar = this.zza;
        if (zzufVar != null) {
            this.zzb = new ByteArrayInputStream(zzufVar.zzx());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzb;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        zzuf zzufVar = this.zza;
        if (zzufVar != null) {
            int iZzz = zzufVar.zzz();
            if (iZzz == 0) {
                this.zza = null;
                this.zzb = null;
                return -1;
            }
            if (i2 >= iZzz) {
                zzsc zzscVarZzB = zzsc.zzB(bArr, i, iZzz);
                this.zza.zzS(zzscVarZzB);
                zzscVarZzB.zzC();
                this.zza = null;
                this.zzb = null;
                return iZzz;
            }
            this.zzb = new ByteArrayInputStream(this.zza.zzx());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzb;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
