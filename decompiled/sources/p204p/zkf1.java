package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zkf1 extends qmd0 {

    /* JADX INFO: renamed from: f */
    public static final ura0 f283741f = new ura0("MRDiscoveryCallback", null);

    /* JADX INFO: renamed from: e */
    public final sqe1 f283746e;

    /* JADX INFO: renamed from: c */
    public final Map f283744c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f283745d = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final Set f283743b = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: a */
    public final skf1 f283742a = new skf1(this);

    public zkf1(Context context) {
        this.f283746e = new sqe1(context);
    }

    @Override // p204p.qmd0
    /* JADX INFO: renamed from: d */
    public final void mo45068d(zmd0 zmd0Var, wmd0 wmd0Var) {
        f283741f.m83848a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        m96323l(wmd0Var, true);
    }

    @Override // p204p.qmd0
    /* JADX INFO: renamed from: e */
    public final void mo45069e(zmd0 zmd0Var, wmd0 wmd0Var) {
        f283741f.m83848a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        m96323l(wmd0Var, true);
    }

    @Override // p204p.qmd0
    /* JADX INFO: renamed from: h */
    public final void mo45072h(zmd0 zmd0Var, wmd0 wmd0Var) {
        f283741f.m83848a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        m96323l(wmd0Var, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m96323l(wmd0 wmd0Var, boolean z) {
        boolean z2;
        boolean zRemove;
        ura0 ura0Var = f283741f;
        ura0Var.m83848a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), wmd0Var);
        Map map = this.f283744c;
        synchronized (map) {
            try {
                String strValueOf = String.valueOf(map.keySet());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
                sb.append("appIdToRouteInfo has these appId route keys: ");
                sb.append(strValueOf);
                ura0Var.m83848a(sb.toString(), new Object[0]);
                z2 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    mkf1 mkf1Var = (mkf1) entry.getValue();
                    if (wmd0Var.m88560g(mkf1Var.f144580b)) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb2.append("Adding/updating route for appId ");
                            sb2.append(str);
                            ura0Var.m83848a(sb2.toString(), new Object[0]);
                            zRemove = mkf1Var.f144579a.add(wmd0Var);
                            if (!zRemove) {
                                String strValueOf2 = String.valueOf(wmd0Var);
                                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 32 + String.valueOf(str).length());
                                sb3.append("Route ");
                                sb3.append(strValueOf2);
                                sb3.append(" already exists for appId ");
                                sb3.append(str);
                                ura0Var.m83850c(sb3.toString(), new Object[0]);
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb4.append("Removing route for appId ");
                            sb4.append(str);
                            ura0Var.m83848a(sb4.toString(), new Object[0]);
                            zRemove = mkf1Var.f144579a.remove(wmd0Var);
                            if (!zRemove) {
                                String strValueOf3 = String.valueOf(wmd0Var);
                                StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 34 + String.valueOf(str).length());
                                sb5.append("Route ");
                                sb5.append(strValueOf3);
                                sb5.append(" already removed from appId ");
                                sb5.append(str);
                                ura0Var.m83850c(sb5.toString(), new Object[0]);
                            }
                        }
                        z2 = zRemove;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            f283741f.m83848a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f283743b) {
                try {
                    HashMap map2 = new HashMap();
                    Map map3 = this.f283744c;
                    synchronized (map3) {
                        try {
                            for (String str2 : map3.keySet()) {
                                mkf1 mkf1Var2 = (mkf1) map3.get(bjf1.m29413u(str2));
                                Set setM52904p = mkf1Var2 == null ? jbg1.m52904p() : jbg1.m52906r(mkf1Var2.f144579a);
                                if (!setM52904p.isEmpty()) {
                                    map2.put(str2, setM52904p);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    zgf1.m96078a(map2.entrySet());
                    Iterator it = this.f283743b.iterator();
                    if (it.hasNext()) {
                        ikc0.m50942n(it.next());
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m96324m() {
        int size = this.f283745d.size();
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 33);
        sb.append("Starting RouteDiscovery with ");
        sb.append(size);
        sb.append(" IDs");
        ura0 ura0Var = f283741f;
        ura0Var.m83848a(sb.toString(), new Object[0]);
        ura0Var.m83848a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f283744c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m96325n();
        } else {
            new ywh0(Looper.getMainLooper(), 5).post(new ukf1(this, 0));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m96325n() {
        sqe1 sqe1Var = this.f283746e;
        sqe1Var.m78953h(this);
        LinkedHashSet<String> linkedHashSet = this.f283745d;
        synchronized (linkedHashSet) {
            try {
                for (String str : linkedHashSet) {
                    String strM45876s = gv90.m45876s(str);
                    if (strM45876s == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(strM45876s)) {
                        arrayList.add(strM45876s);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    omd0 omd0Var = new omd0(bundle, arrayList);
                    Map map = this.f283744c;
                    if (((mkf1) map.get(str)) == null) {
                        map.put(str, new mkf1(omd0Var));
                    }
                    ura0 ura0Var = f283741f;
                    String strM45876s2 = gv90.m45876s(str);
                    StringBuilder sb = new StringBuilder(strM45876s2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(strM45876s2);
                    ura0Var.m83848a(sb.toString(), new Object[0]);
                    sqe1Var.m78952g(omd0Var, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.f283744c;
        f283741f.m83848a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }
}
