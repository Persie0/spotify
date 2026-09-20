package p204p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class aqr implements fqr {

    /* JADX INFO: renamed from: a */
    public final NsdServiceInfo f18764a;

    public /* synthetic */ aqr(NsdServiceInfo nsdServiceInfo) {
        this.f18764a = nsdServiceInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqr) {
            return wj50.m88271j(this.f18764a, ((aqr) obj).f18764a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18764a.hashCode();
    }

    public final String toString() {
        return "FoundService(serviceInfo=" + this.f18764a + ")";
    }
}
