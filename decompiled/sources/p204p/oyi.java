package p204p;

import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class oyi implements zzi {

    /* JADX INFO: renamed from: a */
    public yzi f171775a;

    /* JADX INFO: renamed from: b */
    public boolean f171776b = false;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vyi f171777c;

    public oyi(vyi vyiVar) {
        this.f171777c = vyiVar;
        vyiVar.f246126d.m28216d(this);
    }

    /* JADX INFO: renamed from: b */
    public static ErrorInfo m68501b(oyi oyiVar) {
        ErrorInfo errorInfo;
        synchronized (oyiVar) {
            if (oyiVar.f171776b) {
                throw new IllegalStateException("Already closed.");
            }
            ErrorInfo errorInfo2 = vyi.f246121y;
            tx8.m81888c("p.vyi", "ConnectionWaiter.waitFor()");
            if (oyiVar.f171775a == null) {
                try {
                    oyiVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            ErrorInfo errorInfo3 = vyi.f246121y;
            tx8.m81888c("p.vyi", "ConnectionWaiter.waitFor done: currentState=" + oyiVar.f171777c.f246136n + ")");
            errorInfo = oyiVar.f171775a.f277832c;
            oyiVar.f171775a = null;
        }
        return errorInfo;
    }

    /* JADX INFO: renamed from: c */
    public static void m68502c(oyi oyiVar) {
        if (oyiVar.f171776b) {
            return;
        }
        oyiVar.f171776b = true;
        oyiVar.f171777c.f246126d.m28215c(oyiVar);
    }

    @Override // p204p.zzi
    /* JADX INFO: renamed from: a */
    public final synchronized void mo31064a(yzi yziVar) {
        this.f171775a = yziVar;
        notify();
    }
}
