package p204p;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class ljx0 {

    /* JADX INFO: renamed from: a */
    public c9k f134164a;

    /* JADX INFO: renamed from: b */
    public juk f134165b;

    /* JADX INFO: renamed from: c */
    public Executor f134166c;

    /* JADX INFO: renamed from: d */
    public by81 f134167d;

    /* JADX INFO: renamed from: e */
    public xxo f134168e;

    /* JADX INFO: renamed from: f */
    public wl50 f134169f;

    /* JADX INFO: renamed from: h */
    public boolean f134171h;

    /* JADX INFO: renamed from: g */
    public final bxb f134170g = new bxb(new gtu0(0, this, ljx0.class, "onClosed", "onClosed()V", 0, 0, 2));

    /* JADX INFO: renamed from: i */
    public final ThreadLocal f134172i = new ThreadLocal();

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f134173j = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public boolean f134174k = true;

    /* JADX INFO: renamed from: a */
    public final void m59181a() {
        if (this.f134171h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m59182b() {
        if (!m59188r() || m59189s()) {
            return;
        }
        juk jukVar = (juk) this.f134172i.get();
        if ((jukVar != null ? (ay81) jukVar.mo26595B(ay81.f21165b) : null) != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m59183c() {
        m59181a();
        m59181a();
        u561 writableDatabase = m59186l().getWritableDatabase();
        if (!writableDatabase.mo82396w()) {
            kif1.m56504m(new vl50(m59185k(), null, 1));
        }
        if (writableDatabase.mo82397x1()) {
            writableDatabase.mo82393a0();
        } else {
            writableDatabase.mo82384C();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7283d();

    /* JADX INFO: renamed from: e */
    public List mo2229e(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((ife) ((up60) entry.getKey())).mo28587A(), entry.getValue());
        }
        return mo1160j();
    }

    /* JADX INFO: renamed from: f */
    public abstract wl50 mo1158f();

    /* JADX INFO: renamed from: g */
    public d180 mo2230g() {
        throw new xpj0();
    }

    /* JADX INFO: renamed from: h */
    public w561 mo1159h(dlo dloVar) {
        throw new xpj0();
    }

    /* JADX INFO: renamed from: i */
    public final void m59184i() {
        m59186l().getWritableDatabase().mo82395f0();
        if (m59189s()) {
            return;
        }
        wl50 wl50VarM59185k = m59185k();
        wl50VarM59185k.f252467b.m33109e(wl50VarM59185k.f252470e, wl50VarM59185k.f252471f);
    }

    /* JADX INFO: renamed from: j */
    public List mo1160j() {
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: k */
    public final wl50 m59185k() {
        wl50 wl50Var = this.f134169f;
        if (wl50Var != null) {
            return wl50Var;
        }
        wj50.m88260d0("internalTracker");
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final w561 m59186l() {
        xxo xxoVar = this.f134168e;
        if (xxoVar == null) {
            wj50.m88260d0("connectionManager");
            throw null;
        }
        w561 w561VarM92350l = xxoVar.m92350l();
        if (w561VarM92350l != null) {
            return w561VarM92350l;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    /* JADX INFO: renamed from: m */
    public final juk m59187m() {
        c9k c9kVar = this.f134164a;
        if (c9kVar != null) {
            return c9kVar.f35578a;
        }
        wj50.m88260d0("coroutineScope");
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public Set mo2231n() {
        Set setMo1161o = mo1161o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(setMo1161o, 10));
        Iterator it = setMo1161o.iterator();
        while (it.hasNext()) {
            arrayList.add(qpv0.f191387a.mo54112b((Class) it.next()));
        }
        return g6f.m43736n1(arrayList);
    }

    /* JADX INFO: renamed from: o */
    public Set mo1161o() {
        return gbu.f78413a;
    }

    /* JADX INFO: renamed from: p */
    public LinkedHashMap mo2232p() {
        Set<Map.Entry> setEntrySet = mo1162q().entrySet();
        int iM31820L = c95.m31820L(i6f.m49804T(setEntrySet, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            up60 up60VarMo54112b = qpv0.f191387a.mo54112b(cls);
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(qpv0.f191387a.mo54112b((Class) it.next()));
            }
            pqm0 pqm0VarM69840u = pft0.m69840u(up60VarMo54112b, arrayList);
            linkedHashMap.put(pqm0VarM69840u.f180350a, pqm0VarM69840u.f180351b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: q */
    public Map mo1162q() {
        return nau.f152117a;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m59188r() {
        xxo xxoVar = this.f134168e;
        if (xxoVar != null) {
            return xxoVar.m92350l() != null;
        }
        wj50.m88260d0("connectionManager");
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m59189s() {
        return m59191u() && m59186l().getWritableDatabase().mo82396w();
    }

    /* JADX INFO: renamed from: t */
    public final void m59190t(yyx0 yyx0Var) {
        wl50 wl50VarM59185k = m59185k();
        ck91 ck91Var = wl50VarM59185k.f252467b;
        ck91Var.getClass();
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("PRAGMA query_only");
        try {
            ezx0VarMo63454G1.mo24841E1();
            boolean z = ezx0VarMo63454G1.getBoolean();
            mif1.m61875i(ezx0VarMo63454G1, null);
            if (!z) {
                mif1.m61880o(yyx0Var, "PRAGMA temp_store = MEMORY");
                mif1.m61880o(yyx0Var, "PRAGMA recursive_triggers = 1");
                mif1.m61880o(yyx0Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ck91Var.f38894d) {
                    mif1.m61880o(yyx0Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    mif1.m61880o(yyx0Var, bm51.m29801l0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                bqk0 bqk0Var = ck91Var.f38898h;
                ReentrantLock reentrantLock = bqk0Var.f29844a;
                reentrantLock.lock();
                try {
                    bqk0Var.f29847d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (wl50VarM59185k.f252473h) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mif1.m61875i(ezx0VarMo63454G1, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m59191u() {
        xxo xxoVar = this.f134168e;
        if (xxoVar != null) {
            return xxoVar.m92353o();
        }
        wj50.m88260d0("connectionManager");
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final Object m59192v(Callable callable) {
        return m59193w(new ew40(callable, 14));
    }

    /* JADX INFO: renamed from: w */
    public final Object m59193w(eh00 eh00Var) {
        if (!m59188r()) {
            return nsf1.m65528n(this, false, true, new rsr(eh00Var, 2));
        }
        m59183c();
        try {
            Object objInvoke = eh00Var.invoke();
            m59194x();
            return objInvoke;
        } finally {
            m59184i();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m59194x() {
        m59186l().getWritableDatabase().mo82392W();
    }

    /* JADX INFO: renamed from: y */
    public final Object m59195y(boolean z, th00 th00Var, ibk ibkVar) {
        xxo xxoVar = this.f134168e;
        if (xxoVar != null) {
            return xxoVar.m92360v(z, th00Var, ibkVar);
        }
        wj50.m88260d0("connectionManager");
        throw null;
    }
}
