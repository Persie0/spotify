package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xwz {

    /* JADX INFO: renamed from: a */
    public final cyz f266767a;

    /* JADX INFO: renamed from: b */
    public final TreeMap f266768b;

    /* JADX INFO: renamed from: c */
    public final TreeMap f266769c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f266770d;

    public xwz(cyz cyzVar, Scheduler scheduler) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f266768b = new TreeMap(comparator);
        this.f266769c = new TreeMap(comparator);
        this.f266767a = cyzVar;
        this.f266770d = scheduler;
    }

    /* JADX INFO: renamed from: e */
    public static void m92308e(String str, uwz uwzVar, boolean z) {
        Logger.m3966b("Failed to %s. Rolling back follow state. %s", z ? Request.POST : Request.DELETE, str);
        uwzVar.m84117a(!z);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m92309a(uuz uuzVar) {
        this.f266768b.put(Uri.decode(uuzVar.m84040d()), uuzVar);
        m92312d(uuzVar.m84040d());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m92310b(String str, qwz qwzVar) {
        try {
            String strDecode = Uri.decode(str);
            if (!this.f266769c.containsKey(strDecode)) {
                this.f266769c.put(strDecode, Collections.newSetFromMap(n1h1.m63506p()));
            }
            ((Set) this.f266769c.get(strDecode)).add(qwzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized uuz m92311c(String str) {
        return (uuz) this.f266768b.get(Uri.decode(str));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m92312d(String str) {
        String strDecode = Uri.decode(str);
        Set set = (Set) this.f266769c.get(strDecode);
        if (set != null) {
            uuz uuzVar = (uuz) this.f266768b.get(strDecode);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((qwz) it.next()).mo74096a(uuzVar);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m92313f(String str, qwz qwzVar) {
        Set set = (Set) this.f266769c.get(Uri.decode(str));
        if (set != null) {
            set.remove(qwzVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m92314g(String str, boolean z) {
        String strDecode = Uri.decode(str);
        uuz uuzVar = (uuz) this.f266768b.get(strDecode);
        this.f266768b.put(strDecode, new uuz(uuzVar.m84038b(), uuzVar.m84039c(), uuzVar.m84040d(), uuzVar.m84042f(), z));
        m92312d(strDecode);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m92315h(String str, boolean z) {
        String strDecode = Uri.decode(str);
        uuz uuzVar = (uuz) this.f266768b.get(strDecode);
        this.f266768b.put(strDecode, new uuz(uuzVar.m84038b() + (z ? 1 : -1), uuzVar.m84039c(), uuzVar.m84040d(), z, uuzVar.m84041e()));
        m92312d(strDecode);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m92316i(String str, boolean z) {
        String strDecode = Uri.decode(str);
        c95.m31844j(this.f266768b.containsKey(strDecode), "no model exists for " + strDecode);
        m92314g(strDecode, z);
        m92318k(strDecode, z);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m92317j(String str, boolean z) {
        String strDecode = Uri.decode(str);
        c95.m31844j(this.f266768b.containsKey(strDecode), "no model exists for " + strDecode);
        m92315h(str, z);
        m92319l(str, z);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m92318k(String str, boolean z) {
        try {
            String strDecode = Uri.decode(str);
            su61 su61Var = new su61(Collections.singletonList(strDecode));
            (z ? this.f266767a.m34402d(su61Var) : this.f266767a.m34399a(su61Var)).observeOn(this.f266770d).subscribe(new vwz(z, strDecode, 0), new vwz(z, new uwz(this, str, 0), 1));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m92319l(String str, final boolean z) {
        try {
            final String strDecode = Uri.decode(str);
            su61 su61Var = new su61(Collections.singletonList(strDecode));
            final uwz uwzVar = new uwz(this, str, 1);
            (z ? this.f266767a.m34403e(su61Var) : this.f266767a.m34401c(su61Var)).observeOn(this.f266770d).subscribe(new Consumer() { // from class: p.wwz
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Object obj) {
                    n2x0 n2x0Var = ((o2x0) obj).f161171a;
                    boolean z2 = n2x0Var.f149852O0;
                    boolean z3 = z;
                    if (z2) {
                        Logger.m3969e("%s %s succeeded", z3 ? Request.POST : Request.DELETE, strDecode);
                        return;
                    }
                    xwz.m92308e("Status code was: " + n2x0Var.f149860d, uwzVar, z3);
                }
            }, new vwz(z, uwzVar, 2));
        } catch (Throwable th) {
            throw th;
        }
    }
}
