package p204p;

import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes6.dex */
public final class sgj0 extends rgj0 {

    /* JADX INFO: renamed from: a */
    public final Network f208883a;

    /* JADX INFO: renamed from: b */
    public final NetworkCapabilities f208884b;

    public sgj0(Network network, NetworkCapabilities networkCapabilities) {
        this.f208883a = network;
        this.f208884b = networkCapabilities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgj0)) {
            return false;
        }
        sgj0 sgj0Var = (sgj0) obj;
        return wj50.m88271j(this.f208883a, sgj0Var.f208883a) && wj50.m88271j(this.f208884b, sgj0Var.f208884b);
    }

    public final int hashCode() {
        return this.f208884b.hashCode() + (this.f208883a.hashCode() * 31);
    }
}
