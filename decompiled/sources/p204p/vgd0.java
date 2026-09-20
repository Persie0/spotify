package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class vgd0 {

    /* JADX INFO: renamed from: a */
    public AtomicReference f241230a;

    /* JADX INFO: renamed from: a */
    public final tgd0 m85429a() {
        Object obj = this.f241230a.get();
        if (((tgd0) obj) instanceof ugd0) {
            Logger.m3965a("MLS: delegate is DefaultDelegate — service not fully initialized", new Object[0]);
        }
        return (tgd0) obj;
    }
}
