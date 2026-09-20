package p204p;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class qda0 {

    /* JADX INFO: renamed from: a */
    public final InetAddress f187526a;

    /* JADX INFO: renamed from: b */
    public final int f187527b;

    public qda0(InetAddress inetAddress, int i) {
        this.f187526a = inetAddress;
        this.f187527b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qda0)) {
            return false;
        }
        qda0 qda0Var = (qda0) obj;
        return wj50.m88271j(this.f187526a, qda0Var.f187526a) && this.f187527b == qda0Var.f187527b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187527b) + (this.f187526a.hashCode() * 31);
    }
}
