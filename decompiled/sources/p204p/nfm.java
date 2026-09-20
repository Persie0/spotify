package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nfm implements wma {
    @Override // p204p.wma
    /* JADX INFO: renamed from: d */
    public final List mo28698d(int i, int i2) {
        return Collections.singletonList(new kfm(new rq91(i)));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nfm);
    }

    @Override // p204p.wma
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return -134719520;
    }
}
