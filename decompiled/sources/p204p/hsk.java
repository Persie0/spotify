package p204p;

import com.spotify.logging.logging.Logging;

/* JADX INFO: loaded from: classes8.dex */
public final class hsk implements qql0 {
    @Override // p204p.qql0
    /* JADX INFO: renamed from: a */
    public final void mo25857a() {
        Logging.INSTANCE.deinitLogging();
    }

    @Override // p204p.qql0
    public final String getName() {
        return "CoreLoggingShutdownOperation";
    }
}
