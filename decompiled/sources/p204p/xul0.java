package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class xul0 implements Serializable {
    /* JADX INFO: renamed from: a */
    public static xul0 m92200a(Object obj) {
        return obj == null ? C2244p5.f174033a : new hzq0(obj);
    }

    /* JADX INFO: renamed from: d */
    public static hzq0 m92201d(Object obj) {
        obj.getClass();
        return new hzq0(obj);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo49278b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo49279c();

    /* JADX INFO: renamed from: e */
    public abstract Object mo49280e(Object obj);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo49281f(n5b n5bVar);

    /* JADX INFO: renamed from: g */
    public abstract xul0 mo49282g(xul0 xul0Var);

    /* JADX INFO: renamed from: h */
    public abstract Object mo49283h();

    public abstract int hashCode();

    /* JADX INFO: renamed from: i */
    public abstract xul0 mo49284i(qh00 qh00Var);

    public abstract String toString();
}
