package p204p;

import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ywy implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final hp60 f277076a;

    /* JADX INFO: renamed from: b */
    public static final tbn0 f277077b;

    static {
        hp60 hp60Var;
        try {
            Class.forName("j$.nio.file.Files");
            hp60Var = new ekj0();
        } catch (ClassNotFoundException unused) {
            hp60Var = new hp60();
        }
        f277076a = hp60Var;
        String str = tbn0.f218907b;
        f277077b = qbn0.m72505f(System.getProperty("java.io.tmpdir"));
        new f1x0(f1x0.class.getClassLoader());
    }

    /* JADX INFO: renamed from: a */
    public abstract ai21 mo40342a(tbn0 tbn0Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo39301c(tbn0 tbn0Var, tbn0 tbn0Var2);

    /* JADX INFO: renamed from: e */
    public abstract void mo40343e(tbn0 tbn0Var);

    /* JADX INFO: renamed from: f */
    public abstract void mo40344f(tbn0 tbn0Var);

    /* JADX INFO: renamed from: g */
    public abstract List mo40345g(tbn0 tbn0Var);

    /* JADX INFO: renamed from: h */
    public abstract jwy mo39302h(tbn0 tbn0Var);

    /* JADX INFO: renamed from: i */
    public abstract xn60 mo40346i(tbn0 tbn0Var);

    /* JADX INFO: renamed from: k */
    public abstract ai21 mo40347k(tbn0 tbn0Var, boolean z);

    /* JADX INFO: renamed from: n */
    public abstract wt31 mo40348n(tbn0 tbn0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
