package p204p;

import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class thk0 implements yhk0 {

    /* JADX INFO: renamed from: a */
    public final NsdServiceInfo f220449a;

    public /* synthetic */ thk0(NsdServiceInfo nsdServiceInfo) {
        this.f220449a = nsdServiceInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof thk0) {
            return wj50.m88271j(this.f220449a, ((thk0) obj).f220449a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f220449a.hashCode();
    }

    public final String toString() {
        return "LostService(serviceInfo=" + this.f220449a + ")";
    }
}
