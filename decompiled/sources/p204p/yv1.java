package p204p;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class yv1 {

    /* JADX INFO: renamed from: a */
    public final t6x0 f276522a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f276523b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f276524c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f276525d;

    /* JADX INFO: renamed from: e */
    public final sic f276526e;

    /* JADX INFO: renamed from: f */
    public final xzk f276527f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f276528g;

    /* JADX INFO: renamed from: h */
    public final ph30 f276529h;

    /* JADX INFO: renamed from: i */
    public final List f276530i;

    /* JADX INFO: renamed from: j */
    public final List f276531j;

    public yv1(String str, int i, t6x0 t6x0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, sic sicVar, xzk xzkVar, List list, List list2, ProxySelector proxySelector) {
        this.f276522a = t6x0Var;
        this.f276523b = socketFactory;
        this.f276524c = sSLSocketFactory;
        this.f276525d = hostnameVerifier;
        this.f276526e = sicVar;
        this.f276527f = xzkVar;
        this.f276528g = proxySelector;
        rth rthVar = new rth();
        rthVar.m76393n(sSLSocketFactory != null ? pka1.f178421b : "http");
        rthVar.m76389j(str);
        rthVar.m76392m(i);
        this.f276529h = rthVar.m76382c();
        this.f276530i = c0f1.m31139j(list);
        this.f276531j = c0f1.m31139j(list2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94672a(yv1 yv1Var) {
        return wj50.m88271j(this.f276522a, yv1Var.f276522a) && wj50.m88271j(this.f276527f, yv1Var.f276527f) && wj50.m88271j(this.f276530i, yv1Var.f276530i) && wj50.m88271j(this.f276531j, yv1Var.f276531j) && wj50.m88271j(this.f276528g, yv1Var.f276528g) && wj50.m88271j(this.f276524c, yv1Var.f276524c) && wj50.m88271j(this.f276525d, yv1Var.f276525d) && wj50.m88271j(this.f276526e, yv1Var.f276526e) && this.f276529h.f177460e == yv1Var.f276529h.f177460e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yv1)) {
            return false;
        }
        yv1 yv1Var = (yv1) obj;
        return wj50.m88271j(this.f276529h, yv1Var.f276529h) && m94672a(yv1Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f276526e) + ((Objects.hashCode(this.f276525d) + ((Objects.hashCode(this.f276524c) + ((this.f276528g.hashCode() + s571.m77244c(s571.m77244c((this.f276527f.hashCode() + ((this.f276522a.hashCode() + s571.m77243b(527, 31, this.f276529h.f177464i)) * 31)) * 31, 31, this.f276530i), 31, this.f276531j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ph30 ph30Var = this.f276529h;
        sb.append(ph30Var.f177459d);
        sb.append(':');
        sb.append(ph30Var.f177460e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f276528g);
        sb.append('}');
        return sb.toString();
    }
}
