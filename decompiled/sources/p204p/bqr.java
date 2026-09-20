package p204p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class bqr implements fqr {

    /* JADX INFO: renamed from: a */
    public final NsdServiceInfo f29870a;

    public /* synthetic */ bqr(NsdServiceInfo nsdServiceInfo) {
        this.f29870a = nsdServiceInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bqr) {
            return wj50.m88271j(this.f29870a, ((bqr) obj).f29870a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29870a.hashCode();
    }

    public final String toString() {
        return "LostService(serviceInfo=" + this.f29870a + ")";
    }
}
