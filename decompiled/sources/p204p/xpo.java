package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class xpo implements oz4 {

    /* JADX INFO: renamed from: a */
    public final Object f264691a;

    /* JADX INFO: renamed from: b */
    public long f264692b;

    /* JADX INFO: renamed from: c */
    public final Object f264693c;

    /* JADX INFO: renamed from: d */
    public final Object f264694d;

    /* JADX INFO: renamed from: e */
    public Object f264695e;

    /* JADX INFO: renamed from: f */
    public Object f264696f;

    /* JADX INFO: renamed from: g */
    public Object f264697g;

    /* JADX INFO: renamed from: h */
    public Object f264698h;

    public xpo(s8j s8jVar, qpr qprVar, siy siyVar, xre xreVar) {
        this.f264693c = s8jVar;
        this.f264694d = qprVar;
        this.f264691a = siyVar;
        this.f264695e = xreVar;
    }

    @Override // p204p.oz4
    /* JADX INFO: renamed from: b */
    public boolean mo59935b() {
        return false;
    }

    @Override // p204p.oz4
    /* JADX INFO: renamed from: c */
    public w05 mo59936c(long j) {
        return !m68612d(j) ? ((k77) this.f264693c).m55633a(j, (w05) this.f264696f, (w05) this.f264697g) : (w05) this.f264698h;
    }

    @Override // p204p.oz4
    /* JADX INFO: renamed from: e */
    public long mo59937e() {
        return this.f264692b;
    }

    @Override // p204p.oz4
    /* JADX INFO: renamed from: f */
    public tm91 mo59938f() {
        return (tm91) this.f264694d;
    }

    @Override // p204p.oz4
    /* JADX INFO: renamed from: g */
    public Object mo59939g(long j) {
        if (m68612d(j)) {
            return this.f264695e;
        }
        gh00 gh00Var = ((tm91) this.f264694d).f221638b;
        k77 k77Var = (k77) this.f264693c;
        w05 w05Var = (w05) this.f264696f;
        w05 w05Var2 = (w05) this.f264697g;
        if (((w05) k77Var.f119993c) == null) {
            k77Var.f119993c = w05Var.mo76849c();
        }
        w05 w05Var3 = (w05) k77Var.f119993c;
        if (w05Var3 == null) {
            wj50.m88260d0("valueVector");
            throw null;
        }
        int iMo76848b = w05Var3.mo76848b();
        for (int i = 0; i < iMo76848b; i++) {
            w05 w05Var4 = (w05) k77Var.f119993c;
            if (w05Var4 == null) {
                wj50.m88260d0("valueVector");
                throw null;
            }
            w05Var4.mo76851e(((vhz) k77Var.f119992b).mo39758a(w05Var.mo76847a(i), w05Var2.mo76847a(i), j), i);
        }
        w05 w05Var5 = (w05) k77Var.f119993c;
        if (w05Var5 != null) {
            return gh00Var.invoke(w05Var5);
        }
        wj50.m88260d0("valueVector");
        throw null;
    }

    @Override // p204p.oz4
    /* JADX INFO: renamed from: h */
    public Object mo59940h() {
        return this.f264695e;
    }

    /* JADX INFO: renamed from: i */
    public jmd0 mo47966i(Messenger messenger, int i, String str) {
        return new jmd0(this, messenger, i, str);
    }

    /* JADX INFO: renamed from: j */
    public int m91711j(Messenger messenger) {
        ArrayList arrayList = (ArrayList) this.f264694d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((jmd0) arrayList.get(i)).f113831a.getBinder() == messenger.getBinder()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public jmd0 m91712k(Messenger messenger) {
        int iM91711j = m91711j(messenger);
        if (iM91711j >= 0) {
            return (jmd0) ((ArrayList) this.f264694d).get(iM91711j);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public kmd0 m91713l() {
        return new kmd0(this);
    }

    /* JADX INFO: renamed from: m */
    public void m91714m() {
        if (((HashMap) this.f264697g).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList((ArrayList) this.f264694d).iterator();
        while (it.hasNext()) {
            ((jmd0) it.next()).getClass();
            arrayList.add(new so3(17));
        }
        synchronized (this.f264691a) {
            try {
                for (Map.Entry entry : ((HashMap) this.f264697g).entrySet()) {
                    ((Executor) entry.getValue()).execute(new zaz(26, (y8j) entry.getKey(), arrayList));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public IBinder mo47967n(Intent intent) {
        lmd0 lmd0Var = (lmd0) this.f264693c;
        if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
            return null;
        }
        lmd0Var.m59428b();
        if (lmd0Var.f134950d != null) {
            return lmd0Var.f134947a.getBinder();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m91715o() {
        synchronized (this.f264691a) {
            ((HashMap) this.f264697g).clear();
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo47968p(fmd0 fmd0Var) {
        ArrayList arrayList = (ArrayList) this.f264694d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jmd0 jmd0Var = (jmd0) arrayList.get(i);
            lmd0.m59427d(jmd0Var.f113831a, 5, 0, 0, jmd0Var.mo45228a(fmd0Var), null);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m91716q(lwf lwfVar, String str, String str2) {
        this.f264696f = null;
        this.f264692b = 0L;
        this.f264697g = null;
        k1p0 k1p0Var = lwfVar.f137559c.f127088b;
        if (k1p0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = 12;
        this.f264698h = x0h1.m89578u(lwfVar.f137557a, null, 0, new sqt(i, k1p0Var.f118406b, this, str, str2, (fbk) null), 3);
    }

    /* JADX INFO: renamed from: r */
    public boolean m91717r() {
        sep sepVar;
        ArrayList arrayList = (ArrayList) this.f264694d;
        and0 and0Var = (and0) this.f264698h;
        and0Var.m26490c();
        uld0 uld0Var = (uld0) this.f264696f;
        if (uld0Var != null) {
            and0Var.m26489b(this.f264692b, uld0Var.m83362b());
            uld0 uld0Var2 = (uld0) this.f264696f;
            uld0Var2.m83361a();
            sepVar = new sep(uld0Var2.f231531b);
        } else {
            sepVar = null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jmd0 jmd0Var = (jmd0) arrayList.get(i);
            uld0 uld0Var3 = jmd0Var.f113834d;
            if (uld0Var3 != null) {
                uld0Var3.m83361a();
                omd0 omd0Var = uld0Var3.f231531b;
                omd0Var.m67344a();
                if (!omd0Var.f167019b.isEmpty() || uld0Var3.m83362b()) {
                    and0Var.m26489b(jmd0Var.f113835e, uld0Var3.m83362b());
                    if (sepVar == null) {
                        uld0Var3.m83361a();
                        sepVar = new sep(uld0Var3.f231531b);
                    } else {
                        uld0Var3.m83361a();
                        omd0 omd0Var2 = uld0Var3.f231531b;
                        if (omd0Var2 == null) {
                            throw new IllegalArgumentException("selector must not be null");
                        }
                        sepVar.m77930d(omd0Var2.m67345b());
                    }
                }
            }
        }
        uld0 uld0Var4 = sepVar != null ? new uld0(sepVar.m77936j(), and0Var.m26488a()) : null;
        if (Objects.equals((uld0) this.f264695e, uld0Var4)) {
            return false;
        }
        this.f264695e = uld0Var4;
        dmd0 dmd0Var = ((lmd0) this.f264693c).f134950d;
        if (dmd0Var != null) {
            dmd0Var.m39416h(uld0Var4);
        }
        return true;
    }

    public xpo(Activity activity, Handler handler) {
        this.f264693c = handler;
        this.f264694d = activity.getApplicationContext();
        this.f264691a = new Object();
        this.f264695e = new ArrayMap();
        this.f264692b = 10L;
        this.f264697g = new i8v(this, 0);
        this.f264698h = new h8v(this);
    }

    public xpo(ypo ypoVar, tm91 tm91Var, Object obj, w05 w05Var) {
        k77 k77Var = new k77(ypoVar.f274995a);
        this.f264693c = k77Var;
        this.f264694d = tm91Var;
        this.f264691a = obj;
        w05 w05Var2 = (w05) tm91Var.f221637a.invoke(obj);
        this.f264696f = w05Var2;
        this.f264697g = ja61.m52791m(w05Var);
        gh00 gh00Var = tm91Var.f221638b;
        if (((w05) k77Var.f119995e) == null) {
            k77Var.f119995e = w05Var2.mo76849c();
        }
        w05 w05Var3 = (w05) k77Var.f119995e;
        if (w05Var3 != null) {
            int iMo76848b = w05Var3.mo76848b();
            for (int i = 0; i < iMo76848b; i++) {
                w05 w05Var4 = (w05) k77Var.f119995e;
                if (w05Var4 == null) {
                    wj50.m88260d0("targetVector");
                    throw null;
                }
                w05Var4.mo76851e(((vhz) k77Var.f119992b).mo39765o(w05Var2.mo76847a(i), w05Var.mo76847a(i)), i);
            }
            w05 w05Var5 = (w05) k77Var.f119995e;
            if (w05Var5 != null) {
                this.f264695e = gh00Var.invoke(w05Var5);
                if (((w05) k77Var.f119994d) == null) {
                    k77Var.f119994d = w05Var2.mo76849c();
                }
                w05 w05Var6 = (w05) k77Var.f119994d;
                if (w05Var6 != null) {
                    int iMo76848b2 = w05Var6.mo76848b();
                    long jMax = 0;
                    for (int i2 = 0; i2 < iMo76848b2; i2++) {
                        vhz vhzVar = (vhz) k77Var.f119992b;
                        w05Var2.getClass();
                        jMax = Math.max(jMax, vhzVar.mo39764n(w05Var.mo76847a(i2)));
                    }
                    this.f264692b = jMax;
                    w05 w05VarM52791m = ja61.m52791m(((k77) this.f264693c).m55633a(jMax, (w05) this.f264696f, w05Var));
                    this.f264698h = w05VarM52791m;
                    int iMo76848b3 = w05VarM52791m.mo76848b();
                    for (int i3 = 0; i3 < iMo76848b3; i3++) {
                        w05 w05Var7 = (w05) this.f264698h;
                        float fMo76847a = w05Var7.mo76847a(i3);
                        float f = ((k77) this.f264693c).f119991a;
                        w05Var7.mo76851e(n0e1.m63436m(fMo76847a, -f, f), i3);
                    }
                    return;
                }
                wj50.m88260d0("velocityVector");
                throw null;
            }
            wj50.m88260d0("targetVector");
            throw null;
        }
        wj50.m88260d0("targetVector");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void mo47965a(Context context) {
    }

    public xpo(lmd0 lmd0Var) {
        this.f264694d = new ArrayList();
        this.f264697g = new HashMap();
        this.f264691a = new Object();
        this.f264698h = new and0(new kk00(this, 15));
        this.f264693c = lmd0Var;
    }
}
