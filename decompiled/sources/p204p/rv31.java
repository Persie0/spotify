package p204p;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rv31 extends mv31 implements hv31 {

    /* JADX INFO: renamed from: e */
    public final mv31 f202992e;

    public rv31(iv31 iv31Var, mv31 mv31Var, h15 h15Var, boolean z, utu0 utu0Var) {
        super(new hke((SharedPreferences) iv31Var.get(), 5), h15Var, z, utu0Var);
        this.f202992e = mv31Var;
    }

    /* JADX INFO: renamed from: v */
    public static fv31 m76466v(fv31 fv31Var) {
        return fv31.f73628b.m78180K(fv31Var.f73630a);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: a */
    public final Set mo48706a(fv31 fv31Var) throws Exception {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (sharedPreferencesM62893n.contains(str)) {
            Object objM62895p = m62895p(new pv31(sharedPreferencesM62893n, str, 1));
            wj50.m88279p(objM62895p);
            return (Set) objM62895p;
        }
        if (!sharedPreferencesM62893n.contains("__cleared__")) {
            fv31 fv31VarM76466v = m76466v(fv31Var);
            mv31 mv31Var = this.f202992e;
            if (mv31Var.m62894o(fv31VarM76466v)) {
                return mv31Var.mo48706a(m76466v(fv31Var));
            }
        }
        return gbu.f78413a;
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: b */
    public final Set mo48707b(fv31 fv31Var, Set set) {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (sharedPreferencesM62893n.contains(str)) {
            return (Set) m62895p(new qv31(sharedPreferencesM62893n, str, set, 0));
        }
        return sharedPreferencesM62893n.contains("__cleared__") ? set : this.f202992e.mo48707b(m76466v(fv31Var), set);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: c */
    public final float mo48708c(fv31 fv31Var, float f) throws Exception {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (!sharedPreferencesM62893n.contains(str)) {
            return sharedPreferencesM62893n.contains("__cleared__") ? f : this.f202992e.mo48708c(m76466v(fv31Var), f);
        }
        Object objM62895p = m62895p(new woj0(sharedPreferencesM62893n, str, f, 2));
        wj50.m88279p(objM62895p);
        return ((Number) objM62895p).floatValue();
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: d */
    public final float mo48709d(fv31 fv31Var) {
        return mo48708c(fv31Var, 0.0f);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: e */
    public final String mo48710e(fv31 fv31Var, String str) {
        String str2 = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (sharedPreferencesM62893n.contains(str2)) {
            return (String) m62895p(new gyt0(sharedPreferencesM62893n, str2, str, 29));
        }
        return sharedPreferencesM62893n.contains("__cleared__") ? str : this.f202992e.mo48710e(m76466v(fv31Var), str);
    }

    @Override // p204p.mv31, p204p.hv31
    public final lv31 edit() {
        return new ov31(m62893n().edit(), this.f147505b, this.f147506c, this.f147507d);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: f */
    public final String mo48711f(fv31 fv31Var) {
        return mo48710e(fv31Var, null);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: g */
    public final long mo48712g(fv31 fv31Var, long j) throws Exception {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (!sharedPreferencesM62893n.contains(str)) {
            return sharedPreferencesM62893n.contains("__cleared__") ? j : this.f202992e.mo48712g(m76466v(fv31Var), j);
        }
        Object objM62895p = m62895p(new nye(sharedPreferencesM62893n, str, j, 4));
        wj50.m88279p(objM62895p);
        return ((Number) objM62895p).longValue();
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: h */
    public final boolean mo48713h(fv31 fv31Var, boolean z) throws Exception {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (!sharedPreferencesM62893n.contains(str)) {
            return sharedPreferencesM62893n.contains("__cleared__") ? z : this.f202992e.mo48713h(m76466v(fv31Var), z);
        }
        Object objM62895p = m62895p(new sk1(sharedPreferencesM62893n, str, z, 19));
        wj50.m88279p(objM62895p);
        return ((Boolean) objM62895p).booleanValue();
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: i */
    public final boolean mo48714i(fv31 fv31Var) {
        return mo48713h(fv31Var, false);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: j */
    public final long mo48715j(fv31 fv31Var) {
        return mo48712g(fv31Var, 0L);
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: k */
    public final String mo48716k(fv31 fv31Var) throws Exception {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (sharedPreferencesM62893n.contains(str)) {
            Object objM62895p = m62895p(new pv31(sharedPreferencesM62893n, str, 0));
            wj50.m88279p(objM62895p);
            return (String) objM62895p;
        }
        if (!sharedPreferencesM62893n.contains("__cleared__")) {
            fv31 fv31VarM76466v = m76466v(fv31Var);
            mv31 mv31Var = this.f202992e;
            if (mv31Var.m62894o(fv31VarM76466v)) {
                String strMo48710e = mv31Var.mo48710e(m76466v(fv31Var), "");
                wj50.m88279p(strMo48710e);
                return strMo48710e;
            }
        }
        return "";
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: l */
    public final int mo48717l(fv31 fv31Var, int i) throws Exception {
        String str = fv31Var.f73630a;
        SharedPreferences sharedPreferencesM62893n = m62893n();
        if (!sharedPreferencesM62893n.contains(str)) {
            return sharedPreferencesM62893n.contains("__cleared__") ? i : this.f202992e.mo48717l(m76466v(fv31Var), i);
        }
        Object objM62895p = m62895p(new gs1(sharedPreferencesM62893n, str, i, 23));
        wj50.m88279p(objM62895p);
        return ((Number) objM62895p).intValue();
    }

    @Override // p204p.mv31, p204p.hv31
    /* JADX INFO: renamed from: m */
    public final int mo48718m(fv31 fv31Var) {
        return mo48717l(fv31Var, 0);
    }
}
