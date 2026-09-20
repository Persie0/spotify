package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class zzxd {
    static final zzxe zza;

    static {
        zzxe zzabnVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            zzabnVar = (zzxe) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzxe.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            zzabnVar = new zzabn();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        zza = zzabnVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            zzxf.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
