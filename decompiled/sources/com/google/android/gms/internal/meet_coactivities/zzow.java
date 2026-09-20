package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzow {
    private static final Comparator zza = new zzop();
    private static final zzow zzb = new zzow(new zzou(Collections.EMPTY_LIST));
    private final zzou zzc;

    private zzow(zzou zzouVar) {
        this.zzc = zzouVar;
    }

    public static zzow zza() {
        return zzb;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzow) && ((zzow) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzow zzb(zzow zzowVar) {
        if (zzowVar.zzc.isEmpty()) {
            return this;
        }
        return this.zzc.isEmpty() ? zzowVar : new zzow(new zzou(this.zzc, zzowVar.zzc));
    }

    public final Map zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzc.isEmpty();
    }
}
