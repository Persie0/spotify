package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes4.dex */
final class zzaco extends InputStream implements InputStreamRetargetInterface {
    private byte[][] zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzaco(byte[] bArr) {
        this.zza = null;
        int length = bArr.length;
        this.zzb = length <= 0 ? null : bArr;
        this.zze = length;
    }

    private final void zza() {
        int i = this.zzc + 1;
        this.zzc = i;
        this.zzd = 0;
        byte[][] bArr = this.zza;
        if (bArr == null || i >= bArr.length) {
            this.zzb = null;
        } else {
            this.zzb = bArr[i];
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.zze;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzf) {
            return;
        }
        this.zzf = true;
        byte[][] bArr = this.zza;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                zzacp.zza(bArr2);
            }
        } else {
            byte[] bArr3 = this.zzb;
            if (bArr3 != null) {
                zzacp.zza(bArr3);
            }
        }
        this.zzb = null;
        this.zza = null;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return -1;
        }
        int i = this.zzd;
        int i2 = i + 1;
        this.zzd = i2;
        byte b = bArr[i];
        this.zze--;
        if (i2 == bArr.length) {
            zza();
        }
        return b;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public zzaco(byte[][] bArr, int i) {
        this.zza = bArr;
        this.zze = i;
        if (bArr.length > 0) {
            this.zzb = bArr[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (true) {
            byte[] bArr2 = this.zzb;
            if (bArr2 == null) {
                break;
            }
            int[] iArr = {i3, bArr2.length - this.zzd, this.zze};
            int i4 = iArr[0];
            for (int i5 = 1; i5 < 3; i5++) {
                int i6 = iArr[i5];
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            System.arraycopy(this.zzb, this.zzd, bArr, i, i4);
            i += i4;
            i3 -= i4;
            this.zze -= i4;
            if (i3 == 0) {
                int i7 = this.zzd + i4;
                this.zzd = i7;
                if (i7 != this.zzb.length) {
                    break;
                }
                zza();
                break;
            }
            zza();
        }
        int i8 = i2 - i3;
        if (i8 > 0 || this.zze > 0) {
            return i8;
        }
        return -1;
    }
}
