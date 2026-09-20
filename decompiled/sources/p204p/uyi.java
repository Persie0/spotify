package p204p;

import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class uyi implements hyi {

    /* JADX INFO: renamed from: a */
    public final ErrorInfo f235259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vyi f235260b;

    public uyi(vyi vyiVar, ErrorInfo errorInfo) {
        this.f235260b = vyiVar;
        this.f235259a = errorInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        txi txiVar = this.f235260b.f246126d;
        if (txiVar.f224707c == wzi.connected) {
            txiVar.m28214b(new Object[]{new yzi(this.f235259a)}, vxi.f245759i);
        }
    }
}
