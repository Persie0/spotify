package p204p;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class e04 {

    /* JADX INFO: renamed from: a */
    public final InetAddress f54842a;

    /* JADX INFO: renamed from: b */
    public final int f54843b;

    public e04(InetAddress inetAddress, int i) {
        this.f54842a = inetAddress;
        this.f54843b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04)) {
            return false;
        }
        e04 e04Var = (e04) obj;
        return wj50.m88271j(this.f54842a, e04Var.f54842a) && this.f54843b == e04Var.f54843b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54843b) + (this.f54842a.hashCode() * 31);
    }
}
