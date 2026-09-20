package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rzx implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f204246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f204247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f204248c;

    public /* synthetic */ rzx(int i, Object obj, Object obj2) {
        this.f204246a = i;
        this.f204247b = obj;
        this.f204248c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f204246a) {
            case 0:
                vzx vzxVar = (vzx) this.f204247b;
                String str = (String) this.f204248c;
                ArrayList arrayList = vzxVar.f246578r;
                if (arrayList.contains(str)) {
                    Logger.m3965a("Client with tag %s is already connected.", str);
                }
                arrayList.add(str);
                Logger.m3965a("Client connected: %s - all connected clients: %s", str, arrayList);
                return;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f204247b;
                com.spotify.mobius.functions.Consumer consumer = (com.spotify.mobius.functions.Consumer) this.f204248c;
                synchronized (atomicBoolean) {
                    try {
                        if (!atomicBoolean.get()) {
                            consumer.accept(obj);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
