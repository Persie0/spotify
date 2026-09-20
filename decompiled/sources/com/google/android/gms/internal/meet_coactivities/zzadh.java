package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzadh {
    private final zzacn zza;
    private final int zzb;
    private final zzaos zzc;
    private boolean zzd;
    private InputStream zze;
    private Queue zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk = 1;

    public /* synthetic */ zzadh(zzacn zzacnVar, int i, zzaos zzaosVar, zzadg zzadgVar) {
        this.zza = zzacnVar;
        this.zzb = i;
        this.zzc = zzaosVar;
    }

    private final void zzb(int i) {
        int i2 = this.zzk;
        int i3 = i - 1;
        if (i3 == 1) {
            c95.m31855u(i2 == 1);
        } else if (i3 == 2) {
            c95.m31855u(i2 == 2);
        } else if (i3 == 3) {
            c95.m31855u(i2 == 3);
        }
        this.zzk = i;
    }

    public final synchronized String toString() {
        String simpleName;
        String str;
        try {
            simpleName = getClass().getSimpleName();
            int i = this.zzk;
            if (i == 1) {
                str = "INITIAL";
            } else if (i == 2) {
                str = "PREFIX_SENT";
            } else if (i == 3) {
                str = "ALL_MESSAGES_SENT";
            } else if (i != 4) {
                str = i != 5 ? "null" : "CLOSED";
            } else {
                str = "SUFFIX_SENT";
            }
        } catch (Throwable th) {
            throw th;
        }
        return simpleName + "[S=" + str + "/NDM=" + this.zzi + "]";
    }

    public abstract int zza(Parcel parcel);

    public final zzaos zzc() {
        return this.zzc;
    }

    public final void zzd(InputStream inputStream) {
        this.zzd = true;
        Queue queue = this.zzf;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.zze == null) {
                this.zze = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.zzf = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    public final void zze() {
        this.zzd = true;
    }

    public final void zzf() {
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c0 A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:22:0x0033, B:75:0x0102, B:77:0x010d, B:28:0x0056, B:29:0x005b, B:38:0x007a, B:40:0x007e, B:46:0x008f, B:48:0x0099, B:58:0x00bb, B:60:0x00c0, B:62:0x00cb, B:63:0x00d3, B:64:0x00e3, B:70:0x00f4, B:72:0x00f8, B:74:0x00fe, B:65:0x00e7, B:66:0x00ea, B:67:0x00eb, B:68:0x00ed, B:69:0x00ee, B:41:0x0081, B:43:0x0085, B:33:0x0062, B:35:0x0074, B:84:0x0137, B:49:0x009d, B:51:0x00a3, B:55:0x00ab), top: B:102:0x0033, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:22:0x0033, B:75:0x0102, B:77:0x010d, B:28:0x0056, B:29:0x005b, B:38:0x007a, B:40:0x007e, B:46:0x008f, B:48:0x0099, B:58:0x00bb, B:60:0x00c0, B:62:0x00cb, B:63:0x00d3, B:64:0x00e3, B:70:0x00f4, B:72:0x00f8, B:74:0x00fe, B:65:0x00e7, B:66:0x00ea, B:67:0x00eb, B:68:0x00ed, B:69:0x00ee, B:41:0x0081, B:43:0x0085, B:33:0x0062, B:35:0x0074, B:84:0x0137, B:49:0x009d, B:51:0x00a3, B:55:0x00ab), top: B:102:0x0033, inners: #1 }] */
    public final void zzg() throws zzabf {
        int iZza;
        InputStream inputStream;
        int i;
        int i2;
        while (true) {
            int i3 = this.zzk;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            boolean z = true;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 || !this.zzg) {
                        return;
                    }
                } else if (!zzi() && !this.zzg) {
                    return;
                }
            } else if (!this.zzd) {
                return;
            }
            if (!this.zza.zzv()) {
                return;
            }
            try {
                try {
                    zzadi zzadiVarZzc = zzadi.zzc();
                    try {
                        int i5 = 0;
                        zzadiVarZzc.zza().writeInt(0);
                        Parcel parcelZza = zzadiVarZzc.zza();
                        int i6 = this.zzh;
                        this.zzh = i6 + 1;
                        parcelZza.writeInt(i6);
                        int i7 = this.zzk;
                        int i8 = i7 - 1;
                        if (i7 == 0) {
                            throw null;
                        }
                        if (i8 != 0) {
                            if (i8 == 1) {
                                iZza = 0;
                            } else if (i8 != 2) {
                                throw new AssertionError();
                            }
                            zzadiVarZzc.zza();
                            iZza = i5 | 4;
                            zzb(4);
                            zzadq.zzb(zzadiVarZzc.zza(), iZza);
                            int iDataSize = zzadiVarZzc.zza().dataSize();
                            this.zza.zzr(this.zzb, zzadiVarZzc);
                            long j = iDataSize;
                            this.zzc.zzl(j);
                            this.zzc.zzk(j);
                            zzadiVarZzc.close();
                        } else {
                            iZza = zza(zzadiVarZzc.zza()) | 1;
                            zzb(2);
                            if (zzi() || this.zzg) {
                            }
                            zzadq.zzb(zzadiVarZzc.zza(), iZza);
                            int iDataSize2 = zzadiVarZzc.zza().dataSize();
                            this.zza.zzr(this.zzb, zzadiVarZzc);
                            long j2 = iDataSize2;
                            this.zzc.zzl(j2);
                            this.zzc.zzk(j2);
                            zzadiVarZzc.close();
                        }
                        if (this.zzi == 0) {
                            inputStream = this.zze;
                        } else {
                            Queue queue = this.zzf;
                            inputStream = queue != null ? (InputStream) queue.peek() : null;
                        }
                        if (inputStream != null) {
                            int i9 = iZza | 2;
                            Parcel parcelZza2 = zzadiVarZzc.zza();
                            if (inputStream instanceof zzadj) {
                                throw null;
                            }
                            byte[] bArrZzb = zzacp.zzb();
                            try {
                                int i10 = inputStream.read(bArrZzb);
                                if (i10 <= 0) {
                                    parcelZza2.writeInt(0);
                                } else {
                                    parcelZza2.writeInt(i10);
                                    parcelZza2.writeByteArray(bArrZzb, 0, i10);
                                    this.zzj += i10;
                                    if (i10 == bArrZzb.length) {
                                        i = 128;
                                    }
                                    zzacp.zza(bArrZzb);
                                    if (!z) {
                                        inputStream.close();
                                        i2 = this.zzi;
                                        this.zzi = i2 + 1;
                                        if (i2 > 0) {
                                            Queue queue2 = this.zzf;
                                            queue2.getClass();
                                            queue2.poll();
                                        }
                                        this.zzc.zzi(i2);
                                        zzaos zzaosVar = this.zzc;
                                        long j3 = this.zzj;
                                        zzaosVar.zzj(i2, j3, j3);
                                        this.zzj = 0;
                                    }
                                    i5 = i9 | i;
                                }
                                z = false;
                                i = 0;
                                zzacp.zza(bArrZzb);
                                if (!z) {
                                    inputStream.close();
                                    i2 = this.zzi;
                                    this.zzi = i2 + 1;
                                    if (i2 > 0) {
                                        Queue queue3 = this.zzf;
                                        queue3.getClass();
                                        queue3.poll();
                                    }
                                    this.zzc.zzi(i2);
                                    zzaos zzaosVar2 = this.zzc;
                                    long j4 = this.zzj;
                                    zzaosVar2.zzj(i2, j4, j4);
                                    this.zzj = 0;
                                }
                                i5 = i9 | i;
                            } catch (Throwable th) {
                                zzacp.zza(bArrZzb);
                                throw th;
                            }
                        } else {
                            c95.m31855u(this.zzg);
                            i5 = iZza;
                        }
                        if (!this.zzg || zzi()) {
                            iZza = i5;
                        } else {
                            zzb(3);
                            zzadiVarZzc.zza();
                            iZza = i5 | 4;
                            zzb(4);
                        }
                        zzadq.zzb(zzadiVarZzc.zza(), iZza);
                        int iDataSize3 = zzadiVarZzc.zza().dataSize();
                        this.zza.zzr(this.zzb, zzadiVarZzc);
                        long j5 = iDataSize3;
                        this.zzc.zzl(j5);
                        this.zzc.zzk(j5);
                        zzadiVarZzc.close();
                    } catch (Throwable th2) {
                        try {
                            zzadiVarZzc.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    throw new zzabf(zzabe.zzj.zzd(e), null);
                }
            } catch (zzabf e2) {
                zzb(5);
                throw e2;
            }
        }
    }

    public final boolean zzh() {
        return this.zza.zzv();
    }

    public final boolean zzi() {
        Queue queue = this.zzf;
        if (queue != null) {
            return !queue.isEmpty();
        }
        return this.zze != null && this.zzi == 0;
    }
}
