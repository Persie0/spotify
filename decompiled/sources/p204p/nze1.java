package p204p;

import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes3.dex */
public final class nze1 extends oze1 {
    @Override // p204p.oze1
    /* JADX INFO: renamed from: a */
    public final void mo52876a() {
        Iterator itM79997l = t3d1.m79997l();
        while (itM79997l.hasNext()) {
            try {
                aq91.m26762c((aq91) itM79997l.next());
            } catch (ServiceConfigurationError e) {
                if (!(e.getCause() instanceof SecurityException)) {
                    throw e;
                }
            }
        }
    }
}
