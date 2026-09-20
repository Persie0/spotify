package p204p;

import io.ably.lib.types.Message;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class anc extends hc20 implements zmc {
    public anc() {
        super(new zmc[0]);
    }

    @Override // p204p.zmc
    /* JADX INFO: renamed from: a */
    public final void mo26486a(Message message) {
        Iterator it = m47092c().iterator();
        while (it.hasNext()) {
            try {
                ((zmc) it.next()).mo26486a(message);
            } catch (Throwable th) {
                tx8.m81890e(bnc.f28783x, "Unexpected exception calling listener", th);
            }
        }
    }
}
