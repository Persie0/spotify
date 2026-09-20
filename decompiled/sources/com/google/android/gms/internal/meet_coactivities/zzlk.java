package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzlk implements zzll {
    public static final zzlk zza = new zzlh();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(zzb());
        sb.append(", method=");
        sb.append(zzd());
        sb.append(", line=");
        sb.append(zza());
        if (zzc() != null) {
            sb.append(", file=");
            sb.append(zzc());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract int zza();

    public abstract String zzb();

    public abstract String zzc();

    public abstract String zzd();
}
