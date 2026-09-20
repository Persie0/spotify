package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface o6d0 extends rj50 {
    /* JADX INFO: renamed from: G */
    n6d0 mo34817G(int i, int i2, Map map, gh00 gh00Var, gh00 gh00Var2);

    /* JADX INFO: renamed from: T */
    default n6d0 mo44714T(int i, int i2, Map map, gh00 gh00Var) {
        return mo34817G(i, i2, map, null, gh00Var);
    }
}
