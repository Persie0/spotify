package p204p;

import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zk60 {

    /* JADX INFO: renamed from: a */
    public static final it40 f283668a = bnf1.m29967c("kotlinx.serialization.json.JsonUnquotedLiteral", ql51.f189738a);

    /* JADX INFO: renamed from: a */
    public static final sl60 m96299a(Boolean bool) {
        return bool == null ? kl60.INSTANCE : new hl60(bool, false);
    }

    /* JADX INFO: renamed from: b */
    public static final sl60 m96300b(Number number) {
        return number == null ? kl60.INSTANCE : new hl60(number, false);
    }

    /* JADX INFO: renamed from: c */
    public static final sl60 m96301c(String str) {
        return str == null ? kl60.INSTANCE : new hl60(str, true);
    }

    /* JADX INFO: renamed from: d */
    public static final void m96302d(String str, yk60 yk60Var) {
        throw new IllegalArgumentException("Element " + qpv0.f191387a.mo54112b(yk60Var.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m96303e(sl60 sl60Var) {
        Boolean bool;
        String strMo47869a = sl60Var.mo47869a();
        String[] strArr = nl51.f155008a;
        if (strMo47869a.equalsIgnoreCase("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = strMo47869a.equalsIgnoreCase("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException(sl60Var + " does not represent a Boolean");
    }

    /* JADX INFO: renamed from: f */
    public static final String m96304f(sl60 sl60Var) {
        if (sl60Var instanceof kl60) {
            return null;
        }
        return sl60Var.mo47869a();
    }

    /* JADX INFO: renamed from: g */
    public static final double m96305g(sl60 sl60Var) {
        return Double.parseDouble(sl60Var.mo47869a());
    }

    /* JADX INFO: renamed from: h */
    public static final Integer m96306h(sl60 sl60Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(m96310l(sl60Var));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final jk60 m96307i(yk60 yk60Var) {
        jk60 jk60Var = yk60Var instanceof jk60 ? (jk60) yk60Var : null;
        if (jk60Var != null) {
            return jk60Var;
        }
        m96302d("JsonArray", yk60Var);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final nl60 m96308j(yk60 yk60Var) {
        nl60 nl60Var = yk60Var instanceof nl60 ? (nl60) yk60Var : null;
        if (nl60Var != null) {
            return nl60Var;
        }
        m96302d("JsonObject", yk60Var);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final sl60 m96309k(yk60 yk60Var) {
        sl60 sl60Var = yk60Var instanceof sl60 ? (sl60) yk60Var : null;
        if (sl60Var != null) {
            return sl60Var;
        }
        m96302d("JsonPrimitive", yk60Var);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static final long m96310l(sl60 sl60Var) {
        return vbg1.m85145k(sl60Var.mo47869a(), fk60.f70476d).m40921n();
    }
}
