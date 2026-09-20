package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qpv0 {

    /* JADX INFO: renamed from: a */
    public static final jqv0 f191387a;

    static {
        jqv0 jqv0Var = null;
        try {
            jqv0Var = (jqv0) kqv0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (jqv0Var == null) {
            jqv0Var = new jqv0();
        }
        f191387a = jqv0Var;
    }

    /* JADX INFO: renamed from: a */
    public static sr60 m73454a(Class cls) {
        jqv0 jqv0Var = f191387a;
        return jqv0Var.mo54123m(jqv0Var.mo54112b(cls), Collections.EMPTY_LIST, false);
    }

    /* JADX INFO: renamed from: b */
    public static sr60 m73455b(Class cls, xr60 xr60Var) {
        jqv0 jqv0Var = f191387a;
        return jqv0Var.mo54123m(jqv0Var.mo54112b(cls), Collections.singletonList(xr60Var), false);
    }
}
