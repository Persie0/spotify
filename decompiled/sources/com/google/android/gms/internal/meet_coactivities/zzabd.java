package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p204p.wuc;

/* JADX INFO: loaded from: classes4.dex */
final class zzabd implements zzzv {
    private static final byte[] zza = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private zzabd() {
        throw null;
    }

    private static boolean zzb(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzv
    public final /* bridge */ /* synthetic */ byte[] zza(Object obj) {
        byte[] bytes = ((String) obj).getBytes(wuc.f255136b);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (zzb(bytes[i])) {
                byte[] bArr = new byte[((length - i) * 3) + i];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    int i3 = i2 + 1;
                    byte b = bytes[i];
                    if (zzb(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = zza;
                        bArr[i3] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2 = i3;
                    }
                    i++;
                }
                return Arrays.copyOf(bArr, i2);
            }
            i++;
        }
    }

    public /* synthetic */ zzabd(zzabc zzabcVar) {
    }
}
