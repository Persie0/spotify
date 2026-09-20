package p204p;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class mv31 implements hv31 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f147504a;

    /* JADX INFO: renamed from: b */
    public final h15 f147505b;

    /* JADX INFO: renamed from: c */
    public final boolean f147506c;

    /* JADX INFO: renamed from: d */
    public final utu0 f147507d;

    public mv31(i4t0 i4t0Var, h15 h15Var, boolean z, utu0 utu0Var) {
        this.f147504a = i4t0Var;
        this.f147505b = h15Var;
        this.f147506c = z;
        this.f147507d = utu0Var;
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: a */
    public Set mo48706a(fv31 fv31Var) throws Exception {
        Object objM62895p = m62895p(new w831(4, this, fv31Var));
        if (objM62895p != null) {
            return Collections.unmodifiableSet((Set) objM62895p);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: b */
    public Set mo48707b(fv31 fv31Var, Set set) {
        Set set2 = (Set) m62895p(new gyt0(this, fv31Var, set, 28));
        if (set2 == null) {
            return null;
        }
        return Collections.unmodifiableSet(set2);
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: c */
    public float mo48708c(fv31 fv31Var, float f) throws Exception {
        Object objM62895p = m62895p(new woj0(this, fv31Var, f, 1));
        wj50.m88279p(objM62895p);
        return ((Number) objM62895p).floatValue();
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: d */
    public float mo48709d(fv31 fv31Var) {
        m62900u(fv31Var);
        return mo48708c(fv31Var, 0.0f);
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: e */
    public String mo48710e(fv31 fv31Var, String str) {
        return (String) m62895p(new gyt0(this, fv31Var, str, 27));
    }

    @Override // p204p.hv31
    public lv31 edit() {
        return new lv31(m62893n().edit(), this.f147505b, this.f147506c, this.f147507d);
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: f */
    public String mo48711f(fv31 fv31Var) {
        m62900u(fv31Var);
        return mo48710e(fv31Var, null);
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: g */
    public long mo48712g(fv31 fv31Var, long j) throws Exception {
        Object objM62895p = m62895p(new nye(this, fv31Var, j, 3));
        wj50.m88279p(objM62895p);
        return ((Number) objM62895p).longValue();
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: h */
    public boolean mo48713h(fv31 fv31Var, boolean z) throws Exception {
        Object objM62895p = m62895p(new sk1(this, fv31Var, z, 18));
        wj50.m88279p(objM62895p);
        return ((Boolean) objM62895p).booleanValue();
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: i */
    public boolean mo48714i(fv31 fv31Var) {
        m62900u(fv31Var);
        return mo48713h(fv31Var, false);
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: j */
    public long mo48715j(fv31 fv31Var) {
        m62900u(fv31Var);
        return mo48712g(fv31Var, 0L);
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: k */
    public String mo48716k(fv31 fv31Var) throws Exception {
        Object objM62895p = m62895p(new pr0(26, this, fv31Var));
        if (objM62895p != null) {
            return (String) objM62895p;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: l */
    public int mo48717l(fv31 fv31Var, int i) throws Exception {
        Object objM62895p = m62895p(new gs1(this, fv31Var, i, 22));
        wj50.m88279p(objM62895p);
        return ((Number) objM62895p).intValue();
    }

    @Override // p204p.hv31
    /* JADX INFO: renamed from: m */
    public int mo48718m(fv31 fv31Var) {
        m62900u(fv31Var);
        return mo48717l(fv31Var, 0);
    }

    /* JADX INFO: renamed from: n */
    public final SharedPreferences m62893n() {
        return (SharedPreferences) this.f147504a.get();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m62894o(fv31 fv31Var) {
        return m62893n().contains(fv31Var.f73630a);
    }

    /* JADX INFO: renamed from: p */
    public final Object m62895p(eh00 eh00Var) throws Exception {
        Object objInvoke;
        Object obj = this.f147507d.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            objInvoke = eh00Var.invoke();
            e = null;
        } catch (Exception e) {
            e = e;
            objInvoke = null;
        }
        q0b1 q0b1Var = new q0b1(objInvoke, jCurrentTimeMillis - System.currentTimeMillis(), e);
        Object objM71807a = q0b1Var.m71807a();
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f147506c && this.f147505b != null) {
            int length = 0;
            if (objM71807a != null) {
                if (objM71807a instanceof Boolean) {
                    length = 1;
                } else if ((objM71807a instanceof Float) || (objM71807a instanceof Integer)) {
                    length = 4;
                } else if (objM71807a instanceof Long) {
                    length = 8;
                } else if (objM71807a instanceof String) {
                    length = ((String) objM71807a).length() * 2;
                } else if (objM71807a instanceof Set) {
                    Iterator it = ((Set) objM71807a).iterator();
                    while (it.hasNext()) {
                        length += ((String) it.next()).length() * 2;
                    }
                }
            }
            new h751(1, length, jM71808b, excM71809c != null ? new f751("unexpected result type", 2) : null);
        }
        if (excM71809c == null) {
            return objM71807a;
        }
        throw excM71809c;
    }

    /* JADX INFO: renamed from: q */
    public final yab m62896q(fv31 fv31Var) {
        return mxg1.m63112w(m62893n(), this, fv31Var, jc31.f110954P0);
    }

    /* JADX INFO: renamed from: r */
    public final yab m62897r(fv31 fv31Var) {
        return mxg1.m63112w(m62893n(), this, fv31Var, jc31.f110956R0);
    }

    /* JADX INFO: renamed from: s */
    public final yab m62898s(fv31 fv31Var) {
        return mxg1.m63112w(m62893n(), this, fv31Var, jc31.f110957S0);
    }

    /* JADX INFO: renamed from: t */
    public final yab m62899t(fv31 fv31Var) {
        return mxg1.m63112w(m62893n(), this, fv31Var, jc31.f110958T0);
    }

    /* JADX INFO: renamed from: u */
    public final void m62900u(fv31 fv31Var) {
        if (m62894o(fv31Var)) {
            return;
        }
        if (this.f147506c && this.f147505b != null) {
            int i = 1;
            new h751(i, 0, 0L, new f751("requesting non existing key", 2));
        }
        throw new NoSuchElementException(s571.m77251j("key ", fv31Var.f73630a, " has no value"));
    }
}
