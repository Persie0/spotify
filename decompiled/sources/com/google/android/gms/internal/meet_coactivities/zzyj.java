package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicLong;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyj {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzyj(String str, String str2, long j) {
        c95.m31848n(str, "typeName");
        c95.m31844j(!str.isEmpty(), "empty type");
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzyj zzb(Class cls, String str) {
        c95.m31848n(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzc(simpleName, str);
    }

    public static zzyj zzc(String str, String str2) {
        return new zzyj(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb + "<" + this.zzd + ">");
        if (this.zzc != null) {
            sb.append(": (");
            sb.append(this.zzc);
            sb.append(')');
        }
        return sb.toString();
    }

    public final long zza() {
        return this.zzd;
    }
}
