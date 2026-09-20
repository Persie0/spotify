package p204p;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes9.dex */
public final class wnk0 implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f253202b;

    public /* synthetic */ wnk0(int i, long j) {
        this.f253201a = i;
        this.f253202b = j;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f253201a) {
            case 0:
                ubk ubkVar = (ubk) obj2;
                long j = this.f253202b;
                ReentrantLock reentrantLock = ubkVar.f228811f;
                reentrantLock.lock();
                try {
                    j6f.m52567Y(ubkVar.f228812g, new q22(4, j));
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                ((sn71) obj2).getClass();
                new ArrayList();
                throw null;
        }
    }
}
