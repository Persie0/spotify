package com.google.android.gms.internal.meet_coactivities;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class zzpl implements Closeable {
    private static final ThreadLocal zza = new zzpk();
    private int zzb = 0;

    public static int zza() {
        return ((zzpl) zza.get()).zzb;
    }

    public static zzpl zzc() {
        zzpl zzplVar = (zzpl) zza.get();
        int i = zzplVar.zzb + 1;
        zzplVar.zzb = i;
        if (i != 0) {
            return zzplVar;
        }
        throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i - 1;
    }

    public final int zzb() {
        return this.zzb;
    }
}
