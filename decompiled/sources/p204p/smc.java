package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes16.dex */
public final class smc extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Timer f210621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bnc f210622c;

    public /* synthetic */ smc(bnc bncVar, Timer timer, int i) {
        this.f210620a = i;
        this.f210622c = bncVar;
        this.f210621b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f210620a) {
            case 0:
                Locale locale = Locale.ROOT;
                String str = "Attach timed out for channel " + this.f210622c.f28784c;
                tx8.m81897l(bnc.f28783x, str);
                synchronized (this.f210622c) {
                    try {
                        bnc bncVar = this.f210622c;
                        if (bncVar.f28793l != this.f210621b) {
                            return;
                        }
                        bncVar.f28793l = null;
                        if (bncVar.f28786e == znc.attaching) {
                            bncVar.m29955t(new ErrorInfo(str, 90007));
                            this.f210622c.m29949n();
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                synchronized (this.f210622c) {
                    try {
                        Timer timer = this.f210621b;
                        bnc bncVar2 = this.f210622c;
                        if (timer != bncVar2.f28794m) {
                            return;
                        }
                        bncVar2.f28794m = null;
                        if (bncVar2.f28786e == znc.suspended) {
                            try {
                                bncVar2.m29944g(false, null);
                            } catch (AblyException e) {
                                tx8.m81890e(bnc.f28783x, "Reattach channel failed; channel = " + this.f210622c.f28784c, e);
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
