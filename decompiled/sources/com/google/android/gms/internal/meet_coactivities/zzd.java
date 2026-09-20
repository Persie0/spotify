package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd {
    private static volatile zzaac zza;
    private static volatile zzaac zzb;
    private static volatile zzaac zzc;
    private static volatile zzaac zzd;
    private static volatile zzaac zze;
    private static volatile zzaac zzf;

    private zzd() {
    }

    public static zzc zza(zzwf zzwfVar) {
        return (zzc) zzapc.zza(new zza(), zzwfVar, zzwe.zza);
    }

    public static zzaac zzb() {
        zzaac zzaacVarZzf;
        zzaac zzaacVar = zzf;
        if (zzaacVar != null) {
            return zzaacVar;
        }
        synchronized (zzd.class) {
            try {
                zzaacVarZzf = zzf;
                if (zzaacVarZzf == null) {
                    zzzy zzzyVarZza = zzaac.zza(null, null);
                    zzzyVarZza.zze(zzaaa.UNARY);
                    zzzyVarZza.zza(zzaac.zze("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "BroadcastEventNotification"));
                    zzzyVarZza.zzd(true);
                    zzzyVarZza.zzb(zzapb.zza(zzai.zzc()));
                    zzzyVarZza.zzc(zzapb.zza(zzak.zzb()));
                    zzaacVarZzf = zzzyVarZza.zzf();
                    zzf = zzaacVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaacVarZzf;
    }

    public static zzaac zzc() {
        zzaac zzaacVarZzf;
        zzaac zzaacVar = zze;
        if (zzaacVar != null) {
            return zzaacVar;
        }
        synchronized (zzd.class) {
            try {
                zzaacVarZzf = zze;
                if (zzaacVarZzf == null) {
                    zzzy zzzyVarZza = zzaac.zza(null, null);
                    zzzyVarZza.zze(zzaaa.UNARY);
                    zzzyVarZza.zza(zzaac.zze("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "BroadcastStatSample"));
                    zzzyVarZza.zzd(true);
                    zzzyVarZza.zzb(zzapb.zza(zzbg.zzc()));
                    zzzyVarZza.zzc(zzapb.zza(zzbi.zzb()));
                    zzaacVarZzf = zzzyVarZza.zzf();
                    zze = zzaacVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaacVarZzf;
    }

    public static zzaac zzd() {
        zzaac zzaacVarZzf;
        zzaac zzaacVar = zzd;
        if (zzaacVar != null) {
            return zzaacVar;
        }
        synchronized (zzd.class) {
            try {
                zzaacVarZzf = zzd;
                if (zzaacVarZzf == null) {
                    zzzy zzzyVarZza = zzaac.zza(null, null);
                    zzzyVarZza.zze(zzaaa.BIDI_STREAMING);
                    zzzyVarZza.zza(zzaac.zze("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "BroadcastStateUpdate"));
                    zzzyVarZza.zzd(true);
                    zzzyVarZza.zzb(zzapb.zza(zzbk.zzc()));
                    zzzyVarZza.zzc(zzapb.zza(zzbn.zze()));
                    zzaacVarZzf = zzzyVarZza.zzf();
                    zzd = zzaacVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaacVarZzf;
    }

    public static zzaac zze() {
        zzaac zzaacVarZzf;
        zzaac zzaacVar = zzb;
        if (zzaacVar != null) {
            return zzaacVar;
        }
        synchronized (zzd.class) {
            try {
                zzaacVarZzf = zzb;
                if (zzaacVarZzf == null) {
                    zzzy zzzyVarZza = zzaac.zza(null, null);
                    zzzyVarZza.zze(zzaaa.BIDI_STREAMING);
                    zzzyVarZza.zza(zzaac.zze("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "ConnectMeetingAsStream"));
                    zzzyVarZza.zzd(true);
                    zzzyVarZza.zzb(zzapb.zza(zzu.zzc()));
                    zzzyVarZza.zzc(zzapb.zza(zzx.zzd()));
                    zzaacVarZzf = zzzyVarZza.zzf();
                    zzb = zzaacVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaacVarZzf;
    }

    public static zzaac zzf() {
        zzaac zzaacVarZzf;
        zzaac zzaacVar = zza;
        if (zzaacVar != null) {
            return zzaacVar;
        }
        synchronized (zzd.class) {
            try {
                zzaacVarZzf = zza;
                if (zzaacVarZzf == null) {
                    zzzy zzzyVarZza = zzaac.zza(null, null);
                    zzzyVarZza.zze(zzaaa.UNARY);
                    zzzyVarZza.zza(zzaac.zze("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "ConnectMeeting"));
                    zzzyVarZza.zzd(true);
                    zzzyVarZza.zzb(zzapb.zza(zzu.zzc()));
                    zzzyVarZza.zzc(zzapb.zza(zzx.zzd()));
                    zzaacVarZzf = zzzyVarZza.zzf();
                    zza = zzaacVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaacVarZzf;
    }

    public static zzaac zzg() {
        zzaac zzaacVarZzf;
        zzaac zzaacVar = zzc;
        if (zzaacVar != null) {
            return zzaacVar;
        }
        synchronized (zzd.class) {
            try {
                zzaacVarZzf = zzc;
                if (zzaacVarZzf == null) {
                    zzzy zzzyVarZza = zzaac.zza(null, null);
                    zzzyVarZza.zze(zzaaa.UNARY);
                    zzzyVarZza.zza(zzaac.zze("com.google.android.libraries.communications.sdk.sync.api.proto.MeetActivityService", "DisconnectMeeting"));
                    zzzyVarZza.zzd(true);
                    zzzyVarZza.zzb(zzapb.zza(zzae.zzc()));
                    zzzyVarZza.zzc(zzapb.zza(zzag.zzb()));
                    zzaacVarZzf = zzzyVarZza.zzf();
                    zzc = zzaacVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaacVarZzf;
    }
}
