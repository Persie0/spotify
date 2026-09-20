package p204p;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes11.dex */
public final class xob implements yob {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263818a;

    /* JADX INFO: renamed from: b */
    public final Object f263819b;

    public /* synthetic */ xob(Object obj, int i) {
        this.f263818a = i;
        this.f263819b = obj;
    }

    @Override // p204p.yob
    /* JADX INFO: renamed from: a */
    public final void mo28626a(Throwable th) {
        switch (this.f263818a) {
            case 0:
                ((ScheduledFuture) this.f263819b).cancel(false);
                break;
            default:
                ((gh00) this.f263819b).invoke(th);
                break;
        }
    }

    public final String toString() {
        switch (this.f263818a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f263819b) + ']';
            default:
                return "CancelHandler.UserSupplied[" + opo.m67555e((gh00) this.f263819b) + '@' + opo.m67556f(this) + ']';
        }
    }
}
