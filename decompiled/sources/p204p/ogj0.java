package p204p;

import android.net.Network;

/* JADX INFO: loaded from: classes6.dex */
public final class ogj0 extends rgj0 {

    /* JADX INFO: renamed from: a */
    public final Network f165173a;

    public ogj0(Network network) {
        this.f165173a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogj0) && wj50.m88271j(this.f165173a, ((ogj0) obj).f165173a);
    }

    public final int hashCode() {
        return this.f165173a.hashCode();
    }
}
