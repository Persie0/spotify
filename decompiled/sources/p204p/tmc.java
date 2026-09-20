package p204p;

import io.ably.lib.types.ErrorInfo;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes16.dex */
public final class tmc extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Timer f221648a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uuf f221649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ znc f221650c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bnc f221651d;

    public tmc(bnc bncVar, Timer timer, uuf uufVar, znc zncVar) {
        this.f221651d = bncVar;
        this.f221648a = timer;
        this.f221649b = uufVar;
        this.f221650c = zncVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        synchronized (this.f221651d) {
            try {
                Timer timer = this.f221648a;
                bnc bncVar = this.f221651d;
                if (timer != bncVar.f28793l) {
                    return;
                }
                bncVar.f28793l = null;
                if (bncVar.f28786e == znc.detaching) {
                    ErrorInfo errorInfo = new ErrorInfo("Detach operation timed out", 90007);
                    bnc.m29940h(this.f221649b, errorInfo);
                    this.f221651d.m29954s(this.f221650c, errorInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
