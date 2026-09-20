package p204p;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class smx0 {

    /* JADX INFO: renamed from: a */
    public final yv1 f210738a;

    /* JADX INFO: renamed from: b */
    public final Proxy f210739b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f210740c;

    public smx0(yv1 yv1Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.f210738a = yv1Var;
        this.f210739b = proxy;
        this.f210740c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof smx0)) {
            return false;
        }
        smx0 smx0Var = (smx0) obj;
        return wj50.m88271j(smx0Var.f210738a, this.f210738a) && wj50.m88271j(smx0Var.f210739b, this.f210739b) && wj50.m88271j(smx0Var.f210740c, this.f210740c);
    }

    public final int hashCode() {
        return this.f210740c.hashCode() + ((this.f210739b.hashCode() + ((this.f210738a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        ph30 ph30Var = this.f210738a.f276529h;
        String str = ph30Var.f177459d;
        InetSocketAddress inetSocketAddress = this.f210740c;
        InetAddress address = inetSocketAddress.getAddress();
        String strM92455b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : xze1.m92455b(hostAddress);
        if (wl51.m88497u0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (ph30Var.f177460e != inetSocketAddress.getPort() || wj50.m88271j(str, strM92455b)) {
            sb.append(":");
            sb.append(ph30Var.f177460e);
        }
        if (!wj50.m88271j(str, strM92455b)) {
            if (this.f210739b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM92455b == null) {
                sb.append("<unresolved>");
            } else if (wl51.m88497u0(strM92455b, ':')) {
                sb.append("[");
                sb.append(strM92455b);
                sb.append("]");
            } else {
                sb.append(strM92455b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
