package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzacv implements zzaou {
    protected final zzacn zza;
    protected final zzvz zzb;
    final int zzc;
    protected zzadh zzd;
    protected zzaos zze;
    protected zzaov zzf;
    private InputStream zzg;
    private int zzh;
    private int zzi;
    private ArrayList zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private zzacs zzn = zzacs.UNINITIALIZED;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;

    public /* synthetic */ zzacv(zzacn zzacnVar, zzvz zzvzVar, int i, zzacu zzacuVar) {
        this.zza = zzacnVar;
        this.zzb = zzvzVar;
        this.zzc = i;
    }

    private final void zzp(zzabe zzabeVar, zzabe zzabeVar2, boolean z) {
        if (zzo()) {
            return;
        }
        boolean z2 = this.zzn != zzacs.UNINITIALIZED;
        zzl(zzacs.CLOSED);
        if (z2) {
            this.zze.zzm(zzabeVar2);
        }
        if (!z) {
            this.zza.zzp(this.zzc, zzabeVar);
        }
        if (z2) {
            zza(zzabeVar2);
        }
        this.zza.zzn(this);
    }

    private final void zzq() {
        zzact zzactVar;
        if (this.zzi == 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.zzj.size() && (zzactVar = (zzact) this.zzj.get(i)) != null) {
                i++;
                i2 += zzactVar.zzc;
                if (zzactVar.zzd) {
                    this.zzi = i;
                    zzr(i2);
                    return;
                }
            }
        }
    }

    private final void zzr(int i) {
        this.zze.getClass();
        this.zze.zze(this.zzo);
        long j = i;
        this.zze.zzf(this.zzo, j, j);
        this.zzo++;
    }

    private final boolean zzs() {
        return this.zzg != null || this.zzi > 0;
    }

    private final boolean zzt() {
        return this.zzk && this.zzh >= this.zzl;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.zzk;
        String strValueOf = String.valueOf(this.zzn);
        boolean zZzs = zzs();
        zzaov zzaovVar = this.zzf;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zZzs);
        sb.append("/Lis=");
        sb.append(zzaovVar != null);
        sb.append("]");
        return sb.toString();
    }

    public abstract void zza(zzabe zzabeVar);

    public abstract void zzb();

    public abstract void zzc(int i, Parcel parcel);

    public abstract void zzd(int i, Parcel parcel);

    public boolean zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaou
    public final synchronized InputStream zzf() {
        zzaco zzacoVar;
        try {
            InputStream inputStream = this.zzg;
            if (inputStream != null) {
                this.zzg = null;
            } else if (this.zzp <= 0 || !zzs()) {
                inputStream = null;
            } else {
                int i = this.zzi;
                this.zzi = 0;
                if (i == 1) {
                    zzact zzactVar = (zzact) this.zzj.remove(0);
                    int i2 = zzactVar.zzc;
                    zzacoVar = new zzaco(zzactVar.zzb);
                } else {
                    byte[][] bArr = new byte[i][];
                    int length = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        byte[] bArr2 = ((zzact) this.zzj.remove(0)).zzb;
                        bArr2.getClass();
                        bArr[i3] = bArr2;
                        length += bArr2.length;
                    }
                    zzacoVar = new zzaco(bArr, length);
                }
                this.zzh += i;
                zzq();
                inputStream = zzacoVar;
            }
            if (inputStream != null) {
                this.zzp--;
            } else {
                this.zzr = false;
                if (zzt() && !zzo()) {
                    zzl(zzacs.ALL_MESSAGES_DELIVERED);
                    zzi();
                    return null;
                }
            }
            return inputStream;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzg(zzabe zzabeVar) {
        zzp(zzabeVar, zzabeVar, false);
    }

    public final void zzh(zzabe zzabeVar) {
        zzp(zzabe.zzb, zzabeVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0048  */
    /* JADX WARN: Code duplicated, block: B:52:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0008 A[SYNTHETIC] */
    public final void zzi() {
        int iOrdinal;
        if (this.zzq) {
            return;
        }
        this.zzq = true;
        while (true) {
            int iOrdinal2 = this.zzn.ordinal();
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3 || this.zzf == null || !this.zzk) {
                    break;
                }
                iOrdinal = this.zzn.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new AssertionError();
                    }
                } else if (!this.zzr) {
                    if (zzs()) {
                        this.zzr = true;
                        this.zzf.zzf(this);
                    } else if (this.zzk) {
                        zzl(zzacs.ALL_MESSAGES_DELIVERED);
                    }
                }
                if (this.zzk) {
                    zzl(zzacs.SUFFIX_DELIVERED);
                    zzb();
                }
            } else {
                if (this.zzf == null || this.zzr) {
                    break;
                }
                if (zzs()) {
                    if (this.zzp == 0) {
                        break;
                    }
                    iOrdinal = this.zzn.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new AssertionError();
                        }
                    } else if (!this.zzr) {
                        if (zzs()) {
                            this.zzr = true;
                            this.zzf.zzf(this);
                        } else if (this.zzk) {
                            zzl(zzacs.ALL_MESSAGES_DELIVERED);
                        }
                    }
                    if (this.zzk) {
                        zzl(zzacs.SUFFIX_DELIVERED);
                        zzb();
                    }
                } else {
                    if (!zzt()) {
                        break;
                    }
                    iOrdinal = this.zzn.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new AssertionError();
                        }
                    } else if (!this.zzr) {
                        if (zzs()) {
                            this.zzr = true;
                            this.zzf.zzf(this);
                        } else if (this.zzk) {
                            zzl(zzacs.ALL_MESSAGES_DELIVERED);
                        }
                    }
                    if (this.zzk) {
                        zzl(zzacs.SUFFIX_DELIVERED);
                        zzb();
                    }
                }
            }
        }
        this.zzq = false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009a A[Catch: all -> 0x0020, zzabf -> 0x0023, TryCatch #1 {zzabf -> 0x0023, blocks: (B:8:0x000a, B:10:0x0017, B:17:0x0026, B:19:0x003a, B:21:0x0044, B:23:0x0049, B:25:0x0053, B:26:0x0056, B:30:0x005d, B:32:0x0061, B:35:0x0067, B:37:0x006b, B:41:0x0072, B:42:0x0080, B:43:0x0089, B:45:0x009a, B:46:0x00a3, B:48:0x00ab, B:50:0x00b8, B:51:0x00be, B:52:0x00c7, B:53:0x00de, B:55:0x00e1, B:56:0x00e8, B:58:0x00ec, B:60:0x00f0, B:63:0x00f8, B:64:0x0100, B:67:0x010f, B:68:0x011d), top: B:77:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[Catch: all -> 0x0020, zzabf -> 0x0023, TryCatch #1 {zzabf -> 0x0023, blocks: (B:8:0x000a, B:10:0x0017, B:17:0x0026, B:19:0x003a, B:21:0x0044, B:23:0x0049, B:25:0x0053, B:26:0x0056, B:30:0x005d, B:32:0x0061, B:35:0x0067, B:37:0x006b, B:41:0x0072, B:42:0x0080, B:43:0x0089, B:45:0x009a, B:46:0x00a3, B:48:0x00ab, B:50:0x00b8, B:51:0x00be, B:52:0x00c7, B:53:0x00de, B:55:0x00e1, B:56:0x00e8, B:58:0x00ec, B:60:0x00f0, B:63:0x00f8, B:64:0x0100, B:67:0x010f, B:68:0x011d), top: B:77:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[Catch: all -> 0x0020, zzabf -> 0x0023, LOOP:0: B:48:0x00ab->B:79:?, LOOP_START, TryCatch #1 {zzabf -> 0x0023, blocks: (B:8:0x000a, B:10:0x0017, B:17:0x0026, B:19:0x003a, B:21:0x0044, B:23:0x0049, B:25:0x0053, B:26:0x0056, B:30:0x005d, B:32:0x0061, B:35:0x0067, B:37:0x006b, B:41:0x0072, B:42:0x0080, B:43:0x0089, B:45:0x009a, B:46:0x00a3, B:48:0x00ab, B:50:0x00b8, B:51:0x00be, B:52:0x00c7, B:53:0x00de, B:55:0x00e1, B:56:0x00e8, B:58:0x00ec, B:60:0x00f0, B:63:0x00f8, B:64:0x0100, B:67:0x010f, B:68:0x011d), top: B:77:0x000a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00be A[Catch: all -> 0x0020, zzabf -> 0x0023, TryCatch #1 {zzabf -> 0x0023, blocks: (B:8:0x000a, B:10:0x0017, B:17:0x0026, B:19:0x003a, B:21:0x0044, B:23:0x0049, B:25:0x0053, B:26:0x0056, B:30:0x005d, B:32:0x0061, B:35:0x0067, B:37:0x006b, B:41:0x0072, B:42:0x0080, B:43:0x0089, B:45:0x009a, B:46:0x00a3, B:48:0x00ab, B:50:0x00b8, B:51:0x00be, B:52:0x00c7, B:53:0x00de, B:55:0x00e1, B:56:0x00e8, B:58:0x00ec, B:60:0x00f0, B:63:0x00f8, B:64:0x0100, B:67:0x010f, B:68:0x011d), top: B:77:0x000a, outer: #0 }] */
    public final synchronized void zzj(Parcel parcel) {
        zzact zzactVar;
        int i;
        if (zzo()) {
            return;
        }
        try {
            int i2 = parcel.readInt();
            if (zzadq.zzc(i2, 8)) {
                zzabe zzabeVarZza = zzadq.zza(i2, parcel);
                zzp(zzabeVarZza, zzabeVarZza, true);
                return;
            }
            int i3 = parcel.readInt();
            boolean zZzc = zzadq.zzc(i2, 1);
            boolean zZzc2 = zzadq.zzc(i2, 2);
            boolean zZzc3 = zzadq.zzc(i2, 4);
            if (zZzc) {
                zzc(i2, parcel);
                zzl(zzacs.PREFIX_DELIVERED);
            }
            if (zZzc2) {
                if ((i2 & 64) != 0) {
                    throw new zzabf(zzabe.zze.zze("Parcelable messages not allowed"), null);
                }
                int i4 = parcel.readInt();
                byte[] bArrZzc = zzacp.zzc(i4);
                if (i4 > 0) {
                    parcel.readByteArray(bArrZzc);
                }
                int i5 = i2 & 128;
                boolean z = i5 == 0;
                if (this.zzj != null) {
                    zzactVar = new zzact(null, bArrZzc, i4, z);
                    i = i3 - this.zzh;
                    if (i < this.zzj.size()) {
                        this.zzj.set(i, zzactVar);
                        zzq();
                    } else if (i > this.zzj.size()) {
                        do {
                            this.zzj.add(null);
                        } while (i > this.zzj.size());
                        this.zzj.add(zzactVar);
                    } else {
                        this.zzj.add(zzactVar);
                        zzq();
                    }
                } else if (this.zzo == 0 && i5 == 0 && i3 == this.zzh) {
                    c95.m31855u(this.zzg == null);
                    this.zzg = new zzaco(bArrZzc);
                    zzr(i4);
                } else {
                    this.zzj = new ArrayList(16);
                    zzactVar = new zzact(null, bArrZzc, i4, z);
                    i = i3 - this.zzh;
                    if (i < this.zzj.size()) {
                        this.zzj.set(i, zzactVar);
                        zzq();
                    } else if (i > this.zzj.size()) {
                        do {
                            this.zzj.add(null);
                        } while (i > this.zzj.size());
                        this.zzj.add(zzactVar);
                    } else {
                        this.zzj.add(zzactVar);
                        zzq();
                    }
                }
            }
            if (zZzc3) {
                zzd(i2, parcel);
                this.zzl = i3;
                this.zzk = true;
            }
            int i6 = this.zzh;
            if (i3 == i6) {
                ArrayList arrayList = this.zzj;
                if (arrayList == null) {
                    this.zzh = i6 + 1;
                } else if (!zZzc2 && !zZzc3) {
                    arrayList.remove(0);
                    this.zzh++;
                }
            }
            int iDataSize = this.zzm + parcel.dataSize();
            this.zzm = iDataSize;
            zzaos zzaosVar = this.zze;
            if (zzaosVar != null && iDataSize != 0) {
                zzaosVar.zzh(iDataSize);
                this.zze.zzg(this.zzm);
                this.zzm = 0;
            }
            zzi();
        } catch (zzabf e) {
            zzabe zzabeVarZza2 = e.zza();
            zzp(zzabeVarZza2, zzabeVarZza2, false);
        }
    }

    public final void zzk(zzadh zzadhVar, zzaov zzaovVar) {
        this.zzd = zzadhVar;
        this.zze = zzadhVar.zzc();
        this.zzf = zzaovVar;
        if (zzo()) {
            return;
        }
        zzl(zzacs.INITIALIZED);
    }

    public final void zzl(zzacs zzacsVar) {
        zzacs zzacsVar2 = this.zzn;
        int iOrdinal = zzacsVar.ordinal();
        if (iOrdinal == 1) {
            c95.m31858x(zzacsVar2 == zzacs.UNINITIALIZED, "%s -> %s", zzacsVar2, zzacsVar);
        } else if (iOrdinal == 2) {
            c95.m31858x(zzacsVar2 == zzacs.INITIALIZED || zzacsVar2 == zzacs.UNINITIALIZED, "%s -> %s", zzacsVar2, zzacsVar);
        } else if (iOrdinal == 3) {
            c95.m31858x(zzacsVar2 == zzacs.PREFIX_DELIVERED, "%s -> %s", zzacsVar2, zzacsVar);
        } else if (iOrdinal == 4) {
            c95.m31858x(zzacsVar2 == zzacs.ALL_MESSAGES_DELIVERED, "%s -> %s", zzacsVar2, zzacsVar);
        } else if (iOrdinal != 5) {
            throw new AssertionError();
        }
        this.zzn = zzacsVar;
    }

    public final void zzm() {
        zzadh zzadhVar;
        zzaov zzaovVar;
        synchronized (this) {
            zzadhVar = this.zzd;
            zzaovVar = this.zzf;
        }
        if (zzaovVar != null) {
            zzaovVar.zzg();
        }
        if (zzadhVar != null) {
            try {
                synchronized (zzadhVar) {
                    zzadhVar.zzg();
                }
            } catch (zzabf e) {
                synchronized (this) {
                    zzabe zzabeVarZza = e.zza();
                    zzp(zzabeVarZza, zzabeVarZza, false);
                }
            }
        }
    }

    public final void zzn(int i) {
        this.zzp += i;
        zzi();
    }

    public final boolean zzo() {
        return this.zzn == zzacs.CLOSED;
    }
}
