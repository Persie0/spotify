package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.Logger;
import p204p.c95;
import p204p.kgg1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapm {
    static final zzwc zza;
    private static final Logger zzb = Logger.getLogger(zzapm.class.getName());

    static {
        if (!kgg1.m56363z(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        zza = zzwc.zza("internal-stub-type");
    }

    private zzapm() {
    }

    public static zzapo zza(zzwj zzwjVar, zzapo zzapoVar) {
        c95.m31848n(zzapoVar, "responseObserver");
        zzaph zzaphVar = new zzaph(zzwjVar, true);
        zze(zzwjVar, new zzapk(zzapoVar, zzaphVar));
        return zzaphVar;
    }

    public static void zzb(zzwj zzwjVar, Object obj, zzapo zzapoVar) {
        c95.m31848n(zzapoVar, "responseObserver");
        zzd(zzwjVar, obj, new zzapk(zzapoVar, new zzaph(zzwjVar, false)));
    }

    private static RuntimeException zzc(zzwj zzwjVar, Throwable th) {
        try {
            zzwjVar.zza(null, th);
        } catch (Error | RuntimeException e) {
            zzb.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void zzd(zzwj zzwjVar, Object obj, zzapj zzapjVar) {
        zze(zzwjVar, zzapjVar);
        try {
            zzwjVar.zzd(obj);
            zzwjVar.zzb();
        } catch (Error | RuntimeException e) {
            throw zzc(zzwjVar, e);
        }
    }

    private static void zze(zzwj zzwjVar, zzapj zzapjVar) {
        zzwjVar.zze(zzapjVar, new zzzw());
        zzapjVar.zze();
    }
}
