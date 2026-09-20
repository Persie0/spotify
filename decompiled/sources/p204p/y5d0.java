package p204p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class y5d0 implements a6d0 {

    /* JADX INFO: renamed from: a */
    public final NsdServiceInfo f269413a;

    public y5d0(NsdServiceInfo nsdServiceInfo) {
        this.f269413a = nsdServiceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5d0) && wj50.m88271j(this.f269413a, ((y5d0) obj).f269413a);
    }

    public final int hashCode() {
        return this.f269413a.hashCode();
    }
}
