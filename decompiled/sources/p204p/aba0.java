package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aba0 {

    /* JADX INFO: renamed from: f */
    public static final Object f14077f = new Object();

    /* JADX INFO: renamed from: g */
    public static aba0 f14078g;

    /* JADX INFO: renamed from: a */
    public final Context f14079a;

    /* JADX INFO: renamed from: b */
    public final HashMap f14080b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f14081c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f14082d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final un6 f14083e;

    public aba0(Context context) {
        this.f14079a = context;
        this.f14083e = new un6(this, context.getMainLooper(), 3);
    }

    /* JADX INFO: renamed from: a */
    public static aba0 m25342a(Context context) {
        aba0 aba0Var;
        synchronized (f14077f) {
            try {
                if (f14078g == null) {
                    f14078g = new aba0(context.getApplicationContext());
                }
                aba0Var = f14078g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aba0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m25343b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f14080b) {
            try {
                zaa0 zaa0Var = new zaa0(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f14080b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f14080b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(zaa0Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f14081c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f14081c.put(action, arrayList2);
                    }
                    arrayList2.add(zaa0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25344c(Intent intent) {
        int iMatch;
        synchronized (this.f14080b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14079a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.f14081c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        zaa0 zaa0Var = (zaa0) arrayList.get(i);
                        if (z) {
                            Objects.toString(zaa0Var.f281011a);
                        }
                        if (!zaa0Var.f281013c && (iMatch = zaa0Var.f281011a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(zaa0Var);
                            zaa0Var.f281013c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((zaa0) arrayList2.get(i2)).f281013c = false;
                        }
                        this.f14082d.add(new ia70(13, intent, arrayList2));
                        if (!this.f14083e.hasMessages(1)) {
                            this.f14083e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25345d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14080b) {
            try {
                ArrayList arrayList = (ArrayList) this.f14080b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    zaa0 zaa0Var = (zaa0) arrayList.get(size);
                    zaa0Var.f281014d = true;
                    for (int i = 0; i < zaa0Var.f281011a.countActions(); i++) {
                        String action = zaa0Var.f281011a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f14081c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                zaa0 zaa0Var2 = (zaa0) arrayList2.get(size2);
                                if (zaa0Var2.f281012b == broadcastReceiver) {
                                    zaa0Var2.f281014d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f14081c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
