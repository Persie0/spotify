package p204p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class uhk0 implements yhk0 {

    /* JADX INFO: renamed from: a */
    public final NsdServiceInfo f230477a;

    public final boolean equals(Object obj) {
        if (obj instanceof uhk0) {
            return wj50.m88271j(this.f230477a, ((uhk0) obj).f230477a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f230477a.hashCode();
    }

    public final String toString() {
        return "ResolvedService(serviceInfo=" + this.f230477a + ")";
    }
}
