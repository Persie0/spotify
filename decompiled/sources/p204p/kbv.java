package p204p;

import com.comscore.streaming.ContentType;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kbv {

    /* JADX INFO: renamed from: a */
    public static final tm91 f121289a = geg1.m44500g();

    /* JADX INFO: renamed from: b */
    public static final pg41 f121290b = jg31.m53286y(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c */
    public static final pg41 f121291c;

    /* JADX INFO: renamed from: d */
    public static final pg41 f121292d;

    static {
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        f121291c = jg31.m53286y(0.0f, 400.0f, new y350(j2), 1);
        f121292d = jg31.m53286y(0.0f, 400.0f, new g450(j2), 1);
    }

    /* JADX INFO: renamed from: a */
    public static pbv m55955a(w9z w9zVar, ub9 ub9Var, gh00 gh00Var, int i) {
        wb9 wb9Var;
        ub9 ub9Var2 = d7f0.f46146Q0;
        if ((i & 1) != 0) {
            long j = 1;
            w9zVar = jg31.m53286y(0.0f, 400.0f, new g450((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            ub9Var = ub9Var2;
        }
        if ((i & 8) != 0) {
            gh00Var = jbv.f110904c;
        }
        if (wj50.m88271j(ub9Var, d7f0.f46144O0)) {
            wb9Var = d7f0.f46172h;
        } else {
            wb9Var = wj50.m88271j(ub9Var, ub9Var2) ? d7f0.f46184t : d7f0.f46174i;
        }
        return m55956b(wb9Var, w9zVar, new r7t(17, gh00Var));
    }

    /* JADX INFO: renamed from: b */
    public static final pbv m55956b(wb9 wb9Var, w9z w9zVar, gh00 gh00Var) {
        return new pbv(new w791((l9y) null, (xq21) null, new gmc(wb9Var, w9zVar, gh00Var), (say0) null, (LinkedHashMap) null, ContentType.USER_GENERATED_LIVE));
    }

    /* JADX INFO: renamed from: c */
    public static pbv m55957c(im91 im91Var, vb9 vb9Var, int i) {
        wb9 wb9Var;
        vb9 vb9Var2 = d7f0.f46143N0;
        w9z w9zVarM53286y = im91Var;
        if ((i & 1) != 0) {
            long j = 1;
            w9zVarM53286y = jg31.m53286y(0.0f, 400.0f, new g450((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            vb9Var = vb9Var2;
        }
        if (wj50.m88271j(vb9Var, d7f0.f46141L0)) {
            wb9Var = d7f0.f46168f;
        } else {
            wb9Var = wj50.m88271j(vb9Var, vb9Var2) ? d7f0.f46155Y : d7f0.f46174i;
        }
        return m55956b(wb9Var, w9zVarM53286y, new mgi(16));
    }

    /* JADX INFO: renamed from: d */
    public static pbv m55958d(w9z w9zVar, int i) {
        if ((i & 1) != 0) {
            w9zVar = jg31.m53286y(0.0f, 400.0f, null, 5);
        }
        return new pbv(new w791(new l9y(0.0f, w9zVar), (xq21) null, (gmc) null, (say0) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: e */
    public static whx m55959e(w9z w9zVar, int i) {
        if ((i & 1) != 0) {
            w9zVar = jg31.m53286y(0.0f, 400.0f, null, 5);
        }
        return new whx(new w791(new l9y(0.0f, w9zVar), (xq21) null, (gmc) null, (say0) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: f */
    public static pbv m55960f(w9z w9zVar, float f, long j, int i) {
        if ((i & 1) != 0) {
            w9zVar = jg31.m53286y(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            int i2 = i591.f98850c;
            j = bul.m30569u();
        }
        return new pbv(new w791((l9y) null, (xq21) null, (gmc) null, new say0(f, j, w9zVar), (LinkedHashMap) null, 119));
    }

    /* JADX INFO: renamed from: g */
    public static whx m55961g(w9z w9zVar, float f, long j, int i) {
        if ((i & 1) != 0) {
            w9zVar = jg31.m53286y(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            int i2 = i591.f98850c;
            j = bul.m30569u();
        }
        return new whx(new w791((l9y) null, (xq21) null, (gmc) null, new say0(f, j, w9zVar), (LinkedHashMap) null, 119));
    }

    /* JADX INFO: renamed from: h */
    public static whx m55962h(w9z w9zVar, ub9 ub9Var, gh00 gh00Var, int i) {
        wb9 wb9Var;
        ub9 ub9Var2 = d7f0.f46146Q0;
        if ((i & 1) != 0) {
            long j = 1;
            w9zVar = jg31.m53286y(0.0f, 400.0f, new g450((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            ub9Var = ub9Var2;
        }
        if ((i & 8) != 0) {
            gh00Var = jbv.f110907e;
        }
        if (wj50.m88271j(ub9Var, d7f0.f46144O0)) {
            wb9Var = d7f0.f46172h;
        } else {
            wb9Var = wj50.m88271j(ub9Var, ub9Var2) ? d7f0.f46184t : d7f0.f46174i;
        }
        return m55963i(wb9Var, w9zVar, new r7t(18, gh00Var));
    }

    /* JADX INFO: renamed from: i */
    public static final whx m55963i(wb9 wb9Var, w9z w9zVar, gh00 gh00Var) {
        return new whx(new w791((l9y) null, (xq21) null, new gmc(wb9Var, w9zVar, gh00Var), (say0) null, (LinkedHashMap) null, ContentType.USER_GENERATED_LIVE));
    }

    /* JADX INFO: renamed from: j */
    public static whx m55964j() {
        long j = 1;
        return m55963i(d7f0.f46157Z, jg31.m53286y(0.0f, 400.0f, new g450((j & 4294967295L) | (j << 32)), 1), jbv.f110908f);
    }

    /* JADX INFO: renamed from: k */
    public static whx m55965k(tks tksVar, int i) {
        wb9 wb9Var;
        vb9 vb9Var = d7f0.f46143N0;
        vb9 vb9Var2 = d7f0.f46141L0;
        w9z w9zVarM53286y = tksVar;
        if ((i & 1) != 0) {
            long j = 1;
            w9zVarM53286y = jg31.m53286y(0.0f, 400.0f, new g450((j & 4294967295L) | (j << 32)), 1);
        }
        vb9 vb9Var3 = (i & 2) != 0 ? vb9Var : vb9Var2;
        if (wj50.m88271j(vb9Var3, vb9Var2)) {
            wb9Var = d7f0.f46168f;
        } else {
            wb9Var = wj50.m88271j(vb9Var3, vb9Var) ? d7f0.f46155Y : d7f0.f46174i;
        }
        return m55963i(wb9Var, w9zVarM53286y, new mgi(17));
    }

    /* JADX INFO: renamed from: l */
    public static final pbv m55966l(w9z w9zVar, gh00 gh00Var) {
        return new pbv(new w791((l9y) null, new xq21(w9zVar, new r7t(19, gh00Var)), (gmc) null, (say0) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: m */
    public static pbv m55967m(int i, gh00 gh00Var) {
        long j = 1;
        pg41 pg41VarM53286y = jg31.m53286y(0.0f, 400.0f, new y350((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            gh00Var = jbv.f110909g;
        }
        return m55966l(pg41VarM53286y, gh00Var);
    }

    /* JADX INFO: renamed from: n */
    public static final pbv m55968n(w9z w9zVar, gh00 gh00Var) {
        return new pbv(new w791((l9y) null, new xq21(w9zVar, new j3b(1, gh00Var)), (gmc) null, (say0) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: o */
    public static pbv m55969o(int i, gh00 gh00Var) {
        long j = 1;
        pg41 pg41VarM53286y = jg31.m53286y(0.0f, 400.0f, new y350((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            gh00Var = jbv.f110910h;
        }
        return m55968n(pg41VarM53286y, gh00Var);
    }

    /* JADX INFO: renamed from: p */
    public static final whx m55970p(w9z w9zVar, gh00 gh00Var) {
        return new whx(new w791((l9y) null, new xq21(w9zVar, new r7t(20, gh00Var)), (gmc) null, (say0) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: q */
    public static whx m55971q(int i, gh00 gh00Var) {
        long j = 1;
        pg41 pg41VarM53286y = jg31.m53286y(0.0f, 400.0f, new y350((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            gh00Var = jbv.f110911i;
        }
        return m55970p(pg41VarM53286y, gh00Var);
    }

    /* JADX INFO: renamed from: r */
    public static final whx m55972r(w9z w9zVar, gh00 gh00Var) {
        return new whx(new w791((l9y) null, new xq21(w9zVar, new r7t(21, gh00Var)), (gmc) null, (say0) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: s */
    public static whx m55973s(int i, gh00 gh00Var) {
        long j = 1;
        pg41 pg41VarM53286y = jg31.m53286y(0.0f, 400.0f, new y350((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            gh00Var = jbv.f110912t;
        }
        return m55972r(pg41VarM53286y, gh00Var);
    }
}
