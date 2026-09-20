package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
public final class r9d0 {

    /* JADX INFO: renamed from: a */
    public final jji f197021a;

    /* JADX INFO: renamed from: b */
    public final r46 f197022b;

    /* JADX INFO: renamed from: c */
    public final Context f197023c;

    /* JADX INFO: renamed from: d */
    public final btv0 f197024d;

    /* JADX INFO: renamed from: e */
    public final btv0 f197025e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f197026f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f197027g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f197028h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final ArrayList f197029i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f197030j = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public WeakReference f197031k;

    /* JADX INFO: renamed from: l */
    public o8d0 f197032l;

    public r9d0(jji jjiVar, r46 r46Var, vyj vyjVar, Context context, btv0 btv0Var, btv0 btv0Var2) {
        this.f197021a = jjiVar;
        this.f197022b = r46Var;
        this.f197023c = context;
        this.f197024d = btv0Var;
        this.f197025e = btv0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final void m75045a(zvm0 zvm0Var, n8d0 n8d0Var) {
        String str = zvm0Var.f286742a;
        WeakReference weakReference = this.f197031k;
        if ((weakReference != null ? (uzx) weakReference.get() : null) == null) {
            this.f197028h.put(str, n8d0Var);
            return;
        }
        String strM74739P = this.f197022b.m74739P(zvm0Var);
        if (strM74739P != null) {
            str = strM74739P;
        }
        o9d0 o9d0Var = (o9d0) this.f197030j.get(str);
        if (o9d0Var == null) {
            Logger.m3973i("MBS: No service session found for packageName: %s", str);
        }
        if (o9d0Var != null) {
            n8d0Var.mo63842b(o9d0Var);
        } else {
            n8d0Var.mo63841a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75046b(String str, yjx0 yjx0Var) {
        WeakReference weakReference = this.f197031k;
        uzx uzxVar = weakReference != null ? (uzx) weakReference.get() : null;
        if (uzxVar == null) {
            this.f197026f.put(str, yjx0Var);
            return;
        }
        List listM88477a1 = wl51.m88477a1(str, new String[]{"---"}, 0, 6);
        String str2 = listM88477a1.size() == 2 ? (String) listM88477a1.get(0) : null;
        if (str2 != null) {
            str = str2;
        }
        iji ijiVarM53571a = this.f197021a.m53571a(str);
        if (this.f197030j.containsKey(str) || ijiVarM53571a == null) {
            return;
        }
        m75047c(uzxVar, str, ijiVarM53571a, yjx0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m75047c(uzx uzxVar, String str, iji ijiVar, yjx0 yjx0Var) {
        String str2;
        p9d0 p9d0Var = (p9d0) this.f197024d.get(ijiVar.mo28042i());
        if (p9d0Var == null) {
            throw new NoSuchElementException("No session factory found for " + ijiVar.mo28042i());
        }
        ynd0 ynd0Var = (ynd0) this.f197025e.get(ijiVar.mo28039d());
        if (ynd0Var == null) {
            throw new NoSuchElementException("No callback handler factory found for " + ijiVar.mo28039d());
        }
        try {
            str2 = this.f197023c.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f197030j.put(str, p9d0Var.mo30897a(ijiVar.mo50805g(str, str2, ijiVar.mo40127k(str, yjx0Var), this.f197022b), uzxVar, ynd0Var.mo46169a(uzxVar, ijiVar.mo28038c(str))));
        o8d0 o8d0Var = this.f197032l;
        if (o8d0Var != null) {
            o8d0Var.f162790g.f208201h.m42330a(true);
            o8d0Var.m66427b();
        }
        this.f197027g.put(str, yjx0Var);
    }

    /* JADX INFO: renamed from: d */
    public final String m75048d() {
        return this.f197030j.keySet().toString();
    }

    /* JADX INFO: renamed from: e */
    public final List m75049e() {
        return g6f.m43728j1(this.f197030j.values());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX INFO: renamed from: f */
    public final o9d0 m75050f(String str) {
        boolean z;
        List<o9d0> listM75049e = m75049e();
        if (listM75049e.isEmpty()) {
            return null;
        }
        o9d0 o9d0Var = null;
        for (o9d0 o9d0Var2 : listM75049e) {
            if (o9d0Var != null) {
                o9d0Var2.getClass();
                long jMo37699g = o9d0Var.mo37699g();
                long jMo37699g2 = o9d0Var2.mo37699g();
                if (jMo37699g2 >= jMo37699g && jMo37699g2 != jMo37699g) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (wj50.m88271j(o9d0Var2.mo37703l(), str)) {
                if (o9d0Var2.mo36681k()) {
                    return o9d0Var2;
                }
                na6.m63971s(String.format("The integration with package name: \"%s\" does not support extended search", Arrays.copyOf(new Object[]{o9d0Var2.mo37703l()}, 1)));
                return null;
            }
            if (z && o9d0Var2.mo36681k()) {
                o9d0Var = o9d0Var2;
            }
        }
        return o9d0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m75051g(boolean z) {
        WeakReference weakReference = this.f197031k;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f197031k = null;
        this.f197026f.clear();
        this.f197028h.clear();
        this.f197029i.clear();
        if (z) {
            this.f197027g.clear();
        }
        LinkedHashMap linkedHashMap = this.f197030j;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((o9d0) it.next()).destroy();
        }
        linkedHashMap.clear();
        o8d0 o8d0Var = this.f197032l;
        if (o8d0Var != null) {
            if (o8d0Var.f162784a.m75049e().isEmpty()) {
                o8d0Var.f162790g.f208201h.m42330a(false);
            }
            o8d0Var.m66427b();
        }
        this.f197032l = null;
    }
}
