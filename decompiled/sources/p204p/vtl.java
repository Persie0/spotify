package p204p;

import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class vtl implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wtl f244685b;

    public /* synthetic */ vtl(wtl wtlVar, int i) {
        this.f244684a = i;
        this.f244685b = wtlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        utl utlVar;
        utl utlVar2;
        switch (this.f244684a) {
            case 0:
                wtl wtlVar = this.f244685b;
                AtomicReference atomicReference = wtlVar.f254964e;
                do {
                    utlVar = utl.f233937b;
                    if (atomicReference.compareAndSet(utlVar, utl.f233940e)) {
                        UrlRequest urlRequest = (UrlRequest) wtlVar.f254965f.get();
                        if (urlRequest != null) {
                            urlRequest.cancel();
                        }
                        break;
                    }
                } while (atomicReference.get() == utlVar);
                break;
            default:
                wtl wtlVar2 = this.f244685b;
                AtomicReference atomicReference2 = wtlVar2.f254964e;
                do {
                    utlVar2 = utl.f233938c;
                    if (atomicReference2.compareAndSet(utlVar2, utl.f233940e)) {
                        UrlRequest urlRequest2 = (UrlRequest) wtlVar2.f254965f.get();
                        if (urlRequest2 != null) {
                            urlRequest2.cancel();
                        }
                        break;
                    }
                } while (atomicReference2.get() == utlVar2);
                break;
        }
    }
}
