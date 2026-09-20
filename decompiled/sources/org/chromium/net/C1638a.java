package org.chromium.net;

import java.util.Comparator;
import p204p.ful;

/* JADX INFO: renamed from: org.chromium.net.a */
/* JADX INFO: loaded from: classes11.dex */
public final class C1638a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ful fulVar = (ful) obj;
        ful fulVar2 = (ful) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(fulVar.f73522a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(fulVar2.f73522a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(fulVar.f73522a.getVersion(), fulVar2.f73522a.getVersion());
    }
}
