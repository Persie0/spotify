package p204p;

import android.net.Network;

/* JADX INFO: loaded from: classes6.dex */
public final class mhj0 extends rgj0 {

    /* JADX INFO: renamed from: a */
    public final Network f143806a;

    public mhj0(Network network) {
        this.f143806a = network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhj0) && wj50.m88271j(this.f143806a, ((mhj0) obj).f143806a);
    }

    public final int hashCode() {
        return this.f143806a.hashCode();
    }
}
