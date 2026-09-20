package p204p;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aa20 extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final aa20 f13746a = new aa20();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            return g6f.m43728j1(ProxySelector.getDefault().select(uri));
        } catch (Exception unused) {
            return geg1.m44518y(Proxy.NO_PROXY);
        }
    }
}
