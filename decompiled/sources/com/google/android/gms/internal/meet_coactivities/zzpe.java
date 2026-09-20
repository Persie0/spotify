package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzpe {
    private final zznu zza;
    private int zzb = 0;
    private int zzc = -1;

    public zzpe(zznu zznuVar) {
        zzpj.zza(zznuVar, "context");
        this.zza = zznuVar;
    }

    public abstract Object zza();

    public abstract void zzc(int i, int i2, zzoz zzozVar);

    public final int zzh() {
        return this.zzc + 1;
    }

    public final zzpf zzi() {
        return this.zza.zza();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134 A[LOOP:2: B:42:0x0092->B:88:0x0134, LOOP_END] */
    public final Object zzj() {
        int i;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        char cCharAt2;
        boolean z;
        zzmj zzmjVarZzg;
        zzmi zzmiVarZzc;
        int i5;
        zzox zzoxVarZzb;
        zzoz zzozVarZza;
        String strZzb = this.zza.zzb();
        int iZzc = zzph.zzc(strZzb, 0);
        int i6 = 0;
        int i7 = -1;
        while (iZzc >= 0) {
            int i8 = iZzc + 1;
            int i9 = 0;
            int i10 = i8;
            while (true) {
                if (i10 >= strZzb.length()) {
                    throw zzpg.zzd("unterminated parameter", strZzb, iZzc);
                }
                i = i10 + 1;
                cCharAt = strZzb.charAt(i10);
                char c = (char) (cCharAt - '0');
                if (c < '\n') {
                    i9 = (i9 * 10) + c;
                    if (i9 >= 1000000) {
                        throw zzpg.zzc("index too large", strZzb, iZzc, i);
                    }
                    i10 = i;
                }
            }
            if (cCharAt != '$') {
                if (cCharAt != '<') {
                    i7 = i6;
                    i6++;
                } else {
                    if (i7 == -1) {
                        throw zzpg.zzc("invalid relative parameter", strZzb, iZzc, i);
                    }
                    if (i == strZzb.length()) {
                        throw zzpg.zzd("unterminated parameter", strZzb, iZzc);
                    }
                    i2 = i10 + 2;
                    strZzb.charAt(i);
                }
                i3 = i - 1;
                while (true) {
                    if (i3 < strZzb.length()) {
                        throw zzpg.zzd("unterminated parameter", strZzb, iZzc);
                    }
                    if (((char) ((strZzb.charAt(i3) & (-33)) - 65)) < 26) {
                        break;
                    }
                    i3++;
                }
                i4 = i3 + 1;
                cCharAt2 = strZzb.charAt(i3);
                if ((cCharAt2 & ' ') == 0) {
                    z = true;
                } else {
                    z = false;
                }
                zzmjVarZzg = zzmj.zzg(strZzb, i8, i3, z);
                zzmiVarZzc = zzmi.zzc(cCharAt2);
                if (zzmiVarZzc != null) {
                    if (zzmjVarZzg.zzi(zzmiVarZzc)) {
                        throw zzpg.zzc("invalid format specifier", strZzb, iZzc, i4);
                    }
                    zzozVarZza = zzpb.zza(i7, zzmiVarZzc, zzmjVarZzg);
                } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                    if (!zzmjVarZzg.zzl(160, false)) {
                        throw zzpg.zzc("invalid format specification", strZzb, iZzc, i4);
                    }
                    i5 = i3 + 2;
                    if (i5 > strZzb.length()) {
                        throw zzpg.zza("truncated format specifier", strZzb, iZzc);
                    }
                    zzoxVarZzb = zzox.zzb(strZzb.charAt(i4));
                    if (zzoxVarZzb == null) {
                        throw zzpg.zza("illegal date/time conversion", strZzb, i4);
                    }
                    zzozVarZza = zzoy.zza(zzoxVarZzb, zzmjVarZzg, i7);
                    i4 = i5;
                } else {
                    if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                        throw zzpg.zzc("invalid format specification", strZzb, iZzc, i4);
                    }
                    if (!zzmjVarZzg.zzl(160, false)) {
                        throw zzpg.zzc("invalid format specification", strZzb, iZzc, i4);
                    }
                    zzozVarZza = new zzpc(zzmjVarZzg, i7, zzmjVarZzg);
                }
                zzl(iZzc, i4, zzozVarZza);
                iZzc = zzph.zzc(strZzb, i4);
            } else {
                if (i10 - i8 == 0) {
                    throw zzpg.zzc("missing index", strZzb, iZzc, i);
                }
                if (strZzb.charAt(i8) == '0') {
                    throw zzpg.zzc("index has leading zero", strZzb, iZzc, i);
                }
                int i11 = i9 - 1;
                if (i == strZzb.length()) {
                    throw zzpg.zzd("unterminated parameter", strZzb, iZzc);
                }
                i2 = i10 + 2;
                strZzb.charAt(i);
                i7 = i11;
            }
            i8 = i;
            i = i2;
            i3 = i - 1;
            while (true) {
                if (i3 < strZzb.length()) {
                    throw zzpg.zzd("unterminated parameter", strZzb, iZzc);
                }
                if (((char) ((strZzb.charAt(i3) & (-33)) - 65)) < 26) {
                    break;
                }
                i3++;
            }
            i4 = i3 + 1;
            cCharAt2 = strZzb.charAt(i3);
            if ((cCharAt2 & ' ') == 0) {
                z = true;
            } else {
                z = false;
            }
            zzmjVarZzg = zzmj.zzg(strZzb, i8, i3, z);
            zzmiVarZzc = zzmi.zzc(cCharAt2);
            if (zzmiVarZzc != null) {
                if (zzmjVarZzg.zzi(zzmiVarZzc)) {
                    throw zzpg.zzc("invalid format specifier", strZzb, iZzc, i4);
                }
                zzozVarZza = zzpb.zza(i7, zzmiVarZzc, zzmjVarZzg);
            } else if (cCharAt2 != 't') {
                if (!zzmjVarZzg.zzl(160, false)) {
                    throw zzpg.zzc("invalid format specification", strZzb, iZzc, i4);
                }
                i5 = i3 + 2;
                if (i5 > strZzb.length()) {
                    throw zzpg.zza("truncated format specifier", strZzb, iZzc);
                }
                zzoxVarZzb = zzox.zzb(strZzb.charAt(i4));
                if (zzoxVarZzb == null) {
                    throw zzpg.zza("illegal date/time conversion", strZzb, i4);
                }
                zzozVarZza = zzoy.zza(zzoxVarZzb, zzmjVarZzg, i7);
                i4 = i5;
            } else {
                if (!zzmjVarZzg.zzl(160, false)) {
                    throw zzpg.zzc("invalid format specification", strZzb, iZzc, i4);
                }
                i5 = i3 + 2;
                if (i5 > strZzb.length()) {
                    throw zzpg.zza("truncated format specifier", strZzb, iZzc);
                }
                zzoxVarZzb = zzox.zzb(strZzb.charAt(i4));
                if (zzoxVarZzb == null) {
                    throw zzpg.zza("illegal date/time conversion", strZzb, i4);
                }
                zzozVarZza = zzoy.zza(zzoxVarZzb, zzmjVarZzg, i7);
                i4 = i5;
            }
            zzl(iZzc, i4, zzozVarZza);
            iZzc = zzph.zzc(strZzb, i4);
        }
        int i12 = this.zzb;
        if (((i12 + 1) & i12) != 0 || (this.zzc > 31 && i12 != -1)) {
            throw zzpg.zzb(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i12))), this.zza.zzb());
        }
        return zza();
    }

    public final String zzk() {
        return this.zza.zzb();
    }

    public final void zzl(int i, int i2, zzoz zzozVar) {
        if (zzozVar.zzc() < 32) {
            this.zzb |= 1 << zzozVar.zzc();
        }
        this.zzc = Math.max(this.zzc, zzozVar.zzc());
        zzc(i, i2, zzozVar);
    }
}
