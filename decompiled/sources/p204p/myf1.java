package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class myf1 {

    /* JADX INFO: renamed from: l */
    public static final ura0 f148447l = new ura0("ConnectivityMonitor", null);

    /* JADX INFO: renamed from: a */
    public final a9h1 f148448a;

    /* JADX INFO: renamed from: c */
    public final ConnectivityManager f148450c;

    /* JADX INFO: renamed from: f */
    public boolean f148453f;

    /* JADX INFO: renamed from: g */
    public final Context f148454g;

    /* JADX INFO: renamed from: i */
    public final boolean f148456i;

    /* JADX INFO: renamed from: j */
    public final eyf1 f148457j;

    /* JADX INFO: renamed from: k */
    public final HashSet f148458k;

    /* JADX INFO: renamed from: b */
    public final ayf1 f148449b = new ayf1(this);

    /* JADX INFO: renamed from: d */
    public final HashMap f148451d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f148452e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final Object f148455h = new Object();

    public myf1(Context context, a9h1 a9h1Var) {
        this.f148456i = Build.VERSION.SDK_INT >= 31;
        this.f148457j = new eyf1(this);
        this.f148458k = new HashSet();
        this.f148448a = a9h1Var;
        this.f148454g = context;
        this.f148450c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX INFO: renamed from: a */
    public final void m63193a() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        f148447l.m83848a("Start monitoring connectivity changes", new Object[0]);
        if (this.f148453f || (connectivityManager = this.f148450c) == null) {
            return;
        }
        Context context = this.f148454g;
        if (lzj.m60353c(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                m63194b(activeNetwork, linkProperties);
            }
            NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(1);
            if (this.f148456i) {
                builderAddTransportType.setIncludeOtherUidNetworks(true);
            } else {
                context.registerReceiver(this.f148457j, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            connectivityManager.registerNetworkCallback(builderAddTransportType.build(), this.f148449b);
            this.f148453f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m63194b(Network network, LinkProperties linkProperties) {
        synchronized (this.f148455h) {
            try {
                f148447l.m83848a("a new network is available", new Object[0]);
                HashMap map = this.f148451d;
                if (map.containsKey(network)) {
                    this.f148452e.remove(network);
                }
                map.put(network, linkProperties);
                this.f148452e.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        m63195c();
    }

    /* JADX INFO: renamed from: c */
    public final void m63195c() {
        a9h1 a9h1Var = this.f148448a;
        if (a9h1Var == null) {
            return;
        }
        HashSet hashSet = this.f148458k;
        synchronized (hashSet) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ikc0.m50942n(it.next());
                    if (!((d9h1) a9h1Var).f46837a.isShutdown()) {
                        a9h1Var.execute(new n081(this, 23));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
