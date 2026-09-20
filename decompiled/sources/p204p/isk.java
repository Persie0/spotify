package p204p;

import com.spotify.logging.logging.Logging;

/* JADX INFO: loaded from: classes2.dex */
public final class isk implements qql0 {

    /* JADX INFO: renamed from: a */
    public final boolean f105264a;

    public isk(boolean z) {
        this.f105264a = z;
    }

    @Override // p204p.qql0
    /* JADX INFO: renamed from: a */
    public final void mo25857a() {
        Logging.INSTANCE.initLogging(this.f105264a);
    }

    @Override // p204p.qql0
    public final String getName() {
        return "CoreLoggingStartupOperation";
    }
}
