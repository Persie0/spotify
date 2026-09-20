package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class xy3 implements oxe {

    /* JADX INFO: renamed from: a */
    public final am71 f267188a;

    /* JADX INFO: renamed from: b */
    public final xo4 f267189b;

    /* JADX INFO: renamed from: c */
    public final wa81 f267190c;

    /* JADX INFO: renamed from: d */
    public final b0l f267191d;

    /* JADX INFO: renamed from: e */
    public Long f267192e;

    /* JADX INFO: renamed from: f */
    public xa81 f267193f;

    /* JADX INFO: renamed from: g */
    public sr4 f267194g;

    /* JADX INFO: renamed from: h */
    public volatile AbstractC1895gf f267195h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f267196i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f267197j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArraySet f267198k;

    /* JADX INFO: renamed from: l */
    public final Set f267199l;

    /* JADX INFO: renamed from: m */
    public final Set f267200m;

    /* JADX INFO: renamed from: n */
    public String f267201n;

    /* JADX INFO: renamed from: o */
    public final Object f267202o;

    /* JADX INFO: renamed from: p */
    public Boolean f267203p;

    public xy3(am71 am71Var, xo4 xo4Var) {
        wa81 wa81VarM74221e = qyq0.m74221e();
        b0l b0lVar = b0l.f21940e;
        b0l b0lVarM94499n = ysj0.m94499n();
        this.f267188a = am71Var;
        this.f267189b = xo4Var;
        this.f267190c = wa81VarM74221e;
        this.f267191d = b0lVarM94499n;
        this.f267193f = kmj0.f124171a;
        this.f267194g = ((rr4) am71Var).m76275a("cold_startup");
        this.f267195h = nvf.f158883c;
        this.f267196i = new ConcurrentHashMap();
        this.f267197j = new ConcurrentHashMap();
        this.f267198k = new CopyOnWriteArraySet();
        this.f267199l = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f267200m = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f267202o = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r1 = 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m92396a(String str) {
        Object objPutIfAbsent;
        Set set = this.f267200m;
        if (set.contains(str)) {
            ConcurrentHashMap concurrentHashMap = this.f267197j;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, obj)) != null) {
                obj = objPutIfAbsent;
            }
            concurrentHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
            return;
        }
        if (this.f267199l.contains(str)) {
            this.f267190c.mo53786f(str, "cst");
            sr4 sr4Var = this.f267194g;
            if (sr4Var != null) {
                sr4Var.m79016f(str);
            }
            set.add(str);
            if (sr4Var != null) {
                Long l = this.f267192e;
                Long lValueOf = l != null ? Long.valueOf((((rr4) this.f267188a).f201947a.m27521a() - l.longValue()) / ((long) 1000)) : null;
                if (lValueOf != null) {
                    this.f267191d.m27836a(lValueOf.longValue(), str, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m92397b(String str) {
        List listM43728j1;
        Long lValueOf;
        sr4 sr4Var = this.f267194g;
        if (sr4Var != null) {
            sr4Var.m79014b("first_component", this.f267195h.m44554j());
        }
        if (sr4Var != null) {
            sr4Var.m79014b("start_intent", String.valueOf(this.f267195h.getIntent()));
        }
        if (!this.f267196i.isEmpty() && sr4Var != null) {
            sr4Var.m79014b("duplicate_started_points", g6f.m43753y0(this.f267196i.entrySet(), null, null, null, wv3.f255332Q0, 31));
        }
        if (!this.f267197j.isEmpty() && sr4Var != null) {
            sr4Var.m79014b("duplicate_ended_points", g6f.m43753y0(this.f267197j.entrySet(), null, null, null, wv3.f255333R0, 31));
        }
        if (sr4Var != null) {
            try {
                sr4Var.f213229d.put("thread_count", String.valueOf(Thread.activeCount()));
            } catch (Throwable unused) {
            }
        }
        if (sr4Var != null) {
            sr4Var.m79013a("first_component_type", this.f267195h.mo40107s());
        }
        if (sr4Var != null) {
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
        }
        if (sr4Var != null) {
            sr4Var.m79016f("cold_startup");
        }
        this.f267190c.mo53786f("cold_startup", "cst");
        if (!wj50.m88271j(this.f267193f, kmj0.f124171a)) {
            m92400e("trace_profiler_end");
            this.f267193f.mo56931b(new k23(this, 16));
            m92396a("trace_profiler_end");
        }
        if (sr4Var != null) {
            Long l = this.f267192e;
            if (l != null) {
                lValueOf = Long.valueOf((((rr4) this.f267188a).f201947a.m27521a() - l.longValue()) / ((long) 1000));
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                this.f267191d.m27836a(lValueOf.longValue(), "cold_startup", str);
            }
        }
        if (sr4Var != null) {
            ((rr4) this.f267188a).m76276b(sr4Var.m79015d());
            this.f267194g = null;
        }
        synchronized (this.f267202o) {
            this.f267201n = str;
            listM43728j1 = g6f.m43728j1(this.f267198k);
            this.f267198k.clear();
        }
        Iterator it = listM43728j1.iterator();
        while (it.hasNext()) {
            ((mxe) it.next()).onColdStartupCompleted(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m92398c() {
        if (this.f267192e != null) {
            return;
        }
        long jM27521a = ((rr4) this.f267188a).f201947a.m27521a();
        wa81.m87586a(this.f267190c, "cold_startup", null, 6);
        sr4 sr4Var = this.f267194g;
        if (sr4Var != null) {
            sr4Var.f213232g = Long.valueOf(jM27521a);
            sr4Var.f213234i.add(new swb("cold_startup", null, jM27521a, true));
        }
        this.f267192e = Long.valueOf(jM27521a);
        this.f267191d.m27839d(0L, "cold_startup");
        m92400e("app_init");
    }

    /* JADX INFO: renamed from: d */
    public final void m92399d(mxe mxeVar) {
        String str;
        synchronized (this.f267202o) {
            str = this.f267201n;
            if (str == null) {
                this.f267198k.add(mxeVar);
            }
        }
        if (str != null) {
            mxeVar.onColdStartupCompleted(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r1 = 0;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m92400e(String str) {
        Object objPutIfAbsent;
        Set set = this.f267199l;
        if (set.contains(str)) {
            ConcurrentHashMap concurrentHashMap = this.f267196i;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, obj)) != null) {
                obj = objPutIfAbsent;
            }
            concurrentHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
            return;
        }
        wa81.m87586a(this.f267190c, str, null, 6);
        sr4 sr4Var = this.f267194g;
        if (sr4Var != null) {
            sr4Var.m79019k(str, null, (4 & 4) != 0);
        }
        set.add(str);
        if (sr4Var != null) {
            Long l = this.f267192e;
            Long lValueOf = l != null ? Long.valueOf((((rr4) this.f267188a).f201947a.m27521a() - l.longValue()) / ((long) 1000)) : null;
            if (lValueOf != null) {
                this.f267191d.m27839d(lValueOf.longValue(), str);
            }
        }
    }
}
