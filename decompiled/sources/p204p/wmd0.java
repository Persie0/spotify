package p204p;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class wmd0 {

    /* JADX INFO: renamed from: a */
    public final vmd0 f252810a;

    /* JADX INFO: renamed from: b */
    public final String f252811b;

    /* JADX INFO: renamed from: c */
    public final String f252812c;

    /* JADX INFO: renamed from: d */
    public String f252813d;

    /* JADX INFO: renamed from: e */
    public String f252814e;

    /* JADX INFO: renamed from: f */
    public Uri f252815f;

    /* JADX INFO: renamed from: g */
    public boolean f252816g;

    /* JADX INFO: renamed from: h */
    public final boolean f252817h;

    /* JADX INFO: renamed from: i */
    public int f252818i;

    /* JADX INFO: renamed from: j */
    public boolean f252819j;

    /* JADX INFO: renamed from: l */
    public int f252821l;

    /* JADX INFO: renamed from: m */
    public int f252822m;

    /* JADX INFO: renamed from: n */
    public int f252823n;

    /* JADX INFO: renamed from: o */
    public int f252824o;

    /* JADX INFO: renamed from: p */
    public int f252825p;

    /* JADX INFO: renamed from: q */
    public int f252826q;

    /* JADX INFO: renamed from: s */
    public Bundle f252828s;

    /* JADX INFO: renamed from: t */
    public IntentSender f252829t;

    /* JADX INFO: renamed from: u */
    public tld0 f252830u;

    /* JADX INFO: renamed from: k */
    public final ArrayList f252820k = new ArrayList();

    /* JADX INFO: renamed from: r */
    public int f252827r = -1;

    /* JADX INFO: renamed from: v */
    public ArrayList f252831v = new ArrayList();

    public wmd0(vmd0 vmd0Var, String str, String str2, boolean z) {
        this.f252810a = vmd0Var;
        this.f252811b = str;
        this.f252812c = str2;
        this.f252817h = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m88554a() {
        zmd0.m96426b();
        HashMap map = zmd0.m96427c().f143268j;
        String str = this.f252812c;
        jg10 jg10Var = (jg10) map.get(str);
        if (jg10Var != null) {
            jg10Var.m53253e();
            map.remove(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final emd0 m88555b() {
        vmd0 vmd0Var = this.f252810a;
        vmd0Var.getClass();
        zmd0.m96426b();
        return vmd0Var.f242784a;
    }

    /* JADX INFO: renamed from: c */
    public final int m88556c() {
        Bundle bundle;
        if (!this.f252831v.isEmpty()) {
            if (zmd0.f284250c == null) {
                return 0;
            }
            dnd0 dnd0Var = zmd0.m96427c().f143279u;
            if (dnd0Var != null && (bundle = dnd0Var.f50763e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                return 0;
            }
        }
        return this.f252824o;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m88557d() {
        zmd0.m96426b();
        wmd0 wmd0Var = zmd0.m96427c().f143280v;
        if (wmd0Var != null) {
            return wmd0Var == this || this.f252823n == 3 || (TextUtils.equals(m88555b().f60888b.m79868b(), "android") && m88565l("android.media.intent.category.LIVE_AUDIO") && !m88565l("android.media.intent.category.LIVE_VIDEO"));
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m88558e() {
        return this.f252830u != null && this.f252816g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m88559f() {
        zmd0.m96426b();
        return zmd0.m96427c().m61669h() == this;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m88560g(omd0 omd0Var) {
        if (omd0Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        zmd0.m96426b();
        ArrayList<IntentFilter> arrayList = this.f252820k;
        if (arrayList == null) {
            return false;
        }
        omd0Var.m67344a();
        if (omd0Var.f167019b.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                Iterator it = omd0Var.f167019b.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final int m88561h(tld0 tld0Var) {
        int i;
        wmd0 wmd0Var;
        int iCountActions;
        if (this.f252830u != tld0Var) {
            this.f252830u = tld0Var;
            if (tld0Var != null) {
                Bundle bundle = tld0Var.f221451a;
                if (p1m0.m68831l(this.f252813d, tld0Var.m81051h())) {
                    i = 0;
                } else {
                    this.f252813d = tld0Var.m81051h();
                    i = 1;
                }
                if (!p1m0.m68831l(this.f252814e, bundle.getString("status"))) {
                    this.f252814e = bundle.getString("status");
                    i = 1;
                }
                if (!p1m0.m68831l(this.f252815f, tld0Var.m81049f())) {
                    this.f252815f = tld0Var.m81049f();
                    i = 1;
                }
                if (this.f252816g != bundle.getBoolean(x09.f256832d, true)) {
                    this.f252816g = bundle.getBoolean(x09.f256832d, true);
                    i = 1;
                }
                if (this.f252818i != bundle.getInt("connectionState", 0)) {
                    this.f252818i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList arrayListM81045b = tld0Var.m81045b();
                ArrayList arrayList = this.f252820k;
                if (arrayList != arrayListM81045b) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = arrayListM81045b.listIterator();
                        while (true) {
                            if (listIterator.hasNext() && listIterator2.hasNext()) {
                                IntentFilter intentFilter = (IntentFilter) listIterator.next();
                                IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                                if (intentFilter != intentFilter2) {
                                    if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= iCountActions) {
                                                int iCountCategories = intentFilter.countCategories();
                                                if (iCountCategories == intentFilter2.countCategories()) {
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (i3 >= iCountCategories) {
                                                            continue;
                                                        } else if (intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                            } else if (intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                            }
                            arrayList.clear();
                            arrayList.addAll(tld0Var.m81045b());
                            i = 1;
                        }
                    } else {
                        arrayList.clear();
                        arrayList.addAll(tld0Var.m81045b());
                        i = 1;
                    }
                }
                if (this.f252821l != bundle.getInt("playbackType", 1)) {
                    this.f252821l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.f252822m != bundle.getInt("playbackStream", -1)) {
                    this.f252822m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.f252823n != tld0Var.m81046c()) {
                    this.f252823n = tld0Var.m81046c();
                    i = 1;
                }
                int i4 = 3;
                if (this.f252824o != tld0Var.m81053j()) {
                    this.f252824o = tld0Var.m81053j();
                    i = 3;
                }
                if (this.f252825p != tld0Var.m81052i()) {
                    this.f252825p = tld0Var.m81052i();
                    i = 3;
                }
                if (this.f252826q != tld0Var.m81054k()) {
                    this.f252826q = tld0Var.m81054k();
                } else {
                    i4 = i;
                }
                if (this.f252827r != bundle.getInt("presentationDisplayId", -1)) {
                    this.f252827r = bundle.getInt("presentationDisplayId", -1);
                    i4 |= 5;
                }
                if (!p1m0.m68831l(this.f252828s, tld0Var.m81047d())) {
                    this.f252828s = tld0Var.m81047d();
                    i4 |= 1;
                }
                if (!p1m0.m68831l(this.f252829t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.f252829t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i4 |= 1;
                }
                if (this.f252819j != bundle.getBoolean("canDisconnect", false)) {
                    this.f252819j = bundle.getBoolean("canDisconnect", false);
                    i4 |= 5;
                }
                ArrayList<String> arrayListM81048e = tld0Var.m81048e();
                ArrayList arrayList2 = new ArrayList();
                boolean z = arrayListM81048e.size() != this.f252831v.size();
                if (!arrayListM81048e.isEmpty()) {
                    mg10 mg10VarM96427c = zmd0.m96427c();
                    for (String str : arrayListM81048e) {
                        mg10VarM96427c.getClass();
                        String str2 = (String) mg10VarM96427c.f143269k.get(new qqm0(this.f252810a.f242787d.m79867a().flattenToShortString(), str));
                        Iterator it = mg10VarM96427c.f143267i.iterator();
                        do {
                            if (!it.hasNext()) {
                                wmd0Var = null;
                                break;
                            }
                            wmd0Var = (wmd0) it.next();
                        } while (!wmd0Var.f252812c.equals(str2));
                        if (wmd0Var != null) {
                            arrayList2.add(wmd0Var);
                            if (!z && !this.f252831v.contains(wmd0Var)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.f252831v = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m88562i(int i) {
        zmd0.m96426b();
        mg10 mg10VarM96427c = zmd0.m96427c();
        int iMin = Math.min(this.f252826q, Math.max(0, i));
        amd0 amd0VarM61668g = mg10VarM96427c.m61668g(this);
        if (amd0VarM61668g != null) {
            amd0VarM61668g.mo26394g(iMin);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m88563j(int i) {
        amd0 amd0VarM61668g;
        zmd0.m96426b();
        if (i == 0 || (amd0VarM61668g = zmd0.m96427c().m61668g(this)) == null) {
            return;
        }
        amd0VarM61668g.mo26397j(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m88564k(boolean z) {
        zmd0.m96426b();
        zmd0.m96427c().m61672k(this, 3, z);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m88565l(String str) {
        zmd0.m96426b();
        Iterator it = this.f252820k.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f252812c);
        sb.append(", name=");
        sb.append(this.f252813d);
        sb.append(", description=");
        sb.append(this.f252814e);
        sb.append(", iconUri=");
        sb.append(this.f252815f);
        sb.append(", enabled=");
        sb.append(this.f252816g);
        sb.append(", isSystemRoute=");
        sb.append(this.f252817h);
        sb.append(", connectionState=");
        sb.append(this.f252818i);
        sb.append(", canDisconnect=");
        sb.append(this.f252819j);
        sb.append(", playbackType=");
        sb.append(this.f252821l);
        sb.append(", playbackStream=");
        sb.append(this.f252822m);
        sb.append(", deviceType=");
        sb.append(this.f252823n);
        sb.append(", volumeHandling=");
        sb.append(this.f252824o);
        sb.append(", volume=");
        sb.append(this.f252825p);
        sb.append(", volumeMax=");
        sb.append(this.f252826q);
        sb.append(", presentationDisplayId=");
        sb.append(this.f252827r);
        sb.append(", extras=");
        sb.append(this.f252828s);
        sb.append(", settingsIntent=");
        sb.append(this.f252829t);
        sb.append(", providerPackageName=");
        sb.append(this.f252810a.f242787d.m79868b());
        if (!this.f252831v.isEmpty()) {
            sb.append(", members=[");
            int size = this.f252831v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.f252831v.get(i) != this) {
                    sb.append(((wmd0) this.f252831v.get(i)).f252812c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
