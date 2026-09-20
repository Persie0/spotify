package p204p;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a8v0 {

    /* JADX INFO: renamed from: a */
    public final am71 f13381a;

    /* JADX INFO: renamed from: b */
    public final sr4 f13382b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f13383c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f13384d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f13385e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f13386f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f13387g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap.KeySetView f13388h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap.KeySetView f13389i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f13390j;

    public a8v0(am71 am71Var, int i) {
        this.f13381a = am71Var;
        sr4 sr4VarM54660v = jxg1.m54660v(am71Var, i);
        jxg1.m54635G(sr4VarM54660v);
        jxg1.m54636H(sr4VarM54660v);
        jxg1.m54637I(sr4VarM54660v);
        jxg1.m54634F(sr4VarM54660v);
        this.f13382b = sr4VarM54660v;
        this.f13388h = ConcurrentHashMap.newKeySet();
        this.f13389i = ConcurrentHashMap.newKeySet();
        this.f13390j = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m25052a() {
        for (Map.Entry entry : this.f13390j.entrySet()) {
            String str = (String) entry.getKey();
            z7v0 z7v0Var = (z7v0) entry.getValue();
            if (z7v0Var instanceof x7v0) {
                Long lValueOf = Long.valueOf(((x7v0) z7v0Var).m90175a());
                sr4 sr4Var = this.f13382b;
                if (sr4Var.f213232g == null) {
                    sr4Var.f213232g = null;
                }
                sr4Var.f213236k.add(new qwb(str, null, null, lValueOf));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25053b() {
        if (!this.f13384d) {
            this.f13384d = true;
            jxg1.m54664z(this.f13382b);
        }
        if (!this.f13385e) {
            this.f13385e = true;
            jxg1.m54629A(this.f13382b);
        }
        if (this.f13386f) {
            return;
        }
        this.f13386f = true;
        jxg1.m54630B(this.f13382b);
    }

    /* JADX INFO: renamed from: c */
    public final void m25054c(w7v0 w7v0Var) {
        this.f13388h.add(w7v0Var);
        if (this.f13385e || this.f13388h.size() != w7v0.f248798h.mo33075a()) {
            return;
        }
        this.f13385e = true;
        jxg1.m54629A(this.f13382b);
    }

    /* JADX INFO: renamed from: d */
    public final void m25055d(w7v0 w7v0Var) {
        this.f13389i.add(w7v0Var);
        m25054c(w7v0Var);
        if (this.f13386f || this.f13389i.size() != w7v0.f248798h.mo33075a()) {
            return;
        }
        this.f13386f = true;
        jxg1.m54630B(this.f13382b);
    }

    /* JADX INFO: renamed from: e */
    public final void m25056e(w7v0 w7v0Var) {
        if (!this.f13384d) {
            this.f13384d = true;
            jxg1.m54664z(this.f13382b);
        }
        m25054c(w7v0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m25057f(String str) {
        ConcurrentHashMap concurrentHashMap = this.f13390j;
        Object obj = concurrentHashMap.get(str);
        y7v0 y7v0Var = obj instanceof y7v0 ? (y7v0) obj : null;
        if (y7v0Var == null) {
            return;
        }
        concurrentHashMap.put(str, new x7v0((System.nanoTime() - y7v0Var.m93015a()) / ((long) 1000)));
    }

    /* JADX INFO: renamed from: g */
    public final void m25058g(int i) {
        if (this.f13387g) {
            return;
        }
        this.f13387g = true;
        if (!this.f13383c) {
            jxg1.m54663y(this.f13382b);
        }
        m25052a();
        m25053b();
        jxg1.m54633E(this.f13381a, this.f13382b, i);
    }

    /* JADX INFO: renamed from: h */
    public final void m25059h(String str) {
        this.f13390j.put(str, new y7v0(System.nanoTime()));
    }
}
