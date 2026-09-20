package p204p;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class ayf1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ myf1 f21238a;

    public ayf1(myf1 myf1Var) {
        this.f21238a = myf1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f21238a.m63194b(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        myf1 myf1Var = this.f21238a;
        synchronized (myf1Var.f148455h) {
            try {
                myf1.f148447l.m83848a("the network is lost", new Object[0]);
                if (myf1Var.f148452e.remove(network)) {
                    myf1Var.f148451d.remove(network);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        myf1Var.m63195c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        myf1 myf1Var = this.f21238a;
        synchronized (myf1Var.f148455h) {
            myf1.f148447l.m83848a("all networks are unavailable.", new Object[0]);
            myf1Var.f148451d.clear();
            myf1Var.f148452e.clear();
        }
        myf1Var.m63195c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
