package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface jwf {
    /* JADX INFO: renamed from: a */
    default Object mo54438a(Class cls) {
        return mo54440d(eht0.m39004a(cls));
    }

    /* JADX INFO: renamed from: b */
    j4t0 mo46061b(eht0 eht0Var);

    /* JADX INFO: renamed from: c */
    default Set mo54439c(eht0 eht0Var) {
        return (Set) mo46061b(eht0Var).get();
    }

    /* JADX INFO: renamed from: d */
    default Object mo54440d(eht0 eht0Var) {
        j4t0 j4t0VarMo46062e = mo46062e(eht0Var);
        if (j4t0VarMo46062e == null) {
            return null;
        }
        return j4t0VarMo46062e.get();
    }

    /* JADX INFO: renamed from: e */
    j4t0 mo46062e(eht0 eht0Var);

    /* JADX INFO: renamed from: g */
    fvl0 mo46064g(eht0 eht0Var);

    /* JADX INFO: renamed from: h */
    default j4t0 mo54441h(Class cls) {
        return mo46062e(eht0.m39004a(cls));
    }
}
