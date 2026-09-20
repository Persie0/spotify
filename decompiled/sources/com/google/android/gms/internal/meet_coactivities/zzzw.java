package com.google.android.gms.internal.meet_coactivities;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;
import p204p.c95;
import p204p.uy8;
import p204p.wuc;
import p204p.wy8;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzw {
    static final wy8 zzb;
    private Object[] zzd;
    private int zze;
    private static final Logger zzc = Logger.getLogger(zzzw.class.getName());
    public static final zzzp zza = new zzzm();

    static {
        uy8 uy8Var = wy8.f256229a;
        Character ch = uy8Var.f246001d;
        uy8 uy8VarMo81954h = uy8Var;
        if (ch != null) {
            uy8VarMo81954h = uy8Var.mo81954h(uy8Var.f246000c, null);
        }
        zzb = uy8VarMo81954h;
    }

    public zzzw() {
    }

    private final int zzh() {
        Object[] objArr = this.zzd;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final Object zzi(int i) {
        return this.zzd[i + i + 1];
    }

    private final void zzj(int i) {
        Object[] objArr = new Object[i];
        if (!zzk()) {
            Object[] objArr2 = this.zzd;
            int i2 = this.zze;
            System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.zzd = objArr;
    }

    private final boolean zzk() {
        return this.zze == 0;
    }

    private final byte[] zzl(int i) {
        return (byte[]) this.zzd[i + i];
    }

    private final byte[] zzm(int i) {
        Object objZzi = zzi(i);
        if (objZzi instanceof byte[]) {
            return (byte[]) objZzi;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.zze; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrZzl = zzl(i);
            Charset charset = wuc.f255135a;
            String str = new String(bArrZzl, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                wy8 wy8Var = zzb;
                byte[] bArrZzm = zzm(i);
                wy8Var.getClass();
                sb.append(wy8Var.m89350c(bArrZzm, bArrZzm.length));
            } else {
                sb.append(new String(zzm(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zzb(zzzr zzzrVar) {
        int i = this.zze;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(zzzrVar.zzd(), zzl(i)));
        Object objZzi = zzi(i);
        if (objZzi instanceof byte[]) {
            return zzzrVar.zza((byte[]) objZzi);
        }
        throw null;
    }

    public final void zzd(zzzr zzzrVar) {
        if (zzk()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.zze;
            if (i >= i3) {
                Arrays.fill(this.zzd, i2 + i2, i3 + i3, (Object) null);
                this.zze = i2;
                return;
            }
            if (!Arrays.equals(zzzrVar.zzd(), zzl(i))) {
                int i4 = i2 + i2;
                this.zzd[i4] = zzl(i);
                Object objZzi = zzi(i);
                if (this.zzd instanceof byte[][]) {
                    zzj(zzh());
                }
                this.zzd[i4 + 1] = objZzi;
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void zze(zzzw zzzwVar) {
        if (zzzwVar.zzk()) {
            return;
        }
        int iZzh = zzh();
        int i = this.zze;
        int i2 = i + i;
        int i3 = iZzh - i2;
        if (zzk()) {
            int i4 = zzzwVar.zze;
            zzj(i4 + i4 + i2);
        } else {
            int i5 = zzzwVar.zze;
            if (i3 < i5 + i5) {
                int i6 = zzzwVar.zze;
                zzj(i6 + i6 + i2);
            }
        }
        Object[] objArr = zzzwVar.zzd;
        Object[] objArr2 = this.zzd;
        int i7 = this.zze;
        int i8 = zzzwVar.zze;
        System.arraycopy(objArr, 0, objArr2, i7 + i7, i8 + i8);
        this.zze += zzzwVar.zze;
    }

    public final void zzf(zzzr zzzrVar, Object obj) {
        c95.m31848n(zzzrVar, "key");
        c95.m31848n(obj, "value");
        int i = this.zze;
        int i2 = i + i;
        if (i2 == 0 || i2 == zzh()) {
            zzj(Math.max(i2 + i2, 8));
        }
        int i3 = this.zze;
        this.zzd[i3 + i3] = zzzrVar.zzd();
        int i4 = this.zze;
        this.zzd[i4 + i4 + 1] = zzzrVar.zzb(obj);
        this.zze++;
    }

    public final Object[] zzg() {
        int i = this.zze;
        Object[] objArr = new Object[i + i];
        for (int i2 = 0; i2 < this.zze; i2++) {
            int i3 = i2 + i2;
            objArr[i3] = zzl(i2);
            Object objZzi = zzi(i2);
            if (!(objZzi instanceof byte[])) {
                throw null;
            }
            objArr[i3 + 1] = objZzi;
        }
        return objArr;
    }

    public zzzw(int i, Object[] objArr) {
        this.zze = i;
        this.zzd = objArr;
    }
}
